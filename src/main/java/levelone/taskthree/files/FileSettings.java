package levelone.taskthree.files;

public class FileSettings {
    private final String folder = "src/main/resources/levelone/taskthree/data/";
    private final String path;

    public FileSettings(String filename) {
        this.path = this.folder + filename;
    }

    protected String getPath() {
        return path;
    }
}
