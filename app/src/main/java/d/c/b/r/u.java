/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  c.e.a
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.concurrent.Executor
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.b.r;

import android.util.Pair;
import c.e.a;
import d.c.a.d.j.h;
import d.c.b.r.o;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

public class u {
    public final Executor a;
    @GuardedBy(value="this")
    public final Map<Pair<String, String>, h<o>> b = new a();

    public u(Executor executor) {
        this.a = executor;
    }
}

