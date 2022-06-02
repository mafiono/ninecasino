/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.sql.Date
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class k
extends x<java.sql.Date> {
    public static final y b = new y(){

        @Override
        public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
            if (a2.a == java.sql.Date.class) {
                return new k();
            }
            return null;
        }
    };
    public final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object a(d.c.c.c0.a a2) {
        k k4 = this;
        synchronized (k4) {
            if (a2.n0() == b.m) {
                a2.j0();
                return null;
            }
            try {
                return new java.sql.Date(this.a.parse(a2.l0()).getTime());
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
        java.sql.Date date = (java.sql.Date)object;
        k k4 = this;
        synchronized (k4) {
            String string = date == null ? null : this.a.format(date);
            c3.i0(string);
            return;
        }
    }

}

