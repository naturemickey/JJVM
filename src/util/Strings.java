package util;

public class Strings {

    public static String join(byte[] data) {
        var sb = new StringBuilder();
        sb.append('[');
        for (byte d : data) {
            sb.append(d).append(' ').append(',');
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append(']');
        return sb.toString();
    }
}
