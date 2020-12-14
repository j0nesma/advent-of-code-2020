package matthew.jones.advent.of.code.days.day4.keyValues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CountryIdTest {

    private CountryId underTest;

    @BeforeEach
    void setUp() {
        underTest = new CountryId();
    }

    @Test
    void isValid() {
        assertTrue(underTest.isValid("ADNUEIRFNEWIURFWENR"));
    }

    @Test
    void getKey() {
        assertEquals("cid", underTest.getKey());
    }
}