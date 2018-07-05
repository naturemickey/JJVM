package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantFloatInfo extends ConstantInfo {
    private float val;

    @Override
    public void readInfo(ClassReader reader) {
        this.val = Float.intBitsToFloat(reader.readUint32());
    }
}
