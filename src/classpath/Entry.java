package classpath;

import static util.Constants.pathListSeparator;

public abstract class Entry {
    abstract public byte[] readClass(String className);

    public static Entry New(String path) {
        if (path.contains(pathListSeparator)) {
            return new CompositeEntry(path);
        }
        if (path.endsWith("*")) {
            return new WildcardEntry(path);
        }
        if (path.endsWith(".jar") || path.endsWith(".JAR") || path.endsWith(".zip") || path.endsWith(".ZIP")) {
            return new ZipEntry(path);
        }
        return new DirEntry(path);
    }
}
