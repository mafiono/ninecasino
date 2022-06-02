/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.util.AttributeSet
 *  android.view.InflateException
 *  android.view.animation.Interpolator
 *  c.h.b.g
 *  c.h.c.b.h
 *  d.a.b.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.xmlpull.v1.XmlPullParser
 */
package c.w.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import c.h.b.g;
import c.h.c.b.h;
import c.w.a.a.a;
import org.xmlpull.v1.XmlPullParser;

public class e
implements Interpolator {
    public float[] a;
    public float[] b;

    public e(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        block8 : {
            block9 : {
                block10 : {
                    TypedArray typedArray;
                    block7 : {
                        block5 : {
                            String string;
                            block6 : {
                                Resources resources = context.getResources();
                                Resources.Theme theme = context.getTheme();
                                typedArray = h.e((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])a.l);
                                if (!h.c((XmlPullParser)xmlPullParser, (String)"pathData")) break block5;
                                string = h.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"pathData", (int)4);
                                Path path = g.q((String)string);
                                if (path == null) break block6;
                                this.a(path);
                                break block7;
                            }
                            throw new InflateException(d.a.b.a.a.m((String)"The path is null, which is created from ", (String)string));
                        }
                        if (!h.c((XmlPullParser)xmlPullParser, (String)"controlX1")) break block8;
                        if (!h.c((XmlPullParser)xmlPullParser, (String)"controlY1")) break block9;
                        float f2 = !h.c((XmlPullParser)xmlPullParser, (String)"controlX1") ? 0.0f : typedArray.getFloat(0, 0.0f);
                        float f3 = !h.c((XmlPullParser)xmlPullParser, (String)"controlY1") ? 0.0f : typedArray.getFloat(1, 0.0f);
                        boolean bl = h.c((XmlPullParser)xmlPullParser, (String)"controlX2");
                        if (bl != h.c((XmlPullParser)xmlPullParser, (String)"controlY2")) break block10;
                        if (!bl) {
                            Path path = new Path();
                            path.moveTo(0.0f, 0.0f);
                            path.quadTo(f2, f3, 1.0f, 1.0f);
                            this.a(path);
                        } else {
                            float f4 = !h.c((XmlPullParser)xmlPullParser, (String)"controlX2") ? 0.0f : typedArray.getFloat(2, 0.0f);
                            float f5 = !h.c((XmlPullParser)xmlPullParser, (String)"controlY2") ? 0.0f : typedArray.getFloat(3, 0.0f);
                            Path path = new Path();
                            path.moveTo(0.0f, 0.0f);
                            path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
                            this.a(path);
                        }
                    }
                    typedArray.recycle();
                    return;
                }
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
    }

    public final void a(Path path) {
        IllegalArgumentException illegalArgumentException;
        int n2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float f2 = pathMeasure.getLength();
        int n3 = Math.min(3000, 1 + (int)(f2 / 0.002f));
        if (n3 > 0) {
            int n4;
            float[] arrf;
            this.a = new float[n3];
            this.b = new float[n3];
            float[] arrf2 = new float[2];
            for (int i2 = 0; i2 < n3; ++i2) {
                pathMeasure.getPosTan(f2 * (float)i2 / (float)(n3 - 1), arrf2, null);
                this.a[i2] = arrf2[0];
                this.b[i2] = arrf2[1];
            }
            if (!((double)Math.abs(this.a[0]) > 1.0E-5 || (double)Math.abs(this.b[0]) > 1.0E-5 || (double)Math.abs((arrf = this.a)[n4 = n3 - 1] - 1.0f) > 1.0E-5 || (double)Math.abs(this.b[n4] - 1.0f) > 1.0E-5)) {
                float f3 = 0.0f;
                int n5 = 0;
                while (n2 < n3) {
                    float[] arrf3 = this.a;
                    int n6 = n5 + 1;
                    float f4 = arrf3[n5];
                    if (!(f4 < f3)) {
                        arrf3[n2] = f4;
                        ++n2;
                        f3 = f4;
                        n5 = n6;
                        continue;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The Path cannot loop back on itself, x :");
                    stringBuilder.append(f4);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                if (!pathMeasure.nextContour()) {
                    return;
                }
                throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
            }
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"The Path must start at (0,0) and end at (1,1) start: ");
            stringBuilder.append(this.a[0]);
            stringBuilder.append(",");
            stringBuilder.append(this.b[0]);
            stringBuilder.append(" end:");
            float[] arrf4 = this.a;
            int n7 = n3 - 1;
            stringBuilder.append(arrf4[n7]);
            stringBuilder.append(",");
            stringBuilder.append(this.b[n7]);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The Path has a invalid length ");
        stringBuilder.append(f2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int n2 = 0;
        int n3 = this.a.length - 1;
        while (n3 - n2 > 1) {
            int n4 = (n2 + n3) / 2;
            if (f2 < this.a[n4]) {
                n3 = n4;
                continue;
            }
            n2 = n4;
        }
        float[] arrf = this.a;
        float f3 = arrf[n3] - arrf[n2];
        if (f3 == 0.0f) {
            return this.b[n2];
        }
        float f4 = (f2 - arrf[n2]) / f3;
        float[] arrf2 = this.b;
        float f5 = arrf2[n2];
        return d.a.b.a.a.a((float)arrf2[n3], (float)f5, (float)f4, (float)f5);
    }
}

