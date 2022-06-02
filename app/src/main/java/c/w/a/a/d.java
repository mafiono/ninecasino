/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  d.a.b.a.a
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package c.w.a.a;

import android.animation.TypeEvaluator;
import d.a.b.a.a;

public class d
implements TypeEvaluator {
    public static final d a = new d();

    public Object evaluate(float f2, Object object, Object object2) {
        int n2 = (Integer)object;
        float f3 = (float)(255 & n2 >> 24) / 255.0f;
        float f4 = (float)(255 & n2 >> 16) / 255.0f;
        float f5 = (float)(255 & n2 >> 8) / 255.0f;
        float f6 = (float)(n2 & 255) / 255.0f;
        int n3 = (Integer)object2;
        float f7 = (float)(255 & n3 >> 24) / 255.0f;
        float f8 = (float)(255 & n3 >> 16) / 255.0f;
        float f9 = (float)(255 & n3 >> 8) / 255.0f;
        float f10 = (float)(n3 & 255) / 255.0f;
        float f11 = (float)Math.pow(f4, 2.2);
        float f12 = (float)Math.pow(f5, 2.2);
        float f13 = (float)Math.pow(f6, 2.2);
        float f14 = (float)Math.pow(f8, 2.2);
        float f15 = (float)Math.pow(f9, 2.2);
        float f16 = (float)Math.pow(f10, 2.2);
        float f17 = a.a((float)f7, (float)f3, (float)f2, (float)f3);
        float f18 = a.a((float)f14, (float)f11, (float)f2, (float)f11);
        float f19 = a.a((float)f15, (float)f12, (float)f2, (float)f12);
        float f20 = a.a((float)f16, (float)f13, (float)f2, (float)f13);
        float f21 = f17 * 255.0f;
        float f22 = 255.0f * (float)Math.pow(f18, 0.45454545454545453);
        float f23 = 255.0f * (float)Math.pow(f19, 0.45454545454545453);
        float f24 = 255.0f * (float)Math.pow(f20, 0.45454545454545453);
        return Math.round(f21) << 24 | Math.round(f22) << 16 | Math.round(f23) << 8 | Math.round(f24);
    }
}

