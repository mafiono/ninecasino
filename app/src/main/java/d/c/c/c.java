/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.c.c$a
 *  d.c.c.c$b
 *  d.c.c.c$c
 *  d.c.c.c$d
 *  d.c.c.c$e
 *  d.c.c.c$f
 *  java.lang.Character
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.c;

import d.c.c.c;

public abstract class c
extends Enum<c>
implements d {
    public static final /* enum */ c e;
    public static final /* enum */ c f;
    public static final /* enum */ c g;
    public static final /* enum */ c h;
    public static final /* enum */ c i;
    public static final /* enum */ c j;
    public static final /* synthetic */ c[] k;

    public static {
        a a2 = new a("IDENTITY", 0);
        e = a2;
        b b3 = new b("UPPER_CAMEL_CASE", 1);
        f = b3;
        c c3 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        g = c3;
        d d3 = new d("LOWER_CASE_WITH_UNDERSCORES", 3);
        h = d3;
        e e2 = new e("LOWER_CASE_WITH_DASHES", 4);
        i = e2;
        f f2 = new f("LOWER_CASE_WITH_DOTS", 5);
        j = f2;
        k = new c[]{a2, b3, c3, d3, e2, f2};
    }

    public c(a a2) {
    }

    public static String i(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = string.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c3 = string.charAt(i2);
            if (Character.isUpperCase(c3) && stringBuilder.length() != 0) {
                stringBuilder.append(string2);
            }
            stringBuilder.append(c3);
        }
        return stringBuilder.toString();
    }

    public static String j(String string) {
        int n2;
        int n3 = string.length() - 1;
        for (n2 = 0; !Character.isLetter(string.charAt(n2)) && n2 < n3; ++n2) {
        }
        char c3 = string.charAt(n2);
        if (Character.isUpperCase(c3)) {
            return string;
        }
        char c4 = Character.toUpperCase(c3);
        if (n2 == 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c4);
            stringBuilder.append(string.substring(1));
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string.substring(0, n2));
        stringBuilder.append(c4);
        stringBuilder.append(string.substring(n2 + 1));
        return stringBuilder.toString();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return k.clone();
    }
}

