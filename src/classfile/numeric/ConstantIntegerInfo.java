package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantIntegerInfo extends ConstantInfo<ConstantIntegerInfo> {
    public int int32;

    @Override
    public ConstantIntegerInfo readInfo(ClassReader reader) {
        return null;
    }
}
