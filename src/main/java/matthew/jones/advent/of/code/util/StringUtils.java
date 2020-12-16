package matthew.jones.advent.of.code.util;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {

    public static final String EOL = "\r\n";

    public static List<Integer> convertStringToIntegerList(String integerString) {
        String[] splitNumbers = split(integerString);
        return Arrays.stream(splitNumbers)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public static String[] split(String integerString) {
        return integerString.split(EOL);
    }

    public static List<String> splitToList(String data) {
        return Arrays.asList(data.split(EOL));
    }

    public static ArrayList<String> splitToArrayList(String data) {
        return Lists.newArrayList(splitToList(data));
    }
}
