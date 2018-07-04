package classfile;

public class ConstantNameAndTypeInfo extends ConstantInfo<ConstantNameAndTypeInfo> {
    public char nameIndex;
    public char descriptorIndex;

    @Override
    public ConstantNameAndTypeInfo readInfo(ClassReader reader) {
        return null;
    }
}
