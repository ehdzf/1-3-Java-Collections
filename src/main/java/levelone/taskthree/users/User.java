package levelone.taskthree.users;

import java.util.Scanner;

public class User {
    protected final Scanner scanner = new Scanner(System.in);
    private final String name;

    public User() {
        System.out.println("Hello !!\n Please enter your name:");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }
}
