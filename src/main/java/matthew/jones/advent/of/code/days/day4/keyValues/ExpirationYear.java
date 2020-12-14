package matthew.jones.advent.of.code.days.day4.keyValues;

public class ExpirationYear extends AbstractKeyValue {
    public static final int REQ_LENGTH = 4;
    public static final int MIN_YEAR = 2020;
    public static final int MAX_YEAR = 2030;
    private static final String KEY = "eyr";

    @Override
    public boolean isValid(String value) {
        return isValidYear(value, REQ_LENGTH, MIN_YEAR, MAX_YEAR);
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
