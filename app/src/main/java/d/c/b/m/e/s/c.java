/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.s;

public final class c
extends Enum<c> {
    public static final /* enum */ c e;
    public static final /* enum */ c f;
    public static final /* enum */ c g;
    public static final /* synthetic */ c[] h;

    public static {
        c c2;
        c c3;
        c c4;
        e = c4 = new c();
        f = c3 = new c();
        g = c2 = new c();
        h = new c[]{c4, c3, c2};
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    public static c[] values() {
        return h.clone();
    }
}

