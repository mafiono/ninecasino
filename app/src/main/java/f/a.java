/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package f;

import f.d;
import java.io.Serializable;

public final class a<T>
implements d<T>,
Serializable {
    public final T e;

    public a(T t6) {
        this.e = t6;
    }

    public T getValue() {
        return this.e;
    }

    public String toString() {
        return String.valueOf(this.e);
    }
}

