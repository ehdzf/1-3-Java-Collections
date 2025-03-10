package levelone.taskthree.files;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class ReadFileIntoHashmap extends FileBufferLoader {
    private final List<String> lines = new ArrayList<>();
    private final HashMap<String, String> countries = new HashMap<>();

    public ReadFileIntoHashmap(String filename) {
        super(filename);
        readIntoLines();
        createMap();
    }


    private void readIntoLines() {
        try {
            BufferedReader reader = getReader();
            String line = reader.readLine();
            while (line != null) {
                lines.add(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println("⚠ " + e.getMessage());
        } finally {
            closeReader();
        }
    }

    private void createMap() {
        for (String line : this.lines) {
            String[] substrings = line.split(" ");
            if (substrings.length == 2) {
                this.countries.put(substrings[0], substrings[1]);
            }
        }
    }

    public HashMap<String, String> getCountries() {
        return this.countries;
    }
}
