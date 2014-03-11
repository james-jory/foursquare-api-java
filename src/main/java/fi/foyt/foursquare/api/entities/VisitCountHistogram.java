package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class VisitCountHistogram implements FoursquareEntity {
	private static final long serialVersionUID = -3752313173317541693L;

	private Integer checkins;
	private Integer users;
	
	public Integer getCheckins() {
		return checkins;
	}
	public Integer getUsers() {
		return users;
	}
	
}
