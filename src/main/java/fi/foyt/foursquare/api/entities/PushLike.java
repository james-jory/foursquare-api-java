package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

/**
 * Represents a Like sent as a venue push notification.
 * 
 * See <a href="https://developer.foursquare.com/overview/realtime#venue">https://developer.foursquare.com/overview/realtime#venue</a>
 * @author jamesjory
 */
public class PushLike implements FoursquareEntity {
	private static final long serialVersionUID = 2159979060137625660L;
	
	private Long createdAt;
	private CompactUser user;
	private CompactVenue venue;
	
	public Long getCreatedAt() {
		return createdAt;
	}
	
	public CompactUser getUser() {
		return user;
	}
	
	public CompactVenue getVenue() {
		return venue;
	}
}
