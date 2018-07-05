package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantFloatInfo extends ConstantInfo<ConstantFloatInfo> {
    public float float32;

    @Override
    public ConstantFloatInfo readInfo(ClassReader reader) {
        return null;
    }
}
