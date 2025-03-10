package leveltwo.tasktwo.repo;

import leveltwo.taskone.Restaurant;

public class CreateRestaurantRepo extends Repo {
    public static void create(Restaurant restaurant) {
        Repo.restaurants.add(restaurant);
    }
}
