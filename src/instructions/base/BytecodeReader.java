package instructions.base;

public class BytecodeReader {
    private byte[] code;
    private int pc;

    public void reset(byte[] code, int pc) {
        this.code = code;
        this.pc = pc;
    }

    public int pc() {
        return this.pc;
    }

    public byte readInt8() {
        return code[pc++];
    }

    public byte readUint8() {
        return code[pc++];
    }

    public char readInt16() {
        return this.readUint16();
    }

    public char readUint16() {
        int h = this.readUint8() & 0xFF;
        int l = this.readUint8() & 0xFF;
        return (char) ((h << 8) | l);
    }

    public int readInt32() {
        int b1 = this.readUint8() & 0xFF;
        int b2 = this.readUint8() & 0xFF;
        int b3 = this.readUint8() & 0xFF;
        int b4 = this.readUint8() & 0xFF;
        return (b1 << 24) | (b2 << 16) | (b3 << 8) | b4;
    }

    public int[] readInt32s(int n) {
        int[] ints = new int[n];
        for (int i = 0; i < n; ++i) {
            ints[i] = this.readInt32();
        }
        return ints;
    }

    public void skipPadding() {
        while (this.pc % 4 != 0) {
            this.readUint8();
        }
    }
}
