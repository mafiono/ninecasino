/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.auto.value.AutoValue
 *  com.google.auto.value.AutoValue$Builder
 *  d.a.b.a.a
 *  d.c.b.t.p.a
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.t.p;

import com.google.auto.value.AutoValue;
import d.c.b.t.p.c;

@AutoValue
public abstract class d {
    public static final /* synthetic */ int a;

    public static {
        Long l2 = 0L;
        String string = l2 == null ? " expiresInSecs" : "";
        if (l2 == null) {
            string = d.a.b.a.a.m((String)string, (String)" tokenCreationEpochInSecs");
        }
        if (string.isEmpty()) {
            l2.longValue();
            l2.longValue();
            return;
        }
        throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string));
    }

    public abstract String a();

    public abstract long b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract c.a f();

    public abstract long g();

    public boolean h() {
        return this.f() == c.a.i;
    }

    public boolean i() {
        c.a a2 = ((d.c.b.t.p.a)this).c;
        return a2 == c.a.f || a2 == c.a.e;
        {
        }
    }

    public boolean j() {
        return this.f() == c.a.h;
    }

    public abstract a k();

    @AutoValue.Builder
    public static abstract class a {
        public abstract d a();

        public abstract a b(c.a var1);
    }

}

