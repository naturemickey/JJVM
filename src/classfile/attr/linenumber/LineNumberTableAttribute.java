package classfile.attr.linenumber;

import classfile.ClassReader;
import classfile.attr.AttributeInfo;

public class LineNumberTableAttribute extends AttributeInfo {

    public LineNumberTableEntry[] lineNumberTable;

    @Override
    public void readInfo(ClassReader reader) {
        char lineNumberTableLength = reader.readUint16();
        this.lineNumberTable = new LineNumberTableEntry[lineNumberTableLength];
        for (int i = 0; i < lineNumberTableLength; ++i) {
            var lnt = new LineNumberTableEntry();
            lnt.startPc = reader.readUint16();
            lnt.lineNumber = reader.readUint16();
        }
    }

    public int getLineNumber(int pc) {
        for (int i = this.lineNumberTable.length - 1; i >= 0; --i) {
            var entry = this.lineNumberTable[i];
            if (pc > entry.startPc) {
                return entry.lineNumber;
            }
        }
        return -1;
    }
}
