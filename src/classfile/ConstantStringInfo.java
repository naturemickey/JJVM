package classfile;

public class ConstantStringInfo extends ConstantInfo<ConstantStringInfo> {

    public ConstantPool cp;
    public char stringIndex;

    public ConstantStringInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public ConstantStringInfo readInfo(ClassReader reader) {
        return null;
    }
}
