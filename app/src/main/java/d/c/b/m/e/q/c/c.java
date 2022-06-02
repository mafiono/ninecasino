/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package d.c.b.m.e.q.c;

import java.io.File;
import java.util.Map;

public interface c {
    Map<String, String> a();

    File[] b();

    String c();

    String d();

    a e();

    File f();

    void remove();

    final class a
    extends Enum<a> {
        public static final /* enum */ a e;
        public static final /* enum */ a f;
        public static final /* synthetic */ a[] g;

        public static {
            a a2;
            a a3;
            e = a3 = new a();
            f = a2 = new a();
            g = new a[]{a3, a2};
        }

        public static a valueOf(String string) {
            return Enum.valueOf(a.class, string);
        }

        public static a[] values() {
            return g.clone();
        }
    }

}

