/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Objects
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Pattern
 */
package d.c.b.t;

import android.text.TextUtils;
import d.c.b.t.p.d;
import d.c.b.t.r.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class o {
    public static final long b = TimeUnit.HOURS.toSeconds(1L);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static o d;
    public final a a;

    public o(a a2) {
        this.a = a2;
    }

    public static o c() {
        if (d.c.b.t.r.a.a == null) {
            d.c.b.t.r.a.a = new a();
        }
        a a2 = d.c.b.t.r.a.a;
        if (d == null) {
            d = new o(a2);
        }
        return d;
    }

    public long a() {
        Objects.requireNonNull((Object)this.a);
        return System.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(this.a());
    }

    public boolean d(d d3) {
        if (TextUtils.isEmpty(d3.a())) {
            return true;
        }
        return d3.g() + d3.b() < this.b() + b;
    }
}

