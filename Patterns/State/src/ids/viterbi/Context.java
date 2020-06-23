package ids.viterbi;

public class Context {
    public static void main(String[] args) {

        ViterbiEncoder encoder = new ViterbiEncoder();
        System.out.println(encoder.encode("011001"));
    }
}
