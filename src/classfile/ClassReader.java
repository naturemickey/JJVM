package classfile;

public class ClassReader {
    private byte[] data;
    private int idx = 0;

    public ClassReader(byte[] data) {
        this.data = data;
    }

    public byte readUint8() {
        byte res = data[idx];
        idx += 1;
        return res;
    }

    public char readUint16() {
        return (char) this.binaryRead(2);
    }

    public int readUint32() {
        return (int) this.binaryRead(4);
    }

    public long readUint64() {
        return this.binaryRead(8);
    }

    public char[] readUint16s() {
        char n = this.readUint16();
        char[] s = new char[n];
        for (int i = 0; i < n; ++i) {
            s[i] = this.readUint16();
        }
        return s;
    }

    public byte[] readBytes(int n) {
        byte[] bytes = new byte[n];
        for (int i = 0; i < n; ++i, ++idx) {
            bytes[i] = this.data[idx];
        }
        return bytes;
    }

    private long binaryRead(int count) {
        long res = 0;
        while (--count >= 0) {
            res <<= 8;
            res += data[idx++];
        }
        return res;
    }
}
