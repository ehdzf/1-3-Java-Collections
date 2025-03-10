package levelone.taskthree.files;

import java.io.File;
import java.io.IOException;

public class CreateIfNotExistFile {
    private final File file;

    public CreateIfNotExistFile(String path) {

        this.file = new File(path);

    }

    public void createIfNotExists() {
        if (!file.exists()) {
            try {
                boolean isCreated = file.createNewFile();
                if (isCreated) {
                    System.out.println("File created");
                } else {
                    System.out.println("File already exists");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
