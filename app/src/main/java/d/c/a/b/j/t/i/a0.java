/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  e.a.a
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.b.j.t.i;

import android.content.Context;
import d.c.a.b.j.t.i.z;
import e.a.a;

public final class a0
implements Object<z> {
    public final a<Context> a;
    public final a<String> b;
    public final a<Integer> c;

    public a0(a<Context> a2, a<String> a3, a<Integer> a4) {
        this.a = a2;
        this.b = a3;
        this.c = a4;
    }

    public Object get() {
        return new z((Context)this.a.get(), (String)this.b.get(), (Integer)this.c.get());
    }
}

