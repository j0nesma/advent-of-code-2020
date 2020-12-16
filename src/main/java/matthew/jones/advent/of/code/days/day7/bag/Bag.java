package matthew.jones.advent.of.code.days.day7.bag;

import java.util.List;

public class Bag {
    private String bagLabel;
    private int noOfBags;
    private List<LinkedBag> linkedBagList;

    public Bag(String bagLabel, int noOfBags, List<LinkedBag> linkedBagList) {
        this.bagLabel = bagLabel;
        this.noOfBags = noOfBags;
        this.linkedBagList = linkedBagList;
    }

    public String getBagLabel() {
        return bagLabel;
    }

    public int getNoOfBags() {
        return noOfBags;
    }

    public List<LinkedBag> getLinkedBagList() {
        return linkedBagList;
    }
}
