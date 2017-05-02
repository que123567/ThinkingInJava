package EffectiveJava.part16;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by smaug on 2017/4/29.
 */
public class InstrumentedSet<E> extends HashSet<E>
{

    private int addCount = 0;

    public InstrumentedSet() {
    }

    public InstrumentedSet(int a, float b) {
        super(a, b);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount+=c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}
