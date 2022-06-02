/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.TimeInterpolator
 *  android.util.SparseArray
 *  android.util.SparseIntArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  c.e.a
 *  c.e.d
 *  c.e.e
 *  c.e.h
 *  c.h.j.n
 *  c.v.c0
 *  c.v.i$a
 *  c.v.o
 *  d.a.b.a.a
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package c.v;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ListAdapter;
import android.widget.ListView;
import c.e.h;
import c.v.c0;
import c.v.d0;
import c.v.e;
import c.v.i;
import c.v.j;
import c.v.k;
import c.v.n;
import c.v.o;
import c.v.q;
import c.v.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class i
implements Cloneable {
    public static ThreadLocal<c.e.a<Animator, b>> A;
    public static final int[] y;
    public static final e z;
    public String e = this.getClass().getName();
    public long f = -1L;
    public long g = -1L;
    public TimeInterpolator h = null;
    public ArrayList<Integer> i = new ArrayList();
    public ArrayList<View> j = new ArrayList();
    public r k = new r();
    public r l = new r();
    public o m = null;
    public int[] n = y;
    public ArrayList<q> o;
    public ArrayList<q> p;
    public ArrayList<Animator> q = new ArrayList();
    public int r = 0;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<d> u = null;
    public ArrayList<Animator> v = new ArrayList();
    public c w;
    public e x = z;

    public static {
        y = new int[]{2, 1, 3, 4};
        z = new a();
        A = new ThreadLocal();
    }

    public static void d(r r2, View view, q q2) {
        ListView listView;
        String string;
        r2.a.put((Object)view, (Object)q2);
        int n2 = view.getId();
        if (n2 >= 0) {
            if (r2.b.indexOfKey(n2) >= 0) {
                r2.b.put(n2, null);
            } else {
                r2.b.put(n2, view);
            }
        }
        if ((string = c.h.j.n.j((View)view)) != null) {
            boolean bl = r2.d.e((Object)string) >= 0;
            if (bl) {
                r2.d.put(string, null);
            } else {
                r2.d.put((Object)string, (Object)view);
            }
        }
        if (view.getParent() instanceof ListView && (listView = (ListView)view.getParent()).getAdapter().hasStableIds()) {
            long l = listView.getItemIdAtPosition(listView.getPositionForView(view));
            c.e.e<View> e2 = r2.c;
            if (e2.e) {
                e2.e();
            }
            if (c.e.d.b((long[])e2.f, (int)e2.h, (long)l) >= 0) {
                View view2 = (View)r2.c.f(l);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    r2.c.h(l, null);
                    return;
                }
            } else {
                view.setHasTransientState(true);
                r2.c.h(l, (Object)view);
            }
        }
    }

    public static c.e.a<Animator, b> p() {
        c.e.a a2 = A.get();
        if (a2 == null) {
            a2 = new c.e.a();
            A.set(a2);
        }
        return a2;
    }

    public static boolean u(q q2, q q3, String string) {
        Object object = q2.a.get(string);
        Object object2 = q3.a.get(string);
        boolean bl = true;
        if (object == null && object2 == null) {
            return false;
        }
        if (object != null) {
            if (object2 == null) {
                return bl;
            }
            bl ^= object.equals(object2);
        }
        return bl;
    }

    public i A(long l) {
        this.g = l;
        return this;
    }

    public void B(c c2) {
        this.w = c2;
    }

    public i C(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        return this;
    }

    public void D(e e2) {
        if (e2 == null) {
            e2 = z;
        }
        this.x = e2;
    }

    public void E(n n2) {
    }

    public i F(long l) {
        this.f = l;
        return this;
    }

    public void G() {
        if (this.r == 0) {
            ArrayList<d> arrayList = this.u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList)this.u.clone();
                int n2 = arrayList2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    ((d)arrayList2.get(i2)).c(this);
                }
            }
            this.t = false;
        }
        this.r = 1 + this.r;
    }

    public String H(String string) {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)string);
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        stringBuilder.append(": ");
        String string2 = stringBuilder.toString();
        if (this.g != -1L) {
            StringBuilder stringBuilder2 = d.a.b.a.a.e((String)string2, (String)"dur(");
            stringBuilder2.append(this.g);
            stringBuilder2.append(") ");
            string2 = stringBuilder2.toString();
        }
        if (this.f != -1L) {
            StringBuilder stringBuilder3 = d.a.b.a.a.e((String)string2, (String)"dly(");
            stringBuilder3.append(this.f);
            stringBuilder3.append(") ");
            string2 = stringBuilder3.toString();
        }
        if (this.h != null) {
            StringBuilder stringBuilder4 = d.a.b.a.a.e((String)string2, (String)"interp(");
            stringBuilder4.append(this.h);
            stringBuilder4.append(") ");
            string2 = stringBuilder4.toString();
        }
        if (this.i.size() > 0 || this.j.size() > 0) {
            String string3 = d.a.b.a.a.m((String)string2, (String)"tgts(");
            if (this.i.size() > 0) {
                for (int i2 = 0; i2 < this.i.size(); ++i2) {
                    if (i2 > 0) {
                        string3 = d.a.b.a.a.m((String)string3, (String)", ");
                    }
                    StringBuilder stringBuilder5 = d.a.b.a.a.d((String)string3);
                    stringBuilder5.append(this.i.get(i2));
                    string3 = stringBuilder5.toString();
                }
            }
            int n2 = this.j.size();
            if (n2 > 0) {
                for (int i3 = 0; i3 < this.j.size(); ++i3) {
                    if (i3 > 0) {
                        string3 = d.a.b.a.a.m((String)string3, (String)", ");
                    }
                    StringBuilder stringBuilder6 = d.a.b.a.a.d((String)string3);
                    stringBuilder6.append(this.j.get(i3));
                    string3 = stringBuilder6.toString();
                }
            }
            string2 = d.a.b.a.a.m((String)string3, (String)")");
        }
        return string2;
    }

    public i b(d d2) {
        if (this.u == null) {
            this.u = new ArrayList();
        }
        this.u.add(d2);
        return this;
    }

    public i c(View view) {
        this.j.add(view);
        return this;
    }

    public abstract void e(q var1);

    public final void f(View view, boolean bl) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            q q2 = new q(view);
            if (bl) {
                this.h(q2);
            } else {
                this.e(q2);
            }
            q2.c.add(this);
            this.g(q2);
            r r2 = bl ? this.k : this.l;
            i.d(r2, view, q2);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); ++i2) {
                this.f(viewGroup.getChildAt(i2), bl);
            }
        }
    }

    public void g(q q2) {
    }

    public abstract void h(q var1);

    public void i(ViewGroup viewGroup, boolean bl) {
        this.j(bl);
        if (this.i.size() <= 0 && this.j.size() <= 0) {
            this.f(viewGroup, bl);
            return;
        }
        int n2 = 0;
        do {
            int n3 = this.i.size();
            if (n2 >= n3) break;
            View view = viewGroup.findViewById(this.i.get(n2).intValue());
            if (view != null) {
                q q2 = new q(view);
                if (bl) {
                    this.h(q2);
                } else {
                    this.e(q2);
                }
                q2.c.add(this);
                this.g(q2);
                r r2 = bl ? this.k : this.l;
                i.d(r2, view, q2);
            }
            ++n2;
        } while (true);
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            View view = this.j.get(i2);
            q q3 = new q(view);
            if (bl) {
                this.h(q3);
            } else {
                this.e(q3);
            }
            q3.c.add(this);
            this.g(q3);
            r r3 = bl ? this.k : this.l;
            i.d(r3, view, q3);
        }
    }

    public void j(boolean bl) {
        r r2;
        if (bl) {
            this.k.a.clear();
            this.k.b.clear();
            r2 = this.k;
        } else {
            this.l.a.clear();
            this.l.b.clear();
            r2 = this.l;
        }
        r2.c.c();
    }

    public i k() {
        try {
            i i2 = (i)super.clone();
            i2.v = new ArrayList();
            i2.k = new r();
            i2.l = new r();
            i2.o = null;
            i2.p = null;
            return i2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, q q2, q q3) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void m(ViewGroup viewGroup, r r2, r r3, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        c.e.a<Animator, b> a2 = i.p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int n2 = arrayList.size();
        int n3 = 0;
        do {
            int n4;
            block14 : {
                q q2;
                View view;
                Animator animator;
                block16 : {
                    Animator animator2;
                    q q3;
                    View view2;
                    block8 : {
                        int n5;
                        Animator animator3;
                        block15 : {
                            block9 : {
                                q q4;
                                Animator animator4;
                                block11 : {
                                    block12 : {
                                        block13 : {
                                            block10 : {
                                                if (n3 >= n2) break block9;
                                                q4 = arrayList.get(n3);
                                                q q5 = arrayList2.get(n3);
                                                if (q4 != null && !q4.c.contains(this)) {
                                                    q4 = null;
                                                }
                                                if (q5 != null && !q5.c.contains(this)) {
                                                    q5 = null;
                                                }
                                                if (q4 == null && q5 == null) break block10;
                                                boolean bl = q4 == null || q5 == null || this.s(q4, q5);
                                                if (!bl || (animator4 = this.l(viewGroup, q4, q5)) == null) break block10;
                                                if (q5 == null) break block11;
                                                view2 = q5.b;
                                                String[] arrstring = this.q();
                                                if (arrstring == null || arrstring.length <= 0) break block12;
                                                q3 = new q(view2);
                                                q q6 = r3.a.get(view2);
                                                if (q6 == null) break block13;
                                                for (int i2 = 0; i2 < arrstring.length; ++i2) {
                                                    Map<String, Object> map = q3.a;
                                                    Animator animator5 = animator4;
                                                    String string = arrstring[i2];
                                                    int n6 = n2;
                                                    Map<String, Object> map2 = q6.a;
                                                    q q7 = q6;
                                                    map.put(string, map2.get(arrstring[i2]));
                                                    animator4 = animator5;
                                                    n2 = n6;
                                                    q6 = q7;
                                                }
                                                break block13;
                                            }
                                            n4 = n2;
                                            break block14;
                                        }
                                        animator3 = animator4;
                                        n4 = n2;
                                        n5 = a2.g;
                                        break block15;
                                    }
                                    Animator animator6 = animator4;
                                    n4 = n2;
                                    animator2 = animator6;
                                    q3 = null;
                                    break block8;
                                }
                                Animator animator7 = animator4;
                                n4 = n2;
                                view = q4.b;
                                animator = animator7;
                                q2 = null;
                                break block16;
                            }
                            if (sparseIntArray.size() != 0) {
                                for (int i3 = 0; i3 < sparseIntArray.size(); ++i3) {
                                    int n7 = sparseIntArray.keyAt(i3);
                                    Animator animator8 = this.v.get(n7);
                                    animator8.setStartDelay((long)sparseIntArray.valueAt(i3) - Long.MAX_VALUE + animator8.getStartDelay());
                                }
                            }
                            return;
                        }
                        for (int i4 = 0; i4 < n5; ++i4) {
                            b b2 = a2.get((Animator)a2.h(i4));
                            if (b2.c == null || b2.a != view2 || !b2.b.equals(this.e) || !b2.c.equals(q3)) continue;
                            animator2 = null;
                            break block8;
                        }
                        animator2 = animator3;
                    }
                    view = view2;
                    animator = animator2;
                    q2 = q3;
                }
                if (animator != null) {
                    String string = this.e;
                    b b3 = new b(view, string, this, new c0(viewGroup), q2);
                    a2.put((Object)animator, (Object)b3);
                    this.v.add(animator);
                }
            }
            ++n3;
            n2 = n4;
        } while (true);
    }

    public void n() {
        int n2;
        this.r = n2 = this.r - 1;
        if (n2 == 0) {
            ArrayList<d> arrayList = this.u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList)this.u.clone();
                int n3 = arrayList2.size();
                for (int i2 = 0; i2 < n3; ++i2) {
                    ((d)arrayList2.get(i2)).e(this);
                }
            }
            for (int i3 = 0; i3 < this.k.c.i(); ++i3) {
                View view = (View)this.k.c.j(i3);
                if (view == null) continue;
                view.setHasTransientState(false);
            }
            for (int i4 = 0; i4 < this.l.c.i(); ++i4) {
                View view = (View)this.l.c.j(i4);
                if (view == null) continue;
                view.setHasTransientState(false);
            }
            this.t = true;
        }
    }

    public q o(View view, boolean bl) {
        o o2 = this.m;
        if (o2 != null) {
            return o2.o(view, bl);
        }
        ArrayList<q> arrayList = bl ? this.o : this.p;
        if (arrayList == null) {
            return null;
        }
        int n2 = arrayList.size();
        int n3 = -1;
        for (int i2 = 0; i2 < n2; ++i2) {
            q q2 = arrayList.get(i2);
            if (q2 == null) {
                return null;
            }
            if (q2.b != view) continue;
            n3 = i2;
            break;
        }
        q q3 = null;
        if (n3 >= 0) {
            ArrayList<q> arrayList2 = bl ? this.p : this.o;
            q3 = arrayList2.get(n3);
        }
        return q3;
    }

    public String[] q() {
        return null;
    }

    public q r(View view, boolean bl) {
        o o2 = this.m;
        if (o2 != null) {
            return o2.r(view, bl);
        }
        r r2 = bl ? this.k : this.l;
        return r2.a.getOrDefault(view, null);
    }

    public boolean s(q q2, q q3) {
        boolean bl;
        block6 : {
            bl = false;
            if (q2 != null) {
                bl = false;
                if (q3 != null) {
                    block7 : {
                        String[] arrstring = this.q();
                        if (arrstring != null) {
                            int n2 = arrstring.length;
                            int n3 = 0;
                            do {
                                bl = false;
                                if (n3 >= n2) break block6;
                                if (!i.u(q2, q3, arrstring[n3])) {
                                    ++n3;
                                    continue;
                                }
                                break block7;
                                break;
                            } while (true);
                        }
                        Iterator iterator = q2.a.keySet().iterator();
                        do {
                            boolean bl2 = iterator.hasNext();
                            bl = false;
                            if (!bl2) break block6;
                        } while (!i.u(q2, q3, (String)iterator.next()));
                    }
                    bl = true;
                }
            }
        }
        return bl;
    }

    public boolean t(View view) {
        int n2 = view.getId();
        if (this.i.size() == 0 && this.j.size() == 0) {
            return true;
        }
        if (!this.i.contains(n2)) {
            return this.j.contains(view);
        }
        return true;
    }

    public String toString() {
        return this.H("");
    }

    public void v(View view) {
        if (!this.t) {
            c.e.a<Animator, b> a2 = i.p();
            int n2 = a2.g;
            c0 c02 = new c0(view);
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                b b2 = (b)a2.k(i2);
                if (b2.a == null || !c02.equals(b2.d)) continue;
                ((Animator)a2.h(i2)).pause();
            }
            ArrayList<d> arrayList = this.u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList)this.u.clone();
                int n3 = arrayList2.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    ((d)arrayList2.get(i3)).a(this);
                }
            }
            this.s = true;
        }
    }

    public i w(d d2) {
        ArrayList<d> arrayList = this.u;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(d2);
        if (this.u.size() == 0) {
            this.u = null;
        }
        return this;
    }

    public i x(View view) {
        this.j.remove(view);
        return this;
    }

    public void y(View view) {
        if (this.s) {
            if (!this.t) {
                c.e.a<Animator, b> a2 = i.p();
                int n2 = a2.g;
                c0 c02 = new c0(view);
                for (int i2 = n2 - 1; i2 >= 0; --i2) {
                    b b2 = (b)a2.k(i2);
                    if (b2.a == null || !c02.equals(b2.d)) continue;
                    ((Animator)a2.h(i2)).resume();
                }
                ArrayList<d> arrayList = this.u;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList)this.u.clone();
                    int n3 = arrayList2.size();
                    for (int i3 = 0; i3 < n3; ++i3) {
                        ((d)arrayList2.get(i3)).b(this);
                    }
                }
            }
            this.s = false;
        }
    }

    public void z() {
        this.G();
        c.e.a<Animator, b> a2 = i.p();
        for (Animator animator : this.v) {
            long l;
            TimeInterpolator timeInterpolator;
            if (!a2.containsKey(animator)) continue;
            this.G();
            if (animator == null) continue;
            animator.addListener(new j(this, a2));
            long l2 = this.g;
            if (l2 >= 0L) {
                animator.setDuration(l2);
            }
            if ((l = this.f) >= 0L) {
                animator.setStartDelay(l + animator.getStartDelay());
            }
            if ((timeInterpolator = this.h) != null) {
                animator.setInterpolator(timeInterpolator);
            }
            animator.addListener(new k(this));
            animator.start();
        }
        this.v.clear();
        this.n();
    }

    public static class b {
        public View a;
        public String b;
        public q c;
        public d0 d;
        public i e;

        public b(View view, String string, i i2, d0 d02, q q2) {
            this.a = view;
            this.b = string;
            this.c = q2;
            this.d = d02;
            this.e = i2;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a(i var1);

        void b(i var1);

        void c(i var1);

        void d(i var1);

        void e(i var1);
    }

}

