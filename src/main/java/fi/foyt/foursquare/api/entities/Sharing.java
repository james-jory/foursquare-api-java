package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Sharing implements FoursquareEntity {
	private static final long serialVersionUID = 2444046500074896000L;

	private Integer	twitter;
	private Integer facebook;
	
	public Integer getTwitter() {
		return twitter;
	}
	
	public Integer getFacebook() {
		return facebook;
	}
}
