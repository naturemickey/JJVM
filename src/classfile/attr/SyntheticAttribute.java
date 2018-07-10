package classfile.attr;

import classfile.ClassReader;
import classfile.cp.ConstantPool;

public class SyntheticAttribute extends AttributeInfo {

    private ConstantPool cp;
    private char sourceFileIndex;

    public SyntheticAttribute(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.sourceFileIndex = reader.readUint16();
    }

    public String fileName() {
        return cp.getUtf8(this.sourceFileIndex);
    }
}
