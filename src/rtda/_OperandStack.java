package rtda;

public class _OperandStack {
    private int size;
    private _Slot[] slots;

    public _OperandStack(int maxStack) {
        this.slots = new _Slot[maxStack];
        for (int i = 0; i < maxStack; ++i) {
            this.slots[i] = new _Slot();
        }
    }

    public void pushInt(int val) {
        this.slots[this.size].num = val;
        this.size++;
    }

    public int popInt() {
        this.size--;
        return this.slots[this.size].num;
    }

    public void pushFloat(float val) {
        this.pushInt(Float.floatToIntBits(val));
    }

    public float popFloat() {
        return Float.intBitsToFloat(this.popInt());
    }

    public void pushLong(long val) {
        this.slots[size].num = (int) val;
        this.slots[size + 1].num = (int) (val >> 32);
        size += 2;
    }

    public long popLong() {
        size -= 2;
        int low = this.slots[size].num;
        int hight = this.slots[size + 1].num;
        return ((long) hight) << 32 | low;
    }

    public void pushDouble(double val) {
        this.pushLong(Double.doubleToLongBits(val));
    }

    public double popDouble() {
        return Double.longBitsToDouble(this.popLong());
    }

    public void pushRef(_Object ref) {
        this.slots[size].ref = ref;
        size += 1;
    }

    public _Object popRef() {
        size--;
        _Object ref = this.slots[size].ref;
        this.slots[size].ref = null;
        return ref;
    }
}
