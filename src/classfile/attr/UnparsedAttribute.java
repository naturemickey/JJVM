package classfile.attr;

import classfile.ClassReader;

public class UnparsedAttribute extends AttributeInfo {

    private String name;
    private int length;
    private byte[] info;

    public UnparsedAttribute(String name, int length, byte[] info) {
        this.name = name;
        this.length = length;
        this.info = info;
    }

    @Override
    public void readInfo(ClassReader reader) {
        this.info = reader.readBytes(this.length);
    }
}
