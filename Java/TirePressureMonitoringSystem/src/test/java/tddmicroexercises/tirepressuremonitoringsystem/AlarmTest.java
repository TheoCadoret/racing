package tddmicroexercises.tirepressuremonitoringsystem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by theoc on 19/07/2017.
 */
public class AlarmTest {


    @Test
    public void should_not_ring_when_pressure_is_between_boundaries() {

        //given
        Alarm testAlarm = new Alarm();

        //when
        double testedPressure = (testAlarm.getHighPressureThreshold()+testAlarm.getLowPressureThreshold())/2;

        //then

            testAlarm.check(testedPressure);
            assertFalse(testAlarm.alarmOn);

    }

    @Test
    public void should_ring_when_pressure_is_not_between_boundaries() {

        //given
        Alarm testAlarm = new Alarm();

        //when
        double testedPressure = testAlarm.getLowPressureThreshold()-1;

        //then

        testAlarm.check(testedPressure);
        assertTrue(testAlarm.alarmOn);

    }


    @Test
    public void should_return_true_when_alarm_is_on() throws Exception {
        //given
        Alarm testAlarm = new Alarm();

        //when

    }

}