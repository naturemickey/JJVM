package classpath;

import util.FilePath;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DirEntry extends Entry {

    private String absDir;

    public DirEntry(String path) {
        try {
            this.absDir = new File(path).getCanonicalPath();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte[] readClass(String className) {
        try {
            return Files.readAllBytes(Paths.get(FilePath.join(this.absDir, className)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return this.absDir;
    }
}
