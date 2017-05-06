package Chapter9;

/**
 * 适配器模式
 * Created by smaug on 2017/5/3.
 */


interface Processor
{
    String name();
    Object process(Object input);
}

class FilterAdapter implements Processor
{
    Filters filters;

    public FilterAdapter(Filters filters) {
        this.filters = filters;
    }

    @Override
    public String name() {
        return filters.name();
    }

    @Override
    public Object process(Object input) {
        return filters.process((Waveform) input);
    }
}

public class FilterProcessor
{
    public static void main(String[] args) {
        Waveform waveform = new Waveform();
        Apply.procee(new FilterAdapter(new LowPass(1.0)), waveform);
        Apply.procee(new FilterAdapter(new HighPass(1.0)), waveform);
        Apply.procee(new FilterAdapter(new BandPass(1.0, 2.0)), waveform);
    }

}
