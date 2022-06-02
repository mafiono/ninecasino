/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  d.a.b.a.a
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.nio.charset.Charset
 *  java.util.Locale
 */
package d.c.b.m.e.l;

import android.util.Log;
import d.c.b.m.e.b;
import d.c.b.m.e.k.g;
import d.c.b.m.e.l.c;
import d.c.b.m.e.l.d;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

public class e
implements d.c.b.m.e.l.a {
    public static final Charset d = Charset.forName("UTF-8");
    public final File a;
    public final int b;
    public c c;

    public e(File file, int n2) {
        this.a = file;
        this.b = n2;
    }

    @Override
    public void a() {
        g.c(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }

    @Override
    public void b() {
        g.c(this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
        this.a.delete();
    }

    @Override
    public String c() {
        byte[] arrby = this.e();
        if (arrby != null) {
            return new String(arrby, d);
        }
        return null;
    }

    @Override
    public void d(long l4, String string) {
        block6 : {
            this.f();
            if (this.c == null) {
                return;
            }
            if (string == null) {
                string = "null";
            }
            try {
                int n2 = this.b / 4;
                if (string.length() > n2) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("...");
                    stringBuilder.append(string.substring(string.length() - n2));
                    string = stringBuilder.toString();
                }
                String string2 = string.replaceAll("\r", " ").replaceAll("\n", " ");
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{l4, string2};
                byte[] arrby = String.format(locale, "%d %s%n", arrobject).getBytes(d);
                this.c.e(arrby);
                while (!this.c.u() && this.c.S() > this.b) {
                    this.c.F();
                }
            }
            catch (IOException iOException) {
                if (!b.a.a(6)) break block6;
                Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", iOException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] e() {
        int[] arrn;
        byte[] arrby;
        block4 : {
            if (!this.a.exists()) return null;
            this.f();
            c c3 = this.c;
            if (c3 == null) {
                return null;
            }
            arrn = new int[]{0};
            arrby = new byte[c3.S()];
            try {
                this.c.s(new d(this, arrby, arrn));
            }
            catch (IOException iOException) {
                if (!b.a.a(6)) break block4;
                Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", iOException);
            }
        }
        Object object = new Object(this, arrby, arrn[0]){
            public final byte[] a;
            public final int b;
            {
                this.a = arrby;
                this.b = n2;
            }
        };
        if (object == null) {
            return null;
        }
        int n2 = object.b;
        byte[] arrby2 = new byte[n2];
        System.arraycopy((Object)object.a, 0, arrby2, 0, n2);
        return arrby2;
    }

    public final void f() {
        if (this.c == null) {
            try {
                this.c = new c(this.a);
                return;
            }
            catch (IOException iOException) {
                b b3 = b.a;
                StringBuilder stringBuilder = d.a.b.a.a.d((String)"Could not open log file: ");
                stringBuilder.append(this.a);
                b3.e(stringBuilder.toString(), iOException);
            }
        }
    }

}

