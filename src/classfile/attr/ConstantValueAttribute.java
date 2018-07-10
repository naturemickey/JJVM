package classfile.attr;

import classfile.ClassReader;

public class ConstantValueAttribute extends AttributeInfo {

    private char constantValueIndex;

    @Override
    public void readInfo(ClassReader reader) {
        this.constantValueIndex = reader.readUint16();
    }

    public char constantValueIndex() {
        return this.constantValueIndex;
    }
}
