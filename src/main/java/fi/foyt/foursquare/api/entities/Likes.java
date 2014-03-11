package fi.foyt.foursquare.api.entities;

public class Likes extends Count {
	private static final long serialVersionUID = -6380720779612522250L;

	private String summary;
	private UserGroup[] groups;
	
	public String getSummary() {
		return summary;
	}
	
	public UserGroup[] getGroups() {
		return groups;
	}
}
