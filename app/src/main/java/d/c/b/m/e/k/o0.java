/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

public final class o0
extends Enum<o0> {
    public static final /* enum */ o0 f;
    public static final /* enum */ o0 g;
    public static final /* enum */ o0 h;
    public static final /* enum */ o0 i;
    public static final /* synthetic */ o0[] j;
    public final int e;

    public static {
        o0 o02;
        o0 o03;
        o0 o04;
        o0 o05;
        f = o05 = new o0(1);
        g = o03 = new o0(2);
        h = o02 = new o0(3);
        i = o04 = new o0(4);
        j = new o0[]{o05, o03, o02, o04};
    }

    public o0(int n3) {
        this.e = n3;
    }

    public static o0 g(String string) {
        if (string != null) {
            return i;
        }
        return f;
    }

    public static o0 valueOf(String string) {
        return Enum.valueOf(o0.class, string);
    }

    public static o0[] values() {
        return j.clone();
    }

    public String toString() {
        return Integer.toString(this.e);
    }
}

