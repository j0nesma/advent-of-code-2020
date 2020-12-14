package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EyeColorTest {

    private EyeColor underTest;

    @BeforeEach
    void setUp() {
        underTest = new EyeColor();
    }

    @Test
        //amb blu brn gry grn hzl oth
    void isValid() {
        assertTrue(underTest.isValid("amb"));
        assertTrue(underTest.isValid("blu"));
        assertTrue(underTest.isValid("brn"));
        assertTrue(underTest.isValid("gry"));
        assertTrue(underTest.isValid("grn"));
        assertTrue(underTest.isValid("hzl"));
        assertTrue(underTest.isValid("oth"));
        assertFalse(underTest.isValid("#123abz"));
        assertFalse(underTest.isValid("123abc"));
    }

    @Test
    void getKey() {
        assertEquals("ecl", underTest.getKey());
    }
}