/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.FloatEvaluator
 *  android.animation.TypeEvaluator
 *  java.lang.Float
 *  java.lang.Number
 *  java.lang.Object
 */
package d.c.a.e.q;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import d.c.a.e.q.d;

public class e
implements TypeEvaluator<Float> {
    public FloatEvaluator a = new FloatEvaluator();

    public e(d d2) {
    }

    public Object evaluate(float f2, Object object, Object object2) {
        Float f3 = (Float)object;
        Float f4 = (Float)object2;
        float f5 = this.a.evaluate(f2, f3, f4).floatValue();
        if (f5 < 0.1f) {
            f5 = 0.0f;
        }
        return Float.valueOf(f5);
    }
}

