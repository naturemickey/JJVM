package classfile;

import classfile.attr.AttributeInfo;
import classfile.cp.ConstantPool;

public class ClassFile {

    private char minorVersion;
    private char majorVersion;
    private ConstantPool constantPool;
    private char accessFlags;
    private char thisClass;
    private char superClass;
    private char[] interfaces;
    private MemberInfo[] fields;
    private MemberInfo[] methods;
    private AttributeInfo[] attributes;

    public static ClassFile parser(byte[] classData) {
        var cr = new ClassReader(classData);
        var cf = new ClassFile();
        cf.read(cr);
        return cf;
    }

    private void read(ClassReader reader) {
        this.readAndCheckMagic(reader);
        this.readAndCheckVersion(reader);
        this.constantPool = ConstantPool.readConstantPool(reader);
        this.accessFlags = reader.readUint16();
        this.thisClass = reader.readUint16();
        this.superClass = reader.readUint16();
        this.interfaces = reader.readUint16s();
        this.fields = MemberInfo.readMembers(reader, this.constantPool);
        this.methods = MemberInfo.readMembers(reader, this.constantPool);
        this.attributes = AttributeInfo.readAttributes(reader, this.constantPool);
    }

    private void readAndCheckMagic(ClassReader reader) {
        if (reader.readUint32() != 0xCAFEBABE) {
            throw new ClassFormatError("magic !");
        }
    }

    private void readAndCheckVersion(ClassReader reader) {
        this.minorVersion = reader.readUint16();
        this.majorVersion = reader.readUint16();
        switch (this.majorVersion) {
            case 45:
                return;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
                if (this.minorVersion == 0)
                    return;
        }
        throw new UnsupportedClassVersionError();
    }

    public char minorVersion() {
        return minorVersion;
    }

    public char majorVersion() {
        return majorVersion;
    }

    public ConstantPool constantPool() {
        return constantPool;
    }

    public char accessFlags() {
        return accessFlags;
    }

    public MemberInfo[] fields() {
        return fields;
    }

    public MemberInfo[] methods() {
        return methods;
    }

    public String className() {
        // TODO
        return null;
    }

    public String superClassName() {
        // TODO
        return null;
    }

    public String[] interfaceNames() {
        // TODO
        return null;
    }
}
