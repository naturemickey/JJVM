package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantLongInfo extends ConstantInfo {
    private long val;

    @Override
    public void readInfo(ClassReader reader) {
        this.val = reader.readUint64();
    }
}
