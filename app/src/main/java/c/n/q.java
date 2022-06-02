/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.LiveData
 *  androidx.lifecycle.LiveData$b
 *  java.lang.Object
 *  java.lang.String
 */
package c.n;

import androidx.lifecycle.LiveData;

public class q<T>
extends LiveData<T> {
    public void g(T t2) {
        LiveData.a((String)"setValue");
        this.g = 1 + this.g;
        this.e = t2;
        this.c(null);
    }
}

