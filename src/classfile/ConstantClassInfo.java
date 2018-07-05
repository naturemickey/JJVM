package classfile;

public class ConstantClassInfo extends ConstantInfo<ConstantClassInfo> {
    public ConstantPool cp;
    public char nameIndex;

    public ConstantClassInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public ConstantClassInfo readInfo(ClassReader reader) {
        return null;
    }
}
