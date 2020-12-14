package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightTest {

    private Height underTest;

    @BeforeEach
    void setup() {
        underTest = new Height();
    }

    @Test
    void isValid() {
        assertTrue(underTest.isValid("150cm"));
        assertTrue(underTest.isValid("193cm"));
        assertTrue(underTest.isValid("160cm"));
        assertTrue(underTest.isValid("59in"));
        assertTrue(underTest.isValid("76in"));
        assertFalse(underTest.isValid("149cm"));
        assertFalse(underTest.isValid("194cm"));
        assertFalse(underTest.isValid("58in"));
        assertFalse(underTest.isValid("77in"));
    }

    @Test
    void getKey() {
        assertEquals("hgt", underTest.getKey());
    }
}