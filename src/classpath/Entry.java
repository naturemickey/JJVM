package classpath;

import static util.Constants.pathListSeparator;

public abstract class Entry {
    abstract public byte[] readClass(String className);

    public static Entry New(String path) {
        if (path.contains(pathListSeparator)) {
            return new CompositeEntry(path);
        }
        return null;
    }
}
