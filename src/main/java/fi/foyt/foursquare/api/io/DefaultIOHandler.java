/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 * 
 * License: 
 * 
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

package fi.foyt.foursquare.api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Default implementation of the IOHandler
 * 
 * @author Antti Leppä
 * 
 */
public class DefaultIOHandler extends IOHandler {
	private int connectTimeout = 15000;
	private int readTimeout = 15000;
	private boolean allowUserInteraction = false;

	/**
	 * Timeout in milliseconds to wait for connection.
	 * @return
	 */
	public int getConnectTimeout() {
		return connectTimeout;
	}

	/**
	 * Set connect timeout (in milliseconds).
	 */
	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	/**
	 * Timeout in milliseconds to wait for data on a connection.
	 * @return
	 */
	public int getReadTimeout() {
		return readTimeout;
	}

	/**
	 * Set read timeout (in milliseconds).
	 * @param readTimeout
	 */
	public void setReadTimeout(int readTimeout) {
		this.readTimeout = readTimeout;
	}

	/**
	 * Should user interaction based be supported for HTTP connections.
	 * @return
	 */
	public boolean isAllowUserInteraction() {
		return allowUserInteraction;
	}

	public void setAllowUserInteraction(boolean allowUserInteraction) {
		this.allowUserInteraction = allowUserInteraction;
	}

	@Override
	public Response fetchData(String url, Method method) {
		int code = 200;

		try {
			URL aUrl = new URL(url);
			HttpURLConnection connection = (HttpURLConnection)aUrl.openConnection();
			
			try {
				if (connectTimeout > 0)
					connection.setConnectTimeout(connectTimeout);
				if (readTimeout > 0)
					connection.setReadTimeout(readTimeout);
				
				connection.setAllowUserInteraction(allowUserInteraction);     	  
				connection.setDoInput(true);
				if ("POST".equals(method.name())) 
					connection.setDoOutput(true);
				connection.setRequestMethod(method.name());
				connection.connect();

				code = connection.getResponseCode();
				if (code == 200) {
					InputStream inputStream = connection.getInputStream();
					return new Response(readStream(inputStream), code, connection.getResponseMessage());
				}

				return new Response("", code, getMessageByCode(code));
			} 
			finally {
				connection.disconnect();
			}
		} 
		catch (MalformedURLException e) {
			return new Response("", 400, "Malformed URL: " + url);
		} 
		catch (IOException e) {
			return new Response("", 500, e.getMessage());
		}
	}

	@Override
	public Response fetchDataMultipartMime(String url, MultipartParameter... parameters) {
		int code = 200;

		try {
			URL aUrl = new URL(url);
			HttpURLConnection connection = (HttpURLConnection) aUrl.openConnection();
			
			try {
				if (connectTimeout > 0)
					connection.setConnectTimeout(connectTimeout);
				if (readTimeout > 0)
					connection.setReadTimeout(readTimeout);
				
				connection.setAllowUserInteraction(allowUserInteraction);     	  
				connection.setDoInput(true);
				connection.setDoOutput(true);
				connection.setRequestMethod("POST");
				connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
				connection.connect();

				OutputStream outputStream = connection.getOutputStream();
        
				StringBuilder startBoundaryBuilder = new StringBuilder();
				startBoundaryBuilder.append("--").append(BOUNDARY).append("\r\n");
        
				outputStream.write(startBoundaryBuilder.toString().getBytes());
        
				for (MultipartParameter parameter : parameters) {
					StringBuilder formDataBuilder = new StringBuilder()
							.append("Content-Disposition: form-data; name=\"")
							.append(parameter.getName())
							.append("\"; filename=\"")
							.append(parameter.getName())
							.append("\"\r\n")
							.append("Content-Type: ")
							.append(parameter.getContentType())
							.append("\r\n\r\n");
					
					outputStream.write(formDataBuilder.toString().getBytes());
					outputStream.write(parameter.getContent());
				}
        
				StringBuilder endBoundaryBuilder = new StringBuilder()
						.append("\r\n--")
						.append(BOUNDARY)
						.append("--\r\n");
				
				outputStream.write(endBoundaryBuilder.toString().getBytes());

				outputStream.flush();
				outputStream.close();

				code = connection.getResponseCode();
				if (code == 200) {
					InputStream inputStream = connection.getInputStream();
					return new Response(readStream(inputStream), code, connection.getResponseMessage());
				}

				return new Response("", code, getMessageByCode(code));

			} 
			finally {
				connection.disconnect();
			}
		} 
		catch (MalformedURLException e) {
			return new Response("", 400, "Malformed URL: " + url);
		} 
		catch (IOException e) {
			return new Response("", 500, e.getMessage());
		}
	}

  /**
   * Reads input stream and returns it's contents as String
   * 
   * @param inputStream input stream to be readed
   * @return Stream's content
   * @throws IOException 
   */
  private String readStream(InputStream inputStream) throws IOException {
    StringWriter responseWriter = new StringWriter();

    char[] buf = new char[1024];
    int l = 0;

    InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
    while ((l = inputStreamReader.read(buf)) > 0) {
      responseWriter.write(buf, 0, l);
    }

    responseWriter.flush();
    responseWriter.close();
    return responseWriter.getBuffer().toString();
  }

  /**
   * Returns message for code
   * 
   * @param code code
   * @return Message
   */
  private String getMessageByCode(int code) {
    switch (code) {
      case 400:
        return "Bad Request";
      case 401:
        return "Unauthorized";
      case 403:
        return "Forbidden";
      case 404:
        return "Not Found";
      case 405:
        return "Method Not Allowed";
      case 500:
        return "Internal Server Error";
      default:
        return "Unknown";
    }
  }

  private static String BOUNDARY = "----------gc0p4Jq0M2Yt08jU534c0p";
}
