package com.Security;

import java.util.ArrayList;
import java.util.List;

public class Company implements AlertCompany {
    ArrayList<AlertSystems> alertSystems = new ArrayList<>();

    @Override
    public void register(AlertSystems addAlertSystems) {
        alertSystems.add(addAlertSystems);
    }

    @Override
    public void unregister(AlertSystems removeAlertSystems) {
        alertSystems.remove(removeAlertSystems);
    }


    public void notifySystems(String message) {

        for (AlertSystems alertSystemsLoop : alertSystems) {
            alertSystemsLoop.EmergencyAlert(message);
        }
    }
}
