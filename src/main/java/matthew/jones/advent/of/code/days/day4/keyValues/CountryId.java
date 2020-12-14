package matthew.jones.advent.of.code.days.day4.keyValues;

public class CountryId extends AbstractKeyValue {

    private static final String KEY = "cid";

    @Override
    public boolean isValid(String value) {
        return true;
    }

    @Override
    public String getKey() {
        return KEY;
    }
}
