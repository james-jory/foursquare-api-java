package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

public class List implements FoursquareEntity {
	private static final long serialVersionUID = -1014429206794090183L;

	private String id;
	private String name;
	private String description;
	private CompactUser user;
	private Boolean editable;
	//private Boolean public;
	private Boolean collaborative;
	private String url;
	private String canonicalUrl;
	private Count followers;
	private Count listItems;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public CompactUser getUser() {
		return user;
	}
	public Boolean getEditable() {
		return editable;
	}
	public Boolean getCollaborative() {
		return collaborative;
	}
	public String getUrl() {
		return url;
	}
	public String getCanonicalUrl() {
		return canonicalUrl;
	}
	public Count getFollowers() {
		return followers;
	}
	public Count getListItems() {
		return listItems;
	}
}
