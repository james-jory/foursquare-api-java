package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Price implements FoursquareEntity {
	private static final long serialVersionUID = -8584463636944461994L;

	private Integer tier;
	private String message;
	
	public Integer getTier() {
		return tier;
	}
	
	public String getMessage() {
		return message;
	}
	
}
