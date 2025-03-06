package levelone.taskone;

public class Main {

    public static void main(String[] args) {
        MonthRepo repo = new MonthRepo();
        iterateArray(repo);
        addAugustTwice(repo);
        convertListToSet(repo);
        iterateSet(repo);
    }

    private static void iterateArray(MonthRepo repo) {
        MonthIterator listIterator = new MonthIterator(repo.getMonths());
        listIterator.displayItems();
    }

    private static void iterateSet(MonthRepo repo) {
        MonthIterator setIterator = new MonthIterator(repo.getMonthSet());
        System.out.println("\uD83D\uDD0D unordered months in the set1 :");
        setIterator.displayItems();
    }

    private static void convertListToSet(MonthRepo repo) {
        System.out.println("\uD83D\uDE80 converting to set");
        repo.setMonthSet();
        System.out.println("\uD83D\uDCA1 the set has a length of: " + repo.getMonthSet().size());
    }

    private static void addAugustTwice(MonthRepo repo) {
        System.out.println("\uD83D\uDD0D initial months in List :");
        System.out.println("➕ adding August twice... ");
        repo.addMonth("August");
        repo.addMonth("August");
        System.out.println("\uD83D\uDCA1 the List has a length of: " + repo.getMonths().size());
    }
}
