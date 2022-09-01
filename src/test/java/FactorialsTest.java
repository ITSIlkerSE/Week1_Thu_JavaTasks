
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialsTest {

    @Test
    void factorialFor3()
    {
        //Given
        int number = 3;
        //When
        int actual = Factorials.factorialsMethod(number);
        //Then
        assertEquals(6, actual);
    }
    @Test
    void factorialFor5()
    {
        //Given
        int number = 5;
        //When
        int actual = Factorials.factorialsMethod(number);
        //Then
        assertEquals(120, actual);
    }

}