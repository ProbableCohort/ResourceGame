package com.nm.shapes;

/**
 * Created by brent on 2/18/17.
 */
public abstract class Shape {
    protected String name;

    public Shape() {

    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
