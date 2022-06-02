/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Math
 */
package d.c.a.e.w;

import d.c.a.e.w.d;
import d.c.a.e.w.m;

public class e
extends d {
    @Override
    public void a(m m2, float f2, float f3, float f5) {
        m2.e(0.0f, f5 * f3, 180.0f, 180.0f - f2);
        double d3 = Math.sin(Math.toRadians(f2));
        double d4 = f5;
        Double.isNaN(d4);
        double d5 = d3 * d4;
        double d6 = f3;
        Double.isNaN(d6);
        float f8 = (float)(d5 * d6);
        double d7 = Math.sin(Math.toRadians(90.0f - f2));
        Double.isNaN(d4);
        double d8 = d7 * d4;
        Double.isNaN(d6);
        m2.d(f8, (float)(d8 * d6));
    }
}

