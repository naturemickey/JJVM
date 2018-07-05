package classfile.memberref;

import classfile.ClassReader;
import classfile.ConstantInfo;
import classfile.ConstantPool;

public class ConstantMemberrefInfo extends ConstantInfo {
    public ConstantPool cp;
    public char classIndex;
    public char nameAndTypeIndex;

    public ConstantMemberrefInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
    }
}
