/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.util.AndroidRuntimeException
 *  android.view.View
 *  android.view.ViewGroup
 *  c.v.o$a
 *  c.v.o$b
 *  d.a.b.a.a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package c.v;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import c.v.e;
import c.v.i;
import c.v.n;
import c.v.o;
import c.v.q;
import c.v.r;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Exception performing whole class analysis.
 */
public class o
extends i {
    public ArrayList<i> B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;

    public o() {
        this.B = new ArrayList();
        this.C = true;
        this.E = false;
        this.F = 0;
    }

    @Override
    public i A(long l2) {
        ArrayList<i> arrayList;
        this.g = l2;
        if (l2 >= 0L && (arrayList = this.B) != null) {
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.B.get(i2).A(l2);
            }
        }
        return this;
    }

    @Override
    public void B(c c2) {
        this.w = c2;
        this.F = 8 | this.F;
        int n2 = this.B.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.B.get(i2).B(c2);
        }
    }

    @Override
    public i C(TimeInterpolator timeInterpolator) {
        this.F = 1 | this.F;
        ArrayList<i> arrayList = this.B;
        if (arrayList != null) {
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.B.get(i2).C(timeInterpolator);
            }
        }
        this.h = timeInterpolator;
        return this;
    }

    @Override
    public void D(e e2) {
        e e3 = e2 == null ? i.z : e2;
        this.x = e3;
        this.F = 4 | this.F;
        if (this.B != null) {
            for (int i2 = 0; i2 < this.B.size(); ++i2) {
                this.B.get(i2).D(e2);
            }
        }
    }

    @Override
    public void E(n n2) {
        this.F = 2 | this.F;
        int n3 = this.B.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            this.B.get(i2).E(n2);
        }
    }

    @Override
    public i F(long l2) {
        this.f = l2;
        return this;
    }

    @Override
    public String H(String string) {
        String string2 = super.H(string);
        for (int i2 = 0; i2 < this.B.size(); ++i2) {
            StringBuilder stringBuilder = d.a.b.a.a.e((String)string2, (String)"\n");
            i i3 = this.B.get(i2);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append("  ");
            stringBuilder.append(i3.H(stringBuilder2.toString()));
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public o I(i i2) {
        this.B.add(i2);
        i2.m = this;
        long l2 = this.g;
        if (l2 >= 0L) {
            i2.A(l2);
        }
        if ((1 & this.F) != 0) {
            i2.C(this.h);
        }
        if ((2 & this.F) != 0) {
            i2.E(null);
        }
        if ((4 & this.F) != 0) {
            i2.D(this.x);
        }
        if ((8 & this.F) != 0) {
            i2.B(this.w);
        }
        return this;
    }

    public i J(int n2) {
        if (n2 >= 0 && n2 < this.B.size()) {
            return this.B.get(n2);
        }
        return null;
    }

    public o K(int n2) {
        if (n2 != 0) {
            if (n2 == 1) {
                this.C = false;
                return this;
            }
            throw new AndroidRuntimeException(d.a.b.a.a.k((String)"Invalid parameter for TransitionSet ordering: ", (int)n2));
        }
        this.C = true;
        return this;
    }

    @Override
    public i b(d d2) {
        super.b(d2);
        return this;
    }

    @Override
    public i c(View view) {
        for (int i2 = 0; i2 < this.B.size(); ++i2) {
            this.B.get(i2).c(view);
        }
        this.j.add(view);
        return this;
    }

    @Override
    public void e(q q2) {
        if (this.t(q2.b)) {
            for (i i2 : this.B) {
                if (!i2.t(q2.b)) continue;
                i2.e(q2);
                q2.c.add(i2);
            }
        }
    }

    @Override
    public void g(q q2) {
        int n2 = this.B.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.B.get(i2).g(q2);
        }
    }

    @Override
    public void h(q q2) {
        if (this.t(q2.b)) {
            for (i i2 : this.B) {
                if (!i2.t(q2.b)) continue;
                i2.h(q2);
                q2.c.add(i2);
            }
        }
    }

    @Override
    public i k() {
        o o2 = (o)super.k();
        o2.B = new ArrayList();
        int n2 = this.B.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            i i3 = this.B.get(i2).k();
            o2.B.add(i3);
            i3.m = o2;
        }
        return o2;
    }

    @Override
    public void m(ViewGroup viewGroup, r r2, r r3, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long l2 = this.f;
        int n2 = this.B.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            i i3 = this.B.get(i2);
            if (l2 > 0L && (this.C || i2 == 0)) {
                long l3 = i3.f;
                if (l3 > 0L) {
                    i3.F(l3 + l2);
                } else {
                    i3.F(l2);
                }
            }
            i3.m(viewGroup, r2, r3, arrayList, arrayList2);
        }
    }

    @Override
    public void v(View view) {
        super.v(view);
        int n2 = this.B.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.B.get(i2).v(view);
        }
    }

    @Override
    public i w(d d2) {
        super.w(d2);
        return this;
    }

    @Override
    public i x(View view) {
        for (int i2 = 0; i2 < this.B.size(); ++i2) {
            this.B.get(i2).x(view);
        }
        this.j.remove(view);
        return this;
    }

    @Override
    public void y(View view) {
        super.y(view);
        int n2 = this.B.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.B.get(i2).y(view);
        }
    }

    @Override
    public void z() {
        if (this.B.isEmpty()) {
            this.G();
            this.n();
            return;
        }
        b b2 = new /* Unavailable Anonymous Inner Class!! */;
        Iterator iterator = this.B.iterator();
        while (iterator.hasNext()) {
            ((i)iterator.next()).b((d)b2);
        }
        this.D = this.B.size();
        if (!this.C) {
            for (int i2 = 1; i2 < this.B.size(); ++i2) {
                this.B.get(i2 - 1).b((d)new a(this, (i)this.B.get(i2)));
            }
            i i3 = this.B.get(0);
            if (i3 != null) {
                i3.z();
                return;
            }
        } else {
            Iterator iterator2 = this.B.iterator();
            while (iterator2.hasNext()) {
                ((i)iterator2.next()).z();
            }
        }
    }
}

