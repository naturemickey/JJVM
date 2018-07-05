package classfile.invokedynamic;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantInvokeDynamicInfo extends ConstantInfo<ConstantInvokeDynamicInfo> {

    public char bootstrapMethodAttrIndex;
    public char nameAndTypeIndex;

    @Override
    public ConstantInvokeDynamicInfo readInfo(ClassReader reader) {
        return null;
    }
}
