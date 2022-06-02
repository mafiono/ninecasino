/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.c.a.d.j.g
 *  d.c.a.d.j.h
 *  d.c.a.d.j.i
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Void
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package d.c.b.m.e.k;

import d.c.a.d.b.a;
import d.c.a.d.j.g;
import d.c.a.d.j.h;
import d.c.a.d.j.i;
import d.c.b.m.e.b;
import d.c.b.m.e.k.c0;
import d.c.b.m.e.k.d;
import d.c.b.m.e.k.d0;
import d.c.b.m.e.k.n0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.k.x0;
import d.c.b.m.e.q.b;
import d.c.b.m.e.q.c.c;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;

public class b0
implements g<d.c.b.m.e.s.i.b, Void> {
    public final /* synthetic */ List a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Executor c;
    public final /* synthetic */ c0 d;

    public b0(c0 c02, List list, boolean bl, Executor executor) {
        this.d = c02;
        this.a = list;
        this.b = bl;
        this.c = executor;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public h a(Object object) {
        d.c.b.m.e.s.i.b b3 = (d.c.b.m.e.s.i.b)object;
        b b4 = b.a;
        if (b3 == null) {
            b4.f("Received null app settings, cannot send reports during app startup.");
            return a.l(null);
        }
        for (c c3 : this.a) {
            if (c3.e() != c.a.e) continue;
            t.c(b3.e, c3.f());
        }
        t.b(this.d.b.c);
        d.c.b.m.e.q.b b6 = ((d0)this.d.b.c.j).a(b3);
        List list = this.a;
        boolean bl = this.b;
        float f2 = this.d.b.b;
        d.c.b.m.e.q.b b7 = b6;
        // MONITORENTER : b7
        if (b6.g != null) {
            b4.b("Report upload has already been started.");
        } else {
            Thread thread;
            b6.g = thread = new Thread(new d(b6, (List<c>)list, bl, f2){
                public final List<c> e;
                public final boolean f;
                public final float g;
                public final /* synthetic */ d.c.b.m.e.q.b h;
                {
                    this.h = b3;
                    this.e = list;
                    this.f = bl;
                    this.g = f2;
                }

                public void a() {
                    block2 : {
                        try {
                            this.b(this.e, this.f);
                        }
                        catch (Exception exception) {
                            if (!b.a.a(6)) break block2;
                            android.util.Log.e("FirebaseCrashlytics", "An unexpected error occurred while attempting to upload crash reports.", exception);
                        }
                    }
                    this.h.g = null;
                }

                /*
                 * Loose catch block
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Lifted jumps to return sites
                 */
                public final void b(List<c> arrayList, boolean bl) {
                    b b3 = b.a;
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Starting report processing in ");
                    stringBuilder.append(this.g);
                    stringBuilder.append(" second(s)...");
                    b3.b(stringBuilder.toString());
                    float f2 = this.g;
                    if (f2 > 0.0f) {
                        long l4 = (long)(f2 * 1000.0f);
                        Thread.sleep(l4);
                    }
                    if ((this.h.f).a.p()) {
                        return;
                    }
                    int n2 = 0;
                    while (arrayList.size() > 0) {
                        java.util.ArrayList arrayList2;
                        block9 : {
                            if ((this.h.f).a.p()) {
                                return;
                            }
                            StringBuilder stringBuilder2 = d.a.b.a.a.d((String)"Attempting to send ");
                            stringBuilder2.append(arrayList.size());
                            stringBuilder2.append(" report(s)");
                            b3.b(stringBuilder2.toString());
                            arrayList2 = new java.util.ArrayList();
                            for (c c3 : arrayList) {
                                if (this.h.a(c3, bl)) continue;
                                arrayList2.add(c3);
                            }
                            if (arrayList2.size() > 0) {
                                short[] arrs = d.c.b.m.e.q.b.h;
                                int n3 = n2 + 1;
                                long l5 = arrs[Math.min(n2, -1 + arrs.length)];
                                StringBuilder stringBuilder3 = new StringBuilder();
                                stringBuilder3.append("Report submission: scheduling delayed retry in ");
                                stringBuilder3.append(l5);
                                stringBuilder3.append(" seconds");
                                b3.b(stringBuilder3.toString());
                                long l6 = l5 * 1000L;
                                Thread.sleep(l6);
                                n2 = n3;
                            }
                            break block9;
                            catch (java.lang.InterruptedException interruptedException) {
                                Thread.currentThread().interrupt();
                                return;
                            }
                        }
                        arrayList = arrayList2;
                    }
                }
            }, "Crashlytics Report Uploader");
            thread.start();
        }
        // MONITOREXIT : b7
        this.d.b.c.s.a(this.c, n0.g(b3));
        this.d.b.c.w.b(null);
        return a.l(null);
    }
}

