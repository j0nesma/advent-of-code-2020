package matthew.jones.advent.of.code.days.day4.keyValues;

import java.util.List;

public class EyeColor extends AbstractKeyValue {
    public static final List<String> COLORS = List.of("amb", "blu", "brn", "gry", "grn", "hzl", "oth");
    private static final String KEY = "ecl";

    @Override
    public boolean isValid(String value) {
        return COLORS.contains(value);
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
