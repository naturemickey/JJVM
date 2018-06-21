package classpath;

import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipFile;

public class ZipEntry extends Entry {

    private String absDir;

    public ZipEntry(String path) {
        try {
            this.absDir = new File(path).getCanonicalPath();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public byte[] readClass(String className) {
        try {
            try (ZipFile zf = new ZipFile(this.absDir)) {
                java.util.zip.ZipEntry ze = zf.getEntry(className);
                if (ze != null) {
                    try (InputStream is = zf.getInputStream(ze)) {
                        return is.readAllBytes();
                    }
                }
            }

            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
