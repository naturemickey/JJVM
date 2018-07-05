package classfile;

public class ConstantStringInfo extends ConstantInfo {

    public ConstantPool cp;
    public char stringIndex;

    public ConstantStringInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
    }
}
