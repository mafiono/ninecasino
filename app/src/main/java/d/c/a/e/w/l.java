/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.List
 */
package d.c.a.e.w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import d.c.a.e.v.a;
import d.c.a.e.w.m;
import java.util.Iterator;
import java.util.List;

public class l
extends m.f {
    public final /* synthetic */ List b;
    public final /* synthetic */ Matrix c;

    public l(m m2, List list, Matrix matrix) {
        this.b = list;
        this.c = matrix;
    }

    @Override
    public void a(Matrix matrix, a a2, int n2, Canvas canvas) {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((m.f)iterator.next()).a(this.c, a2, n2, canvas);
        }
    }
}

