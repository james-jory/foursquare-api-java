package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class HourBreakdown implements FoursquareEntity {
	private static final long serialVersionUID = -7654351286692649603L;

	private Integer hour;
	private Integer checkins;
	
	public Integer getHour() {
		return hour;
	}
	public Integer getCheckins() {
		return checkins;
	}
}
