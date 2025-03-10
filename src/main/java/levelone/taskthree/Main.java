package levelone.taskthree;

import levelone.taskthree.files.FileAppender;
import levelone.taskthree.users.UserAttempt;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        UserAttempt attempt = new UserAttempt();
        attempt.attempt();
        FileAppender logger = new FileAppender("users.log");
        logger.appendData(attempt.getDetails());


    }
}
