package matthew.jones.advent.of.code.days.day4.keyValues;

public class HairColor extends AbstractKeyValue {
    public static final String REGEX = "#[a-f,0-9]{6}";
    private static final String KEY = "hcl";

    @Override
    public boolean isValid(String value) {
        return value.matches(REGEX);
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
