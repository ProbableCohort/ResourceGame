package com.nm.shapes;

/**
 * Created by brent on 2/18/17.
 */
public enum ShapeType {

    PYRAMID (1, "Pyramid"),
    RECTANGLE (2, "Rectangle"),
    SQUARE(3, "Square"),
    SPHERE(4, "Sphere")
    ;

    private final String name;
    private final int shapeId;

    ShapeType(int shapeId, String name) {
        this.name = name;
        this.shapeId = shapeId;
    }

    public String getName() {
        return name;
    }

    public int getShapeId() {
        return shapeId;
    }
}
