package matthew.jones.advent.of.code.days.day4;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.days.day4.keyValues.*;
import matthew.jones.advent.of.code.util.StringUtils;

import java.util.ArrayList;
import java.util.Map;

//https://adventofcode.com/2020/day/4
@Slf4j
public class Day4 extends AbstractDay {
    public static Map<String, AbstractKeyValue> validColumns = Map.of("byr", new BirthYear(),
            "iyr", new IssueYear(),
            "eyr", new ExpirationYear(),
            "hgt", new Height(),
            "hcl", new HairColor(),
            "ecl", new EyeColor(),
            "pid", new PassportId(),
            "cid", new CountryId());
    public ArrayList<String> requiredColumns;

    public Day4(String data) {
        super(data);
    }

    @Override
    public void run() {
        log.info("Day4 - Valid passports = " + testPassports());
    }

    private void reset() {
        requiredColumns = Lists.newArrayList("byr", "iyr", "eyr", "hgt", "hcl", "ecl", "pid");
    }

    public int testPassports() {
        String[] split = StringUtils.split(getData());
        reset();
        int count = 0;
        int i = 0;
        for (String value : split) {
            if (value.equals("")) {
                if (requiredColumns.size() == 0) {
                    count++;
                }
                reset();
            } else {
                String[] details = value.split(" ");
                for (String detail : details) {
                    String[] keyValue = detail.split(":");
                    String key = keyValue[0];
                    String val = keyValue[1];
                    if (containsValidKey(key, val)) {
                        requiredColumns.remove(key);
                    }
                }
            }
            i++;
        }
        if (requiredColumns.size() == 0) {
            count++;
        }
        return count;
    }

    private boolean containsValidKey(String key, String val) {
        return validColumns.containsKey(key) &&
                validColumns.get(key).isValid(val);
    }
}
