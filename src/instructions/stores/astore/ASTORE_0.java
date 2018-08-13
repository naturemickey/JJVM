package instructions.stores.astore;

import instructions.base.inst.NoOperandsInstruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class ASTORE_0 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._astore(frame, 0);
    }
}
