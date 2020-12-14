package matthew.jones.advent.of.code.days.day4.keyValues;

public class PassportId extends AbstractKeyValue {
    public static final String REGEX = "[0-9]{9}";
    private static final String KEY = "pid";

    @Override
    public boolean isValid(String value) {
        return value.matches(REGEX);
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
