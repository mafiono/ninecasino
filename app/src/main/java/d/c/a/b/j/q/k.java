/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.c.a.b.j.q.d
 *  d.c.a.b.j.q.e
 *  d.c.a.b.j.q.h
 *  d.c.a.b.j.q.i
 *  d.c.a.b.j.q.k$a
 *  d.c.a.b.j.q.m
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package d.c.a.b.j.q;

import android.content.Context;
import d.c.a.b.j.q.c;
import d.c.a.b.j.q.d;
import d.c.a.b.j.q.e;
import d.c.a.b.j.q.h;
import d.c.a.b.j.q.i;
import d.c.a.b.j.q.k;
import d.c.a.b.j.q.m;
import java.util.HashMap;
import java.util.Map;

/*
 * Exception performing whole class analysis.
 */
public class k
implements e {
    public final a a;
    public final i b;
    public final Map<String, m> c;

    public k(Context context, i i2) {
        a a2 = new /* Unavailable Anonymous Inner Class!! */;
        this.c = new HashMap();
        this.a = a2;
        this.b = i2;
    }

    public m a(String string) {
        k k2 = this;
        synchronized (k2) {
            d d2;
            block6 : {
                block5 : {
                    if (!this.c.containsKey(string)) break block5;
                    m m2 = this.c.get(string);
                    return m2;
                }
                d2 = this.a.a(string);
                if (d2 != null) break block6;
                return null;
            }
            i i2 = this.b;
            m m3 = d2.create((h)new c(i2.a, i2.b, i2.c, string));
            this.c.put((Object)string, (Object)m3);
            return m3;
        }
    }
}

