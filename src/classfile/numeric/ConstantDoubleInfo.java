package classfile.numeric;

import classfile.ClassReader;
import classfile.ConstantInfo;

public class ConstantDoubleInfo extends ConstantInfo<ConstantDoubleInfo> {
    @Override
    public ConstantDoubleInfo readInfo(ClassReader reader) {
        return null;
    }

    public double float64;
}
