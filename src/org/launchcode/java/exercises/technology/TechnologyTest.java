package org.launchcode.java.exercises.technology;

import org.junit.Test;
import static org.junit.Assert.*;

public class TechnologyTest {
    Computer natesRig = new Computer("razer","windows",95);
    Laptop natesSlimPc = new Laptop("apple","macbook", 100, 15);
    Smartphone natesPhone = new Smartphone("apple","iOS",75,"verizon");
    Smartphone randomPhone = new Smartphone("google","android", 65);
    @Test
    public void uniqueIdAssigned(){
        assertFalse(natesRig.newId ==natesSlimPc.newId);
    }

    @Test
    public void batteryUsage(){
        natesRig.regularUsage(2);
        assertEquals(75,natesRig.getBatteryLevel());
    }

    @Test
    public void deviceCharging(){
        natesRig.chargeDevice(4);
        assertEquals(100, natesRig.getBatteryLevel());
    }

    @Test
    public void callConnected(){
        assertEquals("Thanks for using verizon", natesPhone.makeCall());
    }

    @Test
    public void callFailed(){
        assertEquals("Call cannot be completed as dialed.",randomPhone.makeCall());
    }

    @Test
    public void phoneStorage(){
        natesPhone.storageRemaining = 64;
        assertEquals(64,natesPhone.getStorageRemaining());
    }

    @Test
    public void inheritanceBatteryTest(){
        natesSlimPc.regularUsage(4);
        assertTrue(natesSlimPc.getBatteryLevel()==60);
    }

    @Test
    public void storageCheck(){
        natesSlimPc.downloadProgram(3);
        assertEquals(253,natesSlimPc.getStorageRemaining());
    }

    @Test (expected = IllegalArgumentException.class)
    public void fileTooLarge(){
        natesSlimPc.downloadProgram(300);
    }


}
