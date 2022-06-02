/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.y.q;

public class p {
    public final String a;
    public final int b;

    public p(String string, int n2) {
        this.a = string;
        this.b = n2;
    }

    public String a() {
        if (this.b == 0) {
            return "";
        }
        String string = this.a;
        if (string != null) {
            return string;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
}

