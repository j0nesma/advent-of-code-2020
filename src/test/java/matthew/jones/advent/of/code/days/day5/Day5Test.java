package matthew.jones.advent.of.code.days.day5;

import com.google.common.collect.Lists;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day5Test {

    private static Stream<Arguments> boardingPassArguments() {
        return Stream.of(
                Arguments.of("FBFBBFFRLR", 357),
                Arguments.of("BFFFBBFRRR", 567),
                Arguments.of("FFFBBBFRRR", 119),
                Arguments.of("BBFFBBFRLL", 820),
                Arguments.of("FFFBBBFRRR\r\nBBFFBBFRLL\r\nFFFBBBFRRR", 820)
        );
    }

    @ParameterizedTest
    @MethodSource("boardingPassArguments")
    void boardingPassCheck(String path, int expected) {
        //GIVEN
        String someString = "FBFBBFFRLR";
        Day5 undertest = new Day5(path);
        //WHEN
        int actual = undertest.seatCheck();
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void mySeat() {
        //GIVEN
        ArrayList<Integer> someString = Lists.newArrayList(4, 5, 3, 6, 7, 9);
        Day5 undertest = new Day5("NOTHING");
        //WHEN
        int actual = undertest.mySeat(someString);
        //THEN
        assertEquals(8, actual);
    }
}