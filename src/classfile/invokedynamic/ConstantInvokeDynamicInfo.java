package classfile.invokedynamic;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantInvokeDynamicInfo extends ConstantInfo {

    private char bootstrapMethodAttrIndex;
    private char nameAndTypeIndex;

    @Override
    public void readInfo(ClassReader reader) {
    }
}
