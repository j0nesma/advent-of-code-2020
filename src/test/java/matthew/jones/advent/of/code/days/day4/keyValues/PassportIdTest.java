package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassportIdTest {

    private PassportId underTest;

    @BeforeEach
    void setUp() {
        underTest = new PassportId();
    }

    @Test
    void isValid() {
        assertTrue(underTest.isValid("012345678"));
        assertTrue(underTest.isValid("123456789"));
        assertFalse(underTest.isValid("#123abz"));
        assertFalse(underTest.isValid("1234567890"));
        assertFalse(underTest.isValid("123456"));
    }

    @Test
    void getKey() {
        assertEquals("pid", underTest.getKey());
    }
}