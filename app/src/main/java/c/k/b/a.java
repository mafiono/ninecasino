/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  c.k.b.a0
 *  c.k.b.a0$l
 *  c.k.b.i0
 *  c.k.b.i0$a
 *  c.k.b.m
 *  c.k.b.m$b
 *  c.k.b.v0
 *  c.k.b.w
 *  c.n.f
 *  c.n.f$b
 *  d.a.b.a.a
 *  java.io.PrintWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.reflect.Modifier
 *  java.util.ArrayList
 *  java.util.concurrent.atomic.AtomicInteger
 */
package c.k.b;

import android.content.Context;
import android.util.Log;
import c.k.b.a0;
import c.k.b.i0;
import c.k.b.m;
import c.k.b.v0;
import c.k.b.w;
import c.k.b.x;
import c.n.f;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class a
extends i0
implements a0.l {
    public final a0 p;
    public boolean q;
    public int r;

    public a(a0 a02) {
        w w2 = a02.K();
        x x2 = a02.q;
        ClassLoader classLoader = x2 != null ? x2.f.getClassLoader() : null;
        super(w2, classLoader);
        this.r = -1;
        this.p = a02;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (a0.N((int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append(this);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.g) {
            a0 a02 = this.p;
            if (a02.d == null) {
                a02.d = new ArrayList();
            }
            a02.d.add((Object)this);
        }
        return true;
    }

    public void c(int n2) {
        if (!this.g) {
            return;
        }
        if (a0.N((int)2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bump nesting in ");
            stringBuilder.append(this);
            stringBuilder.append(" by ");
            stringBuilder.append(n2);
            Log.v("FragmentManager", stringBuilder.toString());
        }
        int n3 = this.a.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            i0.a a2 = (i0.a)this.a.get(i2);
            m m2 = a2.b;
            if (m2 == null) continue;
            m2.u = n2 + m2.u;
            if (!a0.N((int)2)) continue;
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Bump nesting of ");
            stringBuilder.append((Object)a2.b);
            stringBuilder.append(" to ");
            stringBuilder.append(a2.b.u);
            Log.v("FragmentManager", stringBuilder.toString());
        }
    }

    public int d() {
        return this.e(false);
    }

    public int e(boolean bl) {
        if (!this.q) {
            if (a0.N((int)2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Commit: ");
                stringBuilder.append(this);
                Log.v("FragmentManager", stringBuilder.toString());
                PrintWriter printWriter = new PrintWriter((Writer)new v0("FragmentManager"));
                this.g("  ", printWriter, true);
                printWriter.close();
            }
            this.q = true;
            int n2 = this.g ? this.p.i.getAndIncrement() : -1;
            this.r = n2;
            this.p.A((a0.l)this, bl);
            return this.r;
        }
        throw new IllegalStateException("commit already called");
    }

    public void f(int n2, m m2, String string, int n3) {
        Class class_ = m2.getClass();
        int n4 = class_.getModifiers();
        if (!class_.isAnonymousClass() && Modifier.isPublic(n4) && (!class_.isMemberClass() || Modifier.isStatic(n4))) {
            if (string != null) {
                String string2 = m2.B;
                if (string2 != null && !string.equals(string2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't change tag of fragment ");
                    stringBuilder.append((Object)m2);
                    stringBuilder.append(": was ");
                    stringBuilder.append(m2.B);
                    stringBuilder.append(" now ");
                    stringBuilder.append(string);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                m2.B = string;
            }
            if (n2 != 0) {
                if (n2 != -1) {
                    int n5 = m2.z;
                    if (n5 != 0 && n5 != n2) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Can't change container ID of fragment ");
                        stringBuilder.append((Object)m2);
                        stringBuilder.append(": was ");
                        stringBuilder.append(m2.z);
                        stringBuilder.append(" now ");
                        stringBuilder.append(n2);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    m2.z = n2;
                    m2.A = n2;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't add fragment ");
                    stringBuilder.append((Object)m2);
                    stringBuilder.append(" with tag ");
                    stringBuilder.append(string);
                    stringBuilder.append(" to container view with no id");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.b(new i0.a(n3, m2));
            m2.v = this.p;
            return;
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Fragment ");
        stringBuilder.append(class_.getCanonicalName());
        stringBuilder.append(" must be a public static class to be  properly recreated from instance state.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void g(String string, PrintWriter printWriter, boolean bl) {
        if (bl) {
            printWriter.print(string);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.q);
            if (this.f != 0) {
                printWriter.print(string);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString((int)this.f));
            }
            if (this.b != 0 || this.c != 0) {
                printWriter.print(string);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString((int)this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString((int)this.c));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(string);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString((int)this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString((int)this.e));
            }
            if (this.i != 0 || this.j != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString((int)this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println((Object)this.j);
            }
            if (this.k != 0 || this.l != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString((int)this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println((Object)this.l);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(string);
            printWriter.println("Operations:");
            int n2 = this.a.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                String string2;
                i0.a a2 = (i0.a)this.a.get(i2);
                switch (a2.a) {
                    default: {
                        StringBuilder stringBuilder = d.a.b.a.a.d((String)"cmd=");
                        stringBuilder.append(a2.a);
                        string2 = stringBuilder.toString();
                        break;
                    }
                    case 10: {
                        string2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    }
                    case 9: {
                        string2 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string2 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string2 = "ATTACH";
                        break;
                    }
                    case 6: {
                        string2 = "DETACH";
                        break;
                    }
                    case 5: {
                        string2 = "SHOW";
                        break;
                    }
                    case 4: {
                        string2 = "HIDE";
                        break;
                    }
                    case 3: {
                        string2 = "REMOVE";
                        break;
                    }
                    case 2: {
                        string2 = "REPLACE";
                        break;
                    }
                    case 1: {
                        string2 = "ADD";
                        break;
                    }
                    case 0: {
                        string2 = "NULL";
                    }
                }
                printWriter.print(string);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(string2);
                printWriter.print(" ");
                printWriter.println((Object)a2.b);
                if (!bl) continue;
                if (a2.c != 0 || a2.d != 0) {
                    printWriter.print(string);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString((int)a2.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString((int)a2.d));
                }
                if (a2.e == 0 && a2.f == 0) continue;
                printWriter.print(string);
                printWriter.print("popEnterAnim=#");
                printWriter.print(Integer.toHexString((int)a2.e));
                printWriter.print(" popExitAnim=#");
                printWriter.println(Integer.toHexString((int)a2.f));
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void h() {
        var1_1 = this.a.size();
        var2_2 = 0;
        while (var2_2 < var1_1) {
            block14 : {
                var3_3 = (i0.a)this.a.get(var2_2);
                var4_4 = var3_3.b;
                if (var4_4 != null) {
                    var8_6 = this.f;
                    if (var4_4.M != null || var8_6 != 0) {
                        var4_4.f();
                        var4_4.M.d = var8_6;
                    }
                    var10_7 = this.m;
                    var11_8 = this.n;
                    var4_4.f();
                    var13_9 = var4_4.M;
                    var13_9.e = var10_7;
                    var13_9.f = var11_8;
                }
                switch (var3_3.a) {
                    default: {
                        var6_10 = d.a.b.a.a.d((String)"Unknown cmd: ");
                        var6_10.append(var3_3.a);
                        throw new IllegalArgumentException(var6_10.toString());
                    }
                    case 10: {
                        this.p.d0(var4_4, var3_3.h);
                        break block14;
                    }
                    case 9: {
                        var5_5 = this.p;
                        var4_4 = null;
                        ** GOTO lbl31
                    }
                    case 8: {
                        var5_5 = this.p;
lbl31: // 2 sources:
                        var5_5.e0(var4_4);
                        break block14;
                    }
                    case 7: {
                        var4_4.r0(var3_3.c);
                        this.p.c0(var4_4, false);
                        this.p.c(var4_4);
                        break block14;
                    }
                    case 6: {
                        var4_4.r0(var3_3.d);
                        this.p.j(var4_4);
                        break block14;
                    }
                    case 5: {
                        var4_4.r0(var3_3.c);
                        this.p.c0(var4_4, false);
                        this.p.g0(var4_4);
                        break block14;
                    }
                    case 4: {
                        var4_4.r0(var3_3.d);
                        this.p.M(var4_4);
                        break block14;
                    }
                    case 3: {
                        var4_4.r0(var3_3.d);
                        this.p.X(var4_4);
                        break block14;
                    }
                    case 1: 
                }
                var4_4.r0(var3_3.c);
                this.p.c0(var4_4, false);
                this.p.a(var4_4);
            }
            ++var2_2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void i(boolean var1_1) {
        var2_2 = this.a.size() - 1;
        while (var2_2 >= 0) {
            block15 : {
                var3_3 = (i0.a)this.a.get(var2_2);
                var4_4 = var3_3.b;
                if (var4_4 != null) {
                    var8_6 = this.f;
                    var9_7 = 8194;
                    if (var8_6 != 4097) {
                        var9_7 = var8_6 != 4099 ? (var8_6 != var9_7 ? 0 : 4097) : 4099;
                    }
                    if (var4_4.M != null || var9_7 != 0) {
                        var4_4.f();
                        var4_4.M.d = var9_7;
                    }
                    var11_8 = this.n;
                    var12_9 = this.m;
                    var4_4.f();
                    var14_10 = var4_4.M;
                    var14_10.e = var11_8;
                    var14_10.f = var12_9;
                }
                switch (var3_3.a) {
                    default: {
                        var6_11 = d.a.b.a.a.d((String)"Unknown cmd: ");
                        var6_11.append(var3_3.a);
                        throw new IllegalArgumentException(var6_11.toString());
                    }
                    case 10: {
                        this.p.d0(var4_4, var3_3.g);
                        break block15;
                    }
                    case 9: {
                        var5_5 = this.p;
                        ** GOTO lbl33
                    }
                    case 8: {
                        var5_5 = this.p;
                        var4_4 = null;
lbl33: // 2 sources:
                        var5_5.e0(var4_4);
                        break block15;
                    }
                    case 7: {
                        var4_4.r0(var3_3.f);
                        this.p.c0(var4_4, true);
                        this.p.j(var4_4);
                        break block15;
                    }
                    case 6: {
                        var4_4.r0(var3_3.e);
                        this.p.c(var4_4);
                        break block15;
                    }
                    case 5: {
                        var4_4.r0(var3_3.f);
                        this.p.c0(var4_4, true);
                        this.p.M(var4_4);
                        break block15;
                    }
                    case 4: {
                        var4_4.r0(var3_3.e);
                        this.p.g0(var4_4);
                        break block15;
                    }
                    case 3: {
                        var4_4.r0(var3_3.e);
                        this.p.a(var4_4);
                        break block15;
                    }
                    case 1: 
                }
                var4_4.r0(var3_3.f);
                this.p.c0(var4_4, true);
                this.p.X(var4_4);
            }
            --var2_2;
        }
    }

    public boolean j(int n2) {
        int n3 = this.a.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            m m2 = ((i0.a)this.a.get((int)i2)).b;
            int n4 = m2 != null ? m2.A : 0;
            if (n4 == 0 || n4 != n2) continue;
            return true;
        }
        return false;
    }

    public boolean k(ArrayList<a> arrayList, int n2, int n3) {
        if (n3 == n2) {
            return false;
        }
        int n4 = this.a.size();
        int n5 = -1;
        for (int i2 = 0; i2 < n4; ++i2) {
            m m2 = ((i0.a)this.a.get((int)i2)).b;
            int n6 = m2 != null ? m2.A : 0;
            if (n6 == 0 || n6 == n5) continue;
            for (int i3 = n2; i3 < n3; ++i3) {
                a a2 = arrayList.get(i3);
                int n7 = a2.a.size();
                for (int i4 = 0; i4 < n7; ++i4) {
                    m m3 = ((i0.a)a2.a.get((int)i4)).b;
                    int n8 = m3 != null ? m3.A : 0;
                    if (n8 != n6) continue;
                    return true;
                }
            }
            n5 = n6;
        }
        return false;
    }

    public i0 l(m m2) {
        a0 a02 = m2.v;
        if (a02 != null && a02 != this.p) {
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            stringBuilder.append(m2.toString());
            stringBuilder.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.b(new i0.a(3, m2));
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.r >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.r);
        }
        if (this.h != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.h);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

