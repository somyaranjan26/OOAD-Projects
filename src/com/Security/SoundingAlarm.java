package com.Security;

public class SoundingAlarm implements AlertSystems {
    @Override
    public void EmergencyAlert(String message) {
        System.out.println("Make Alert Sound");
    }
}
