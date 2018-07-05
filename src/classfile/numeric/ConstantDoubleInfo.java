package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantDoubleInfo extends ConstantInfo {

    private double val;

    @Override
    public void readInfo(ClassReader reader) {
        this.val = Double.longBitsToDouble(reader.readUint64());
    }

}
