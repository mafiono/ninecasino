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
        super(FunctionalInterface);
        PathMeasure pathMeasure;
        super(Float.class, property.getName());
        this.a = property;
        this.b = pathMeasure = new PathMeasure(path, false);
        this.c = pathMeasure.getLength();
    }

    /**
     * A constructor that takes an identifying name and {@link #getType() type} for the property.
     *
     * @param type
     * @param name
     */
    public f(Class<Float> type, String name) {
        super(type, name);
        a = null;
        b = null;
        c = 0;
    }

    public Float get(Object object) {
        return this.f;
    }

}

