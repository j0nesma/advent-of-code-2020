package matthew.jones.advent.of.code.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtils {
    public static List<Integer> convertStringToIntegerList(String integerString){
        String[] splitNumbers = split(integerString);
        return Arrays.stream(splitNumbers)
                .map(Integer::parseInt)
                . collect(Collectors.toList());
    }

    public static String[] split(String integerString) {
        return integerString.split("\r\n");
    }
}
