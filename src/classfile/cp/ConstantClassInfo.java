package classfile.cp;

import classfile.ClassReader;

public class ConstantClassInfo extends ConstantInfo {
    private ConstantPool cp;
    private char nameIndex;

    public ConstantClassInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.nameIndex = reader.readUint16();
    }

    public String Name() {
        return this.cp.getUtf8(this.nameIndex);
    }
}
