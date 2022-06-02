/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.e.a
 *  h.r
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package d.c.b.m.e.q.d;

import android.util.Log;
import d.c.b.m.e.k.a;
import d.c.b.m.e.n.d;
import d.c.b.m.e.q.d.b;
import h.r;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class c
extends a
implements b {
    public final String f;

    public c(String string, String string2, d.c.b.m.e.n.c c3, String string3) {
        super(string, string2, c3, d.c.b.m.e.n.a.f);
        this.f = string3;
    }

    @Override
    public boolean a(d.c.b.m.e.q.c.a a2, boolean bl) {
        RuntimeException runtimeException;
        d.c.b.m.e.b b3 = d.c.b.m.e.b.a;
        if (bl) {
            d.c.b.m.e.n.b b4 = this.b();
            String string = a2.b;
            b4.d.put((Object)"X-CRASHLYTICS-GOOGLE-APP-ID", (Object)string);
            b4.d.put((Object)"X-CRASHLYTICS-API-CLIENT-TYPE", (Object)"android");
            String string2 = this.f;
            b4.d.put((Object)"X-CRASHLYTICS-API-CLIENT-VERSION", (Object)string2);
            for (Map.Entry entry : a2.c.a().entrySet()) {
                String string3 = (String)entry.getKey();
                String string4 = (String)entry.getValue();
                b4.d.put((Object)string3, (Object)string4);
            }
            d.c.b.m.e.q.c.c c3 = a2.c;
            b4.b("report[identifier]", c3.d());
            if (c3.b().length == 1) {
                StringBuilder stringBuilder = d.a.b.a.a.d((String)"Adding single file ");
                stringBuilder.append(c3.c());
                stringBuilder.append(" to report ");
                stringBuilder.append(c3.d());
                b3.b(stringBuilder.toString());
                b4.c("report[file]", c3.c(), "application/octet-stream", c3.f());
            } else {
                File[] arrfile = c3.b();
                int n2 = arrfile.length;
                int n3 = 0;
                for (int i2 = 0; i2 < n2; ++i2) {
                    File file = arrfile[i2];
                    StringBuilder stringBuilder = d.a.b.a.a.d((String)"Adding file ");
                    stringBuilder.append(file.getName());
                    stringBuilder.append(" to report ");
                    stringBuilder.append(c3.d());
                    b3.b(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("report[file");
                    stringBuilder2.append(n3);
                    stringBuilder2.append("]");
                    b4.c(stringBuilder2.toString(), file.getName(), "application/octet-stream", file);
                    ++n3;
                }
            }
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Sending report to: ");
            stringBuilder.append(this.a);
            b3.b(stringBuilder.toString());
            try {
                d d3 = b4.a();
                int n4 = d3.a;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("Create report request ID: ");
                stringBuilder3.append(d3.c.c("X-REQUEST-ID"));
                b3.b(stringBuilder3.toString());
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("Result was: ");
                stringBuilder4.append(n4);
                b3.b(stringBuilder4.toString());
                int n5 = d.c.a.e.a.d0((int)n4);
                return n5 == 0;
            }
            catch (IOException iOException) {
                if (b3.a(6)) {
                    Log.e("FirebaseCrashlytics", "Create report HTTP request failed.", iOException);
                }
                throw new RuntimeException(iOException);
            }
        }
        runtimeException = new RuntimeException("An invalid data collection token was used.");
        throw runtimeException;
    }
}

