package junit;

import static org.junit.Assert.*;
import org.junit.Test;


public class CalculateTest {
    Calculate calculate=new Calculate();
    int sum = calculate.sum(2,5);
    int testSum=10;

    @Test
    public void testSum(){
        System.out.println("@Test sum():"+sum+"="+testSum);
        assertEquals(sum, testSum);
}
}
