package matthew.jones.advent.of.code.days.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day3Test {

    @Test
    void shouldTraverseCorrectly() {
        //GIVEN
        String map = "..##.......\r\n" +
                "#...#...#..\r\n" +
                ".#....#..#.\r\n" +
                "..#.#...#.#\r\n" +
                ".#...##..#.\r\n" +
                "..#.##.....\r\n" +
                ".#.#.#....#\r\n" +
                ".#........#\r\n" +
                "#.##...#...\r\n" +
                "#...##....#\r\n" +
                ".#..#...#.#";
        Day3 underTest = new Day3(map);
        int x = 3;
        int y = 1;
        //WHEN
        int actual = underTest.traverseMap(x, y);
        //THEN
        assertEquals(7, actual);
    }
}