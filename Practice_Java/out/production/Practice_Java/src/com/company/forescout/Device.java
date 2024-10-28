package com.company.forescout;/*
 * @author -Suraj Tiwari
 */
import java.util.ArrayList;
import java.util.List;

class Device {
    private int internalTimer;

    public Device(int initialTimer) {
        this.internalTimer = initialTimer;
    }

    public void updateTimer() {
        if (internalTimer > 0) {
            internalTimer--;
        }
    }

    public boolean infectNewDevice(List<Device> devices) {
        if (internalTimer == 0) {
            devices.add(new Device(8)); // New device with initial timer 8
            internalTimer = 6; // Reset timer
            return true;
        }
        return false;
    }
}



