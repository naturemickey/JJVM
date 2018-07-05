package classfile;

public class ConstantClassInfo extends ConstantInfo {
    public ConstantPool cp;
    public char nameIndex;

    public ConstantClassInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
    }
}
