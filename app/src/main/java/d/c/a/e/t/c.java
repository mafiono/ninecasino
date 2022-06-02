/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.text.TextPaint
 */
package d.c.a.e.t;

import android.graphics.Typeface;
import android.text.TextPaint;
import d.c.a.e.t.b;
import d.c.a.e.t.d;

public class c
extends d {
    public final /* synthetic */ TextPaint a;
    public final /* synthetic */ d b;
    public final /* synthetic */ b c;

    public c(b b3, TextPaint textPaint, d d3) {
        this.c = b3;
        this.a = textPaint;
        this.b = d3;
    }

    @Override
    public void a(int n2) {
        this.b.a(n2);
    }

    @Override
    public void b(Typeface typeface, boolean bl) {
        this.c.d(this.a, typeface);
        this.b.b(typeface, bl);
    }
}

