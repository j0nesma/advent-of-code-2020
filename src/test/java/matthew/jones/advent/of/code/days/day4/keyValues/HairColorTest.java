package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HairColorTest {


    private HairColor underTest;

    @BeforeEach
    void setUp() {
        underTest = new HairColor();
    }

    @Test
    void isValid() {
        assertTrue(underTest.isValid("#123abc"));
        assertFalse(underTest.isValid("#123abz"));
        assertFalse(underTest.isValid("123abc"));
    }

    @Test
    void getKey() {
        assertEquals("hcl", underTest.getKey());
    }
}