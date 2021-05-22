package org.launchcode.java.exercises.technology;

public class Smartphone extends Computer{
    private String phoneCarrier;

    public Smartphone(String aBrand, String aOperatingSystem, int aBatteryLevel, String aPhoneCarrier){
        super(aBrand,aOperatingSystem,aBatteryLevel);
        this.phoneCarrier = aPhoneCarrier;
    }

    public Smartphone(String aBrand, String aOperatingSystem, int aBatteryLevel){
        super(aBrand,aOperatingSystem,aBatteryLevel);
        this.phoneCarrier = null;
    }

    public String makeCall(){
        if (phoneCarrier == null){
            return "Call cannot be completed as dialed.";
        } else {
            return "Thanks for using " + this.phoneCarrier;
        }
    }
}
