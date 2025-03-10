package leveltwo;

import leveltwo.tasktwo.CliCreator;
import leveltwo.tasktwo.CliDisplayArray;
import leveltwo.taskone.GetRestaurantRepo;

public class Main {

    public static void main(String[] args) {
        CliCreator cliCreator = new CliCreator();
        CliDisplayArray cliDisplayArray = new CliDisplayArray();
        for (int i = 0; i < 5; i++) {
            cliCreator.create();

        }
        cliDisplayArray.display(GetRestaurantRepo.getSortedRestaurants());
    }
}
