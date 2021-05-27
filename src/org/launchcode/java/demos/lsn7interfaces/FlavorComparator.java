package org.launchcode.java.demos.lsn7interfaces;
import java.util.Comparator;

public class FlavorComparator implements Comparator<org.launchcode.java.demos.lsn7interfaces.Flavor> {
    @Override
    public int compare(org.launchcode.java.demos.lsn7interfaces.Flavor o1, org.launchcode.java.demos.lsn7interfaces.Flavor o2) {
        return o1.getAllergens().size() - (o2.getAllergens().size());
    }

    @Override
    public Comparator<org.launchcode.java.demos.lsn7interfaces.Flavor> reversed() {
        return Comparator.super.reversed();
    }

    /*@Override
    public int compare(org.launchcode.java.demos.lsn7interfaces.Flavor o1, org.launchcode.java.demos.lsn7interfaces.Flavor o2) {
        return o1.getName().compareTo(o2.getName());
    }*/
}
