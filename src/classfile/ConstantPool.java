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
        return this.constants[index];
    }

    public Tuple2<String, String> getNameAndType(char index) {
        var ntInfo = (ConstantNameAndTypeInfo) this.constants[index];
        var name = this.getUtf8(ntInfo.nameIndex);
        var type = this.getUtf8(ntInfo.descriptorIndex);
        return Tuple2.create(name, type);
    }

    public String getClassName(char index) {
        var classInfo = (ConstantClassInfo) this.constants[index];
        return this.getUtf8(classInfo.nameIndex);
    }

    public String getUtf8(char index) {
        var utf8Info = (ConstantUtf8Info) this.constants[index];
        return utf8Info.str;
    }
}
