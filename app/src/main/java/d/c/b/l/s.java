/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.ArrayDeque
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Objects
 *  java.util.Queue
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.Executor
 */
package d.c.b.l;

import d.c.b.p.a;
import d.c.b.p.b;
import d.c.b.p.c;
import d.c.b.p.d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class s
implements d,
c {
    public final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap();
    public Queue<a<?>> b = new ArrayDeque();
    public final Executor c;

    public s(Executor executor) {
        this.c = executor;
    }

    @Override
    public <T> void a(Class<T> class_, b<? super T> b3) {
        this.b(class_, this.c, b3);
    }

    @Override
    public <T> void b(Class<T> class_, Executor executor, b<? super T> b3) {
        s s4 = this;
        synchronized (s4) {
            Objects.requireNonNull(class_);
            Objects.requireNonNull(b3);
            Objects.requireNonNull((Object)executor);
            if (!this.a.containsKey(class_)) {
                this.a.put(class_, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap)this.a.get(class_)).put(b3, executor);
            return;
        }
    }
}

