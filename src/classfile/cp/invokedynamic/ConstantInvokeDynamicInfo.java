package classfile.cp.invokedynamic;

import classfile.ClassReader;
import classfile.cp.ConstantInfo;

public class ConstantInvokeDynamicInfo extends ConstantInfo {

    private char bootstrapMethodAttrIndex;
    private char nameAndTypeIndex;

    @Override
    public void readInfo(ClassReader reader) {
        this.bootstrapMethodAttrIndex = reader.readUint16();
        this.nameAndTypeIndex = reader.readUint16();
    }
}
