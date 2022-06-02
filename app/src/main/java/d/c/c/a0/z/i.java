/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Field
 *  java.lang.reflect.Type
 */
package d.c.c.a0.z;

import d.c.c.a0.z.j;
import d.c.c.a0.z.n;
import d.c.c.c0.a;
import d.c.c.c0.c;
import d.c.c.x;
import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class i
extends j.b {
    public final /* synthetic */ Field d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ x f;
    public final /* synthetic */ d.c.c.i g;
    public final /* synthetic */ d.c.c.b0.a h;
    public final /* synthetic */ boolean i;

    public i(j j2, String string, boolean bl, boolean bl2, Field field, boolean bl3, x x3, d.c.c.i i2, d.c.c.b0.a a2, boolean bl4) {
        this.d = field;
        this.e = bl3;
        this.f = x3;
        this.g = i2;
        this.h = a2;
        this.i = bl4;
        super(string, bl, bl2);
    }

    @Override
    public void a(a a2, Object object) {
        Object t6 = this.f.a(a2);
        if (t6 != null || !this.i) {
            this.d.set(object, t6);
        }
    }

    @Override
    public void b(c c3, Object object) {
        Object object2 = this.d.get(object);
        n<Object> n2 = this.e ? this.f : new n<Object>(this.g, this.f, this.h.b);
        ((x)n2).b(c3, object2);
    }

    @Override
    public boolean c(Object object) {
        if (!this.b) {
            return false;
        }
        Object object2 = this.d.get(object);
        boolean bl = object2 != object;
        return bl;
    }
}

