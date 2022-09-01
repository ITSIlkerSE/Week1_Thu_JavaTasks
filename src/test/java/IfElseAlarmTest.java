import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IfElseAlarmTest {


    @Test
    void IfUnder30() {

        //Given
        int count = 29;

        //When
        String actual = IfElseAlarm.IfOver30(count);

        //Then
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }


}