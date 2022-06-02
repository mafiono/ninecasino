/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.m.d
 *  f.m.f
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package f.m.k.a;

import f.m.d;
import f.m.f;

public final class b
implements d<Object> {
    public static final b e = new b();

    public f d() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public void g(Object object) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public String toString() {
        return "This continuation is already complete";
    }
}

