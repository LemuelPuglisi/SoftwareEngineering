package ids.viterbi;

import java.util.Arrays;
import java.util.List;

public class ViterbiEncoder {

    State currentState = new StateZero(this);

    public String encode (String sequence) {
        String encodedSequence = "";
        for (char c : sequence.toCharArray())
            encodedSequence += currentState.encode(c);
        return encodedSequence;
    }

    public void setState(State newState) {
        this.currentState = newState;
    }
}
