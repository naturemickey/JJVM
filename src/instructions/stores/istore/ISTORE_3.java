package instructions.stores.istore;

import instructions.base.inst.NoOperandsInstruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class ISTORE_3 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._istore(frame, 3);
    }
}
