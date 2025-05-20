package Lesson_9.FizzBuzzTranslate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void testFizz_DivisibleBy3() {
        assertEquals("Fizz", FizzBuzzTranslate.fizzBuzz(3));
        assertEquals("Fizz", FizzBuzzTranslate.fizzBuzz(6));
        assertEquals("Fizz", FizzBuzzTranslate.fizzBuzz(9));
    }

    @Test
    void testBuzz_DivisibleBy5() {
        assertEquals("Buzz", FizzBuzzTranslate.fizzBuzz(5));
        assertEquals("Buzz", FizzBuzzTranslate.fizzBuzz(10));
        assertEquals("Buzz", FizzBuzzTranslate.fizzBuzz(20));
    }

    @Test
    void testFizzBuzz_DivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.fizzBuzz(15));
        assertEquals("FizzBuzz", FizzBuzzTranslate.fizzBuzz(30));
        assertEquals("FizzBuzz", FizzBuzzTranslate.fizzBuzz(45));
    }

    @Test
    void testReadNumber_NumberContains3Or5() {
        assertEquals("một ba", FizzBuzzTranslate.readNumber(13));
        assertEquals("hai năm", FizzBuzzTranslate.readNumber(25));
        assertEquals("ba năm", FizzBuzzTranslate.readNumber(35));
    }

    @Test
    void testReadNumber_SingleDigit() {
        assertEquals("không", FizzBuzzTranslate.readNumber(0));
        assertEquals("bảy", FizzBuzzTranslate.readNumber(7));
        assertEquals("chín", FizzBuzzTranslate.readNumber(9));
    }

    @Test
    void testReadNumber_TwoDigits() {
        assertEquals("hai không", FizzBuzzTranslate.readNumber(20));
        assertEquals("một hai", FizzBuzzTranslate.readNumber(12));
        assertEquals("bốn bảy", FizzBuzzTranslate.readNumber(47));
    }

}