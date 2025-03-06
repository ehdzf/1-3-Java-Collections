package levelone.taskone;

import java.util.Collection;
import java.util.Iterator;

public class MonthIterator {
    private final Iterator<Month> iterator;

    public void displayItems(){
        while (this.iterator.hasNext()){
            System.out.println(this.iterator.next());
        }
    }
    public MonthIterator(Collection<Month> collection) {
        this.iterator = collection.iterator();
    }
}
