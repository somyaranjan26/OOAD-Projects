import com.Security.*;

public class Main {

    public static void main(String[] args) {

        Company rowan = new Company();

        EmailAlert emailAlert = new EmailAlert();
        CallEMSStaff callEMSStaff = new CallEMSStaff();
        TextAlertEMS textAlertEMS = new TextAlertEMS();
        SoundingAlarm soundingAlarm = new SoundingAlarm();

        rowan.register(emailAlert);
        rowan.register(callEMSStaff);
        rowan.register(textAlertEMS);
        rowan.register(soundingAlarm);

        rowan.notifySystems("Fire");

    }
}