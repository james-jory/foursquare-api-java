package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class VenueStats implements FoursquareEntity {
	private static final long serialVersionUID = -5520305024843565702L;
	
	private Integer totalCheckins;
	private Integer newCheckins;
	private Integer uniqueVisitors;
	
	private Sharing sharing;
	
	private GenderBreakdown genderBreakdown;
	
	private AgeBreakdown[] ageBreakdown;

	/**
	 * Hours 0-23
	 */
	private HourBreakdown[] hourBreakdown;
	
	private VisitCountHistogram[] visitCountHistogram;
	
	private TopVisitor[] topVisitors;
	
	private RecentVisitor[] recentVisitors;

	public Integer getTotalCheckins() {
		return totalCheckins;
	}

	public Integer getNewCheckins() {
		return newCheckins;
	}

	public Integer getUniqueVisitors() {
		return uniqueVisitors;
	}

	public Sharing getSharing() {
		return sharing;
	}

	public GenderBreakdown getGenderBreakdown() {
		return genderBreakdown;
	}

	public AgeBreakdown[] getAgeBreakdown() {
		return ageBreakdown;
	}

	public HourBreakdown[] getHourBreakdown() {
		return hourBreakdown;
	}

	public VisitCountHistogram[] getVisitCountHistogram() {
		return visitCountHistogram;
	}

	public TopVisitor[] getTopVisitors() {
		return topVisitors;
	}

	public RecentVisitor[] getRecentVisitors() {
		return recentVisitors;
	}
}
