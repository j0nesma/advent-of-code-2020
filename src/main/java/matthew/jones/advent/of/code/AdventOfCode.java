package matthew.jones.advent.of.code;

import com.google.common.base.Charsets;
import matthew.jones.advent.of.code.days.DayManager;
import matthew.jones.advent.of.code.days.day1.Day1;
import matthew.jones.advent.of.code.days.day2.Day2;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdventOfCode {
    public static final Logger LOGGER = Logger.getLogger(AdventOfCode.class.getName());

    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        DayManager dayManager = new DayManager();
        LOGGER.log(Level.INFO, "Adding Day");
        dayManager.addDay(new Day1(getData("day1.txt")));
        dayManager.addDay(new Day2(getData("day2.txt")));

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
