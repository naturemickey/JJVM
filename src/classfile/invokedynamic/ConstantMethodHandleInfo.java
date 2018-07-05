package classfile.invokedynamic;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantMethodHandleInfo extends ConstantInfo {
    public byte referenceKind;
    public char referenceIndex;

    @Override
    public void readInfo(ClassReader reader) {
    }
}
