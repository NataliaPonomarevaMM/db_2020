package homework.radioalarm;

public class BestRadioAlarm extends GeneralRadioAlarm {
    private BestRadioAlarm(Alarm alarmImpl, Radio radioImpl) {
        super(alarmImpl, radioImpl);
    }

    public static BestRadioAlarm create() {
        var alarm = new BestAlarm();
        var radio = new BestRadio();
        return new BestRadioAlarm(alarm, radio);
    }
}
