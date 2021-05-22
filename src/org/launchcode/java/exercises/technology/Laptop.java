package org.launchcode.java.exercises.technology;

public class Laptop extends Computer{
    private int screenSize;

    public Laptop(String aBrand, String aOperatingSystem, int aBatteryLevel, int aScreenSize){
        super(aBrand, aOperatingSystem, aBatteryLevel);
        this.screenSize = aScreenSize;
        this.storageRemaining = 256;
    }

    public void downloadProgram(int fileSize){
        if (fileSize <= storageRemaining) {
            this.storageRemaining -= fileSize;
        } else {
            throw new IllegalArgumentException("File size cannot exceed storage space remaining.");
        }
    }




}
