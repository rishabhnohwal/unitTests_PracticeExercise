package unitTests_PracticeExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTests {

//    Sum Method Tests

    @Test
    void givenBothPositiveIntegersThenReturnSum(){
        assertEquals(7,Calculate.addSum(3,4));
    }

    @Test
    void givenBothZeroThenReturnSum(){
        assertEquals(0,Calculate.addSum(0,0));
    }

    @Test
    void givenOnePositiveAndOneNegativeIntegerThenReturnSum(){
        assertEquals(4,Calculate.addSum(8,-4));
    }

    @Test
    void givenBothNegativeIntegerThenReturnSum(){
        assertEquals(-10,Calculate.addSum(-6,-4));
    }

    @Test
    void givenOnePositiveIntegerAndZeroThenReturnSum(){
        assertEquals(27,Calculate.addSum(0,27));
    }

    @Test
    void givenOneNegativeIntegerAndZeroThenReturnSum(){
        assertEquals(-1,Calculate.addSum(-1,0));
    }

//    Even Method Tests

    @Test
    void givenZeroThenReturnTrue(){
        assertTrue(Calculate.isEven(0));
    }

    @Test
    void givenPositiveEvenIntegerThenReturnTrue(){
        assertTrue(Calculate.isEven(8));
    }

    @Test
    void givenPositiveOddIntegerThenReturnFalse(){
        assertFalse(Calculate.isEven(9));
    }

    @Test
    void givenNegativeEvenIntegerThenReturnTrue(){
        assertTrue(Calculate.isEven(-20));
    }

    @Test
    void givenNegativeOddIntegerThenReturnFalse(){
        assertFalse(Calculate.isEven(-7));
    }


}