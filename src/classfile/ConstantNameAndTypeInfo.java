package classfile;

public class ConstantNameAndTypeInfo extends ConstantInfo {
    private ConstantPool cp;
    private char nameIndex;
    private char descriptorIndex;

    public ConstantNameAndTypeInfo(ConstantPool cp) {
        this.cp = cp;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.nameIndex = reader.readUint16();
        this.descriptorIndex = reader.readUint16();
    }

    public String Name() {
        return this.cp.getUtf8(this.nameIndex);
    }

    public String Descriptor() {
        return this.cp.getUtf8(this.descriptorIndex);
    }
}
