/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.RectF
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  d.c.a.e.a
 *  d.c.a.e.b
 *  d.c.a.e.w.a
 *  d.c.a.e.w.e
 *  d.c.a.e.w.h
 *  d.c.a.e.w.i
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Objects
 */
package d.c.a.e.w;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import d.c.a.e.w.c;
import d.c.a.e.w.d;
import d.c.a.e.w.e;
import d.c.a.e.w.f;
import d.c.a.e.w.h;
import d.c.a.e.w.i;
import java.util.Objects;

public class j {
    public d a;
    public d b;
    public d c;
    public d d;
    public c e;
    public c f;
    public c g;
    public c h;
    public f i;
    public f j;
    public f k;
    public f l;

    public j() {
        this.a = new i();
        this.b = new i();
        this.c = new i();
        this.d = new i();
        this.e = new a(0.0f);
        this.f = new a(0.0f);
        this.g = new a(0.0f);
        this.h = new a(0.0f);
        this.i = new f();
        this.j = new f();
        this.k = new f();
        this.l = new f();
    }

    public j(b b2, a a2) {
        this.a = b2.a;
        this.b = b2.b;
        this.c = b2.c;
        this.d = b2.d;
        this.e = b2.e;
        this.f = b2.f;
        this.g = b2.g;
        this.h = b2.h;
        this.i = b2.i;
        this.j = b2.j;
        this.k = b2.k;
        this.l = b2.l;
    }

    public static b a(Context context, int n2, int n3, c c2) {
        if (n3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, n2);
            n2 = n3;
            context = contextThemeWrapper;
        }
        TypedArray typedArray = context.obtainStyledAttributes(n2, d.c.a.e.b.s);
        try {
            d d2;
            d d3;
            d d4;
            d d5;
            int n4 = typedArray.getInt(0, 0);
            int n5 = typedArray.getInt(3, n4);
            int n6 = typedArray.getInt(4, n4);
            int n7 = typedArray.getInt(2, n4);
            int n8 = typedArray.getInt(1, n4);
            c c3 = j.c(typedArray, 5, c2);
            c c4 = j.c(typedArray, 8, c3);
            c c5 = j.c(typedArray, 9, c3);
            c c6 = j.c(typedArray, 7, c3);
            c c7 = j.c(typedArray, 6, c3);
            b b2 = new b();
            b2.a = d3 = d.c.a.e.a.o((int)n5);
            b.b(d3);
            b2.e = c4;
            b2.b = d4 = d.c.a.e.a.o((int)n6);
            b.b(d4);
            b2.f = c5;
            b2.c = d2 = d.c.a.e.a.o((int)n7);
            b.b(d2);
            b2.g = c6;
            b2.d = d5 = d.c.a.e.a.o((int)n8);
            b.b(d5);
            b2.h = c7;
            return b2;
        }
        finally {
            typedArray.recycle();
        }
    }

    public static b b(Context context, AttributeSet attributeSet, int n2, int n3) {
        d.c.a.e.w.a a2 = new a((float)false);
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, d.c.a.e.b.o, n2, n3);
        int n4 = typedArray.getResourceId(0, 0);
        int n5 = typedArray.getResourceId(1, 0);
        typedArray.recycle();
        return j.a(context, n4, n5, (c)a2);
    }

    public static c c(TypedArray typedArray, int n2, c c2) {
        TypedValue typedValue = typedArray.peekValue(n2);
        if (typedValue == null) {
            return c2;
        }
        int n3 = typedValue.type;
        if (n3 == 5) {
            return new a((float)TypedValue.complexToDimensionPixelSize(typedValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (n3 == 6) {
            return new h(typedValue.getFraction(1.0f, 1.0f));
        }
        return c2;
    }

    public boolean d(RectF rectF) {
        boolean bl = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float f2 = this.e.a(rectF);
        boolean bl2 = this.f.a(rectF) == f2 && this.h.a(rectF) == f2 && this.g.a(rectF) == f2;
        boolean bl3 = this.b instanceof i && this.a instanceof i && this.c instanceof i && this.d instanceof i;
        return bl && bl2 && bl3;
    }

    public j e(float f2) {
        b b2 = new b(this);
        b2.e = new a(f2);
        b2.f = new a(f2);
        b2.g = new a(f2);
        b2.h = new a(f2);
        return b2.a();
    }

    public static final class b {
        public d a = new i();
        public d b = new i();
        public d c = new i();
        public d d = new i();
        public c e = new a(0.0f);
        public c f = new a(0.0f);
        public c g = new a(0.0f);
        public c h = new a(0.0f);
        public f i = new f();
        public f j = new f();
        public f k = new f();
        public f l = new f();

        public b() {
        }

        public b(j j2) {
            this.a = j2.a;
            this.b = j2.b;
            this.c = j2.c;
            this.d = j2.d;
            this.e = j2.e;
            this.f = j2.f;
            this.g = j2.g;
            this.h = j2.h;
            this.i = j2.i;
            this.j = j2.j;
            this.k = j2.k;
            this.l = j2.l;
        }

        /*
         * Enabled aggressive block sorting
         */
        public static float b(d d2) {
            i i2;
            if (d2 instanceof i) {
                i2 = (i)d2;
            } else {
                if (!(d2 instanceof e)) {
                    return -1.0f;
                }
                i2 = (e)d2;
            }
            Objects.requireNonNull((Object)i2);
            return -1.0f;
        }

        public j a() {
            return new j(this, null);
        }

        public b c(float f2) {
            this.h = new a(f2);
            return this;
        }

        public b d(float f2) {
            this.g = new a(f2);
            return this;
        }

        public b e(float f2) {
            this.e = new a(f2);
            return this;
        }

        public b f(float f2) {
            this.f = new a(f2);
            return this;
        }
    }

}

