/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package d.c.c.a0.z;

import d.c.c.a0.p;
import d.c.c.c0.b;
import d.c.c.i;
import d.c.c.v;
import d.c.c.x;
import d.c.c.y;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class c
extends x<Date> {
    public static final y b = new y(){

        @Override
        public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
            if (a2.a == Date.class) {
                return new c();
            }
            return null;
        }
    };
    public final List<DateFormat> a;

    public c() {
        boolean bl;
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (bl = p.a >= 9) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MMM d, yyyy");
            stringBuilder.append(" ");
            stringBuilder.append("h:mm:ss a");
            arrayList.add(new SimpleDateFormat(stringBuilder.toString(), locale));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object a(d.c.c.c0.a a2) {
        if (a2.n0() == b.m) {
            a2.j0();
            return null;
        }
        String string = a2.l0();
        c c3 = this;
        synchronized (c3) {
            Iterator iterator = this.a.iterator();
            if (iterator.hasNext()) {
                DateFormat dateFormat = (DateFormat)iterator.next();
                return dateFormat.parse(string);
            }
            try {
                return d.c.c.a0.z.t.a.b(string, new ParsePosition(0));
            }
            catch (ParseException parseException) {
                throw new v(string, parseException);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void b(d.c.c.c0.c var1_1, Object var2_2) {
        var3_3 = (Date)var2_2;
        var7_4 = this;
        // MONITORENTER : var7_4
        if (var3_3 != null) ** GOTO lbl9
        var1_1.F();
        // MONITOREXIT : var7_4
        return;
lbl9: // 1 sources:
        var1_1.i0(((DateFormat)this.a.get(0)).format(var3_3));
        return;
    }

}

