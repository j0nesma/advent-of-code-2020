package matthew.jones.advent.of.code.days.day6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day6Test {
    @Test
    void test() {
        //GIVEN
        String exampleString = "abc\r\n" +
                "\r\n" +
                "a\r\n" +
                "b\r\n" +
                "c\r\n" +
                "\r\n" +
                "ab\r\n" +
                "ac\r\n" +
                "\r\n" +
                "a\r\n" +
                "a\r\n" +
                "a\r\n" +
                "a\r\n" +
                "\r\n" +
                "b\r\n" +
                "\r\n";
        Day6 underTest = new Day6(exampleString);
        //WHEN
        int actual = underTest.customDeclarationForm();
        //THEN
        assertEquals(11, actual);
    }

    @Test
    void part2() {
        //GIVEN
        String exampleString = "abc\r\n" +
                "\r\n" +
                "a\r\n" +
                "b\r\n" +
                "c\r\n" +
                "\r\n" +
                "ab\r\n" +
                "ac\r\n" +
                "\r\n" +
                "a\r\n" +
                "a\r\n" +
                "a\r\n" +
                "a\r\n" +
                "\r\n" +
                "b\r\n";
        Day6 underTest = new Day6(exampleString);
        //WHEN
        int actual = underTest.customDeclarationFormWhoAnswered();
        //THEN
        assertEquals(6, actual);
    }
}