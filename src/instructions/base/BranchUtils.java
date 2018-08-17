package instructions.base;

import rtda._Frame;

public class BranchUtils {


    public static void branch(_Frame frame, int offset) {
        var pc = frame.thread().pc();
        var nextPC = pc + offset;
        frame.setNextPC(nextPC);
    }
}
