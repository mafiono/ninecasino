/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  c.k.b.a0
 *  c.k.b.m
 *  c.n.a0
 *  c.n.w
 *  c.n.x
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Set
 */
package c.k.b;

import android.util.Log;
import c.k.b.a0;
import c.k.b.m;
import c.n.w;
import c.n.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class d0
extends w {
    public static final x h = new x(){

        public <T extends w> T a(Class<T> class_) {
            return (T)((Object)new d0(true));
        }
    };
    public final HashMap<String, m> b = new HashMap();
    public final HashMap<String, d0> c = new HashMap();
    public final HashMap<String, c.n.a0> d = new HashMap();
    public final boolean e;
    public boolean f = false;
    public boolean g = false;

    public d0(boolean bl) {
        this.e = bl;
    }

    public void a() {
        if (a0.N((int)3)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onCleared called for ");
            stringBuilder.append(this);
            Log.d("FragmentManager", stringBuilder.toString());
        }
        this.f = true;
    }

    public void b(m m2) {
        if (this.g) {
            if (a0.N((int)2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.b.containsKey((Object)m2.i)) {
            return;
        }
        this.b.put((Object)m2.i, (Object)m2);
        if (a0.N((int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Updating retained Fragments: Added ");
            stringBuilder.append((Object)m2);
            Log.v("FragmentManager", stringBuilder.toString());
        }
    }

    public void c(m m2) {
        if (this.g) {
            if (a0.N((int)2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        boolean bl = this.b.remove((Object)m2.i) != null;
        if (bl && a0.N((int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Updating retained Fragments: Removed ");
            stringBuilder.append((Object)m2);
            Log.v("FragmentManager", stringBuilder.toString());
        }
    }

    public boolean d(m m2) {
        if (!this.b.containsKey((Object)m2.i)) {
            return true;
        }
        if (this.e) {
            return this.f;
        }
        return true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (d0.class != object.getClass()) {
                return false;
            }
            d0 d02 = (d0) object;
            return this.b.equals(d02.b) && this.c.equals(d02.c) && this.d.equals(d02.d);
        }
        return false;
    }

    public int hashCode() {
        return 31 * (31 * this.b.hashCode() + this.c.hashCode()) + this.d.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("FragmentManagerViewModel{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append("} Fragments (");
        Iterator iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(iterator.next());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") Child Non Config (");
        Iterator iterator2 = this.c.keySet().iterator();
        while (iterator2.hasNext()) {
            stringBuilder.append((String)iterator2.next());
            if (!iterator2.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(") ViewModelStores (");
        Iterator iterator3 = this.d.keySet().iterator();
        while (iterator3.hasNext()) {
            stringBuilder.append((String)iterator3.next());
            if (!iterator3.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

}

