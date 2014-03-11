package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Timeseries implements FoursquareEntity {
	private static final long serialVersionUID = 8654378304346489994L;

	private String venueId;
	private String[] date;
	private Integer[] totalCheckins;
	private Integer[] newCheckins;
	private Integer[] uniqueVisitors;
	private Integer[] shareTwitter;
	private Integer[] shareFacebook;
	private Integer[] male;
	private Integer[] female;
	private Integer[] age13_17;
	private Integer[] age18_24;
	private Integer[] age25_34;
	private Integer[] age35_44;
	private Integer[] age45_54;
	private Integer[] age55;
	
	private Integer[][] hours;
	
	public String getVenueId() {
		return venueId;
	}
	
	public String[] getDate() {
		return date;
	}

	public Integer[] getTotalCheckins() {
		return totalCheckins;
	}
	
	public Integer[] getNewCheckins() {
		return newCheckins;
	}

	public Integer[] getUniqueVisitors() {
		return uniqueVisitors;
	}

	public Integer[] getShareTwitter() {
		return shareTwitter;
	}

	public Integer[] getShareFacebook() {
		return shareFacebook;
	}

	public Integer[] getMale() {
		return male;
	}

	public Integer[] getFemale() {
		return female;
	}

	public Integer[] getAge13_17() {
		return age13_17;
	}

	public Integer[] getAge18_24() {
		return age18_24;
	}

	public Integer[] getAge25_34() {
		return age25_34;
	}

	public Integer[] getAge35_44() {
		return age35_44;
	}

	public Integer[] getAge45_54() {
		return age45_54;
	}

	public Integer[] getAge55() {
		return age55;
	}

	public Integer[][] getHours() {
		return hours;
	}
}
