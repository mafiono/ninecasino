/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  android.graphics.drawable.Drawable
 *  android.util.Property
 *  d.c.a.e.a
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.e.l;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {
    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable var1);

    void setCircularRevealScrimColor(int var1);

    void setRevealInfo(e var1);

    class b
    implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        public final e a = new e(null);

        public Object evaluate(float f2, Object object, Object object2) {
            e e2 = (e)object;
            e e3 = (e)object2;
            e e4 = this.a;
            float f3 = d.c.a.e.a.Y((float)e2.a, (float)e3.a, (float)f2);
            float f4 = d.c.a.e.a.Y((float)e2.b, (float)e3.b, (float)f2);
            float f5 = d.c.a.e.a.Y((float)e2.c, (float)e3.c, (float)f2);
            e4.a = f3;
            e4.b = f4;
            e4.c = f5;
            return this.a;
        }
    }

    class c
    extends Property<d, e> {
        public static final Property<d, e> a = new c("circularReveal");

        public c(String string) {
            super(e.class, string);
        }

        public Object get(Object object) {
            return ((d)object).getRevealInfo();
        }

        public void set(Object object, Object object2) {
            ((d)object).setRevealInfo((e)object2);
        }
    }

    class d
    extends Property<d, Integer> {
        public static final Property<d, Integer> a = new d("circularRevealScrimColor");

        public d(String string) {
            super(Integer.class, string);
        }

        public Object get(Object object) {
            return ((d)object).getCircularRevealScrimColor();
        }

        public void set(Object object, Object object2) {
            ((d)object).setCircularRevealScrimColor((Integer)object2);
        }
    }

    class e {
        public float a;
        public float b;
        public float c;

        public e() {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.b = f3;
            this.c = f4;
        }

        public e(a a2) {
        }
    }

}

