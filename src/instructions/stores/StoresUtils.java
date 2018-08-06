package instructions.stores;

import rtda._Frame;

public class StoresUtils {

    public static void _lstore(_Frame frame, int index) {
        long val = frame.operandStack().popLong();
        frame.localVars().setLong(index, val);
    }
}
