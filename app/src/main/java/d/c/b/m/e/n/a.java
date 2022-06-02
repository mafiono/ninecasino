/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.n;

public final class a
extends Enum<a> {
    public static final /* enum */ a e;
    public static final /* enum */ a f;
    public static final /* enum */ a g;
    public static final /* enum */ a h;
    public static final /* synthetic */ a[] i;

    public static {
        a a2;
        a a3;
        a a4;
        a a5;
        e = a2 = new a();
        f = a3 = new a();
        g = a5 = new a();
        h = a4 = new a();
        i = new a[]{a2, a3, a5, a4};
    }

    public static a valueOf(String string) {
        return Enum.valueOf(a.class, string);
    }

    public static a[] values() {
        return i.clone();
    }
}

