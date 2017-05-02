package EffectiveJava.part39;

import java.util.Date;

/**
 * Created by smaug on 2017/4/28.
 */
public class Period
{
    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {

        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (start.compareTo(end) > 0) {
            try {
                throw new IllegalAccessException(start + "after" + end);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}
