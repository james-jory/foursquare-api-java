package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;

/**
 * Part of a Campaign (at least). 
 * 
 * @see https://developer.foursquare.com/docs/responses/campaign.html
 * @author james
 */
public class CompactSpecial implements FoursquareEntity {
	private static final long serialVersionUID = -8224339191745069155L;

	private String id;
	private String text;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
