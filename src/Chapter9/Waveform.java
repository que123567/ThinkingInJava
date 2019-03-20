package Chapter9;

/**
 * Created by smaug on 2017/5/3.
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Waveform" + id;
    }
}

class Filters {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

class LowPass extends Filters {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

class HighPass extends Filters {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

class BandPass extends Filters {
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}