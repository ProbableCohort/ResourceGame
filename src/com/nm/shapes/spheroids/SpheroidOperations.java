package com.nm.shapes.spheroids;

/**
 * @author brent
 * @since 2/19/17.
 */
public interface SpheroidOperations {

  /**
   * Gets the volume of a Sphere with a given Radius
   *
   * @param radius
   * @return
   */
  double getSphereVolume(double radius);

  /**
   * Gets the volume of a Cylinder with a given Radius and Length
   *
   * @param radius
   * @param length
   * @return
   */
  double getCylinderVolume(double radius, double length);

  /**
   * Gets the volume of the given Sphere
   *
   * @param sphere
   * @return
   */
  double getVolume(Sphere sphere);

  /**
   * Gets the volume of the given Obround
   *
   * @param obround
   * @return
   */
  double getVolume(Obround obround);

  /**
   * Gets the volume of the given Silo
   *
   * @param silo
   * @return
   */
  double getVolume(Silo silo);
}
