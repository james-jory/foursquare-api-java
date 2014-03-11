package fi.foyt.foursquare.api;

/**
 * Class representing API query result status
 * 
 * @author Antti Leppä
 */
public class ResultMeta {

  /**
   * Constructor 
   * 
   * @param code code
   * @param errorType errorType
   * @param errorDetail error details
   */
  public ResultMeta(Integer code, String errorType, String errorDetail) {
    this.code = code;
    this.errorType = errorType;
    this.errorDetail = errorDetail;
  }

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (errorDetail != null || errorType != null) {
			s.append(errorDetail);
			if (errorType != null)
				s.append(" (").append(errorType).append(")");
			
			if (code > 0) 
				s.append(" (").append(code).append(")");
		}
		else if (code > 0)
			s.append("HTTP ").append(code);
		else
			s.append("[no meta info available]");
		return s.toString();
	}

  /**
   * Returns code
   * 
   * @return code
   */
  public Integer getCode() {
    return code;
  }
  
  /**
   * Returns error type. Possible error types are: 
   * 
   * invalid_auth, param_error, endpoint_error, not_authorized, rate_limit_exceeded, deprecated, server_error and other
   * 
   * @see <a href="https://developer.foursquare.com/docs/overview.html" target="_blank">https://developer.foursquare.com/docs/overview.html</a>
   * 
   * @return error type
   */
  public String getErrorType() {
    return errorType;
  }

  /**
   * Returns error details
   * 
   * @return error details
   */
  public String getErrorDetail() {
    return errorDetail;
  }

  private Integer code;
  private String errorType;
  private String errorDetail;
}