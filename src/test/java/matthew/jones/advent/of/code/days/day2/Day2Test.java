package matthew.jones.advent.of.code.days.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {

    @Test
    void test() {
        //GIVEN
        String exampleString = "1-3 a: abcde\r\n1-3 b: cdefg\r\n2-9 c: ccccccccc";
        Day2 underTest = new Day2(exampleString);
        //WHEN
        Integer actual = underTest.checkPasswords();
        //THEN
        assertEquals(2, actual);
    }

    @Test
    void part2() {
        //GIVEN
        String exampleString = "1-3 a: abcde\r\n1-3 b: cdefg\r\n2-9 c: ccccccccc";
        Day2 underTest = new Day2(exampleString);
        //WHEN
        Integer actual = underTest.checkPasswordsNewPolicy();
        //THEN
        assertEquals(1, actual);
    }
}