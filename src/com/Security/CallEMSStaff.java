package com.Security;

public class CallEMSStaff implements AlertSystems {
    @Override
    public void EmergencyAlert(String message) {
        System.out.println("Call(Message Alert)");
    }
}
