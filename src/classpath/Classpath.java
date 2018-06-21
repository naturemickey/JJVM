package classpath;

import java.io.File;

public class Classpath {
    private Entry bootClasspath;
    private Entry extClasspath;
    private Entry userClasspath;

    private Classpath() {
    }

    public static Classpath parse(String jreOption, String cpOption) {
        Classpath cp = new Classpath();
        return cp;
    }

    public byte[] readClass(String className) {
        return null;
    }

    private void parseBootAndExtClasspath(String jreOption) {

    }

    private void parseUserClasspath(String cpOption) {

    }

    private static String getJreDir(String jreOption ) {
        return null;
    }

    private static boolean exists(String path) {
        return new File(path).exists();
    }

    @Override
    public String toString() {
        return this.userClasspath.toString();
    }
}
