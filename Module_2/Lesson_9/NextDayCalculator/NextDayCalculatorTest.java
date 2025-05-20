package Lesson_9.NextDayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void findNextDay() {
    }

    @Test
    void testNormalDay() {
        assertEquals("02/01/2018", NextDayCalculator.getNextDate(1, 1, 2018));
    }

    @Test
    void testLast31DayMonth() {
        assertEquals("01/02/2018", NextDayCalculator.getNextDate(31, 1, 2018));
    }

    @Test
    void testLast30DayMonth() {
        assertEquals("01/05/2018", NextDayCalculator.getNextDate(30, 4, 2018));
    }

    @Test
    void test28FebruaryMonth() {
        assertEquals("01/03/2018", NextDayCalculator.getNextDate(28, 2, 2018));
    }

    @Test
    void test29FebruaryMonth() {
        assertEquals("01/03/2020", NextDayCalculator.getNextDate(29, 2, 2020));
    }

    @Test
    void testLeapYear() {
        assertEquals("01/01/2019", NextDayCalculator.getNextDate(31, 12, 2018));
    }
}