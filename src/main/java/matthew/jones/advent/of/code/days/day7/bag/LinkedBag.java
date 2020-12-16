package matthew.jones.advent.of.code.days.day7.bag;

public class LinkedBag {
    private int multiplier;
    private String bagLabel;

    public LinkedBag(int multiplier, String bagLabel) {
        this.multiplier = multiplier;
        this.bagLabel = bagLabel;
    }

    public String getBagLabel() {
        return bagLabel;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
