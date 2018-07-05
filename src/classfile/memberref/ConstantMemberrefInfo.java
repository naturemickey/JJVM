package classfile.memberref;

import classfile.ClassReader;
import classfile.ConstantInfo;
import classfile.ConstantNameAndTypeInfo;
import classfile.ConstantPool;

public class ConstantMemberrefInfo extends ConstantInfo {
    private ConstantPool cp;
    private char classIndex;
    private char nameAndTypeIndex;

    public ConstantMemberrefInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.classIndex = reader.readUint16();
        this.nameAndTypeIndex = reader.readUint16();
    }

    public String className() {
        return this.cp.getClassName(this.classIndex);
    }

    public ConstantNameAndTypeInfo nameAndDescriptor() {
        return this.cp.getNameAndType(this.nameAndTypeIndex);
    }
}
