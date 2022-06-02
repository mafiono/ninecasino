/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.sql.Time
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 */
package d.c.c.a0.z;

import d.c.c.c0.b;
import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.v;
import d.c.c.x;
import d.c.c.y;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class l
extends x<Time> {
    public static final y b = new y(){

        @Override
        public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
            if (a2.a == Time.class) {
                return new l();
            }
            return null;
        }
    };
    public final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object a(d.c.c.c0.a a2) {
        l l4 = this;
        synchronized (l4) {
            if (a2.n0() == b.m) {
                a2.j0();
                return null;
            }
            try {
                return new Time(this.a.parse(a2.l0()).getTime());
            }
            catch (ParseException parseException) {
                throw new v(parseException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b(c c3, Object object) {
        Time time = (Time)object;
        l l4 = this;
        synchronized (l4) {
            String string = time == null ? null : this.a.format(time);
            c3.i0(string);
            return;
        }
    }

}

