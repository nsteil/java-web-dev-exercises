package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {


    @Override
    public int compare(org.launchcode.java.demos.lsn7interfaces.Cone o1, org.launchcode.java.demos.lsn7interfaces.Cone o2) {
        if (o1.getCost() - o2.getCost() > 0) {
            return 1;
        } else if (o1.getCost() - o2.getCost() < 0) {
            return -1;
        } else /*if (o1.getCost() - o2.getCost() == 0) */{
            return 0;
        }
    }

}
