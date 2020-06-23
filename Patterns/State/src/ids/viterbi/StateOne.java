package ids.viterbi;

import java.util.Map;

public class StateOne extends State{

    public StateOne(ViterbiEncoder encoder) {
        super(encoder);
        super.zeroReturns = "11";
        super.oneReturns = "00";
        super.nextState = Map.of(
                '0', e -> new StateZero(e),
                '1', e -> new StateTwo(e)
        );
    }
}
