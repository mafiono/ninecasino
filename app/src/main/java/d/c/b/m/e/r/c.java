/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.b.e
 *  d.c.a.b.f
 *  d.c.b.m.e.r.b
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.b.m.e.r;

import d.c.a.b.e;
import d.c.a.b.f;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.x.h;
import d.c.b.m.e.r.b;

public class c {
    public static final h b = new h();
    public static final String c = c.a("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    public static final String d = c.a("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    public static final e<v, byte[]> e = h.a;
    public final f<v> a;

    public c(f<v> f2, e<v, byte[]> e2) {
        this.a = f2;
    }

    public static String a(String string, String string2) {
        IllegalArgumentException illegalArgumentException;
        int n2 = string.length() - string2.length();
        if (n2 >= 0 && n2 <= 1) {
            StringBuilder stringBuilder = new StringBuilder(string.length() + string2.length());
            for (int i2 = 0; i2 < string.length(); ++i2) {
                stringBuilder.append(string.charAt(i2));
                if (string2.length() <= i2) continue;
                stringBuilder.append(string2.charAt(i2));
            }
            return stringBuilder.toString();
        }
        illegalArgumentException = new IllegalArgumentException("Invalid input received");
        throw illegalArgumentException;
    }
}

