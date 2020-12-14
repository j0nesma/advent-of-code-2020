package matthew.jones.advent.of.code;

import com.google.common.base.Charsets;
import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.DayManager;
import matthew.jones.advent.of.code.days.day1.Day1;
import matthew.jones.advent.of.code.days.day2.Day2;
import matthew.jones.advent.of.code.days.day3.Day3;

import java.io.IOException;
import java.net.URL;

@Slf4j
public class AdventOfCode {

    public static void main(String[] args) {
        DayManager dayManager = new DayManager();

        dayManager.addDay(new Day1(getData("day1.txt")));
        dayManager.addDay(new Day2(getData("day2.txt")));
        dayManager.addDay(new Day3(getData("day3.txt")));

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
