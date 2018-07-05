package classfile.invokedynamic;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantInvokeDynamicInfo extends ConstantInfo {

    public char bootstrapMethodAttrIndex;
    public char nameAndTypeIndex;

    @Override
    public void readInfo(ClassReader reader) {
    }
}
