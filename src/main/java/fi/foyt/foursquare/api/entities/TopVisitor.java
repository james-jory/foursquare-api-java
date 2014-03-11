package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;
import fi.foyt.foursquare.api.entities.CompactUser;

public class TopVisitor implements FoursquareEntity {
	private static final long serialVersionUID = 2621644449681621077L;

	private CompactUser user;
	private Integer checkins;
	
	public CompactUser getUser() {
		return user;
	}
	public Integer getCheckins() {
		return checkins;
	}
	
}
