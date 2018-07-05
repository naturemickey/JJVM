package classfile;

public class ConstantNameAndTypeInfo extends ConstantInfo {
    public char nameIndex;
    public char descriptorIndex;

    @Override
    public void readInfo(ClassReader reader) {
    }
}
