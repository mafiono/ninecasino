/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package d.c.d.j;

import java.util.HashMap;
import java.util.Map;

public final class c
extends Enum<c> {
    public static final /* enum */ c A;
    public static final /* enum */ c B;
    public static final /* enum */ c C;
    public static final /* enum */ c D;
    public static final /* enum */ c E;
    public static final /* enum */ c F;
    public static final /* enum */ c G;
    public static final Map<Integer, c> H;
    public static final Map<String, c> I;
    public static final /* synthetic */ c[] J;
    public static final /* enum */ c g;
    public static final /* enum */ c h;
    public static final /* enum */ c i;
    public static final /* enum */ c j;
    public static final /* enum */ c k;
    public static final /* enum */ c l;
    public static final /* enum */ c m;
    public static final /* enum */ c n;
    public static final /* enum */ c o;
    public static final /* enum */ c p;
    public static final /* enum */ c q;
    public static final /* enum */ c r;
    public static final /* enum */ c s;
    public static final /* enum */ c t;
    public static final /* enum */ c u;
    public static final /* enum */ c v;
    public static final /* enum */ c w;
    public static final /* enum */ c x;
    public static final /* enum */ c y;
    public static final /* enum */ c z;
    public final int[] e;
    public final String[] f;

    public static {
        c c2;
        c c3;
        c c4;
        c c5;
        c c6;
        c c7;
        c c8;
        c c9;
        c c10;
        c c11;
        c c12;
        c c13;
        c c14;
        c c15;
        c c16;
        c c17;
        c c18;
        c c19;
        c c20;
        c c21;
        c c22;
        c c23;
        c c24;
        c c25;
        c c26;
        c c27;
        c c28;
        g = c25 = new c(new int[]{0, 2});
        h = c23 = new c(new int[]{1, 3}, "ISO-8859-1");
        i = c14 = new c(4, "ISO-8859-2");
        j = c8 = new c(5, "ISO-8859-3");
        k = c28 = new c(6, "ISO-8859-4");
        l = c15 = new c(7, "ISO-8859-5");
        m = c18 = new c(8, "ISO-8859-6");
        n = c2 = new c(9, "ISO-8859-7");
        o = c12 = new c(10, "ISO-8859-8");
        p = c20 = new c(11, "ISO-8859-9");
        q = c27 = new c(12, "ISO-8859-10");
        r = c11 = new c(13, "ISO-8859-11");
        s = c21 = new c(15, "ISO-8859-13");
        t = c17 = new c(16, "ISO-8859-14");
        u = c5 = new c(17, "ISO-8859-15");
        v = c24 = new c(18, "ISO-8859-16");
        w = c9 = new c(20, "Shift_JIS");
        x = c4 = new c(21, "windows-1250");
        y = c19 = new c(22, "windows-1251");
        z = c6 = new c(23, "windows-1252");
        A = c3 = new c(24, "windows-1256");
        B = c16 = new c(25, "UTF-16BE", "UnicodeBig");
        C = c7 = new c(26, "UTF-8");
        D = c22 = new c(new int[]{27, 170}, "US-ASCII");
        E = c13 = new c(28);
        F = c26 = new c(29, "GB2312", "EUC_CN", "GBK");
        G = c10 = new c(30, "EUC-KR");
        J = new c[]{c25, c23, c14, c8, c28, c15, c18, c2, c12, c20, c27, c11, c21, c17, c5, c24, c9, c4, c19, c6, c3, c16, c7, c22, c13, c26, c10};
        H = new HashMap();
        I = new HashMap();
        c[] arrc = c.values();
        for (int i2 = 0; i2 < 27; ++i2) {
            c c29 = arrc[i2];
            for (int n2 : c29.e) {
                H.put((Object)n2, (Object)c29);
            }
            I.put((Object)c29.name(), (Object)c29);
            for (String string : c29.f) {
                I.put((Object)string, (Object)c29);
            }
        }
    }

    public c(int n3) {
        int[] arrn = new int[]{n3};
        String[] arrstring = new String[]{};
        this.e = arrn;
        this.f = arrstring;
    }

    public /* varargs */ c(int n3, String ... arrstring) {
        this.e = new int[]{n3};
        this.f = arrstring;
    }

    public /* varargs */ c(int[] arrn, String ... arrstring) {
        this.e = arrn;
        this.f = arrstring;
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return J.clone();
    }
}

