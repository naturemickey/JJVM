package classfile.attr;

import classfile.ClassReader;

public class ExceptionsAttribute extends AttributeInfo {

    public char[] exceptionIndexTable;

    @Override
    public void readInfo(ClassReader reader) {
        this.exceptionIndexTable = reader.readUint16s();
    }
}
