package com.nm.resources;

/**
 * Created by brent on 2/18/17.
 */
public class Wood extends Resource {

    public Wood() {
        super(ResourceType.WOOD);
    }

    public Wood(double size) {
        super(ResourceType.WOOD, size);
    }
}
