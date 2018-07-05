package classfile.cp;

import classfile.ClassReader;

public class ConstantStringInfo extends ConstantInfo {

    private ConstantPool cp;
    private char stringIndex;

    public ConstantStringInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.stringIndex = reader.readUint16();
    }

    public String String() {
        return this.cp.getUtf8(this.stringIndex);
    }
}
