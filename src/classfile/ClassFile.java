package classfile;

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
        // TODO
        return null;
    }

    private void read(ClassReader reader) {
        // TODO
    }

    private void readAndCheckMagic(ClassReader reader) {
        // TODO
    }

    private void readAndCheckVersion(ClassReader reader) {
        // TODO
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
