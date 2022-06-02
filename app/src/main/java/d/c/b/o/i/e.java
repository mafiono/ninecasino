/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.b.o.i.a
 *  d.c.b.o.i.b
 *  d.c.b.o.i.c
 *  d.c.b.o.i.e$a
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 *  java.util.HashMap
 *  java.util.Map
 */
package d.c.b.o.i;

import d.c.b.o.d;
import d.c.b.o.f;
import d.c.b.o.i.b;
import d.c.b.o.i.c;
import d.c.b.o.i.e;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 * Exception performing whole class analysis.
 */
public final class e
implements d.c.b.o.h.b<e> {
    public static final a e;
    public final Map<Class<?>, d<?>> a;
    public final Map<Class<?>, f<?>> b;
    public d<Object> c;
    public boolean d;

    public static {
        e = new /* Unavailable Anonymous Inner Class!! */;
    }

    public e() {
        HashMap hashMap;
        HashMap hashMap2;
        this.a = hashMap2 = new HashMap();
        this.b = hashMap = new HashMap();
        this.c = d.c.b.o.i.a.a;
        this.d = false;
        hashMap.put(String.class, (Object)b.a);
        hashMap2.remove(String.class);
        hashMap.put(Boolean.class, (Object)c.a);
        hashMap2.remove(Boolean.class);
        hashMap.put(Date.class, (Object)e);
        hashMap2.remove(Date.class);
    }
}

