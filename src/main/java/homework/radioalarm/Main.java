package homework.radioalarm;

public class Main {
    public static void main(String[] args) {
        var alarm = new BestAlarm();
        var radio = new BestRadio();
        var radioAlarm = new GeneralRadioAlarm(alarm, radio);

        radioAlarm.a();
        radioAlarm.b();
        radioAlarm.c();
        radioAlarm.d();

        var bestRadioAlarm = BestRadioAlarm.create();
        bestRadioAlarm.a();
        bestRadioAlarm.c();
    }
}
