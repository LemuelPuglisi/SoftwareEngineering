package ids.viterbi;

import java.util.Map;
import java.util.function.Function;

public class State {

    ViterbiEncoder encoder;

    protected Map<Character, Function<ViterbiEncoder, State>> nextState;
    protected String zeroReturns;
    protected String oneReturns;

    public State (ViterbiEncoder encoder) {
        this.encoder = encoder;
    }

    public String encode (char bit) {
        this.encoder.setState(nextState.get(bit).apply(encoder));
        return bit == '0' ? zeroReturns : oneReturns;
    }
}
