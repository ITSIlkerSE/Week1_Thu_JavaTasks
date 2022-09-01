import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElseAlarmTest {
    @Test
    static void PersonsOver30() {

        //Given
        int count = 31;

        //When
        String actual = IfAlarm.IfOver30(count);

        //Then
        assertEquals("Zu viele Personen", actual);
    }

    @Test
    void IfUnder30() {

        //Given
        int count = 29;

        //When
        String actual = IfAlarm.IfOver30(count);

        //Then
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }


}