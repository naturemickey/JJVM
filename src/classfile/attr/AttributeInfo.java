package classfile.attr;

import classfile.ClassReader;
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
        // TODO
        return null;
    }

    public static AttributeInfo newAttributeInfo(String attrName, int attrLen, ConstantPool cp) {
        // TODO
        return null;
    }
}