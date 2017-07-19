package tddmicroexercises.tirepressuremonitoringsystem;

public class Alarm
{
    private final double LowPressureThreshold = 17;
    private final double HighPressureThreshold = 21;

    boolean alarmOn = false;

    public void check(double psiPressureValue)
    {

        if (psiPressureValue < LowPressureThreshold || HighPressureThreshold < psiPressureValue)
        {
            alarmOn = true;
        }
    }

    public boolean isAlarmOn()
    {
        return alarmOn; 
    }

    public double getHighPressureThreshold() {
        return HighPressureThreshold;
    }

    public double getLowPressureThreshold() {
        return LowPressureThreshold;
    }
}
