package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class GenderBreakdown implements FoursquareEntity {
	private static final long serialVersionUID = 6453387140210199645L;

	private Integer female;
	private Integer male;
	
	public Integer getFemale() {
		return female;
	}
	public Integer getMale() {
		return male;
	}

}
