package classfile.cp;

import classfile.ClassReader;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.nio.charset.Charset;

public class ConstantUtf8Info extends ConstantInfo {
    private String str;

    @Override
    public void readInfo(ClassReader reader) {
        var bytes = reader.readBytes(reader.readUint16());
        this.str = this.decodeMUTF8(bytes);
    }

    private String decodeMUTF8(byte[] bytes) {
        return new String(bytes);
//        try (DataInputStream dis = new DataInputStream(new ByteArrayInputStream(bytes))) {
//            return dis.readUTF();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
    }

    public String String() {
        return str;
    }
}
