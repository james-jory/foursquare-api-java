## foursquare-api-java

Ported from original [Google Code project](https://code.google.com/p/foursquare-api-java/) which is no longer being maintained.

Besides updating the driver with the latest [Foursquare API](https://developer.foursquare.com/) changes, also added support for 
some [merchant-related endpoints](https://developer.foursquare.com/overview/merchants). See Summary of Changes below for details.

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

## Summary of Changes

The following changes were made to the [original project](https://code.google.com/p/foursquare-api-java/) before being added 
to this repository.

### API Changes 

* Updated DEFAULT_VERSION to "20130424"
* Added support for POST /checkins/[CHECKIN_ID]/like
* Added support for POST /pageupdates/add
* Added support for POST /pageupdates/[UPDATE_ID]/delete
* Added support for GET /pageupdates/list
* Added support for POST /tips/[TIP_ID]/like
* Added support for POST /tips/[TIP_ID]/flag
* Added support for GET /venues/[VENUE_ID]/nextvenues
* Added support for GET /venues/[VENUE_ID]/likes
* Added support for GET /venues/[VENUE_ID]/stats
* Added support for GET /venues/managed
* Added support for GET /venues/timeseries

### Entity Changes

* Changed Badge.java to match API.
* Changed Category.java to match API (Icon & shortName)
* Changed Checkin.java (Likes)
* Changed CompactTip.java (canonicalUrl)
* Changed CompactUser.java (Photo)
* Changed CompactVenue.java (SpecialGroup, Menu, Rating, Price, canonicalUrl)
* Changed CompleteTip.java (Likes)
* Changed CompleteUser.java (Lists, Photos, referralId, checkInPings)
* Changed CompleteVenue.java (Lists, Likes, like, dislike)
* Changed Contact.java (formattedPhone)
* Changed HereNow.java (summary)
* Changed Location.java (cc, isFuzzed)
* Changed Photo.java (width, height, visibility, ...)
* Changed Stats.java (tipCount)
* Created MiniPhoto.java to support photo changes in API
* Created PushLike.java to support processing real-time venue like messages

### Other Changes

* Added support for nested arrays in JSONFieldParser.java
* JSON field names with embedded "-" are mapped to Java property names using underscore ("_").
* Override ResultMeta.toString() to return descriptive string of error info.
* Fixed misc compiler warnings.

## License

[GNU LGPL v3](http://www.gnu.org/licenses/lgpl.txt)