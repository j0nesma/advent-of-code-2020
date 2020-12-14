package matthew.jones.advent.of.code.days.day4.keyValues;

public abstract class AbstractKeyValue {
    public abstract boolean isValid(String value);

    abstract String getKey();

    public boolean isValidYear(String value, int length, int minYear, int maxYear) {
        if (value.length() == length) {
            int year = Integer.parseInt(value);
            return year >= minYear && year <= maxYear;
        }
        return false;
    }
}
