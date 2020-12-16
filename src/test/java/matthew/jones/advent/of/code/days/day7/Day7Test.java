package matthew.jones.advent.of.code.days.day7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Day7Test {
    @Test
    void test() {
        // GIVEN
        Day7 underTest = new Day7("light red bags contain 1 bright white bag, 2 muted yellow bags.\r\n" +
                "dark orange bags contain 3 bright white bags, 4 muted yellow bags.\r\n" +
                "bright white bags contain 1 shiny gold bag.\r\n" +
                "muted yellow bags contain 2 shiny gold bags, 9 shiny gold bags.\r\n" +
                "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.\r\n" +
                "dark olive bags contain 3 faded blue bags, 4 dotted black bags.\r\n" +
                "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.\r\n" +
                "faded blue bags contain no other bags.\r\n" +
                "dotted black bags contain no other bags.");
        // WHEN
        int actual = underTest.howManyBagsssss();
        // THEN
        assertEquals(4, actual);
    }

    @Test
    void part2() {
        // GIVEN
        Day7 underTest = new Day7("shiny gold bags contain 2 dark red bags.\r\n" +
                "dark red bags contain 2 dark orange bags.\r\n" +
                "dark orange bags contain 2 dark yellow bags.\r\n" +
                "dark yellow bags contain 2 dark green bags.\r\n" +
                "dark green bags contain 2 dark blue bags.\r\n" +
                "dark blue bags contain 2 dark violet bags.\r\n" +
                "dark violet bags contain no other bags.");
        // WHEN
        int actual = underTest.howManyBagsssssPart2();
        // THEN
        assertEquals(126, actual);
    }

    @Test
    void part2_1() {
        // GIVEN
        Day7 underTest = new Day7("light red bags contain 1 bright white bag, 2 muted yellow bags.\r\n" +
                "dark orange bags contain 3 bright white bags, 4 muted yellow bags.\r\n" +
                "bright white bags contain 1 shiny gold bag.\r\n" +
                "muted yellow bags contain 2 shiny gold bags, 9 faded blue bags.\r\n" +
                "shiny gold bags contain 1 dark olive bag, 2 vibrant plum bags.\r\n" +
                "dark olive bags contain 3 faded blue bags, 4 dotted black bags.\r\n" +
                "vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.\r\n" +
                "faded blue bags contain no other bags.\r\n" +
                "dotted black bags contain no other bags.");
        // WHEN
        int actual = underTest.howManyBagsssssPart2();
        // THEN
        assertEquals(32, actual);
    }
}