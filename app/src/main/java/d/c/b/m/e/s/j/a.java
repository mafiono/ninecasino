/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.e.a
 *  h.r
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 */
package d.c.b.m.e.s.j;

import android.util.Log;
import d.c.b.m.e.b;
import d.c.b.m.e.k.g;
import d.c.b.m.e.n.c;
import d.c.b.m.e.n.d;
import h.r;
import java.io.IOException;
import java.util.Map;

public abstract class a
extends d.c.b.m.e.k.a {
    public final String f;

    public a(String string, String string2, c c3, d.c.b.m.e.n.a a2, String string3) {
        super(string, string2, c3, a2);
        this.f = string3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean d(d.c.b.m.e.s.i.a a2, boolean bl) {
        String string;
        d d3;
        int n2;
        b b3 = b.a;
        if (!bl) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        d.c.b.m.e.n.b b4 = this.b();
        String string2 = a2.a;
        b4.d.put((Object)"X-CRASHLYTICS-ORG-ID", (Object)string2);
        String string3 = a2.b;
        b4.d.put((Object)"X-CRASHLYTICS-GOOGLE-APP-ID", (Object)string3);
        b4.d.put((Object)"X-CRASHLYTICS-API-CLIENT-TYPE", (Object)"android");
        String string4 = this.f;
        b4.d.put((Object)"X-CRASHLYTICS-API-CLIENT-VERSION", (Object)string4);
        b4.b("org_id", a2.a);
        b4.b("app[identifier]", a2.c);
        b4.b("app[name]", a2.g);
        b4.b("app[display_version]", a2.d);
        b4.b("app[build_version]", a2.e);
        b4.b("app[source]", Integer.toString(a2.h));
        b4.b("app[minimum_sdk_version]", a2.i);
        b4.b("app[built_sdk_version]", "0");
        if (!g.r(a2.f)) {
            b4.b("app[instance_identifier]", a2.f);
        }
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"Sending app info to ");
        stringBuilder.append(this.a);
        b3.b(stringBuilder.toString());
        try {
            d3 = b4.a();
            n2 = d3.a;
            string = "POST".equalsIgnoreCase(b4.a.name()) ? "Create" : "Update";
        }
        catch (IOException iOException) {
            if (b3.a(6)) {
                Log.e("FirebaseCrashlytics", "HTTP request failed.", iOException);
            }
            throw new RuntimeException(iOException);
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string);
        stringBuilder2.append(" app request ID: ");
        stringBuilder2.append(d3.c.c("X-REQUEST-ID"));
        b3.b(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("Result was ");
        stringBuilder3.append(n2);
        b3.b(stringBuilder3.toString());
        int n3 = d.c.a.e.a.d0((int)n2);
        return n3 == 0;
    }
}

