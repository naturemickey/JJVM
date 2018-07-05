package classfile.cp.invokedynamic;

import classfile.ClassReader;
import classfile.cp.ConstantInfo;

public class ConstantMethodTypeInfo extends ConstantInfo {

    private char descriptorIndex;

    @Override
    public void readInfo(ClassReader reader) {
        this.descriptorIndex = reader.readUint16();
    }
}
