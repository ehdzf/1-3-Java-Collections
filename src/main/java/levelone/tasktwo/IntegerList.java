package levelone.tasktwo;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    private final List<Integer> integerList;

    public IntegerList() {
        this.integerList = new ArrayList<>();
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void addInteger(int integer) {
        this.integerList.add(integer);
    }

    public void addIntegerAtStart(int integer) {
        this.integerList.addFirst(integer);
    }

    @Override
    public String toString() {
        return "IntegerList{" +
                "integerList=" + integerList +
                '}';
    }
}
