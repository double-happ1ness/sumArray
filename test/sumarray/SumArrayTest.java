/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarray;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumArrayTest {

    public SumArrayTest() {
    }

    @Test
    public void testSumArray() {
        int[] intArray = new int[]{2, 3, 4};
        int expectedResult = 9;
        assertEquals(expectedResult, SumArray.sumArray(intArray)); 
//        fail("The test case is a prototype.");
    }
}
