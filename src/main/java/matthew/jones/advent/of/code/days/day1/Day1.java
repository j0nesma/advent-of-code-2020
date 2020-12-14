package matthew.jones.advent.of.code.days.day1;

import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.util.StringUtils;

import java.util.Collections;
import java.util.List;

//https://adventofcode.com/2020/day/1
@Slf4j
public class Day1 extends AbstractDay {

    private static List<Integer> DATA_LIST;

    public Day1(String data) {
        super(data);
        DATA_LIST = StringUtils.convertStringToIntegerList(getData());
    }

    @Override
    public void run() {
        log.info("Day1 - two digits which add up to make 2020 multiplied =" + multiplyTwoDigitsWhichAddToMake2020());
        log.info("Day1 - three digits which add up to make 2020 multiplied =" + multiplyThreeDigitsWhichAddToMake2020());
    }

    public int multiplyTwoDigitsWhichAddToMake2020() {
        for (Integer item : DATA_LIST) {
            if (makes2020(item)) {
                return item * getExpectedValue(item);
            }
        }
        throw new RuntimeException("No 2020 value provided");
    }

    private boolean makes2020(Integer item) {
        return DATA_LIST.contains(getExpectedValue(item));
    }

    public int multiplyThreeDigitsWhichAddToMake2020() {
        Collections.sort(DATA_LIST);
        for(int i = 0; i < DATA_LIST.size(); i++) {
            Integer lowValue = DATA_LIST.get(i);
            for(int j = 1; j< DATA_LIST.size(); j++) {
                Integer testingValue = DATA_LIST.get(j);
                int total = lowValue + testingValue;
                if (makes2020(total)) {
                    return lowValue * testingValue * getExpectedValue(total);
                }
            }
        }
        throw new RuntimeException("No 2020 value provided");
    }

    private int getExpectedValue(Integer value) {
        return 2020 - value;
    }


}
