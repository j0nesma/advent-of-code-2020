package matthew.jones.advent.of.code.days.day4.keyValues;

public class Height extends AbstractKeyValue {

    public static final int SUFFIX_LENGTH = 2;
    public static final String CENTIMETER = "cm";
    public static final String INCH = "in";
    private static final String KEY = "hgt";

    @Override
    public boolean isValid(String value) {
        String suffix = value.substring(value.length() - SUFFIX_LENGTH);
        int prefix;
        try {
            prefix = Integer.parseInt(value.substring(0, value.length() - SUFFIX_LENGTH));
        } catch (NumberFormatException e) {
            return false;
        }
        if (suffix.equals(CENTIMETER)) {
            return prefix >= 150 && prefix <= 193;
        }
        if (suffix.equals(INCH)) {
            return prefix >= 59 && prefix <= 76;
        }
        return false;
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
