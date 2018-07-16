package rtda;

public class _LocalVars {
    private _Slot[] slots;

    public _LocalVars(int maxLocals) {
        this.slots = new _Slot[maxLocals];
        for (int i = 0; i < maxLocals; ++i) {
            this.slots[i] = new _Slot();
        }
    }

    public void setInt(int index, int val) {
        this.slots[index].num = val;
    }

    public int getInt(int index) {
        return this.slots[index].num;
    }

    public void setFloat(int index, float val) {
        this.slots[index].num = Float.floatToIntBits(val);
    }

    public float getFloat(int index) {
        return Float.intBitsToFloat(this.slots[index].num);
    }

    public void setLong(int index, long val) {
        int low = (int) (val & 0xFFFF);
        int hight = (int) ((val >> 32) & 0xFFFF);

        this.slots[index].num = low;
        this.slots[index + 1].num = hight;
    }

    public long getLong(int index) {
        int low = this.slots[index].num;
        int hight = this.slots[index + 1].num;

        long lowL = ((long) low) & 0xFFFF;
        long hightL = ((long) hight) << 32;

        return hightL | lowL;
    }

    public void setDouble(int index, double val) {
        this.setLong(index, Double.doubleToLongBits(val));
    }

    public double getDouble(int index) {
        return Double.longBitsToDouble(this.getLong(index));
    }

    public void setRef(int index, _Object ref) {
        this.slots[index].ref = ref;
    }

    public _Object getRef(int index) {
        return this.slots[index].ref;
    }
}
