package classpath;

public class ZipEntry extends Entry {
    @Override
    public byte[] readClass(String className) {
        return new byte[0];
    }
}
