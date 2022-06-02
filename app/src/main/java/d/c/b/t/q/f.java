/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.auto.value.AutoValue
 *  com.google.auto.value.AutoValue$Builder
 *  d.c.b.t.q.b
 *  d.c.b.t.q.b$b
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.t.q;

import com.google.auto.value.AutoValue;
import d.c.b.t.q.b;

@AutoValue
public abstract class f {
    public static a a() {
        b.b b2 = new b.b();
        b2.b(0L);
        return b2;
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();

    @AutoValue.Builder
    public static abstract class a {
        public abstract f a();

        public abstract a b(long var1);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b e;
        public static final /* enum */ b f;
        public static final /* enum */ b g;
        public static final /* synthetic */ b[] h;

        public static {
            b b2;
            b b3;
            b b4;
            e = b2 = new b();
            f = b3 = new b();
            g = b4 = new b();
            h = new b[]{b2, b3, b4};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return h.clone();
        }
    }

}

