package leveltwo.taskone;

import leveltwo.tasktwo.repo.Repo;

import java.util.ArrayList;
import java.util.Comparator;

public class GetRestaurantRepo extends Repo {

    public static Restaurant[] getSortedRestaurants() {
        ArrayList<Restaurant> result = new ArrayList<>(Repo.restaurants);
        return result.stream()
                .sorted(Comparator.comparing(Restaurant::getName)
                        .thenComparing(Restaurant::getRating).reversed())
                .toArray(Restaurant[]::new);

    }
}
