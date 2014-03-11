package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Icon implements FoursquareEntity {
	private static final long serialVersionUID = 8289252010776332455L;
	
	private String prefix;
	private String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	
	public String getSuffix() {
		return suffix;
	}

	public String getUrlTiny() {
		return prefix + "32" + suffix;
	}

	public String getUrlSmall() {
		return prefix + "44" + suffix;
	}

	public String getUrlMedium() {
		return prefix + "64" + suffix;
	}

	public String getUrlLarge() {
		return prefix + "88" + suffix;
	}

	public String getUrlBackgroundTiny() {
		return prefix + "bg_32" + suffix;
	}

	public String getUrlBackgroundSmall() {
		return prefix + "bg_44" + suffix;
	}

	public String getUrlBackgroundMedium() {
		return prefix + "bg_64" + suffix;
	}

	public String getUrlBackgroundLarge() {
		return prefix + "bg_88" + suffix;
	}
}
