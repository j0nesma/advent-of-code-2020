package matthew.jones.advent.of.code.days.day2;

import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.util.StringUtils;

//https://adventofcode.com/2020/day/2
@Slf4j
public class Day2 extends AbstractDay {

    public static final int RULE_DEFINITION = 0;
    public static final int PASSWORD = 1;
    public static final int RULE = 0;
    public static final int CHARACTER = 1;
    public static final int RULE_MAX = 0;
    public static final int RULE_MIN = 1;
    public static final String ROW_SPLIT_CHARACTER = ":";
    public static final String RULES_SPLIT_CHARACTER = " ";
    public static final String MIN_MAX_SPLIT_CHARACTER = "-";
    private String password;
    private char value;
    private int ruleMin;
    private int ruleMax;

    public Day2(String data) {
        super(data);
    }

    @Override
    public void run() {
        log.info("Day2 - Number of Valid Passwords =" + checkPasswords());
        log.info("Day2 - Number of Valid Passwords NEW POLICY =" + checkPasswordsNewPolicy());
    }

    public Integer checkPasswords() {
        String[] dataRow = StringUtils.split(getData());
        Integer count = 0;
        for (String row : dataRow) {
            extractData(row);
            if (validPassword(password, value, ruleMin, ruleMax)) {
                count++;
            }
        }
        return count;
    }

    public Integer checkPasswordsNewPolicy() {
        String[] dataRow = StringUtils.split(getData());
        int count = 0;
        for (String row : dataRow) {
            extractData(row);
            if (characterInValidPosition(password, value, ruleMin, ruleMax)) {
                count++;
            }
        }
        return count;
    }

    private boolean characterInValidPosition(String password, char value, int ruleMin, int ruleMax) {
        return password.charAt(ruleMin) == value ^ password.charAt(ruleMax) == value;
    }

    private boolean validPassword(String password, char value, int ruleMin, int ruleMax) {
        int count = countValueInPassword(password, value, 0);
        return count <= ruleMax && count >= ruleMin;
    }

    private int countValueInPassword(String password, char value, int index) {
        if (index >= password.length()) {
            return 0;
        }
        int count = password.charAt(index) == value ? 1 : 0;
        return count + countValueInPassword(password, value, index + 1);
    }

    private void extractData(String row) {
        String[] dataColumns = row.split(ROW_SPLIT_CHARACTER);
        password = dataColumns[PASSWORD];
        String[] rules = dataColumns[RULE_DEFINITION].split(RULES_SPLIT_CHARACTER);
        value = rules[CHARACTER].charAt(0);
        String rule = rules[RULE];
        String[] ruleMinMax = rule.split(MIN_MAX_SPLIT_CHARACTER);
        ruleMin = Integer.parseInt(ruleMinMax[RULE_MAX]);
        ruleMax = Integer.parseInt(ruleMinMax[RULE_MIN]);
    }
}

