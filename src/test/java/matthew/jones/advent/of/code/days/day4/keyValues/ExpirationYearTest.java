package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpirationYearTest {

    private ExpirationYear underTest;

    @BeforeEach
    void setUp() {
        underTest = new ExpirationYear();
    }

    @Test
    void isValid() {
        assertTrue(underTest.isValid("2020"));
        assertTrue(underTest.isValid("2030"));
        assertFalse(underTest.isValid("2019"));
        assertFalse(underTest.isValid("2031"));
        assertFalse(underTest.isValid("20311"));
        assertFalse(underTest.isValid("2fdsfds"));
    }

    @Test
    void getKey() {
        assertEquals("eyr", underTest.getKey());
    }
}