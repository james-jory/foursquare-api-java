package fi.foyt.foursquare.api.entities;

import java.util.Date;

import fi.foyt.foursquare.api.FoursquareEntity;
import fi.foyt.foursquare.api.entities.CompactUser;

public class RecentVisitor implements FoursquareEntity {
	private static final long serialVersionUID = -2223826955007320518L;

	private CompactUser user;
	private Long lastCheckin;
	
	public CompactUser getUser() {
		return user;
	}
	
	public Long getLastCheckin() {
		return lastCheckin;
	}
	
	public Date getLastCheckinAsDate() {
		return lastCheckin != null ? new Date(lastCheckin * 1000) : null;
	}
}
