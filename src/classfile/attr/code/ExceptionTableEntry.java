package classfile.attr.code;

import classfile.ClassReader;

public class ExceptionTableEntry {

    public char startPc;
    public char endPc;
    public char handlerPc;
    public char catchType;

    public static ExceptionTableEntry[] readExceptionTable(ClassReader reader) {
        char exceptionTableLength = reader.readUint16();
        var exceptionTable = new ExceptionTableEntry[exceptionTableLength];
        for (int i = 0; i < exceptionTableLength; ++i) {
            var et = new ExceptionTableEntry();
            et.startPc = reader.readUint16();
            et.endPc = reader.readUint16();
            et.handlerPc = reader.readUint16();
            et.catchType = reader.readUint16();
            exceptionTable[i] = et;
        }
        return exceptionTable;
    }
}
