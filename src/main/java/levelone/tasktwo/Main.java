package levelone.tasktwo;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        IntegerList integers = createIntegerList();
        IntegerList invertedIntegers = createInvertedList(integers);
        displayLists(integers, invertedIntegers);


    }

    private static void displayLists(IntegerList integers, IntegerList invertedIntegers) {
        System.out.println("ℹ original list:");
        System.out.println(integers);
        System.out.println("\uD83D\uDE80 inverted list:");
        System.out.println(invertedIntegers);
    }

    private static IntegerList createInvertedList(IntegerList integers) {
        IntegerList invertedIntegers = new IntegerList();
        Iterator<Integer> iterator = integers.getIntegerList().iterator();
        while (iterator.hasNext()) {
            invertedIntegers.addIntegerAtStart(iterator.next());
        }
        return invertedIntegers;
    }

    private static IntegerList createIntegerList() {
        IntegerList integers = new IntegerList();
        for (int i = 0; i < 9; i++) {
            integers.addInteger(i);
        }
        return integers;
    }
}
