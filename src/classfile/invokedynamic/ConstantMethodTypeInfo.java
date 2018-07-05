package classfile.invokedynamic;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantMethodTypeInfo extends ConstantInfo<ConstantMethodTypeInfo> {

    public char descriptorIndex;

    @Override
    public ConstantMethodTypeInfo readInfo(ClassReader reader) {
        return null;
    }
}
