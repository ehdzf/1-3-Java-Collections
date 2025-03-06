package levelone.taskone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MonthRepo {
    private static List<Month> months = new ArrayList<>();
    private final Set<Month> monthSet = new HashSet<>();
    private final String[] names = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "September",
            "October",
            "November",
            "December"};

    public MonthRepo() {
        this.createMonthObjects();
    }

    private void createMonthObjects() {
        for (String name : this.names) {
            this.addMonth(name);
        }

    }

    public void addMonth(String name) {
        months.add(new Month(name));
    }

    public void setMonthSet() {
        monthSet.addAll(months);
    }

    public Set<Month> getMonthSet() {
        return monthSet;
    }

    public List<Month> getMonths() {
        return months;
    }
}
