package classfile;

public class MemberInfo {

    private ConstantPool cp;
    private char accessFlags;
    private char nameIndex;
    private char descriptorIndex;
    private AttributeInfo[] attributes;

    public static MemberInfo[] readMembers(ClassReader reader, ConstantPool cp) {
        char memberCount = reader.readUint16();
        var members = new MemberInfo[memberCount];
        for (int i = 0; i < memberCount; ++i) {
            members[i] = readMember(reader, cp);
        }
        return members;
    }

    public static MemberInfo readMember(ClassReader reader, ConstantPool cp) {
        var member = new MemberInfo();
        member.cp = cp;
        member.accessFlags = reader.readUint16();
        member.nameIndex = reader.readUint16();
        member.descriptorIndex = reader.readUint16();
        member.attributes = AttributeInfo.readAttributes(reader, cp);
        return member;
    }

    public char accessFlags() {
        return this.accessFlags;
    }

    public String name() {
        // TODO
        return null;
    }

    public String descriptor() {
        // TODO
        return null;
    }

}
