package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IssueYearTest {

    private IssueYear underTest;

    @BeforeEach
    void setUp() {
        underTest = new IssueYear();
    }

    @Test
    void isValid() {
        assertTrue(underTest.isValid("2010"));
        assertTrue(underTest.isValid("2020"));
        assertFalse(underTest.isValid("2009"));
        assertFalse(underTest.isValid("2021"));
    }

    @Test
    void getKey() {
        assertEquals("iyr", underTest.getKey());
    }
}