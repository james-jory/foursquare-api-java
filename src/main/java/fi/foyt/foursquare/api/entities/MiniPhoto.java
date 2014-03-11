package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

/**
 * Represents minimal photo information such as what is provided 
 * as User.Photo.
 * 
 * @author jamesjory
 */
public class MiniPhoto implements FoursquareEntity {
	private static final long serialVersionUID = 7505948584128309854L;

	private String prefix;
	private String suffix;
	
	public String getPrefix() {
		return prefix;
	}
	
	public String getSuffix() {
		return suffix;
	}
	
	/*
	 * 36x36, 100x100, 300x300, and 500x500.
	 */
	public String getUrlOriginal() {
		return prefix + "original" + suffix;
	}
	
	public String getUrl(int width, int height) {
		return String.format("%s%dx%d%s", prefix, width, height, suffix);
	}
	
	public String getUrlSquare36() {
		return getUrl(36, 36);
	}
	
	public String getUrlSquare100() {
		return getUrl(100, 100);
	}
	
	public String getUrlSquare300() {
		return getUrl(300, 300);
	}
	
	public String getUrlSquare500() {
		return getUrl(500, 500);
	}
	
	public String getUrlCap(int largestDimension) {
		return String.format("%scap%d%s", prefix, largestDimension, suffix);
	}
	
	public String getUrlWithWidth(int width) {
		return String.format("%swidth%d%s", prefix, width, suffix);
	}
	
	public String getUrlWithHeightWidth(int height) {
		return String.format("%sheight%d%s", prefix, height, suffix);
	}
}
