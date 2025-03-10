package leveltwo.tasktwo;

import leveltwo.taskone.Restaurant;
import leveltwo.tasktwo.repo.CreateRestaurantRepo;

import java.util.Scanner;

public class CliCreator {
    private final Scanner scanner = new Scanner(System.in);

    public void create() {
        try {
            System.out.println("enter restaurant name:");
            String name = scanner.nextLine();
            System.out.println("enter restaurant rating:");
            int rating = Integer.parseInt(scanner.nextLine());
            Restaurant restaurant = new Restaurant(name, rating);
            CreateRestaurantRepo.create(restaurant);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
