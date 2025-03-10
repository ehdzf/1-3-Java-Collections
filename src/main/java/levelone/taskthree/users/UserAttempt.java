package levelone.taskthree.users;

import levelone.taskthree.countries.CountryGetter;

import java.util.Map;
import java.util.Scanner;

public class UserAttempt extends User {

    private int attempts = 10;
    private int score = 0;
    private String details;

    public UserAttempt() {
    }

    public void attempt() {
        while (this.attempts > 0) {
            Map.Entry<String, String> country = CountryGetter.getRandomCountry();
            System.out.println(country.getKey());
            System.out.println("enter capital");
            String capital = scanner.nextLine();
            if (capital.equalsIgnoreCase(country.getValue())) {
                this.score++;
            }

            this.attempts -= 1;
        }
        this.details = "User: " + this.getName() + ", score: " + this.getScore();

    }

    public String getDetails() {
        return this.details;
    }

    public int getScore() {
        return score;
    }
}
