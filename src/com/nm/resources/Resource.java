package com.nm.resources;

/**
 * Created by brent on 2/18/17.
 */
public abstract class Resource {

    protected String name;
    protected double size;
    protected double weight;

    public Resource() {}

    public Resource(String name) {
        this.name = name;
    }

    public Resource(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public Resource(ResourceType type) {
        this.name = type.getName();
    }

    public Resource(ResourceType type, double size) {
        this.name = type.getName();
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
