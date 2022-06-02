/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.auto.value.AutoValue
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.t.q;

import com.google.auto.value.AutoValue;
import d.c.b.t.q.f;

@AutoValue
public abstract class d {
    public abstract f a();

    public abstract String b();

    public abstract String c();

    public abstract a d();

    public abstract String e();

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a e;
        public static final /* enum */ a f;
        public static final /* synthetic */ a[] g;

        public static {
            a a2;
            a a3;
            e = a2 = new a();
            f = a3 = new a();
            g = new a[]{a2, a3};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return g.clone();
        }
    }

}

