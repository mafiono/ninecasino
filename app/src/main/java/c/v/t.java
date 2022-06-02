/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Property
 *  android.view.View
 *  c.v.u
 *  c.v.v
 *  c.v.w
 *  c.v.x
 *  c.v.y
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package c.v;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import c.v.u;
import c.v.v;
import c.v.w;
import c.v.x;
import c.v.y;
import c.v.z;

public class t {
    public static final z a;
    public static final Property<View, Float> b;

    public static {
        int n2 = Build.VERSION.SDK_INT;
        Object object = n2 >= 29 ? new y() : (n2 >= 23 ? new x() : (n2 >= 22 ? new w() : (n2 >= 21 ? new v() : new u())));
        a = object;
        b = new Property<View, Float>(Float.class, "translationAlpha"){

            public Object get(Object object) {
                return Float.valueOf(t.a((View)object));
            }

            public void set(Object object, Object object2) {
                View view = (View)object;
                float f2 = ((Float)object2).floatValue();
                t.a.e(view, f2);
            }
        };
        new Property<View, Rect>(Rect.class, "clipBounds"){

            public Object get(Object object) {
                View view = (View)object;
                return view.getClipBounds();
            }

            public void set(Object object, Object object2) {
                View view = (View)object;
                Rect rect = (Rect)object2;
                view.setClipBounds(rect);
            }
        };
    }

    public static float a(View view) {
        return a.b(view);
    }

    public static void b(View view, int n2, int n3, int n4, int n5) {
        a.d(view, n2, n3, n4, n5);
    }

}

