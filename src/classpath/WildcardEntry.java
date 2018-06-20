package classpath;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static util.Constants.pathListSeparator;

public class WildcardEntry extends Entry {


    private List<Entry> compositeEntry = new ArrayList<>();

    public WildcardEntry(String path) {
        StringBuilder sb = new StringBuilder(path);
        sb.deleteCharAt(sb.length() - 1);
        path = sb.toString();// remove *
        File baseFile = new File(path);
        for (File cf : baseFile.listFiles()) {
            if (cf.isFile() && (cf.getName().endsWith(".jar") || cf.getName().endsWith(".JAR"))) {
                compositeEntry.add(new ZipEntry(cf.getPath()));
            }
        }
    }

    @Override
    public byte[] readClass(String className) {
        for (Entry entry : compositeEntry) {
            byte[] bytes = entry.readClass(className);
            if (bytes != null) {
                return bytes;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : compositeEntry) {
            sb.append(entry.toString()).append(pathListSeparator);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
