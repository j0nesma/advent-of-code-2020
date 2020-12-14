package matthew.jones.advent.of.code.days.day3;

import lombok.extern.slf4j.Slf4j;
import matthew.jones.advent.of.code.days.AbstractDay;
import matthew.jones.advent.of.code.util.StringUtils;

@Slf4j
public class Day3 extends AbstractDay {

    public Day3(String data) {
        super(data);
    }

    @Override
    public void run() {
        log.info("Day3 - trees hit = " + traverseMap(3, 1));
        //PART TWO
        //Right 1, down 1.
        int r1d1 = traverseMap(1, 1);
        log.debug("Right 1, down 1 =" + r1d1);
        //Right 3, down 1. (This is the slope you already checked.)
        int r3d1 = traverseMap(3, 1);
        log.debug("Right 3, down 1 =" + r3d1);
        //Right 5, down 1.
        int r5d1 = traverseMap(5, 1);
        log.debug("Right 5, down 1 =" + r5d1);
        //Right 7, down 1.
        int r7d1 = traverseMap(7, 1);
        log.debug("Right 7, down 1 =" + r7d1);
        //Right 1, down 2.
        int r1d2 = traverseMap(1, 2);
        log.debug("Right 1, down 2 =" + r1d2);
        log.info("Day3 - part 2 multi routes " + r1d1 * r3d1 * r5d1 * r7d1 * r1d2);
    }


    public int traverseMap(int x, int y) {
        String[] mapRows = StringUtils.split(getData());
        int count = 0;
        int xPos = 0;
        for (int i = 0; i < mapRows.length; i += y) {
            String[] mapCells = mapRows[i].split("");
            if (mapCells[xPos].equals("#")) {
                count++;
            }
            if (xPos + x >= mapCells.length) {
                int toEndOfMap = mapCells.length - xPos;
                xPos = x - toEndOfMap;
            } else {
                xPos += x;
            }
        }
        return count;
    }
}
