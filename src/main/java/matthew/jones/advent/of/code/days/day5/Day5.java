package matthew.jones.advent.of.code.days.day5;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;

//https://adventofcode.com/2020/day/5
@Slf4j
public class Day5 extends AbstractDay {

    public static final String BACK = "B";
    public static final String RIGHT = "R";
    public static final String FRONT = "F";
    public static final String LEFT = "L";
    public static final int MAX_ROWS = 128;
    public static final int MAX_COLUMNS = 8;
    public static final int COLUMN_PATH_LENGTH = 3;
    private ArrayList<Integer> seats;

    public Day5(String data) {
        super(data);
    }

    @Override
    public void run() {
        log.info("DAY5 - seatCheck = " + seatCheck());
        log.info("DAY5 - My seat = " + mySeat(seats));
    }

    public int mySeat(ArrayList<Integer> seats) {
        Collections.sort(seats);
        for (Integer seat : seats) {
            int i = seats.indexOf(seat);
            if (i != 0) {
                Integer integer1 = seats.get(i + 1);
                if (integer1 != seat + 1) {
                    return seat + 1;
                }
            }
        }
        throw (new RuntimeException("Seat number not found!"));
    }

    public int seatCheck() {
        String[] data = StringUtils.split(getData());
        seats = Lists.newArrayList();
        for (String path : data) {
            ArrayList<String> pathForRows = Lists.newArrayList(path.substring(0, path.length() - COLUMN_PATH_LENGTH).split(""));
            int row = getPosition(pathForRows, 0, MAX_ROWS);
            ArrayList<String> pathForColumns = Lists.newArrayList(path.substring(path.length() - COLUMN_PATH_LENGTH).split(""));
            int column = getPosition(pathForColumns, 0, MAX_COLUMNS);
            seats.add(row * 8 + column);
        }
        return Collections.max(seats);
    }

    private int getPosition(ArrayList<String> path, int min, int max) {
        if (path.size() == 0) {
            return max - 1;
        }
        String ele = path.remove(0);
        int midPoint = ((max - min) / 2) + min;
        return switch (ele) {
            case BACK, RIGHT -> getPosition(path, midPoint, max);
            case FRONT, LEFT -> getPosition(path, min, midPoint);
            default -> throw (new RuntimeException("Invalid Element"));
        };
    }
}
