package com.nm.objects;

import com.nm.resources.Resource;
import com.nm.shapes.pyramids.Pyramid;
import com.nm.shapes.pyramids.PyramidOperations;
import com.nm.shapes.pyramids.PyramidService;

/**
 * Created by brent on 2/18/17.
 */
public class Pile<T extends Resource> {

    private PyramidOperations pyramidService = new PyramidService();

    private T type;
    private int amount = 0;
    private int base = 0;
    private float heightMultiplier = 1.4f;
    private double height = heightMultiplier * base;

    public Pile() {

    }

    public Pile(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public String sizeOf() {
        System.out.println(String.format("There are %d pieces of %s, and each piece is about %f foot in diameter", this.amount, type.getName(), type.getSize()));
        double volume = type.getSize() * this.amount;

        Pyramid p = pyramidService.getPyramid(volume, heightMultiplier);;
        return String.format("The %s is %f feet wide and %f feet deep and %f feet tall", p.getName(), p.getWidth(), p.getLength(), p.getHeight());
    }

    public void setResourceSize(double size) {
        this.type.setSize(size);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
