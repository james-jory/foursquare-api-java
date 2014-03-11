package fi.foyt.foursquare.api.entities;

public class ListGroup extends Group<List> {
	private static final long serialVersionUID = -3913942344645034402L;

	private List[] items;
	
	@Override
	public List[] getItems() {
		return items;
	}
}
