package org.launchcode.java.exercises.technology;

public class Computer extends AbstractEntity{
    private String brand = new String();
    private String operatingSystem;
    private int batteryLevel;
    public int storageRemaining;

    public Computer(String aBrand, String aOperatingSystem, int aBatteryLevel){
        this.brand = aBrand;
        this.operatingSystem = aOperatingSystem;
        this.batteryLevel = aBatteryLevel;

    }

    public void regularUsage(int hours){
        this.batteryLevel -= hours*10;
        if(this.batteryLevel < 0){
            this.batteryLevel = 0;
        }
    }

    public void chargeDevice(int hours){
        this.batteryLevel += hours*5;
        if (this.batteryLevel > 100) {
            this.batteryLevel = 100;
        }
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }

    public int getStorageRemaining(){
        return storageRemaining;
    }

    //@Override
    //public int getMachineId() {
      //  return newId;
    //}

}
