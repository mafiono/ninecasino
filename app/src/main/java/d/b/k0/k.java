/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  d.b.a
 *  d.b.e
 *  d.b.j0.s
 *  d.b.j0.s$b
 *  d.b.j0.w
 *  d.b.k0.k$b
 *  d.b.k0.o
 *  d.b.k0.o$d
 *  d.b.k0.o$e
 *  d.b.k0.t
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.Map
 */
package d.b.k0;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d.b.e;
import d.b.j0.s;
import d.b.j0.w;
import d.b.k0.j;
import d.b.k0.k;
import d.b.k0.o;
import d.b.k0.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class k
extends t {
    public static final Parcelable.Creator<k> CREATOR = new b();
    public j g;

    public k(Parcel parcel) {
        super(parcel);
    }

    public k(o o2) {
        super(o2);
    }

    public void b() {
        j j2 = this.g;
        if (j2 != null) {
            j2.d = false;
            j2.c = null;
            this.g = null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return "get_token";
    }

    /*
     * Exception decompiling
     */
    public int t(o.d var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 7[DOLOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
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

    public void u(o.d d2, Bundle bundle) {
        d.b.a a2;
        e e2 = e.i;
        String string = d2.h;
        Date date = w.k((Bundle)bundle, (String)"com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", (Date)new Date(0L));
        ArrayList arrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date date2 = w.k((Bundle)bundle, (String)"com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", (Date)new Date(0L));
        if (w.y((String)string2)) {
            a2 = null;
        } else {
            d.b.a a3;
            String string3 = bundle.getString("com.facebook.platform.extra.USER_ID");
            String string4 = bundle.getString("graph_domain");
            a2 = a3 = new d.b.a(string2, string, string3, (Collection)arrayList, null, null, e2, date, new Date(), date2, string4);
        }
        o.e e3 = o.e.d((o.d)this.f.k, a2);
        this.f.d(e3);
    }

    public void writeToParcel(Parcel parcel, int n2) {
        w.L((Parcel)parcel, (Map)this.e);
    }

}

