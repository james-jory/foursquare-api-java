package fi.foyt.foursquare.api.entities;

import fi.foyt.foursquare.api.FoursquareEntity;
import fi.foyt.foursquare.api.entities.CompactUser;
import fi.foyt.foursquare.api.entities.PhotoGroup;
import fi.foyt.foursquare.api.entities.VenueGroup;

/**
 * @see https://developer.foursquare.com/docs/responses/pageupdate
 * @author james
 */
public class PageUpdate implements FoursquareEntity {
	private static final long serialVersionUID = 886066319304015675L;

	private String id;
	private Long createdAt;
	private CompactUser page;
	private String shout;
	private PhotoGroup photos;
	private Campaign campaign;
	private VenueGroup venues;
	//private VenueGroup[] venueGroups;	??
	private CompactUser chain;
	private String canonicalUrl;
	//private CompactVenue[] nearbyVenues;	??
	
	// likes??? don't know what this property looks like.

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Long createdAt) {
		this.createdAt = createdAt;
	}
	public CompactUser getPage() {
		return page;
	}
	public void setPage(CompactUser page) {
		this.page = page;
	}
	public String getShout() {
		return shout;
	}
	public void setShout(String shout) {
		this.shout = shout;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public CompactUser getChain() {
		return chain;
	}
	public void setChain(CompactUser chain) {
		this.chain = chain;
	}
	public String getCanonicalUrl() {
		return canonicalUrl;
	}
	public void setCanonicalUrl(String canonicalUrl) {
		this.canonicalUrl = canonicalUrl;
	}
	public PhotoGroup getPhotos() {
		return photos;
	}
	public void setPhotos(PhotoGroup photos) {
		this.photos = photos;
	}
	public VenueGroup getVenues() {
		return venues;
	}
	public void setVenues(VenueGroup venues) {
		this.venues = venues;
	}
}
