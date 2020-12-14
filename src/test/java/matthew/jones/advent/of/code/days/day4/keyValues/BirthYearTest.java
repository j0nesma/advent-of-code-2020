package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirthYearTest {

    private BirthYear underTest;

    @BeforeEach
    void setUp() {
        underTest = new BirthYear();
    }

    @Test
    void isValid() {
        assertTrue(underTest.isValid("1920"));
        assertTrue(underTest.isValid("2002"));
        assertFalse(underTest.isValid("1919"));
        assertFalse(underTest.isValid("2003"));
    }

    @Test
    void getKey() {
        assertEquals("byr", underTest.getKey());
    }
}