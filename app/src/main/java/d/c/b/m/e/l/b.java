/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  d.a.b.a.a
 *  d.c.b.m.e.k.t$j
 *  d.c.b.m.e.l.b$c
 *  d.c.b.m.e.l.e
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.l;

import android.content.Context;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.t;
import d.c.b.m.e.l.b;
import d.c.b.m.e.l.e;
import java.io.File;

/*
 * Exception performing whole class analysis.
 */
public class b {
    public static final c d;
    public final Context a;
    public final b b;
    public d.c.b.m.e.l.a c;

    public static {
        d = new /* Unavailable Anonymous Inner Class!! */;
    }

    public b(Context context, b b2) {
        this.a = context;
        this.b = b2;
        this.c = d;
        this.a(null);
    }

    public final void a(String string) {
        this.c.a();
        this.c = d;
        if (string == null) {
            return;
        }
        if (!g.i(this.a, "com.crashlytics.CollectCustomLogs", true)) {
            d.c.b.m.e.b.a.b("Preferences requested no custom logs. Aborting log file creation.");
            return;
        }
        String string2 = d.a.b.a.a.n((String)"crashlytics-userlog-", (String)string, (String)".temp");
        this.c = new e(new File((this.b).a(), string2), 65536);
    }

    public interface b {
    }

}

