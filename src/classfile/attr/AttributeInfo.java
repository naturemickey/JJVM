package classfile.attr;

import classfile.ClassReader;
import classfile.attr.code.CodeAttribute;
import classfile.attr.linenumber.LineNumberTableAttribute;
import classfile.attr.localvariable.LocalVariableTableAttribute;
import classfile.cp.ConstantPool;

public abstract class AttributeInfo {

    public abstract void readInfo(ClassReader reader);

    public static AttributeInfo[] readAttributes(ClassReader reader, ConstantPool cp) {
        char attributesCount = reader.readUint16();
        var attributeInfos = new AttributeInfo[attributesCount];
        for (int i = 0; i < attributesCount; ++i) {
            attributeInfos[i] = readAttribute(reader, cp);
        }
        return attributeInfos;
    }

    public static AttributeInfo readAttribute(ClassReader reader, ConstantPool cp) {
        char attrNameIndex = reader.readUint16();
        var attrName = cp.getUtf8(attrNameIndex);
        int attrLen = reader.readUint32();
        var attrInfo = newAttributeInfo(attrName, attrLen, cp);
        attrInfo.readInfo(reader);
        return attrInfo;
    }

    public static AttributeInfo newAttributeInfo(String attrName, int attrLen, ConstantPool cp) {
        switch (attrName) {
            case "Code":
                return new CodeAttribute(cp);
            case "ConstantValue":
                return new ConstantValueAttribute();
            case "Deprecated":
                return new DeprecatedAttribute();
            case "Exceptions":
                return new ExceptionsAttribute();
            case "LineNumberTable":
                return new LineNumberTableAttribute();
            case "LocalVariableTable":
                return new LocalVariableTableAttribute();
            case "SourceFile":
                return new SourceFileAttribute(cp);
            case "Synthetic":
                return new SyntheticAttribute(cp);
            default:
                return new UnparsedAttribute(attrName, attrLen, new byte[0]);
        }
    }
}
