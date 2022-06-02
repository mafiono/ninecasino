/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.b.g
 *  d.b.j
 *  d.b.j0.z
 *  d.b.j0.z$f
 *  d.b.o
 *  d.b.o$c
 *  d.b.s
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.CountDownLatch
 *  org.json.JSONObject
 */
package d.b.j0;

import d.b.g;
import d.b.h;
import d.b.j;
import d.b.j0.z;
import d.b.o;
import d.b.s;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public class b0
implements o.c {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ z.f d;

    public b0(z.f f2, String[] arrstring, int n2, CountDownLatch countDownLatch) {
        this.d = f2;
        this.a = arrstring;
        this.b = n2;
        this.c = countDownLatch;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(s s2) {
        block4 : {
            String string;
            try {
                j j2 = s2.c;
                string = "Error staging photo.";
                if (j2 == null) {
                    JSONObject jSONObject = s2.b;
                    if (jSONObject == null) throw new g(string);
                    String string2 = jSONObject.optString("uri");
                    if (string2 == null) throw new g(string);
                    this.a[this.b] = string2;
                    break block4;
                }
                String string3 = j2.a();
                if (string3 == null) {
                    throw new h(s2, string);
                }
                string = string3;
            }
            catch (Exception exception) {}
            throw new h(s2, string);
            this.d.c[this.b] = exception;
        }
        this.c.countDown();
    }
}

