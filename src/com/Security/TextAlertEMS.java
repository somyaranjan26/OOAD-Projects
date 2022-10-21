package com.Security;

public class TextAlertEMS implements AlertSystems{
    @Override
    public void EmergencyAlert(String message) {
        System.out.println("Text Message Alert");
    }
}
