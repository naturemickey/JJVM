package instructions.stores;

import rtda._Frame;

public class StoresUtils {

    public static void _lstore(_Frame frame, int index) {
        long val = frame.operandStack().popLong();
        frame.localVars().setLong(index, val);
    }

    public static void _astore(_Frame frame, int index) {
        var ref = frame.operandStack().popRef();
        frame.localVars().setRef(index, ref);
    }

    public static void _dstore(_Frame frame, int index) {
        var d = frame.operandStack().popDouble();
        frame.localVars().setDouble(index, d);
    }

    public static void _fstore(_Frame frame, int index) {
        var f = frame.operandStack().popFloat();
        frame.localVars().setFloat(index, f);
    }

    public static void _istore(_Frame frame, int index) {
        var i = frame.operandStack().popInt();
        frame.localVars().setInt(index, i);
    }
}
