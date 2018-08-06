package instructions.loads;

import rtda._Frame;

public class LoadsUtils {

    public static void _iload(_Frame frame, int index) {
        int val = frame.localVars().getInt(index);
        frame.operandStack().pushInt(val);
    }
}
