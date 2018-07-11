package classfile.attr.localvariable;

import classfile.ClassReader;
import classfile.attr.AttributeInfo;

public class LocalVariableTableAttribute extends AttributeInfo {

    private LocalVariableTableEntry[] localVariableTable;

    @Override
    public void readInfo(ClassReader reader) {
        char localVariableTableLength = reader.readUint16();
        this.localVariableTable = new LocalVariableTableEntry[localVariableTableLength];
        for (int i = 0; i < localVariableTableLength; ++i) {
            var lv = new LocalVariableTableEntry();
            lv.startPc = reader.readUint16();
            lv.length = reader.readUint16();
            lv.nameIndex = reader.readUint16();
            lv.descriptorIndex = reader.readUint16();
            lv.index = reader.readUint16();
            this.localVariableTable[i] = lv;
        }
    }
}
