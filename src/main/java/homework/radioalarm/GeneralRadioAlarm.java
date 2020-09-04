package homework.radioalarm;

public class GeneralRadioAlarm implements RadioAlarm {
    private Alarm alarmImpl;
    private Radio radioImpl;

    public GeneralRadioAlarm(Alarm alarmImpl, Radio radioImpl) {
        this.alarmImpl = alarmImpl;
        this.radioImpl = radioImpl;
    }


    @Override
    public void a() {
        alarmImpl.a();
    }

    @Override
    public void b() {
        alarmImpl.b();
    }

    @Override
    public void c() {
        radioImpl.c();
    }

    @Override
    public void d() {
        radioImpl.d();
    }
}
