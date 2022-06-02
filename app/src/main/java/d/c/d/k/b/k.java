/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.d.k.b;

public final class k
extends Enum<k> {
    public static final /* enum */ k e;
    public static final /* enum */ k f;
    public static final /* enum */ k g;
    public static final /* synthetic */ k[] h;

    public static {
        k k2;
        k k3;
        k k4;
        e = k3 = new k();
        f = k2 = new k();
        g = k4 = new k();
        h = new k[]{k3, k2, k4};
    }

    public static k valueOf(String string) {
        return Enum.valueOf(k.class, string);
    }

    public static k[] values() {
        return h.clone();
    }
}

