package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.entities.Count;

/**
 * Can't extend Group since String doesn't extend FoursquareEntity
 * @author james
 *
 */
public class StringGroup extends Count {
	private static final long serialVersionUID = -7448078477415271917L;
	
	private String[] items;
	
	public String[] getItems() {
		return items;
	}
}
