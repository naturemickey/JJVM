package instructions.control;

import instructions.base.BranchUtils;
import instructions.base.BytecodeReader;
import instructions.base.Instruction;
import rtda._Frame;

import java.util.HashMap;
import java.util.Map;

public class LOOKUP_SWITCH implements Instruction {

    private int defaultOffset;
    private Map<Integer, Integer> matchOffsets = new HashMap<>();

    @Override
    public void fetchOperands(BytecodeReader reader) {
        this.defaultOffset = reader.readInt32();
        var npairs = reader.readInt32();
        var pars = reader.readInt32s(npairs * 2);
        for (int i = 0; i < pars.length; i += 2) {
            var key = pars[i];
            var val = pars[i + 1];
            matchOffsets.put(key, val);
        }
    }

    @Override
    public void execute(_Frame frame) {
        var key = frame.operandStack().popInt();
        var offset = matchOffsets.getOrDefault(key, this.defaultOffset);
        BranchUtils.branch(frame, offset);
    }
}
