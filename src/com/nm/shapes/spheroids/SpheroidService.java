package com.nm.shapes.spheroids;

/**
 * @author brent
 * @since 2/19/17.
 */
public class SpheroidService implements SpheroidOperations {

  @Override
  public double getSphereVolume(double radius) {
    return (4/3) * Math.PI * Math.pow(radius, 3);
  }

  @Override
  public double getCylinderVolume(double radius, double length) {
    return Math.PI * Math.pow(radius, 2) * length;
  }

  @Override
  public double getVolume(Sphere sphere) {
    return getSphereVolume(sphere.getRadius());
  }

  @Override
  public double getVolume(Obround obround) {
    double sphereVolume = getSphereVolume(obround.getRadius());
    double cylinderVolume = getCylinderVolume(obround.getRadius(), obround.getLength());
    return sphereVolume + cylinderVolume;
  }

  @Override
  public double getVolume(Silo silo) {
    double sphereVolume = getSphereVolume(silo.getRadius());
    double cylinderVolume = getCylinderVolume(silo.getRadius(), silo.getLength());
    return (sphereVolume / 2) + cylinderVolume;

  }
}
