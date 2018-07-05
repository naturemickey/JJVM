package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantIntegerInfo extends ConstantInfo {
    public int val;

    @Override
    public void readInfo(ClassReader reader) {
        this.val = reader.readUint32();
    }
}
