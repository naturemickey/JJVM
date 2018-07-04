package classfile;

public class ConstantUtf8Info extends ConstantInfo<ConstantUtf8Info> {
    public String str;
    @Override
    public ConstantUtf8Info readInfo(ClassReader reader) {
        return null;
    }
}
