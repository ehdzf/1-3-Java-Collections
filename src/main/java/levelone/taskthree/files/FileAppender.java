package levelone.taskthree.files;

import java.io.*;

public class FileAppender extends FileSettings {
    private final CreateIfNotExistFile creator = new CreateIfNotExistFile(getPath());

    public FileAppender(String filename) {
        super(filename);
    }

    public void appendData(String content) {
        creator.createIfNotExists();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getPath(), true))) {
            writer.write(content + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
