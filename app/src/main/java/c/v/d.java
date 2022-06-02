/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.graphics.Rect
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  c.k.b.r0
 *  c.v.d$c
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 */
package c.v;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c.k.b.r0;
import c.v.d;
import c.v.h;
import c.v.i;
import c.v.m;
import c.v.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@SuppressLint(value={"RestrictedApi"})
public class d
extends r0 {
    public static boolean z(i i2) {
        return !r0.k(i2.i) || !r0.k(null) || !r0.k(null);
        {
        }
    }

    public void a(Object object, View view) {
        if (object != null) {
            ((i)object).c(view);
        }
    }

    public void b(Object object, ArrayList<View> arrayList) {
        block4 : {
            i i2;
            int n2;
            block3 : {
                i2 = (i)object;
                if (i2 == null) {
                    return;
                }
                boolean bl = i2 instanceof o;
                if (!bl) break block3;
                o o2 = (o)i2;
                int n3 = o2.B.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    this.b(o2.J(n2), arrayList);
                }
                break block4;
            }
            if (d.z(i2) || !r0.k(i2.j)) break block4;
            int n4 = arrayList.size();
            while (n2 < n4) {
                i2.c(arrayList.get(n2));
                ++n2;
            }
        }
    }

    public void c(ViewGroup viewGroup, Object object) {
        i i2 = (i)object;
        if (!m.c.contains(viewGroup) && viewGroup.isLaidOut()) {
            m.c.add(viewGroup);
            if (i2 == null) {
                i2 = m.a;
            }
            i i3 = i2.k();
            ArrayList arrayList = m.a().getOrDefault(viewGroup, null);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    ((i)iterator.next()).v(viewGroup);
                }
            }
            if (i3 != null) {
                i3.i(viewGroup, true);
            }
            if (viewGroup.getTag(2131231122) == null) {
                viewGroup.setTag(2131231122, null);
                if (i3 != null) {
                    m.a a2 = new m.a(i3, viewGroup);
                    viewGroup.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)a2);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)a2);
                    return;
                }
            } else {
                throw null;
            }
        }
    }

    public boolean e(Object object) {
        return object instanceof i;
    }

    public Object g(Object object) {
        if (object != null) {
            return ((i)object).k();
        }
        return null;
    }

    public Object l(Object object, Object object2, Object object3) {
        i i2 = (i)object;
        i i3 = (i)object2;
        i i4 = (i)object3;
        if (i2 != null && i3 != null) {
            o o2 = new o();
            o2.I(i2);
            o2.I(i3);
            o2.K(1);
            i2 = o2;
        } else if (i2 == null) {
            i2 = i3;
        }
        if (i4 != null) {
            o o3 = new o();
            if (i2 != null) {
                o3.I(i2);
            }
            o3.I(i4);
            return o3;
        }
        return i2;
    }

    public Object m(Object object, Object object2, Object object3) {
        o o2 = new o();
        if (object != null) {
            o2.I((i)object);
        }
        if (object2 != null) {
            o2.I((i)object2);
        }
        if (object3 != null) {
            o2.I((i)object3);
        }
        return o2;
    }

    public void o(Object object, View view) {
        if (object != null) {
            ((i)object).x(view);
        }
    }

    public void p(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        block6 : {
            int n2;
            int n3;
            i i2;
            ArrayList<View> arrayList3;
            block5 : {
                i2 = (i)object;
                boolean bl = i2 instanceof o;
                if (!bl) break block5;
                o o2 = (o)i2;
                int n4 = o2.B.size();
                for (n3 = 0; n3 < n4; ++n3) {
                    this.p(o2.J(n3), arrayList, arrayList2);
                }
                break block6;
            }
            if (d.z(i2) || (arrayList3 = i2.j).size() != arrayList.size() || !arrayList3.containsAll(arrayList)) break block6;
            if (arrayList2 == null) {
                n2 = 0;
                n3 = 0;
            } else {
                n2 = arrayList2.size();
            }
            while (n3 < n2) {
                i2.c(arrayList2.get(n3));
                ++n3;
            }
            int n5 = arrayList.size();
            while (--n5 >= 0) {
                i2.x(arrayList.get(n5));
            }
        }
    }

    public void q(Object object, final View view, final ArrayList<View> arrayList) {
        ((i)object).b(new i.d(this){

            @Override
            public void a(i i2) {
            }

            @Override
            public void b(i i2) {
            }

            @Override
            public void c(i i2) {
            }

            @Override
            public void d(i i2) {
            }

            @Override
            public void e(i i2) {
                i2.w(this);
                view.setVisibility(8);
                int n2 = arrayList.size();
                for (int i3 = 0; i3 < n2; ++i3) {
                    arrayList.get(i3).setVisibility(0);
                }
            }
        });
    }

    public void r(Object object, Object object2, ArrayList<View> arrayList, Object object3, ArrayList<View> arrayList2, Object object4, ArrayList<View> arrayList3) {
        i i2 = (i)object;
        c c2 = new c(this, object2, arrayList, object3, arrayList2, object4, arrayList3);
        i2.b((i.d)c2);
    }

    public void s(Object object, Rect rect) {
        if (object != null) {
            ((i)object).B(new i.c(this, rect){});
        }
    }

    public void t(Object object, View view) {
        if (view != null) {
            i i2 = (i)object;
            Rect rect = new Rect();
            this.j(view, rect);
            i2.B(new i.c(this, rect){});
        }
    }

    public void w(Object object, View view, ArrayList<View> arrayList) {
        o o2 = (o)object;
        ArrayList<View> arrayList2 = o2.j;
        arrayList2.clear();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            r0.d(arrayList2, (View) arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        this.b(o2, arrayList);
    }

    public void x(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        o o2 = (o)object;
        if (o2 != null) {
            o2.j.clear();
            o2.j.addAll(arrayList2);
            this.p(o2, arrayList, arrayList2);
        }
    }

    public Object y(Object object) {
        if (object == null) {
            return null;
        }
        o o2 = new o();
        o2.I((i)object);
        return o2;
    }

}

