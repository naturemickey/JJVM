package classfile;

public abstract class ConstantInfo<T extends ConstantInfo> {

    public abstract T readInfo(ClassReader reader);

    public static ConstantInfo readConstantInfo(ClassReader reader, ConstantPool cp)  {
        // TODO
        return null;
    }
}
