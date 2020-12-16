package matthew.jones.advent.of.code.days.day7;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.days.day7.bag.Bag;
import matthew.jones.advent.of.code.days.day7.bag.LinkedBag;
import matthew.jones.advent.of.code.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://adventofcode.com/2020/day/7
@Slf4j
public class Day7 extends AbstractDay {
    public static final String MY_BAG = "shiny gold";
    public final HashMap<String, Bag> bagMap = Maps.newHashMap();


    public Day7(String data) {
        super(data);
    }

    @Override
    public void run() {
        log.info("Day7 - number of bags which can fit my bag = " + howManyBagsssss());
        log.info("Day7 - number of bags which can fit into my bag = " + howManyBagsssssPart2());
    }


    public int howManyBagsssss() {
        setup(getData());
        int count = 0;
        for (Map.Entry<String, Bag> entry : bagMap.entrySet()) {
            if (canContainMyBag(entry.getKey())) {
                count++;
            }
        }
        return count;
    }

    public int howManyBagsssssPart2() {
        setup(getData());
        return getNumberOfBagsInside(MY_BAG, 0);
    }

    private int getNumberOfBagsInside(String myBag, int noOfBags) {
        Bag bag = bagMap.get(myBag);
        List<LinkedBag> linkedBagList = bag.getLinkedBagList();
        if (linkedBagList.isEmpty()) {
            return noOfBags;
        }
        int bags = 0;
        for (LinkedBag linkedBag : linkedBagList) {
            if (noOfBags == 0) {
                bags += getNumberOfBagsInside(linkedBag.getBagLabel(), linkedBag.getMultiplier());
            }
            bags += noOfBags * getNumberOfBagsInside(linkedBag.getBagLabel(), linkedBag.getMultiplier());
        }
        return bags + noOfBags;
    }

    private boolean canContainMyBag(String bagLabel) {
        Bag bag = bagMap.get(bagLabel);
        return bag.getLinkedBagList().stream().anyMatch(bag1 -> bag1.getBagLabel().equals(MY_BAG) || canContainMyBag(bag1.getBagLabel()));
    }


    private void setup(String data) {
        ArrayList<String> lines = StringUtils.splitToArrayList(data);
        for (String line : lines) {
            String[] split = line.split(" bags contain ");
            String bagLabel = split[0];
            String[] linkedBags = split[1].split(", ");
            int noOfBags = 0;
            List<LinkedBag> linkedBagList = Lists.newArrayList();
            for (String linkedBag : linkedBags) {
                if ("no other bags.".equals(linkedBag)) {
                    break;
                }
                int perBags = Integer.parseInt(linkedBag.substring(0, 1));
                noOfBags += perBags;
                linkedBagList.add(new LinkedBag(perBags, linkedBag.substring(2, linkedBag.indexOf(" bag"))));
            }
            bagMap.put(bagLabel, new Bag(bagLabel, noOfBags, linkedBagList));
        }
    }
}
