/*
 * FoursquareAPI - Foursquare API for Java
 * Copyright (C) 2008 - 2011 Antti Leppä / Foyt
 * http://www.foyt.fi
 *
 * License:
 *
 * Licensed under GNU Lesser General Public License Version 3 or later (the "LGPL")
 * http://www.gnu.org/licenses/lgpl.html
 */

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
