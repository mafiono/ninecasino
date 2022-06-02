/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.text.format.DateUtils
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  d.c.b.y.j
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Date
 *  java.util.Objects
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 */
package d.c.b.y.q;

import android.content.SharedPreferences;
import android.text.format.DateUtils;
import d.c.a.d.b.a;
import d.c.b.t.l;
import d.c.b.y.j;
import d.c.b.y.q.f;
import d.c.b.y.q.h;
import d.c.b.y.q.i;
import d.c.b.y.q.k;
import d.c.b.y.q.n;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class g
implements d.c.a.d.j.a {
    public final k a;
    public final long b;

    public g(k k4, long l4) {
        this.a = k4;
        this.b = l4;
    }

    public Object a(d.c.a.d.j.h h2) {
        d.c.a.d.j.h h3;
        k k4 = this.a;
        long l4 = this.b;
        Objects.requireNonNull((Object)k4);
        Date date = new Date(System.currentTimeMillis());
        if (h2.n()) {
            n n2 = k4.g;
            Objects.requireNonNull((Object)n2);
            Date date2 = new Date(n2.a.getLong("last_fetch_time_in_millis", -1L));
            boolean bl = !date2.equals(n.d) && date.before(new Date(date2.getTime() + TimeUnit.SECONDS.toMillis(l4)));
            if (bl) {
                return a.l(new k.a(date, 2, null, null));
            }
        }
        Date date3 = k4.g.a().b;
        boolean bl = date.before(date3);
        Date date4 = null;
        if (bl) {
            date4 = date3;
        }
        if (date4 != null) {
            long l5 = date4.getTime() - date.getTime();
            Object[] arrobject = new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(l5))};
            h3 = a.k((Exception)new j(String.format("Fetch is throttled. Please wait before calling fetch again: %s", arrobject), date4.getTime()));
        } else {
            d.c.a.d.j.h<String> h4 = k4.a.d();
            d.c.a.d.j.h<l> h5 = k4.a.a(false);
            h3 = a.C(h4, h5).h(k4.c, (d.c.a.d.j.a)new h(k4, h4, h5, date));
        }
        return h3.h(k4.c, (d.c.a.d.j.a)new i(k4, date));
    }
}

