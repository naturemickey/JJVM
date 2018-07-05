package classfile.cp;

import classfile.ClassReader;
import classfile.cp.numeric.ConstantDoubleInfo;
import classfile.cp.numeric.ConstantLongInfo;

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

    public ConstantNameAndTypeInfo getNameAndType(char index) {
        return (ConstantNameAndTypeInfo) this.constants[index];
    }

    public String getClassName(char index) {
        var classInfo = (ConstantClassInfo) this.constants[index];
        return classInfo.Name();
    }

    public String getUtf8(char index) {
        var utf8Info = (ConstantUtf8Info) this.constants[index];
        return utf8Info.String();
    }
}
