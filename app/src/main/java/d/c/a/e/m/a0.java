/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Calendar
 *  java.util.TimeZone
 *  java.util.concurrent.atomic.AtomicReference
 */
package d.c.a.e.m;

import d.c.a.e.m.z;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public class a0 {
    public static AtomicReference<z> a = new AtomicReference();

    public static long a(long l2) {
        Calendar calendar = a0.e();
        calendar.setTimeInMillis(l2);
        return a0.b(calendar).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar calendar2 = a0.f(calendar);
        Calendar calendar3 = a0.e();
        calendar3.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
        return calendar3;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        TimeZone timeZone;
        z z2 = a.get();
        if (z2 == null) {
            z2 = z.c;
        }
        Calendar calendar = (timeZone = z2.b) == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = z2.a;
        if (l2 != null) {
            calendar.setTimeInMillis(l2.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(a0.c());
        return calendar;
    }

    public static Calendar e() {
        return a0.f(null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(a0.c());
        if (calendar == null) {
            calendar2.clear();
            return calendar2;
        }
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return calendar2;
    }
}

