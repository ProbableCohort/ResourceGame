package com.nm;

import com.nm.lang.AnsiColor;
import com.nm.lang.PrintUtil;
import com.nm.objects.FluidTank;
import com.nm.objects.Pile;
import com.nm.resources.Coal;
import com.nm.resources.Oil;
import com.nm.resources.Wood;

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
    Coal coal = new Coal();
    Pile<Coal> coalPile = new Pile<>(coal);
    coalPile.setResourceSize(0.1d);
    coalPile.setAmount(1364);
    System.out.println(coalPile.sizeOf());

    Wood wood = new Wood(0.5d);
    Pile<Wood> woodPile = new Pile<>(wood);
    woodPile.setAmount(98765);
    System.out.println(woodPile.sizeOf());

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
    PrintUtil.wrapLine("Finishing running testObjects", '/');
  }
}
