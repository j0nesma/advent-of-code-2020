package matthew.jones.advent.of.code.days.day6;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://adventofcode.com/2020/day/6
@Slf4j
public class Day6 extends AbstractDay {

    public Day6(String data) {
        super(data);
    }

    @Override
    public void run() {
        log.info("Day6 - number of questions = " + customDeclarationForm());
        log.info("Day6 - number of questions part 2 = " + customDeclarationFormWhoAnswered());
    }

    public int customDeclarationForm() {
        String[] data = StringUtils.split(getData());
        ArrayList<String> mergedLines = Lists.newArrayList();
        StringBuilder answers = new StringBuilder();
        for (String line : data) {
            if (line.equals("")) {
                mergedLines.add(answers.toString());
                answers = new StringBuilder();
            }
            answers.append(line);
        }
        //Check if there is a straggler
        if (answers.length() > 0) {
            mergedLines.add(answers.toString());
        }

        return mergedLines.stream().map(this::getDistinct).mapToInt(Integer::intValue).sum();
    }

    private Integer getDistinct(String ele) {
        return (int) ele.chars().distinct().count();
    }

    public int customDeclarationFormWhoAnswered() {
        List<String> data = Arrays.asList(StringUtils.split(getData()));
        ArrayList<String> answeredQuestions = Lists.newArrayList(Arrays.asList(data.get(0).split("")));
        int count = 0;
        for (int i = 0; i < data.size(); i++) {
            String line = data.get(i);
            if (line.isEmpty()) {
                count += answeredQuestions.size();
                answeredQuestions = Lists.newArrayList(Arrays.asList(data.get(i + 1).split("")));
            } else {
                List<String> tempAnsweredQuestions = Arrays.asList(line.split(""));
                answeredQuestions.retainAll(tempAnsweredQuestions);
            }
        }
        if (!answeredQuestions.isEmpty()) {
            count += answeredQuestions.size();
        }

        return count;
    }
}
