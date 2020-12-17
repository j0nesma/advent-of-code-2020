package matthew.jones.advent.of.code;

import com.google.common.base.Charsets;
import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.DayManager;
import matthew.jones.advent.of.code.days.day1.Day1;
import matthew.jones.advent.of.code.days.day2.Day2;
import matthew.jones.advent.of.code.days.day3.Day3;
import matthew.jones.advent.of.code.days.day4.Day4;
import matthew.jones.advent.of.code.days.day5.Day5;
import matthew.jones.advent.of.code.days.day6.Day6;
import matthew.jones.advent.of.code.days.day7.Day7;
import matthew.jones.advent.of.code.days.day8.Day8;

import java.io.IOException;
import java.net.URL;

@Slf4j
public class AdventOfCode {

    public static void main(String[] args) {
        DayManager dayManager = new DayManager();

        dayManager.addDay(new Day1(getData("day1.txt")));
        dayManager.addDay(new Day2(getData("day2.txt")));
        dayManager.addDay(new Day3(getData("day3.txt")));
        dayManager.addDay(new Day4(getData("day4.txt")));
        dayManager.addDay(new Day5(getData("day5.txt")));
        dayManager.addDay(new Day6(getData("day6.txt")));
        dayManager.addDay(new Day7(getData("day7.txt")));
        dayManager.addDay(new Day8(getData("day8.txt")));

        dayManager.run();
    }

    private static String getData(String path) {
        URL url = com.google.common.io.Resources.getResource(path);
        try {
            return com.google.common.io.Resources.toString(url, Charsets.UTF_8);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
