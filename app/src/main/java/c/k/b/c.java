/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  c.e.g
 *  c.e.g$a
 *  c.e.g$b
 *  c.e.g$d
 *  c.e.g$e
 *  c.h.b.g
 *  c.h.f.a
 *  c.h.f.a$a
 *  c.h.j.l
 *  c.h.j.n
 *  c.k.b.a0
 *  c.k.b.c$a
 *  c.k.b.c$c
 *  c.k.b.d
 *  c.k.b.f
 *  c.k.b.h
 *  c.k.b.i
 *  c.k.b.j
 *  c.k.b.k
 *  c.k.b.m
 *  c.k.b.m$b
 *  c.k.b.p0
 *  c.k.b.r
 *  c.k.b.r0
 *  c.k.b.s
 *  c.k.b.w0
 *  c.k.b.w0$d
 *  c.k.b.w0$d$c
 *  d.a.b.a.a
 *  java.lang.Boolean
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 */
package c.k.b;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import c.e.g;
import c.h.f.a;
import c.h.j.l;
import c.h.j.n;
import c.k.b.a0;
import c.k.b.c;
import c.k.b.e;
import c.k.b.f;
import c.k.b.g;
import c.k.b.h;
import c.k.b.i;
import c.k.b.j;
import c.k.b.k;
import c.k.b.m;
import c.k.b.p0;
import c.k.b.r;
import c.k.b.r0;
import c.k.b.s;
import c.k.b.w0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class c
extends w0 {
    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public void b(List<w0.d> list, boolean bl) {
        HashMap hashMap;
        boolean bl2;
        ArrayList arrayList;
        Boolean bl3;
        w0.d.c c2;
        ArrayList arrayList2;
        boolean bl4 = bl;
        Boolean bl5 = Boolean.TRUE;
        w0.d.c c3 = w0.d.c.f;
        Iterator iterator = list.iterator();
        w0.d d2 = null;
        w0.d d3 = null;
        while (iterator.hasNext()) {
            w0.d d4 = (w0.d)iterator.next();
            w0.d.c c4 = w0.d.c.j((View)d4.c.J);
            int n2 = d4.a.ordinal();
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2 && n2 != 3) {
                        continue;
                    }
                } else {
                    if (c4 == c3) continue;
                    d3 = d4;
                    continue;
                }
            }
            if (c4 != c3 || d2 != null) continue;
            d2 = d4;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(list);
        for (w0.d d5 : list) {
            c.h.f.a a2 = new c.h.f.a();
            d5.d();
            d5.e.add((Object)a2);
            arrayList3.add(new b(d5, a2));
            c.h.f.a a3 = new c.h.f.a();
            d5.d();
            d5.e.add((Object)a3);
            boolean bl6 = bl4 ? d5 == d2 : d5 == d3;
            arrayList4.add(new d(d5, a3, bl4, bl6));
            a a4 = new a(this, (List)arrayList5, d5);
            d5.d.add((Object)a4);
        }
        Boolean bl7 = Boolean.FALSE;
        HashMap hashMap2 = new HashMap();
        Iterator iterator2 = arrayList4.iterator();
        r0 r02 = null;
        while (iterator2.hasNext()) {
            Iterator iterator3;
            d d6 = (d) iterator2.next();
            if (d6.b()) {
                iterator3 = iterator2;
            } else {
                r0 r03 = d6.c(d6.c);
                r0 r04 = d6.c(d6.e);
                iterator3 = iterator2;
                if (r03 != null && r04 != null && r03 != r04) {
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    stringBuilder.append((Object)d6.a.c);
                    stringBuilder.append(" returned Transition ");
                    stringBuilder.append(d6.c);
                    stringBuilder.append(" which uses a different Transition  type than its shared element transition ");
                    stringBuilder.append(d6.e);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                if (r03 == null) {
                    r03 = r04;
                }
                if (r02 == null) {
                    r02 = r03;
                } else if (r03 != null && r02 != r03) {
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    stringBuilder.append((Object)d6.a.c);
                    stringBuilder.append(" returned Transition ");
                    stringBuilder.append(d6.c);
                    stringBuilder.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            iterator2 = iterator3;
        }
        if (r02 == null) {
            for (d d7 : arrayList4) {
                hashMap2.put((Object)d7.a, bl7);
                d7.a();
            }
            bl2 = false;
            hashMap = hashMap2;
            c2 = c3;
            arrayList2 = arrayList3;
            arrayList = arrayList5;
            bl3 = bl5;
        } else {
            View view = new View(this.a.getContext());
            Rect rect = new Rect();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            arrayList = arrayList5;
            c.e.a a5 = new c.e.a();
            Iterator iterator4 = arrayList4.iterator();
            Rect rect2 = rect;
            arrayList2 = arrayList3;
            Object object = null;
            View view2 = null;
            boolean bl8 = false;
            View view3 = view;
            HashMap hashMap3 = hashMap2;
            w0.d d8 = d2;
            w0.d d9 = d3;
            while (iterator4.hasNext()) {
                HashMap hashMap4;
                w0.d.c c5;
                ArrayList arrayList8;
                View view4;
                Boolean bl9;
                Boolean bl10;
                Rect rect3;
                c.e.a a6;
                ArrayList arrayList9;
                r0 r05;
                ArrayList arrayList10;
                w0.d d10;
                w0.d d11;
                Object object2 = iterator4.next();
                View view5 = view2;
                Object object3 = ((d)object2).e;
                boolean bl11 = object3 != null;
                if (bl11 && d8 != null && d9 != null) {
                    ArrayList arrayList11;
                    ArrayList arrayList12;
                    ArrayList arrayList13;
                    ArrayList arrayList14;
                    Object object4 = r02.y(r02.g(object3));
                    m.b b2 = d9.c.M;
                    if (b2 == null || (arrayList12 = b2.e) == null) {
                        arrayList12 = new ArrayList();
                    }
                    r0 r06 = r02;
                    m.b b3 = d8.c.M;
                    if (b3 == null || (arrayList14 = b3.e) == null) {
                        arrayList14 = new ArrayList();
                    }
                    c5 = c3;
                    m.b b4 = d8.c.M;
                    if (b4 == null || (arrayList11 = b4.f) == null) {
                        arrayList11 = new ArrayList();
                    }
                    arrayList10 = arrayList4;
                    bl9 = bl7;
                    for (int i2 = 0; i2 < arrayList11.size(); ++i2) {
                        int n3 = arrayList12.indexOf(arrayList11.get(i2));
                        ArrayList arrayList15 = arrayList11;
                        if (n3 != -1) {
                            arrayList12.set(n3, arrayList14.get(i2));
                        }
                        arrayList11 = arrayList15;
                    }
                    m.b b5 = d9.c.M;
                    if (b5 == null || (arrayList13 = b5.f) == null) {
                        arrayList13 = new ArrayList();
                    }
                    ArrayList arrayList16 = arrayList13;
                    if (!bl4) {
                        d8.c.o();
                        d9.c.m();
                    } else {
                        d8.c.m();
                        d9.c.o();
                    }
                    int n4 = arrayList12.size();
                    for (int i3 = 0; i3 < n4; ++i3) {
                        String string = (String)arrayList12.get(i3);
                        Object object5 = arrayList16.get(i3);
                        int n5 = n4;
                        a5.put(string, object5);
                        n4 = n5;
                    }
                    c.e.a<String, View> a7 = new c.e.a<String, View>();
                    this.j(a7, d8.c.J);
                    c.e.g.k(a7, (Collection)arrayList12);
                    c.e.g.k(a5, a7.keySet());
                    c.e.a<String, View> a8 = new c.e.a<String, View>();
                    this.j(a8, d9.c.J);
                    c.e.g.k(a8, (Collection)arrayList16);
                    c.e.g.k(a8, a5.values());
                    p0.m(a5, a8);
                    this.k(a7, (Collection<String>)a5.keySet());
                    this.k(a8, a5.values());
                    if (a5.isEmpty()) {
                        arrayList6.clear();
                        arrayList7.clear();
                        rect3 = rect2;
                        arrayList8 = arrayList6;
                        bl10 = bl5;
                        d10 = d2;
                        a6 = a5;
                        view4 = view3;
                        r05 = r06;
                        view2 = view5;
                        arrayList9 = arrayList7;
                        d11 = d3;
                        hashMap4 = hashMap3;
                        object = null;
                    } else {
                        View view6;
                        g.a a9;
                        g.a a10;
                        View view7;
                        p0.c((m)d9.c, (m)d8.c, (boolean)bl4, a7, (boolean)true);
                        ViewGroup viewGroup = this.a;
                        ArrayList arrayList17 = arrayList7;
                        arrayList8 = arrayList6;
                        a6 = a5;
                        Rect rect4 = rect2;
                        ArrayList arrayList18 = arrayList12;
                        w0.d d12 = d3;
                        Boolean bl12 = bl5;
                        w0.d d13 = d3;
                        View view8 = view3;
                        arrayList9 = arrayList17;
                        w0.d d14 = d2;
                        w0.d d15 = d2;
                        r05 = r06;
                        HashMap hashMap5 = hashMap3;
                        h h2 = new h(this, d12, d14, bl, a8);
                        l.a((View)viewGroup, (Runnable)h2);
                        Iterator iterator5 = ((g.e)a7.values()).iterator();
                        while ((a10 = (g.a)iterator5).hasNext()) {
                            this.i((ArrayList<View>)arrayList8, (View)a10.next());
                        }
                        if (!arrayList18.isEmpty()) {
                            view6 = a7.get(arrayList18.get(0));
                            r05.t(object4, view6);
                        } else {
                            view6 = view5;
                        }
                        Iterator iterator6 = ((g.e)a8.values()).iterator();
                        while ((a9 = (g.a)iterator6).hasNext()) {
                            this.i((ArrayList<View>)arrayList9, (View)a9.next());
                        }
                        if (!arrayList16.isEmpty() && (view7 = a8.get(arrayList16.get(0))) != null) {
                            ViewGroup viewGroup2 = this.a;
                            rect3 = rect4;
                            l.a((View)viewGroup2, (Runnable)new i(this, r05, view7, rect3));
                            bl8 = true;
                        } else {
                            rect3 = rect4;
                        }
                        view4 = view8;
                        r05.w(object4, view4, arrayList8);
                        r05.r(object4, null, null, null, null, object4, arrayList9);
                        bl10 = bl12;
                        d10 = d15;
                        hashMap4 = hashMap5;
                        hashMap4.put((Object)d10, bl10);
                        d11 = d13;
                        hashMap4.put((Object)d11, bl10);
                        object = object4;
                        d8 = d10;
                        d9 = d11;
                        view2 = view6;
                    }
                } else {
                    arrayList8 = arrayList6;
                    c5 = c3;
                    arrayList10 = arrayList4;
                    a6 = a5;
                    bl9 = bl7;
                    view4 = view3;
                    bl10 = bl5;
                    d10 = d2;
                    d11 = d3;
                    hashMap4 = hashMap3;
                    arrayList9 = arrayList7;
                    r05 = r02;
                    rect3 = rect2;
                    view2 = view5;
                }
                view3 = view4;
                rect2 = rect3;
                arrayList6 = arrayList8;
                arrayList7 = arrayList9;
                bl5 = bl10;
                r02 = r05;
                hashMap3 = hashMap4;
                d2 = d10;
                d3 = d11;
                c3 = c5;
                bl7 = bl9;
                arrayList4 = arrayList10;
                a5 = a6;
                bl4 = bl;
            }
            ArrayList arrayList19 = arrayList6;
            r0 r07 = r02;
            w0.d.c c6 = c3;
            View view9 = view2;
            ArrayList arrayList20 = arrayList4;
            c.e.a a11 = a5;
            Boolean bl13 = bl7;
            View view10 = view3;
            hashMap = hashMap3;
            Rect rect5 = rect2;
            bl3 = bl5;
            ArrayList arrayList21 = arrayList7;
            ArrayList arrayList22 = new ArrayList();
            Iterator iterator7 = arrayList20.iterator();
            Object object6 = null;
            Object object7 = null;
            while (iterator7.hasNext()) {
                View view11;
                w0.d.c c7;
                w0.d d16;
                View view12;
                Boolean bl14;
                d d17 = (d) iterator7.next();
                if (d17.b()) {
                    Iterator iterator8 = iterator7;
                    w0.d d18 = d17.a;
                    Object object8 = object6;
                    hashMap.put((Object)d18, bl13);
                    d17.a();
                    iterator7 = iterator8;
                    object6 = object8;
                    continue;
                }
                Iterator iterator9 = iterator7;
                Object object9 = object6;
                Boolean bl15 = bl13;
                Object object10 = r07.g(d17.c);
                Object object11 = object7;
                w0.d d19 = d17.a;
                boolean bl16 = object != null && (d19 == d8 || d19 == d9);
                if (object10 == null) {
                    if (!bl16) {
                        hashMap.put((Object)d19, bl15);
                        d17.a();
                    }
                    view11 = view10;
                    d16 = d9;
                    bl14 = bl15;
                    object6 = object9;
                    view12 = view9;
                    c7 = c6;
                    object7 = object11;
                } else {
                    bl14 = bl15;
                    ArrayList arrayList23 = new ArrayList();
                    d16 = d9;
                    this.i((ArrayList<View>)arrayList23, d19.c.J);
                    if (bl16) {
                        if (d19 == d8) {
                            arrayList23.removeAll(arrayList19);
                        } else {
                            arrayList23.removeAll(arrayList21);
                        }
                    }
                    if (arrayList23.isEmpty()) {
                        r07.a(object10, view10);
                        view11 = view10;
                    } else {
                        r07.b(object10, arrayList23);
                        r07.r(object10, object10, arrayList23, null, null, null, null);
                        w0.d.c c8 = d19.a;
                        view11 = view10;
                        if (c8 == w0.d.c.g) {
                            r07.q(object10, d19.c.J, arrayList23);
                            l.a((View)this.a, (Runnable)new j(this, arrayList23));
                        }
                    }
                    w0.d.c c9 = d19.a;
                    c7 = c6;
                    if (c9 == c7) {
                        arrayList22.addAll(arrayList23);
                        if (bl8) {
                            r07.s(object10, rect5);
                        }
                        view12 = view9;
                    } else {
                        view12 = view9;
                        r07.t(object10, view12);
                    }
                    hashMap.put((Object)d19, bl3);
                    if (d17.d) {
                        object7 = r07.m(object11, object10, null);
                        object6 = object9;
                    } else {
                        object7 = object11;
                        object6 = r07.m(object9, object10, null);
                    }
                }
                iterator7 = iterator9;
                view9 = view12;
                c6 = c7;
                view10 = view11;
                bl13 = bl14;
                d9 = d16;
            }
            w0.d d20 = d9;
            Object object12 = object6;
            c2 = c6;
            Object object13 = r07.l(object7, object12, object);
            for (d d21 : arrayList20) {
                if (d21.b()) continue;
                Object object14 = d21.c;
                w0.d d22 = d21.a;
                w0.d d23 = d20;
                boolean bl17 = object != null && (d22 == d8 || d22 == d23);
                if (object14 != null || bl17) {
                    m m2 = d22.c;
                    c.h.f.a a12 = d21.b;
                    w0.d d24 = d8;
                    r07.u(m2, object13, a12, (Runnable)new k(this, d21));
                    d8 = d24;
                }
                d20 = d23;
            }
            p0.o((ArrayList)arrayList22, (int)4);
            ArrayList arrayList24 = r07.n(arrayList21);
            r07.c(this.a, object13);
            r07.v((View)this.a, arrayList19, arrayList21, arrayList24, a11);
            p0.o((ArrayList)arrayList22, (int)0);
            r07.x(object, arrayList19, arrayList21);
            bl2 = false;
        }
        boolean bl18 = hashMap.containsValue(bl3);
        ViewGroup viewGroup = this.a;
        Context context = viewGroup.getContext();
        ArrayList arrayList25 = new ArrayList();
        for (b b6 : arrayList2) {
            m m3;
            Animator animator;
            block71 : {
                block70 : {
                    r r2;
                    if (b6.b() || (r2 = b6.c(context)) == null) break block70;
                    animator = r2.b;
                    if (animator == null) {
                        arrayList25.add(b6);
                        continue;
                    }
                    w0.d d25 = b6.a;
                    m3 = d25.c;
                    if (!bl3.equals(hashMap.get((Object)d25))) break block71;
                    if (a0.N((int)2)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Ignoring Animator set on ");
                        stringBuilder.append((Object)m3);
                        stringBuilder.append(" as this Fragment was involved in a Transition.");
                        Log.v("FragmentManager", stringBuilder.toString());
                    }
                }
                b6.a();
                continue;
            }
            View view = m3.J;
            viewGroup.startViewTransition(view);
            animator.addListener((Animator.AnimatorListener)new c.k.b.d(this, viewGroup, view, b6));
            animator.setTarget(view);
            animator.start();
            b.b((a.a)new e(this, animator));
            bl2 = true;
        }
        for (b b7 : arrayList25) {
            w0.d d26;
            m m4;
            block75 : {
                block73 : {
                    String string;
                    StringBuilder stringBuilder;
                    block74 : {
                        block72 : {
                            d26 = b7.a;
                            m4 = d26.c;
                            if (!bl18) break block72;
                            if (!a0.N((int)2)) break block73;
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Ignoring Animation set on ");
                            stringBuilder.append((Object)m4);
                            string = " as Animations cannot run alongside Transitions.";
                            break block74;
                        }
                        if (!bl2) break block75;
                        if (!a0.N((int)2)) break block73;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Ignoring Animation set on ");
                        stringBuilder.append((Object)m4);
                        string = " as Animations cannot run alongside Animators.";
                    }
                    stringBuilder.append(string);
                    Log.v("FragmentManager", stringBuilder.toString());
                }
                b7.a();
                continue;
            }
            View view = m4.J;
            r r3 = b7.c(context);
            Objects.requireNonNull(r3);
            Animation animation = r3.a;
            Objects.requireNonNull((Object)animation);
            if (d26.a == c2) {
                view.startAnimation(animation);
                b7.a();
            } else {
                viewGroup.startViewTransition(view);
                s s2 = new s(animation, viewGroup, view);
                s2.setAnimationListener((Animation.AnimationListener)new f(this, viewGroup, view, b7));
                view.startAnimation((Animation)s2);
            }
            b.b((a.a)new g(this, view));
        }
        for (w0.d d27 : arrayList) {
            View view = d27.c.J;
            d27.a.g(view);
        }
        arrayList.clear();
    }

    public void i(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup && !c.h.b.g.D((ViewGroup)(view = view))) {
            int n2 = view.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                View view2 = view.getChildAt(i2);
                if (view2.getVisibility() != 0) continue;
                this.i(arrayList, view2);
            }
        } else {
            arrayList.add(view);
        }
    }

    public void j(Map<String, View> map, View view) {
        String string = n.j((View)view);
        if (string != null) {
            map.put((Object)string, (Object)view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            int n2 = viewGroup.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                View view2 = viewGroup.getChildAt(i2);
                if (view2.getVisibility() != 0) continue;
                this.j(map, view2);
            }
        }
    }

    public void k(c.e.a<String, View> a2, Collection<String> collection) {
        g.d d2;
        Iterator iterator = ((g.b)a2.entrySet()).iterator();
        while ((d2 = (g.d)iterator).hasNext()) {
            d2.next();
            if (collection.contains((Object)n.j((View) ((Map.Entry)d2).getValue()))) continue;
            d2.remove();
        }
    }

    public static class b
    extends c {
        public boolean c = false;
        public r d;

        public b(w0.d d2, c.h.f.a a2) {
            super(d2, a2);
        }

        public r c(Context context) {
            r r2;
            if (this.c) {
                return this.d;
            }
            w0.d d2 = this.a;
            m m2 = d2.c;
            boolean bl = d2.a == w0.d.c.f;
            this.d = r2 = c.h.b.g.E((Context)context, (m)m2, (boolean)bl);
            this.c = true;
            return r2;
        }
    }

    public static class d
    extends c {
        public final Object c;
        public final boolean d;
        public final Object e;

        public d(w0.d d2, c.h.f.a a2, boolean bl, boolean bl2) {
            super(d2, a2);
            if (d2.a == w0.d.c.f) {
                Object object;
                if (bl) {
                    object = d2.c.t();
                } else {
                    d2.c.l();
                    object = null;
                }
                this.c = object;
                if (!bl) {
                    // empty if block
                }
            } else {
                Object object;
                if (bl) {
                    object = d2.c.v();
                } else {
                    d2.c.n();
                    object = null;
                }
                this.c = object;
            }
            this.d = true;
            if (bl2) {
                if (bl) {
                    this.e = d2.c.x();
                    return;
                }
                d2.c.w();
            }
            this.e = null;
        }

        public final r0 c(Object object) {
            if (object == null) {
                return null;
            }
            r0 r02 = p0.b;
            if (r02 != null && r02.e(object)) {
                return r02;
            }
            r0 r03 = p0.c;
            if (r03 != null && r03.e(object)) {
                return r03;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Transition ");
            stringBuilder.append(object);
            stringBuilder.append(" for fragment ");
            stringBuilder.append((Object)this.a.c);
            stringBuilder.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

}

