package matthew.jones.advent.of.code.days.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day8Test {

    //nop +0  | 1
//acc +1  | 2, 8(!)
//jmp +4  | 3
//acc +3  | 6
//jmp -3  | 7
//acc -99 |
//acc +1  | 4
//jmp -4  | 5
//acc +6  |
    @Test
    void test() {
        //GIVEN
        Day8 undertest = new Day8("nop +0\r\n" +
                "acc +1\r\n" +
                "jmp +4\r\n" +
                "acc +3\r\n" +
                "jmp -3\r\n" +
                "acc -99\r\n" +
                "acc +1\r\n" +
                "jmp -4\r\n" +
                "acc +6");
        //WHEN
        int actual = undertest.runCode();

        //THEN
        assertEquals(5, actual);
    }

}