package instructions.stores.lstore;

import instructions.base.inst.NoOperandsInstruction;
import instructions.stores.StoresUtils;
import rtda._Frame;

public class LSTORE_3 extends NoOperandsInstruction {
    @Override
    public void execute(_Frame frame) {
        StoresUtils._lstore(frame, 3);
    }
}
