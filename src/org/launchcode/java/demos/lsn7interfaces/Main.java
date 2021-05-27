package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();
        Comparator comparator = new FlavorComparator();
        Comparator comparator1 = new ConeComparator();
        Comparator comparator2 = new ToppingComparator();
        System.out.println(flavors);
        flavors.sort(comparator.reversed());
        System.out.println(flavors);
        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        //System.out.println(cones);
        cones.sort(comparator1);
        //System.out.println(cones);
        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        //System.out.println(toppings);
        toppings.sort(comparator2);
        //System.out.println(toppings);

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
