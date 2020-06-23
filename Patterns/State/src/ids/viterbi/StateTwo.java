package ids.viterbi;

import java.util.Map;

public class StateTwo extends State {

    public StateTwo(ViterbiEncoder encoder) {
        super(encoder);
        super.zeroReturns = "10";
        super.oneReturns = "01";
        super.nextState = Map.of(
                '0', e -> new StateOne(e),
                '1', e -> new StateThree(e)
        );
    }
}
