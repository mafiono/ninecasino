/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  java.io.IOException
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Properties
 *  java.util.Set
 */
package d.c.c.a0.z;

import d.c.c.a0.t;
import d.c.c.a0.z.e;
import d.c.c.a0.z.f;
import d.c.c.a0.z.n;
import d.c.c.a0.z.o;
import d.c.c.c0.a;
import d.c.c.c0.b;
import d.c.c.c0.c;
import d.c.c.i;
import d.c.c.k;
import d.c.c.p;
import d.c.c.q;
import d.c.c.s;
import d.c.c.v;
import d.c.c.x;
import d.c.c.y;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;

public final class g
implements y {
    public final d.c.c.a0.g e;
    public final boolean f;

    public g(d.c.c.a0.g g2, boolean bl) {
        this.e = g2;
        this.f = bl;
    }

    @Override
    public <T> x<T> b(i i2, d.c.c.b0.a<T> a2) {
        Type type;
        Type type2 = a2.b;
        if (!Map.class.isAssignableFrom(a2.a)) {
            return null;
        }
        Class<?> class_ = d.c.c.a0.a.e(type2);
        Type[] arrtype = type2 == Properties.class ? new Type[]{String.class, String.class} : ((type = d.c.c.a0.a.f(type2, class_, Map.class)) instanceof ParameterizedType ? ((ParameterizedType)type).getActualTypeArguments() : new Type[]{Object.class, Object.class});
        Type type3 = arrtype[0];
        x<Object> x3 = type3 != Boolean.TYPE && type3 != Boolean.class ? i2.c(new d.c.c.b0.a(type3)) : o.f;
        x<Boolean> x4 = x3;
        x x5 = i2.c(new d.c.c.b0.a(arrtype[1]));
        t<T> t6 = this.e.a(a2);
        a a3 = new a(i2, arrtype[0], x4, arrtype[1], x5, t6);
        return a3;
    }

    public final class a<K, V>
    extends x<Map<K, V>> {
        public final x<K> a;
        public final x<V> b;
        public final t<? extends Map<K, V>> c;

        public a(i i2, Type type, x<K> x3, Type type2, x<V> x4, t<? extends Map<K, V>> t6) {
            this.a = new n<K>(i2, x3, type);
            this.b = new n<V>(i2, x4, type2);
            this.c = t6;
        }

        @Override
        public Object a(d.c.c.c0.a a2) {
            Map<K, V> map;
            block9 : {
                block8 : {
                    b b3 = a2.n0();
                    if (b3 == b.m) {
                        a2.j0();
                        return null;
                    }
                    map = this.c.a();
                    if (b3 != b.e) break block8;
                    a2.a();
                    while (a2.F()) {
                        a2.a();
                        K k4 = this.a.a(a2);
                        if (map.put(k4, this.b.a(a2)) == null) {
                            a2.s();
                            continue;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(k4);
                        throw new v(stringBuilder.toString());
                    }
                    a2.s();
                    break block9;
                }
                a2.e();
                while (a2.F()) {
                    block15 : {
                        block11 : {
                            int n2;
                            block13 : {
                                int n3;
                                block14 : {
                                    block12 : {
                                        block10 : {
                                            Objects.requireNonNull((Object)(d.c.c.a0.q.a));
                                            if (!(a2 instanceof e)) break block10;
                                            e e2 = (e)a2;
                                            e2.u0(b.i);
                                            Map.Entry entry = (Map.Entry)((Iterator)e2.v0()).next();
                                            e2.x0(entry.getValue());
                                            e2.x0(new s((String)entry.getKey()));
                                            break block11;
                                        }
                                        n3 = a2.l;
                                        if (n3 == 0) {
                                            n3 = a2.m();
                                        }
                                        if (n3 != 13) break block12;
                                        n2 = 9;
                                        break block13;
                                    }
                                    if (n3 != 12) break block14;
                                    n2 = 8;
                                    break block13;
                                }
                                if (n3 != 14) break block15;
                                n2 = 10;
                            }
                            a2.l = n2;
                        }
                        K k5 = this.a.a(a2);
                        if (map.put(k5, this.b.a(a2)) == null) continue;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("duplicate key: ");
                        stringBuilder.append(k5);
                        throw new v(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Expected a name but was ");
                    stringBuilder.append(a2.n0());
                    stringBuilder.append(a2.J());
                    throw new IllegalStateException(stringBuilder.toString());
                }
                a2.u();
            }
            return map;
        }

        @Override
        public void b(c c3, Object object) {
            block14 : {
                Map map;
                block13 : {
                    map = (Map)object;
                    if (map == null) {
                        c3.F();
                        return;
                    }
                    if (g.this.f) break block13;
                    c3.i();
                    for (Map.Entry entry : map.entrySet()) {
                        c3.A(String.valueOf(entry.getKey()));
                        this.b.b(c3, entry.getValue());
                    }
                    break block14;
                }
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator iterator = map.entrySet().iterator();
                int n2 = 0;
                boolean bl = false;
                while (iterator.hasNext()) {
                    f f2;
                    block12 : {
                        d.c.c.n n3;
                        Map.Entry entry = (Map.Entry)iterator.next();
                        x<K> x3 = this.a;
                        Object object2 = entry.getKey();
                        Objects.requireNonNull(x3);
                        try {
                            f2 = new f();
                            x3.b(f2, object2);
                            if (!f2.o.isEmpty()) break block12;
                            n3 = f2.q;
                        }
                        catch (IOException iOException) {
                            throw new d.c.c.o(iOException);
                        }
                        arrayList.add(n3);
                        arrayList2.add(entry.getValue());
                        Objects.requireNonNull((Object)n3);
                        boolean bl2 = n3 instanceof k || n3 instanceof q;
                        bl |= bl2;
                        continue;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected one JSON element but was ");
                    stringBuilder.append(f2.o);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (bl) {
                    c3.e();
                    int n4 = arrayList.size();
                    while (n2 < n4) {
                        c3.e();
                        d.c.c.n n5 = (d.c.c.n)arrayList.get(n2);
                        o.X.b(c3, n5);
                        this.b.b(c3, arrayList2.get(n2));
                        c3.s();
                        ++n2;
                    }
                    c3.s();
                    return;
                }
                c3.i();
                int n6 = arrayList.size();
                while (n2 < n6) {
                    block20 : {
                        String string;
                        block17 : {
                            d.c.c.n n7;
                            block15 : {
                                block19 : {
                                    s s4;
                                    Object object3;
                                    block18 : {
                                        block16 : {
                                            n7 = (d.c.c.n)arrayList.get(n2);
                                            Objects.requireNonNull((Object)n7);
                                            if (!(n7 instanceof s)) break block15;
                                            s4 = n7.g();
                                            object3 = s4.a;
                                            if (!(object3 instanceof Number)) break block16;
                                            string = String.valueOf(s4.i());
                                            break block17;
                                        }
                                        if (!(object3 instanceof Boolean)) break block18;
                                        string = Boolean.toString(s4.h());
                                        break block17;
                                    }
                                    if (!(object3 instanceof String)) break block19;
                                    string = s4.j();
                                    break block17;
                                }
                                throw new AssertionError();
                            }
                            if (!(n7 instanceof p)) break block20;
                            string = "null";
                        }
                        c3.A(string);
                        this.b.b(c3, arrayList2.get(n2));
                        ++n2;
                        continue;
                    }
                    throw new AssertionError();
                }
            }
            c3.u();
        }
    }

}

