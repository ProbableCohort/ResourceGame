package com.nm.shapes.pyramids;

/**
 * Created by brent on 2/18/17.
 */
public interface PyramidOperations {
    Pyramid getRegularPyramid(double volume);

    Pyramid getPyramid(double volume, double height);

    Pyramid getPyramid(double volume, double side, double heightMultiplier);

    Pyramid getPyramid(double volume, float heightMultiplier);
}
