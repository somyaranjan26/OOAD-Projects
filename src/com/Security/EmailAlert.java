package com.Security;

public class EmailAlert implements AlertSystems {
    @Override
    public void EmergencyAlert(String message) {
        System.out.println("Email Alert To Employee");
    }
}
