package classfile.attr.code;

import classfile.ClassReader;
import classfile.attr.AttributeInfo;
import classfile.cp.ConstantPool;

public class CodeAttribute extends AttributeInfo {

    public CodeAttribute(ConstantPool cp) {
        this.cp = cp;
    }

    private ConstantPool cp;
    public char maxStack;
    public char maxLocals;
    public byte[] code;
    public ExceptionTableEntry[] exceptionTable;
    public AttributeInfo[] attributes;

    @Override
    public void readInfo(ClassReader reader) {
        this.maxStack = reader.readUint16();
        this.maxLocals = reader.readUint16();
        int codeLength = reader.readUint32();
        this.code = reader.readBytes(codeLength);
        this.exceptionTable = ExceptionTableEntry.readExceptionTable(reader);
        this.attributes = AttributeInfo.readAttributes(reader, cp);
    }
}
