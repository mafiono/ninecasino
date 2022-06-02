/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.graphics.PointF
 *  android.util.Property
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package c.v;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

public class f<T>
extends Property<T, Float> {
    public final Property<T, PointF> a;
    public final PathMeasure b;
    public final float c;
    public final float[] d = new float[2];
    public final PointF e = new PointF();
    public float f;

    public f(Property<T, PointF> property, Path path) {
        PathMeasure pathMeasure;
        super(Float.class, property.getName());
        this.a = property;
        this.b = pathMeasure = new PathMeasure(path, false);
        this.c = pathMeasure.getLength();
    }

    public Object get(Object object) {
        return Float.valueOf(this.f);
    }

    public void set(Object object, Object object2) {
        Float f2 = (Float)object2;
        this.f = f2.floatValue();
        this.b.getPosTan(this.c * f2.floatValue(), this.d, null);
        PointF pointF = this.e;
        float[] arrf = this.d;
        pointF.x = arrf[0];
        pointF.y = arrf[1];
        this.a.set(object, (Object)pointF);
    }
}

