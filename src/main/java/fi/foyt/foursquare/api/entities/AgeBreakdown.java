package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class AgeBreakdown implements FoursquareEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5881784978431364360L;

	private String age;
	private Integer checkins;
	
	public String getAge() {
		return age;
	}
	public Integer getCheckins() {
		return checkins;
	}

}
