package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantFloatInfo extends ConstantInfo {
    public float val;

    @Override
    public void readInfo(ClassReader reader) {
        var bytes = reader.readUint32();
        this.val = Float.intBitsToFloat(bytes);
    }
}
