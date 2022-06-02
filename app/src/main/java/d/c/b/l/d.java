/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.b.l.b
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.SafeVarargs
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashSet
 *  java.util.Objects
 *  java.util.Set
 */
package d.c.b.l;

import d.c.b.l.f;
import d.c.b.l.o;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class d<T> {
    public final Set<Class<? super T>> a;
    public final Set<o> b;
    public final int c;
    public final int d;
    public final f<T> e;
    public final Set<Class<?>> f;

    public d(Set set, Set set2, int n2, int n3, f f2, Set set3, a a2) {
        this.a = Collections.unmodifiableSet(set);
        this.b = Collections.unmodifiableSet(set2);
        this.c = n2;
        this.d = n3;
        this.e = f2;
        this.f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> class_) {
        return new b(class_, new Class[0], null);
    }

    @SafeVarargs
    public static /* varargs */ <T> d<T> c(T t2, Class<T> class_, Class<? super T> ... arrclass) {
        b b2 = new b(class_, arrclass, null);
        b2.c(new d.c.b.l.b(t2));
        return b2.b();
    }

    public boolean b() {
        return this.d == 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Component<");
        stringBuilder.append(Arrays.toString(this.a.toArray()));
        stringBuilder.append(">{");
        stringBuilder.append(this.c);
        stringBuilder.append(", type=");
        stringBuilder.append(this.d);
        stringBuilder.append(", deps=");
        stringBuilder.append(Arrays.toString(this.b.toArray()));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static class b<T> {
        public final Set<Class<? super T>> a;
        public final Set<o> b;
        public int c;
        public int d;
        public f<T> e;
        public Set<Class<?>> f;

        public b(Class class_, Class[] arrclass, a a2) {
            HashSet hashSet;
            this.a = hashSet = new HashSet();
            this.b = new HashSet();
            this.c = 0;
            this.d = 0;
            this.f = new HashSet();
            Objects.requireNonNull((Object)class_, "Null interface");
            hashSet.add(class_);
            int n2 = arrclass.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                Objects.requireNonNull((Object)arrclass[i2], "Null interface");
            }
            Collections.addAll(this.a, (Object[])arrclass);
        }

        public b<T> a(o o2) {
            Class<?> class_ = o2.a;
            if (true ^ this.a.contains(class_)) {
                this.b.add(o2);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public d<T> b() {
            boolean bl = this.e != null;
            if (bl) {
                d d3 = new d(new HashSet(this.a), new HashSet(this.b), this.c, this.d, this.e, this.f, null);
                return d3;
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public b<T> c(f<T> f2) {
            this.e = f2;
            return this;
        }

        public final b<T> d(int n2) {
            boolean bl = this.c == 0;
            if (bl) {
                this.c = n2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

}

