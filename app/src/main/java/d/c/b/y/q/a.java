/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.FileOutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package d.c.b.y.q;

import android.content.Context;
import d.c.b.y.q.e;
import d.c.b.y.q.f;
import d.c.b.y.q.o;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    public final e a;
    public final f b;

    public a(e e2, f f2) {
        this.a = e2;
        this.b = f2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object call() {
        o o2;
        e e2 = this.a;
        f f2 = this.b;
        o o3 = o2 = e2.b;
        synchronized (o3) {
            FileOutputStream fileOutputStream = o2.a.openFileOutput(o2.b, 0);
            try {
                fileOutputStream.write(f2.toString().getBytes(StandardCharsets.UTF_8));
                return null;
            }
            finally {
                fileOutputStream.close();
            }
        }
    }
}

