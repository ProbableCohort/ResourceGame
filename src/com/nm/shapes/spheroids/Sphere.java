package com.nm.shapes.spheroids;

/**
 * Created by brent on 2/18/17.
 */
public class Sphere extends Spheroid {

  private SpheroidOperations spheroidService = new SpheroidService();

  public Sphere() {
    super();
  }

  public Sphere(double diameter) {
    super(diameter);
    this.volume = spheroidService.getVolume(this);
  }

}
