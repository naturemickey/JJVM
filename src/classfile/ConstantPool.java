package classfile;

import util.Tuple2;

public class ConstantPool {

    private ConstantInfo[] constants;

    public static ConstantPool readConstantPool(ClassReader reader) {
        // TODO
        return null;
    }

    public ConstantInfo getConstantInfo(char index) {
        // TODO
        return null;
    }

    public Tuple2<String, String> getNameAndType(char index) {
        // TODO
        return null;
    }

    public String getClassName(char index) {
        return null;
    }

    public String getUtf8(char index) {
        // TODO
        return null;
    }
}
