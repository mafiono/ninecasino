/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  e.a.a
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d.c.a.b.j.r.a;

public final class a<T>
implements e.a.a<T>,
Object<T> {
    public static final Object c = new Object();
    public volatile e.a.a<T> a;
    public volatile Object b = c;

    public a(e.a.a<T> a2) {
        this.a = a2;
    }

    public static Object a(Object object, Object object2) {
        boolean bl = object != c;
        if (bl) {
            if (object == object2) {
                return object2;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
            stringBuilder.append(object);
            stringBuilder.append(" & ");
            stringBuilder.append(object2);
            stringBuilder.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public T get() {
        Object object = this.b;
        Object object2 = c;
        if (object != object2) {
            return (T)object;
        }
        a a2 = this;
        synchronized (a2) {
            Object object3 = this.b;
            if (object3 == object2) {
                object3 = this.a.get();
                a.a(this.b, object3);
                this.b = object3;
                this.a = null;
            }
            return (T)object3;
        }
    }
}

