package ids.viterbi;

import java.util.Map;

public class StateZero extends State {

    public StateZero(ViterbiEncoder encoder) {
        super(encoder);
        super.zeroReturns = "00";
        super.oneReturns = "11";
        super.nextState = Map.of(
                '0', e -> new StateZero(e),
                '1', e -> new StateTwo(e)
        );
    }
}
