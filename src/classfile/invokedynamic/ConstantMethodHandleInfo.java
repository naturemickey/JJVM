package classfile.invokedynamic;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantMethodHandleInfo extends ConstantInfo<ConstantMethodHandleInfo> {
    public byte referenceKind;
    public char referenceIndex;

    @Override
    public ConstantMethodHandleInfo readInfo(ClassReader reader) {
        return null;
    }
}
