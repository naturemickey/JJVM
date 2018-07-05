package classfile.cp.numeric;

import classfile.ClassReader;
import classfile.cp.ConstantInfo;

public class ConstantFloatInfo extends ConstantInfo {
    private float val;

    @Override
    public void readInfo(ClassReader reader) {
        this.val = Float.intBitsToFloat(reader.readUint32());
    }
}
