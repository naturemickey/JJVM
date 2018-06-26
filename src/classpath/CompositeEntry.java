package classpath;

import java.util.ArrayList;
import java.util.List;

import static util.Constants.pathListSeparator;

public class CompositeEntry extends Entry {

    private List<Entry> compositeEntry = new ArrayList<>();

    public CompositeEntry(String paths) {
        for (String path : paths.split(pathListSeparator)) {
            compositeEntry.add(Entry.New(path));
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
        var sb = new StringBuilder();
        for (Entry entry : compositeEntry) {
            sb.append(entry.toString()).append(pathListSeparator);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
