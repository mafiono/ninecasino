/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Paint
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  c.h.d.a
 *  java.lang.Object
 */
package d.c.a.e.v;

import android.graphics.Paint;
import android.graphics.Path;

public class a {
    public static final int[] i = new int[3];
    public static final float[] j = new float[]{0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = new float[]{0.0f, 0.0f, 0.5f, 1.0f};
    public final Paint a = new Paint();
    public final Paint b;
    public final Paint c;
    public int d;
    public int e;
    public int f;
    public final Path g = new Path();
    public Paint h = new Paint();

    public a() {
        Paint paint;
        this.a(-16777216);
        this.h.setColor(0);
        this.b = paint = new Paint(4);
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint);
    }

    public void a(int n2) {
        this.d = c.h.d.a.c((int)n2, (int)68);
        this.e = c.h.d.a.c((int)n2, (int)20);
        this.f = c.h.d.a.c((int)n2, (int)0);
        this.a.setColor(this.d);
    }
}

