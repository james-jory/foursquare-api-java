package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Menu implements FoursquareEntity {
	private static final long serialVersionUID = -1755752570782440137L;

	private String type;
	private String url;
	private String mobileUrl;
	
	public String getType() {
		return type;
	}
	
	public String getUrl() {
		return url;
	}

	public String getMobileUrl() {
		return mobileUrl;
	}
}
