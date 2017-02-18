package com.nm.shapes.pyramids;

/**
 * Created by brent on 2/18/17.
 */
public class PyramidService implements PyramidOperations {

    @Override
    public Pyramid getRegularPyramid(double volume) {
        double base = Math.cbrt(volume * 3);
        return new Pyramid(base);
    }

    @Override
    public Pyramid getPyramid(double volume, double height) {
        double base = Math.sqrt((volume * 3) / height);
        return new Pyramid(base, height);
    }

    @Override
    public Pyramid getPyramid(double volume, double side, double heightMultiplier) {
        double height = side * heightMultiplier;
        double base = Math.sqrt((volume * 3) / height);
        return new Pyramid(base, base, height);
    }

    @Override
    public Pyramid getPyramid(double volume, float heightMultiplier) {
        Pyramid p = getRegularPyramid(volume);
        double height = (p.getHeight() * heightMultiplier);
        return getPyramid(volume, height);
    }
}
