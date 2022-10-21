package com.Security;

public interface AlertCompany {
    void register(AlertSystems addAlertSystems);

    void unregister(AlertSystems removeAlertSystems);

    void notifySystems(String message);
}
