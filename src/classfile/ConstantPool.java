package classfile;

import classfile.numeric.ConstantDoubleInfo;
import classfile.numeric.ConstantLongInfo;
import util.Tuple2;

public class ConstantPool {

    private ConstantInfo[] constants;

    private ConstantPool(ConstantInfo[] constants) {
        this.constants = constants;
    }

    public static ConstantPool readConstantPool(ClassReader reader) {
        int cpCount = reader.readUint16();
        var cp = new ConstantPool(new ConstantInfo[cpCount]);
        for (int i = 1; i < cpCount; ++i) {
            cp.constants[i] = ConstantInfo.readConstantInfo(reader, cp);
            Class cls = cp.constants[i].getClass();
            if (cls.equals(ConstantLongInfo.class) || cls.equals(ConstantDoubleInfo.class)) {
                ++i;
            }
        }
        return cp;
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
