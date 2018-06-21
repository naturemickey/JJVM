package classpath;

import util.FilePath;

import java.io.File;

public class Classpath {
    private Entry bootClasspath;
    private Entry extClasspath;
    private Entry userClasspath;

    private Classpath() {
    }

    public static Classpath parse(String jreOption, String cpOption) {
        Classpath cp = new Classpath();
        cp.parseBootAndExtClasspath(jreOption);
        cp.parseUserClasspath(cpOption);
        return cp;
    }

    public byte[] readClass(String className) {
        className = className + ".class";
        byte[] bytes = this.bootClasspath.readClass(className);
        if (bytes != null)
            return bytes;
        if (this.extClasspath != null)
            bytes = this.extClasspath.readClass(className);
        if (bytes != null)
            return bytes;
        return this.userClasspath.readClass(className);
    }

    private void parseBootAndExtClasspath(String jreOption) {
        String jreDir = getJreDir(jreOption);

        String jreLibPath = FilePath.join(jreDir, "lib");
        if (exists(jreLibPath))
            this.bootClasspath = new WildcardEntry(FilePath.join(jreLibPath, "*"));

        String jreExtPath = FilePath.join(jreDir, "lib", "ext");
        if (exists(jreExtPath))
            this.extClasspath = new WildcardEntry(FilePath.join(jreExtPath, "*"));
    }

    private void parseUserClasspath(String cpOption) {
        if (cpOption == null) {
            cpOption = ".";
        }
        this.userClasspath = Entry.New(cpOption);
    }

    private static String getJreDir(String jreOption) {
        if (jreOption != null && exists(jreOption)) {
            return jreOption;
        }
        if (exists("./jre")) {
            return "./jre";
        }
        String javaHome = System.getProperty("java.home");
        if (javaHome != null && javaHome.length() > 0) {
            // return FilePath.join(javaHome, "jre");
            return javaHome;
        }
        throw new RuntimeException("Can not find jre folder!");
    }

    private static boolean exists(String path) {
        return new File(path).exists();
    }

    @Override
    public String toString() {
        return this.userClasspath == null ? "" : this.userClasspath.toString();
    }
}
