/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.m.d
 *  g.a.y1.f
 *  g.a.y1.g
 *  g.a.y1.j.c
 *  g.a.y1.j.d
 *  g.a.z1.o
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package g.a.y1;

import g.a.y1.f;
import g.a.y1.g;
import g.a.y1.j.c;
import g.a.y1.j.d;
import g.a.z1.o;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class h
extends d<f<?>> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a;
    public volatile /* synthetic */ Object _state;

    public static {
        a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_state");
    }

    public h() {
        this._state = null;
    }

    public boolean a(Object object) {
        (f)object;
        if (this._state != null) {
            return false;
        }
        this._state = g.a;
        return true;
    }

    public f.m.d[] b(Object object) {
        (f)object;
        this._state = null;
        return c.a;
    }
}

