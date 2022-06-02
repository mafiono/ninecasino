/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  c.h.i.a
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 */
package d.c.a.e.m;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.c.a.e.m.a;
import d.c.a.e.m.w;
import java.util.Collection;

public interface d<S>
extends Parcelable {
    S g();

    String h(Context var1);

    int i(Context var1);

    Collection<c.h.i.a<Long, Long>> j();

    boolean l();

    void n(long var1);

    View o(LayoutInflater var1, ViewGroup var2, Bundle var3, a var4, w<S> var5);

    Collection<Long> p();
}

