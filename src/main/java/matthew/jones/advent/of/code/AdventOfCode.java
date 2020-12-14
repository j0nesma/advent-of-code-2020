package matthew.jones.advent.of.code;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import matthew.jones.advent.of.code.days.DayManager;
import matthew.jones.advent.of.code.days.day1.Day1;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdventOfCode {
    public static final Logger LOGGER = Logger.getLogger(AdventOfCode.class.getName());
    public static final ClassLoader CLASS_LOADER = AdventOfCode.class.getClassLoader();

    public static void main(String[] args) throws IOException {
        LOGGER.setLevel(Level.INFO);
        DayManager dayManager = new DayManager();
        LOGGER.log(Level.INFO, "Adding Day");
        dayManager.addDay(new Day1(getData("day1.txt")));

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
