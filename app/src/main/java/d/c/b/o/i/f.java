/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonWriter
 *  java.io.Writer
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package d.c.b.o.i;

import android.util.Base64;
import android.util.JsonWriter;
import d.c.b.o.c;
import d.c.b.o.d;
import d.c.b.o.e;
import d.c.b.o.g;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class f
implements e,
g {
    public boolean a = true;
    public final JsonWriter b;
    public final Map<Class<?>, d<?>> c;
    public final Map<Class<?>, d.c.b.o.f<?>> d;
    public final d<Object> e;
    public final boolean f;

    public f(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, d.c.b.o.f<?>> map2, d<Object> d3, boolean bl) {
        this.b = new JsonWriter(writer);
        this.c = map;
        this.d = map2;
        this.e = d3;
        this.f = bl;
    }

    @Override
    public g a(String string) {
        this.i();
        this.b.value(string);
        return this;
    }

    @Override
    public g b(boolean bl) {
        this.i();
        this.b.value(bl);
        return this;
    }

    @Override
    public e c(String string, boolean bl) {
        this.i();
        this.b.name(string);
        this.i();
        this.b.value(bl);
        return this;
    }

    @Override
    public e e(String string, long l4) {
        this.i();
        this.b.name(string);
        this.i();
        this.b.value(l4);
        return this;
    }

    @Override
    public e f(String string, int n2) {
        this.i();
        this.b.name(string);
        this.i();
        this.b.value(n2);
        return this;
    }

    public f g(Object object, boolean bl) {
        int n2 = 0;
        if (bl) {
            boolean bl2 = object == null || object.getClass().isArray() || object instanceof Collection || object instanceof Date || object instanceof Enum || object instanceof Number;
            if (bl2) {
                Object[] arrobject = new Object[1];
                Class class_ = object == null ? null : object.getClass();
                arrobject[0] = class_;
                throw new c(String.format("%s cannot be encoded inline", arrobject));
            }
        }
        if (object == null) {
            this.b.nullValue();
            return this;
        }
        if (object instanceof Number) {
            this.b.value((Number)object);
            return this;
        }
        if (object.getClass().isArray()) {
            if (object instanceof byte[]) {
                byte[] arrby = (byte[])object;
                this.i();
                this.b.value(Base64.encodeToString(arrby, 2));
                return this;
            }
            this.b.beginArray();
            if (object instanceof int[]) {
                int[] arrn = (int[])object;
                int n3 = arrn.length;
                while (n2 < n3) {
                    int n4 = arrn[n2];
                    this.b.value(n4);
                    ++n2;
                }
            } else if (object instanceof long[]) {
                long[] arrl = (long[])object;
                int n5 = arrl.length;
                while (n2 < n5) {
                    long l4 = arrl[n2];
                    this.i();
                    this.b.value(l4);
                    ++n2;
                }
            } else if (object instanceof double[]) {
                double[] arrd = (double[])object;
                int n6 = arrd.length;
                while (n2 < n6) {
                    double d3 = arrd[n2];
                    this.b.value(d3);
                    ++n2;
                }
            } else if (object instanceof boolean[]) {
                boolean[] arrbl = (boolean[])object;
                int n7 = arrbl.length;
                while (n2 < n7) {
                    boolean bl3 = arrbl[n2];
                    this.b.value(bl3);
                    ++n2;
                }
            } else if (object instanceof Number[]) {
                Number[] arrnumber = (Number[])object;
                int n8 = arrnumber.length;
                for (int i2 = 0; i2 < n8; ++i2) {
                    this.g(arrnumber[i2], false);
                }
            } else {
                Object[] arrobject = (Object[])object;
                int n10 = arrobject.length;
                for (int i3 = 0; i3 < n10; ++i3) {
                    this.g(arrobject[i3], false);
                }
            }
            this.b.endArray();
            return this;
        }
        if (object instanceof Collection) {
            Collection collection = (Collection)object;
            this.b.beginArray();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                this.g(iterator.next(), false);
            }
            this.b.endArray();
            return this;
        }
        if (object instanceof Map) {
            Map map = (Map)object;
            this.b.beginObject();
            for (Map.Entry entry : map.entrySet()) {
                Object object2 = entry.getKey();
                try {
                    this.h((String)object2, entry.getValue());
                }
                catch (ClassCastException classCastException) {
                    Object[] arrobject = new Object[]{object2, object2.getClass()};
                    throw new c(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", arrobject), (Exception) classCastException);
                }
            }
            this.b.endObject();
            return this;
        }
        d d4 = this.c.get(object.getClass());
        if (d4 != null) {
            if (!bl) {
                this.b.beginObject();
            }
            d4.a(object, this);
            if (!bl) {
                this.b.endObject();
            }
            return this;
        }
        d.c.b.o.f f2 = this.d.get(object.getClass());
        if (f2 != null) {
            f2.a(object, this);
            return this;
        }
        if (object instanceof Enum) {
            String string = ((Enum)object).name();
            this.i();
            this.b.value(string);
            return this;
        }
        d<Object> d5 = this.e;
        if (!bl) {
            this.b.beginObject();
        }
        d5.a(object, this);
        if (!bl) {
            this.b.endObject();
        }
        return this;
    }

    public f h(String string, Object object) {
        if (this.f) {
            if (object == null) {
                return this;
            }
            this.i();
            this.b.name(string);
            return this.g(object, false);
        }
        this.i();
        this.b.name(string);
        if (object == null) {
            this.b.nullValue();
            return this;
        }
        return this.g(object, false);
    }

    public final void i() {
        if (this.a) {
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}

