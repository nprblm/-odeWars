package kyu_8;
import static org.junit.Assert.*;
import org.junit.Test;
//https://www.codewars.com/kata/568dcc3c7f12767a62000038/java

public class AlarmTest {

    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", Alarm.setAlarm(true, false));
        assertFalse("Should be false.", Alarm.setAlarm(true, true));
        assertFalse("Should be false.", Alarm.setAlarm(false, false));
        assertFalse("Should be false.", Alarm.setAlarm(false, true));
    }

}
