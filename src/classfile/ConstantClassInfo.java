package classfile;

public class ConstantClassInfo extends ConstantInfo<ConstantClassInfo> {
    public ConstantPool cp;
    public char nameIndex;
    @Override
    public ConstantClassInfo readInfo(ClassReader reader) {
        return null;
    }
}
