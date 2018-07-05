package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantLongInfo extends ConstantInfo<ConstantLongInfo> {
    public long int64;

    @Override
    public ConstantLongInfo readInfo(ClassReader reader) {
        return null;
    }
}
