package com.nm.objects;

import com.nm.shapes.Shape;

/**
 * Created by brent on 2/18/17.
 */
public class Container<T extends Shape> {
  private T type;
  private String name;
  protected double capacity;
  protected double amount = 0;

  public Container() {

  }

  public Container(T type) {
    this(type, type.getName());
  }

  public Container(T type, String name) {
    this.type = type;
    this.name = name;
    this.capacity = type.getVolume();
  }

  public Container(T type, String name, double capacity) {
    this.type = type;
    this.name = name;
    this.capacity = capacity;
  }

  public void add(double amount) {
    if (this.amount + amount <= capacity) {
      this.amount += amount;
      System.out.println(String.format("Added %f to Container [%s], it is now %d%% full", amount, this.name, this.getPercentFull()));
    } else {
      System.out.println(String.format("Cannot add %f to Container [%s] without exceeding the container's capacity of %f", amount, this.name, this.capacity));
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCapacity() {
    return capacity;
  }

  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  public double getAmount() {
    return amount;
  }

  public int getPercentFull() {
    return Long.valueOf(Math.round((this.amount / this.capacity) * 100)).intValue();
  }
}
