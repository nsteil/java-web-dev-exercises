package org.launchcode.java.exercises.technology;

public abstract class AbstractEntity {
    private static int machineId = 1;
    protected int newId;
    public AbstractEntity() {
        newId = machineId;
        machineId++;
    }
}
