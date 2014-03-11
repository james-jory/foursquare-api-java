package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class Campaign implements FoursquareEntity {
	private static final long serialVersionUID = 7282640977848502085L;

	private String id;
	private CompactSpecial special;
	private Long startsAt;
	private Long endsAt;
	private StringGroup venues;
	private StringGroup venueGroups;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public CompactSpecial getSpecial() {
		return special;
	}
	public void setSpecial(CompactSpecial special) {
		this.special = special;
	}
	public Long getStartsAt() {
		return startsAt;
	}
	public void setStartsAt(Long startsAt) {
		this.startsAt = startsAt;
	}
	public Long getEndsAt() {
		return endsAt;
	}
	public void setEndsAt(Long endsAt) {
		this.endsAt = endsAt;
	}
	public StringGroup getVenues() {
		return venues;
	}
	public void setVenues(StringGroup venues) {
		this.venues = venues;
	}
	public StringGroup getVenueGroups() {
		return venueGroups;
	}
	public void setVenueGroups(StringGroup venueGroups) {
		this.venueGroups = venueGroups;
	}
}
