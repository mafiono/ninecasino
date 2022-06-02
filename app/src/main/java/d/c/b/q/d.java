/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.q;

public interface d {
    a a(String var1);

    final class a
    extends Enum<a> {
        public static final /* enum */ a f;
        public static final /* enum */ a g;
        public static final /* enum */ a h;
        public static final /* enum */ a i;
        public static final /* synthetic */ a[] j;
        public final int e;

        public static {
            a a2;
            a a3;
            a a4;
            a a5;
            f = a2 = new a(0);
            g = a5 = new a(1);
            h = a3 = new a(2);
            i = a4 = new a(3);
            j = new a[]{a2, a5, a3, a4};
        }

        public a(int n3) {
            this.e = n3;
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return j.clone();
        }
    }

}

