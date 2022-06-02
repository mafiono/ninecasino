/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.d.l.b
 *  d.c.d.l.d
 *  d.c.d.l.f
 *  d.c.d.l.h
 *  d.c.d.l.j
 *  d.c.d.l.k
 *  d.c.d.l.l
 *  d.c.d.l.s
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package d.c.d;

import d.c.d.c;
import d.c.d.g;
import d.c.d.i.a;
import d.c.d.j.b;
import d.c.d.l.d;
import d.c.d.l.f;
import d.c.d.l.h;
import d.c.d.l.j;
import d.c.d.l.k;
import d.c.d.l.l;
import d.c.d.l.o;
import d.c.d.l.s;
import java.util.Map;

public final class e
implements g {
    @Override
    public b a(String string, d.c.d.a a2, int n2, int n3, Map<c, ?> map) {
        Object object;
        switch (a2.ordinal()) {
            default: {
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(a2)));
            }
            case 15: {
                object = new s();
                break;
            }
            case 14: {
                object = new o();
                break;
            }
            case 11: {
                object = new d.c.d.n.a();
                break;
            }
            case 10: {
                object = new d.c.d.m.a();
                break;
            }
            case 8: {
                object = new l();
                break;
            }
            case 7: {
                object = new j();
                break;
            }
            case 6: {
                object = new k();
                break;
            }
            case 5: {
                object = new d.c.d.k.a();
                break;
            }
            case 4: {
                object = new d();
                break;
            }
            case 3: {
                object = new h();
                break;
            }
            case 2: {
                object = new f();
                break;
            }
            case 1: {
                object = new d.c.d.l.b();
                break;
            }
            case 0: {
                object = new a();
            }
        }
        return object.a(string, a2, n2, n3, map);
    }
}

