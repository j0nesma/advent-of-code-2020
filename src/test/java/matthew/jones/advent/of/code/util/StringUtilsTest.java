package matthew.jones.advent.of.code.util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilsTest {

    @Test
    void convertStringToIntegerList() {
        //GIVEN
        String testString = "1721\r\n366\r\n299\r\n675\r\n1456";
        List<Integer> expected = List.of(1721, 366, 299, 675, 1456);
        //WHEN
        List<Integer> actual = StringUtils.convertStringToIntegerList(testString);
        //THEN
        assertEquals(expected,actual);
    }
}