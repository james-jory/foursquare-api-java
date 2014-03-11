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
 * Class representing Badge entity
 * 
 * @see <a href="https://developer.foursquare.com/docs/responses/badge.html" target="_blank">https://developer.foursquare.com/docs/responses/badge.html</a>
 * 
 * @author Antti Leppä
 */
public class Badge implements FoursquareEntity {

  private static final long serialVersionUID = -1700328878776397998L;

  /**
   * Returns id
   * 
   * @return id
   */
  public String getId() {
    return id;
  }
  
  /**
   * Return badge id
   * 
   * @return badge id
   */
  public String getBadgeId() {
    return badgeId;
  }
  
  /**
   * Returns badge's name
   * 
   * @return badge's name
   */
  public String getName() {
    return name;
  }
  
  /**
   * Returns badge's description
   * 
   * @return badge's description
   */
  public String getDescription() {
    return description;
  }
  
  /**
   * Returns badge's image
   * 
   * @return badge's image
   */
  public BadgeImage getImage() {
    return image;
  }
  
  /**
   * Returns array of unlock data
   * 
   * @return array of unlock data
   */
  public BadgeUnlock[] getUnlocks() {
    return unlocks;
  }
  
  public String getUnlockMessage() {
	return unlockMessage;
  }

  public Integer getLevel() {
	return level;
  }

  public String getBadgeText() {
	return badgeText;
  }

  public String getLevelText() {
	return levelText;
  }

  public String getCategorySummary() {
	return categorySummary;
  }

  private String id;
  private String badgeId;
  private String name;
  private String description;
  private BadgeImage image;
  private BadgeUnlock[] unlocks;
  
  private String unlockMessage;
  private Integer level;
  private String badgeText;
  private String levelText;
  private String categorySummary;
}
