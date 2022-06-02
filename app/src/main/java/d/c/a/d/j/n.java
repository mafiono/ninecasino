/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.lang.Object
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package d.c.a.d.j;

import d.c.a.d.j.a;
import d.c.a.d.j.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class n
implements a<Void, h<List<h<?>>>> {
    public final /* synthetic */ Collection a;

    public n(Collection collection) {
        this.a = collection;
    }

    public final /* synthetic */ Object a(h h2) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a);
        return d.c.a.d.b.a.l(arrayList);
    }
}

