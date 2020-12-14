package matthew.jones.advent.of.code.days.day4.keyValues;

public class BirthYear extends AbstractKeyValue {
    public static final int MIN_YEAR = 1920;
    public static final int MAX_YEAR = 2002;
    public static final int REQ_LENGTH = 4;
    private static final String KEY = "byr";

    public boolean isValid(String value) {
        return isValidYear(value, REQ_LENGTH, MIN_YEAR, MAX_YEAR);
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
