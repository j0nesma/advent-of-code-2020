package matthew.jones.advent.of.code.days.day1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @Test
    void part1MultiplyTwoNumbersWhichAddTo2020(){
        //GIVEN
        String exampleString = "1721\r\n366\r\n299\r\n675\r\n1456";
        Day1 undertest = new Day1(exampleString);
        //WHEN
        int actual = undertest.multiplyTwoDigitsWhichAddToMake2020();
        //THEN
        assertEquals(514579, actual);
    }

    @Test
    void part2MultiplyThreeNumbersWhichAddTo2020(){
        //GIVEN
        String exampleString = "1721\r\n" +
                "979\r\n" +
                "366\r\n" +
                "299\r\n" +
                "675\r\n" +
                "1456";
        Day1 undertest = new Day1(exampleString);
        //WHEN
        int actual = undertest.multiplyThreeDigitsWhichAddToMake2020();
        //THEN
        assertEquals(241861950, actual);
    }
}