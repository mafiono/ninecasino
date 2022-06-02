/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  java.lang.Float
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Arrays
 */
package d.c.a.e.w;

import android.graphics.RectF;
import d.c.a.e.w.c;
import java.util.Arrays;

public final class b
implements c {
    public final c a;
    public final float b;

    public b(float f2, c c3) {
        while (c3 instanceof b) {
            c3 = ((b)c3).a;
            f2 += ((b)c3).b;
        }
        this.a = c3;
        this.b = f2;
    }

    @Override
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b3 = (b)object;
        return this.a.equals(b3.a) && this.b == b3.b;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.a, Float.valueOf(this.b)};
        return Arrays.hashCode(arrobject);
    }
}

