/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$w
 *  c.h.i.c
 *  c.s.c.a$a
 *  c.s.c.a$b
 *  c.s.c.q
 *  c.s.c.q$a
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package c.s.c;

import androidx.recyclerview.widget.RecyclerView;
import c.h.i.c;
import c.s.c.a;
import c.s.c.q;
import c.s.c.v;
import java.util.ArrayList;
import java.util.List;

/*
 * Exception performing whole class analysis.
 */
public class a
implements q.a {
    public c<b> a;
    public final ArrayList<b> b;
    public final ArrayList<b> c;
    public final a d;
    public final q e;

    public a(a a2) {
        this.a = new c(30);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = a2;
        this.e = new q((q.a)this);
    }

    public final boolean a(int n2) {
        int n3 = this.c.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4;
            b b2 = this.c.get(i2);
            int n5 = b2.a;
            if (n5 == 8) {
                if (this.f(b2.d, i2 + 1) != n2) continue;
                return true;
            }
            if (n5 != 1) continue;
            int n6 = n4 + b2.d;
            for (n4 = b2.b; n4 < n6; ++n4) {
                if (this.f(n4, i2 + 1) != n2) continue;
                return true;
            }
        }
        return false;
    }

    public void b() {
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            a a2 = this.d;
            b b2 = this.c.get(i2);
            ((v)a2).a(b2);
        }
        this.l(this.c);
    }

    public void c() {
        this.b();
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            b b2 = this.b.get(i2);
            int n3 = b2.a;
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 4) {
                        if (n3 != 8) continue;
                        ((v)this.d).a(b2);
                        a a2 = this.d;
                        int n4 = b2.b;
                        int n5 = b2.d;
                        ((v)a2).e(n4, n5);
                        continue;
                    }
                    ((v)this.d).a(b2);
                    a a3 = this.d;
                    int n6 = b2.b;
                    int n7 = b2.d;
                    Object object = b2.c;
                    ((v)a3).c(n6, n7, object);
                    continue;
                }
                ((v)this.d).a(b2);
                a a4 = this.d;
                int n8 = b2.b;
                int n9 = b2.d;
                v v2 = (v)a4;
                v2.a.R(n8, n9, true);
                RecyclerView recyclerView = v2.a;
                recyclerView.l0 = true;
                RecyclerView.w w2 = recyclerView.i0;
                w2.c = n9 + w2.c;
                continue;
            }
            ((v)this.d).a(b2);
            a a5 = this.d;
            int n10 = b2.b;
            int n11 = b2.d;
            ((v)a5).d(n10, n11);
        }
        this.l(this.b);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(b b2) {
        int n2;
        int n3;
        int n4;
        int n5 = b2.a;
        if (n5 != 1 && n5 != 8) {
            n3 = this.m(b2.b, n5);
            n4 = b2.b;
            int n6 = b2.a;
            if (n6 != 2) {
                if (n6 != 4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("op should be remove or update.");
                    stringBuilder.append((Object)b2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                n2 = 1;
            } else {
                n2 = 0;
            }
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("should not dispatch add or move for pre layout");
            throw illegalArgumentException;
        }
        int n7 = 1;
        int n8 = 1;
        do {
            if (n7 >= b2.d) {
                Object object = b2.c;
                this.k(b2);
                if (n8 <= 0) return;
                b b3 = this.h(b2.a, n3, n8, object);
                this.e(b3, n4);
                this.k(b3);
                return;
            }
            int n9 = this.m(b2.b + n2 * n7, b2.a);
            int n10 = b2.a;
            boolean bl = n10 != 2 ? n10 == 4 && n9 == n3 + 1 : n9 == n3;
            if (bl) {
                ++n8;
            } else {
                b b4 = this.h(n10, n3, n8, b2.c);
                this.e(b4, n4);
                this.k(b4);
                if (b2.a == 4) {
                    n4 += n8;
                }
                n3 = n9;
                n8 = 1;
            }
            ++n7;
        } while (true);
    }

    public void e(b b2, int n2) {
        ((v)this.d).a(b2);
        int n3 = b2.a;
        if (n3 != 2) {
            if (n3 == 4) {
                a a2 = this.d;
                int n4 = b2.d;
                Object object = b2.c;
                ((v)a2).c(n2, n4, object);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        a a3 = this.d;
        int n5 = b2.d;
        v v2 = (v)a3;
        v2.a.R(n2, n5, true);
        RecyclerView recyclerView = v2.a;
        recyclerView.l0 = true;
        RecyclerView.w w2 = recyclerView.i0;
        w2.c = n5 + w2.c;
    }

    public int f(int n2, int n3) {
        int n4 = this.c.size();
        while (n3 < n4) {
            b b2 = this.c.get(n3);
            int n5 = b2.a;
            if (n5 == 8) {
                int n6 = b2.b;
                if (n6 == n2) {
                    n2 = b2.d;
                } else {
                    if (n6 < n2) {
                        --n2;
                    }
                    if (b2.d <= n2) {
                        ++n2;
                    }
                }
            } else {
                int n7 = b2.b;
                if (n7 <= n2) {
                    if (n5 == 2) {
                        int n8 = b2.d;
                        if (n2 < n7 + n8) {
                            return -1;
                        }
                        n2 -= n8;
                    } else if (n5 == 1) {
                        n2 += b2.d;
                    }
                }
            }
            ++n3;
        }
        return n2;
    }

    public boolean g() {
        return this.b.size() > 0;
    }

    public b h(int n2, int n3, int n4, Object object) {
        b b2 = this.a.a();
        if (b2 == null) {
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        b2.a = n2;
        b2.b = n3;
        b2.d = n4;
        b2.c = object;
        return b2;
    }

    public final void i(b b2) {
        this.c.add(b2);
        int n2 = b2.a;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 == 8) {
                        a a2 = this.d;
                        int n3 = b2.b;
                        int n4 = b2.d;
                        ((v)a2).e(n3, n4);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown update op type for ");
                    stringBuilder.append((Object)b2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                a a3 = this.d;
                int n5 = b2.b;
                int n6 = b2.d;
                Object object = b2.c;
                ((v)a3).c(n5, n6, object);
                return;
            }
            a a4 = this.d;
            int n7 = b2.b;
            int n8 = b2.d;
            v v2 = (v)a4;
            v2.a.R(n7, n8, false);
            v2.a.l0 = true;
            return;
        }
        a a5 = this.d;
        int n9 = b2.b;
        int n10 = b2.d;
        ((v)a5).d(n9, n10);
    }

    /*
     * Exception decompiling
     */
    public void j() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: CONTINUE without a while class org.benf.cfr.reader.b.a.b.e.e
        // org.benf.cfr.reader.b.a.b.e.p.k(GotoStatement.java:87)
        // org.benf.cfr.reader.b.a.b.e.r.f(IfStatement.java:103)
        // org.benf.cfr.reader.b.a.a.i.z(Op03SimpleStatement.java:503)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:598)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public void k(b b2) {
        b2.c = null;
        this.a.b((Object)b2);
    }

    public void l(List<b> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.k(list.get(i2));
        }
        list.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int m(int n2, int n3) {
        for (int i2 = this.c.size() - 1; i2 >= 0; --i2) {
            int n4;
            b b2;
            int n5;
            block18 : {
                int n6;
                int n7;
                int n8;
                block19 : {
                    block26 : {
                        int n9;
                        block25 : {
                            block24 : {
                                block20 : {
                                    block23 : {
                                        int n10;
                                        block22 : {
                                            block21 : {
                                                int n11;
                                                int n12;
                                                b2 = this.c.get(i2);
                                                n4 = b2.a;
                                                if (n4 != 8) break block18;
                                                n6 = b2.b;
                                                n7 = b2.d;
                                                if (n6 < n7) {
                                                    n12 = n6;
                                                    n11 = n7;
                                                } else {
                                                    n11 = n6;
                                                    n12 = n7;
                                                }
                                                if (n2 < n12 || n2 > n11) break block19;
                                                if (n12 != n6) break block20;
                                                if (n3 != 1) break block21;
                                                n10 = n7 + 1;
                                                break block22;
                                            }
                                            if (n3 != 2) break block23;
                                            n10 = n7 - 1;
                                        }
                                        b2.d = n10;
                                    }
                                    ++n2;
                                    continue;
                                }
                                if (n3 != 1) break block24;
                                n9 = n6 + 1;
                                break block25;
                            }
                            if (n3 != 2) break block26;
                            n9 = n6 - 1;
                        }
                        b2.b = n9;
                    }
                    --n2;
                    continue;
                }
                if (n2 >= n6) continue;
                if (n3 == 1) {
                    b2.b = n6 + 1;
                    n8 = n7 + 1;
                } else {
                    if (n3 != 2) continue;
                    b2.b = n6 - 1;
                    n8 = n7 - 1;
                }
                b2.d = n8;
                continue;
            }
            int n13 = b2.b;
            if (n13 <= n2) {
                if (n4 == 1) {
                    n2 -= b2.d;
                    continue;
                }
                if (n4 != 2) continue;
                n2 += b2.d;
                continue;
            }
            if (n3 == 1) {
                n5 = n13 + 1;
            } else {
                if (n3 != 2) continue;
                n5 = n13 - 1;
            }
            b2.b = n5;
        }
        int n14 = this.c.size() - 1;
        while (n14 >= 0) {
            int n15;
            b b3 = this.c.get(n14);
            if (b3.a == 8 ? (n15 = b3.d) == b3.b || n15 < 0 : b3.d <= 0) {
                this.c.remove(n14);
                this.k(b3);
            }
            --n14;
        }
        return n2;
    }
}

