package com.nm.resources;

/**
 * Created by brent on 2/18/17.
 */
public enum ResourceType {

  COAL (1, "Coal"),
  WOOD (2, "Wood"),
  SILVER (3, "Silver"),
  GOLD (4, "Gold"),
  OIL(5, "Oil")
    ;

  private final String name;
  private final int resourceId;
//    private final double defaultSize;
//    private final double defaultWeight;

  ResourceType(int resourceId, String name) {
      this.name = name;
      this.resourceId = resourceId;
  }

//    ResourceType(int resourceId, String name, double defaultSize, double defaultWeight) {
//        this.name = name;
//        this.resourceId = resourceId;
//        this.defaultSize = defaultSize;
//        this.defaultWeight = defaultWeight;
//    }

  public String getName() {
      return name;
  }

  public int getId() {
        return resourceId;
    }


}
