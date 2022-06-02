/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Objects
 */
package d.c.b.m.e.q;

import android.util.Log;
import d.c.b.m.e.k.n0;
import d.c.b.m.e.q.c.c;
import java.util.Objects;

public class b {
    public static final short[] h = new short[]{10, 20, 30, 60, 120, 300};
    public final d.c.b.m.e.q.d.b a;
    public final String b;
    public final String c;
    public final n0 d;
    public final d.c.b.m.e.q.a e;
    public final a f;
    public Thread g;

    public b(String string, String string2, n0 n02, d.c.b.m.e.q.a a2, d.c.b.m.e.q.d.b b2, a a3) {
        this.a = b2;
        this.b = string;
        this.c = string2;
        this.d = n02;
        this.e = a2;
        this.f = a3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(d.c.b.m.e.q.c.c c2, boolean bl) {
        d.c.b.m.e.b b2 = d.c.b.m.e.b.a;
        try {
            boolean bl2;
            d.c.b.m.e.q.c.a a2 = new d.c.b.m.e.q.c.a(this.b, this.c, c2);
            n0 n02 = this.d;
            n0 n03 = n0.g;
            if (n02 == n03 || n02 == n0.f && c2.e() == c.a.e) {
                b2.b("Report configured to be sent via DataTransport.");
                bl2 = true;
            } else {
                bl2 = this.a.a(a2, bl);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Crashlytics Reports Endpoint upload ");
                String string = bl2 ? "complete: " : "FAILED: ";
                stringBuilder.append(string);
                stringBuilder.append(c2.d());
                String string2 = stringBuilder.toString();
                if (b2.a(4)) {
                    Log.i("FirebaseCrashlytics", string2, null);
                }
            }
            if (!bl2) return false;
            {
                Objects.requireNonNull((Object)this.e);
                c2.remove();
                return true;
            }
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error occurred sending report ");
            stringBuilder.append(c2);
            b2.e(stringBuilder.toString(), exception);
        }
        return false;
    }

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

}

