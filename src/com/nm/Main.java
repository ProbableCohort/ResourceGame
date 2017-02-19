package com.nm;

import com.nm.lang.AnsiColor;
import com.nm.lang.PrintUtil;
import com.nm.objects.FluidTank;
import com.nm.objects.Pile;
import com.nm.resources.Coal;
import com.nm.resources.Oil;
import com.nm.resources.Wood;
import com.nm.shapes.spheroids.Sphere;

/**
 * Created by brent on 2/18/17.
 */
public class Main {

  public static void main(String[] args) {
    PrintUtil.wrapLine("Main.main() is running!", AnsiColor.RED);
    testObjects();
    PrintUtil.wrapLine("Main.main() has stopped running!", AnsiColor.RED);
  }

  private static void testObjects() {
    PrintUtil.wrapLine("Running testObjects", "#", AnsiColor.BLUE);

    PrintUtil.printDivider();

    testCoalPile();

    PrintUtil.printDivider();

    testWoodPile();

    PrintUtil.printDivider();

    testOilTank();

    PrintUtil.printDivider();

    testSphere();

    PrintUtil.printDivider();

    System.out.println("Testing printing divider lines");

    PrintUtil.printDividers(AnsiColor.GREEN, 5);

    PrintUtil.printDividers(7);

    PrintUtil.wrapLine("Finishing running testObjects", '/');
  }

  private static void testOilTank() {
    FluidTank<Oil> oilTank = new FluidTank(3.0d, 5.0d);
    System.out.println(String.format("The FluidTank has a capacity of %f", oilTank.getCapacity()));
    Oil oil = new Oil();
    oil.setSize(1d);
    oilTank.add(oil, 100);
    System.out.println(String.format("The Oil Tank has %f gallons of oil", oilTank.getAmount()));
    oilTank.add(oil, 100);
    System.out.println(String.format("The Oil Tank has %f gallons of oil", oilTank.getAmount()));
    oilTank.add(oil, 100);
    System.out.println(String.format("The Oil Tank has %f gallons of oil", oilTank.getAmount()));
  }

  private static void testWoodPile() {
    Wood wood = new Wood(0.5d);
    Pile<Wood> woodPile = new Pile<>(wood);
    woodPile.setAmount(98765);
    System.out.println(woodPile.sizeOf());
  }

  private static void testCoalPile() {
    Coal coal = new Coal();
    Pile<Coal> coalPile = new Pile<>(coal);
    coalPile.setResourceSize(0.1d);
    coalPile.setAmount(1364);
    System.out.println(coalPile.sizeOf());
  }

  private static void testSphere() {
    Sphere sphere = new Sphere(37d);
    System.out.println(String.format("The sphere has a radius of %f and a voume of %f", sphere.getRadius(), sphere.getVolume()));
  }
}
