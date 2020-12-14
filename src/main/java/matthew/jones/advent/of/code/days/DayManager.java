package matthew.jones.advent.of.code.days;

import com.google.common.collect.Lists;

import java.util.ArrayList;

public class DayManager {
    ArrayList<AbstractDay> dayList = Lists.newArrayList();

    public void addDay(AbstractDay day) {
        dayList.add(day);
    }

    public void run() {
        dayList.forEach(AbstractDay::run);
    }
}
