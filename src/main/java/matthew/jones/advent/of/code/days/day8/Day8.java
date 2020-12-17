package matthew.jones.advent.of.code.days.day8;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.util.StringUtils;

import java.util.ArrayList;

//https://adventofcode.com/2020/day/8
@Slf4j
public class Day8 extends AbstractDay {
    public int accumulator;

    public Day8(String data) {
        super(data);
    }

    @Override
    public void run() {
        log.info("Day8 - accumulator =" + runCode());
    }

    public int runCode() {
        ArrayList<String> lines = StringUtils.splitToArrayList(getData());
        ArrayList<Integer> linesRun = Lists.newArrayList();
        boolean hasRepeated = false;
        int i = 0;
        while (!hasRepeated) {
            if (linesRun.contains(i)) {
                return accumulator;
            }
            linesRun.add(i);
            String line = lines.get(i);
            String command = line.substring(0, 3);
            String operand = line.substring(4, 5);
            int value = Integer.parseInt(line.substring(line.indexOf(operand) + 1));
            switch (command) {
                case "acc":
                    if ("+".equals(operand)) {
                        accumulator += value;
                    }
                    if ("-".equals(operand)) {
                        accumulator -= value;
                    }
                    break;
                case "nop":
                    break;
                case "jmp":
                    if ("+".equals(operand)) {
                        if (i + value > lines.size()) {
                            int diff = i - value;
                            i = i + value % lines.size();
                        } else {
                            i += value;
                        }
                    }
                    if ("-".equals(operand)) {
                        if (i - value < 0) {
                            int diff = i - value;
                            i = lines.size() + diff % lines.size();
                        } else {
                            i -= value;
                        }
                    }
                    break;
            }

            if (!"jmp".equals(command)) {
                if (i + 1 > lines.size()) {
                    i = 0;
                } else {
                    i++;
                }
            }
        }
        return 0;
    }

    public int runCodePart2() {
        ArrayList<String> lines = StringUtils.splitToArrayList(getData());
        ArrayList<Integer> linesRun = Lists.newArrayList();
        boolean hasRepeated = false;
        int i = 0;
        while (!hasRepeated) {
            if (linesRun.contains(i)) {
                String prevLine = lines.get(linesRun.get(linesRun.size() - 1));

                return accumulator;
            }
            linesRun.add(i);
            String line = lines.get(i);
            String command = line.substring(0, 3);
            String operand = line.substring(4, 5);
            int value = Integer.parseInt(line.substring(line.indexOf(operand) + 1));
            switch (command) {
                case "acc":
                    if ("+".equals(operand)) {
                        accumulator += value;
                    }
                    if ("-".equals(operand)) {
                        accumulator -= value;
                    }
                    break;
                case "nop":
                    break;
                case "jmp":
                    if ("+".equals(operand)) {
                        if (i + value > lines.size()) {
                            int diff = i - value;
                            i = i + value % lines.size();
                        } else {
                            i += value;
                        }
                    }
                    if ("-".equals(operand)) {
                        if (i - value < 0) {
                            int diff = i - value;
                            i = lines.size() + diff % lines.size();
                        } else {
                            i -= value;
                        }
                    }
                    break;
            }

            if (!"jmp".equals(command)) {
                if (i + 1 > lines.size()) {
                    i = 0;
                } else {
                    i++;
                }
            }
        }
        return 0;
    }
}
