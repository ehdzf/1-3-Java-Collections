package levelone.taskthree.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBufferLoader extends FileSettings {
    private BufferedReader reader;

    protected FileBufferLoader(String filename) {
        super(filename);
    }

    protected BufferedReader getReader() {
        try {
            this.reader = new BufferedReader(new FileReader(this.getPath()));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return this.reader;
    }


    protected void closeReader() {
        try {
            this.reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
