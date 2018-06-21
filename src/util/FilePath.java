package util;

import java.io.File;

public class FilePath {

    public static String join (String... paths) {
        StringBuilder sb = new StringBuilder();
        for (String path: paths) {
            sb.append(path).append(File.separator);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
