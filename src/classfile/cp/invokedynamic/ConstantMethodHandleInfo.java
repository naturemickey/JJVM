package classfile.cp.invokedynamic;

import classfile.ClassReader;
import classfile.cp.ConstantInfo;

public class ConstantMethodHandleInfo extends ConstantInfo {
    private byte referenceKind;
    private char referenceIndex;

    @Override
    public void readInfo(ClassReader reader) {
        this.referenceKind = reader.readUint8();
        this.referenceIndex = reader.readUint16();
    }
}
