package com.nm;

import com.nm.objects.Pile;
import com.nm.resources.Coal;
import com.nm.resources.Wood;

/**
 * Created by brent on 2/18/17.
 */
public class Main {

    public static void main(String[] args) {
        Coal coal = new Coal();
        Pile<Coal> coalPile = new Pile<>(coal);
        coalPile.setResourceSize(0.1d);
        coalPile.setAmount(1364);
        System.out.println(coalPile.sizeOf());

        Wood wood = new Wood(0.5d);
        Pile<Wood> woodPile = new Pile<>(wood);
        woodPile.setAmount(98765);
        System.out.println(woodPile.sizeOf());

    }
}
