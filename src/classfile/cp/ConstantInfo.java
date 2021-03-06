package classfile.cp;

import classfile.ClassReader;
import classfile.cp.invokedynamic.ConstantInvokeDynamicInfo;
import classfile.cp.invokedynamic.ConstantMethodHandleInfo;
import classfile.cp.invokedynamic.ConstantMethodTypeInfo;
import classfile.cp.memberref.ConstantFieldrefInfo;
import classfile.cp.memberref.ConstantInterfaceMethodrefInfo;
import classfile.cp.memberref.ConstantMemberrefInfo;
import classfile.cp.numeric.ConstantDoubleInfo;
import classfile.cp.numeric.ConstantFloatInfo;
import classfile.cp.numeric.ConstantIntegerInfo;
import classfile.cp.numeric.ConstantLongInfo;

public abstract class ConstantInfo {

    public static final byte CONSTANT_Utf8 = 1;
    public static final byte CONSTANT_Integer = 3;
    public static final byte CONSTANT_Float = 4;
    public static final byte CONSTANT_Long = 5;
    public static final byte CONSTANT_Double = 6;
    public static final byte CONSTANT_Class = 7;
    public static final byte CONSTANT_String = 8;
    public static final byte CONSTANT_Fieldref = 9;
    public static final byte CONSTANT_Methodref = 10;
    public static final byte CONSTANT_InterfaceMethodref = 11;
    public static final byte CONSTANT_NameAndType = 12;
    public static final byte CONSTANT_MethodHandle = 15;
    public static final byte CONSTANT_MethodType = 16;
    public static final byte CONSTANT_InvokeDynamic = 18;

    public abstract void readInfo(ClassReader reader);

    public static ConstantInfo readConstantInfo(ClassReader reader, ConstantPool cp) {
        var tag = reader.readUint8();
        var c = newConstantInfo(tag, cp);
        c.readInfo(reader);
        return c;
    }

    public static ConstantInfo newConstantInfo(byte tag, ConstantPool cp) {
        switch (tag) {
            case CONSTANT_Integer:
                return new ConstantIntegerInfo();
            case CONSTANT_Float:
                return new ConstantFloatInfo();
            case CONSTANT_Long:
                return new ConstantLongInfo();
            case CONSTANT_Double:
                return new ConstantDoubleInfo();
            case CONSTANT_Utf8:
                return new ConstantUtf8Info();
            case CONSTANT_String:
                return new ConstantStringInfo(cp);
            case CONSTANT_Class:
                return new ConstantClassInfo(cp);
            case CONSTANT_Fieldref:
                return new ConstantFieldrefInfo(cp);
            case CONSTANT_Methodref:
                return new ConstantMemberrefInfo(cp);
            case CONSTANT_InterfaceMethodref:
                return new ConstantInterfaceMethodrefInfo(cp);
            case CONSTANT_NameAndType:
                return new ConstantNameAndTypeInfo(cp);
            case CONSTANT_MethodType:
                return new ConstantMethodTypeInfo();
            case CONSTANT_MethodHandle:
                return new ConstantMethodHandleInfo();
            case CONSTANT_InvokeDynamic:
                return new ConstantInvokeDynamicInfo();
        }
        return null;
    }
}
