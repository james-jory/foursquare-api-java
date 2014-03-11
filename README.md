## foursquare-api-java

Ported from original [Google Code project](https://code.google.com/p/foursquare-api-java/) which is no longer being maintained.

Besides updating the driver with the latest [Foursquare API](https://developer.foursquare.com/) changes, also added support for 
some [merchant-related endpoints](https://developer.foursquare.com/overview/merchants).

## Example
Most Foursquare API endpoints require an OAuth 2.0 access token while others support [userless](https://developer.foursquare.com/overview/auth#userless) 
access. For details on how to obtain an OAuth 2.0 access token, see Foursquare API [Connecting](https://developer.foursquare.com/overview/auth) page.

```
try {
	FoursquareApi client = new FoursquareApi(YOUR_CLIENT_ID, YOUR_CLIENT_SECRET, null);
	client.setoAuthToken(AN_ACCESS_TOKEN);
	
	Result<CompleteVenue> result = client.venue(VENUE_ID);
	CompleteVenue venue = resVenue.getResult();
	
	// Do something with the venue
}
catch (FoursquareApiException e) {
	// Deal with it.
}
``` 

## License

[GNU LGPL v3](http://www.gnu.org/licenses/lgpl.txt)