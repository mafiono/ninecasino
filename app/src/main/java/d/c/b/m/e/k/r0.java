/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.content.pm.PackageManager
 *  android.util.Log
 *  d.c.a.d.j.h
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Locale
 *  java.util.UUID
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.c.b.m.e.k;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import d.c.a.d.j.h;
import d.c.b.m.e.b;
import d.c.b.m.e.k.b1;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.s0;
import d.c.b.m.e.k.t0;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class r0
implements s0 {
    public static final Pattern f = Pattern.compile("[^\\p{Alnum}]");
    public static final String g = Pattern.quote("/");
    public final t0 a;
    public final Context b;
    public final String c;
    public final d.c.b.t.g d;
    public String e;

    public r0(Context context, String string, d.c.b.t.g g2) {
        if (string != null) {
            this.b = context;
            this.c = string;
            this.d = g2;
            this.a = new t0();
            return;
        }
        throw new IllegalArgumentException("appIdentifier must not be null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String a(String string, SharedPreferences sharedPreferences) {
        r0 r02 = this;
        synchronized (r02) {
            String string2 = UUID.randomUUID().toString();
            String string3 = string2 == null ? null : f.matcher(string2).replaceAll("").toLowerCase(Locale.US);
            b b3 = b.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Created new Crashlytics IID: ");
            stringBuilder.append(string3);
            b3.b(stringBuilder.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", string3).putString("firebase.installation.id", string).apply();
            return string3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String b() {
        b b3 = b.a;
        r0 r02 = this;
        synchronized (r02) {
            String string;
            String string2;
            SharedPreferences sharedPreferences;
            String string3;
            block13 : {
                block12 : {
                    String string4 = this.e;
                    if (string4 == null) break block12;
                    return string4;
                }
                sharedPreferences = g.n(this.b);
                h<String> h2 = this.d.d();
                string = sharedPreferences.getString("firebase.installation.id", null);
                try {
                    string3 = b1.a(h2);
                    break block13;
                }
                catch (Exception exception) {
                    if (b3.a(3)) {
                        Log.d("FirebaseCrashlytics", "Failed to retrieve installation id", exception);
                    }
                }
                string3 = string;
            }
            if (string == null) {
                SharedPreferences sharedPreferences2 = this.b.getSharedPreferences("com.crashlytics.prefs", 0);
                String string5 = sharedPreferences2.getString("crashlytics.installation.id", null);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("No cached FID; legacy id is ");
                stringBuilder.append(string5);
                b3.b(stringBuilder.toString());
                if (string5 == null) {
                    this.e = this.a(string3, sharedPreferences);
                    return this.e;
                } else {
                    this.e = string5;
                    this.d(string5, string3, sharedPreferences, sharedPreferences2);
                }
                return this.e;
            }
            if (string.equals(string3)) {
                this.e = sharedPreferences.getString("crashlytics.installation.id", null);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Found matching FID, using Crashlytics IID: ");
                stringBuilder.append(this.e);
                b3.b(stringBuilder.toString());
                if (this.e != null) return this.e;
                string2 = this.a(string3, sharedPreferences);
            } else {
                string2 = this.a(string3, sharedPreferences);
            }
            this.e = string2;
            return this.e;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String c() {
        t0 t02 = this.a;
        Context context = this.b;
        t0 t03 = t02;
        synchronized (t03) {
            if (t02.a == null) {
                String string = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                if (string == null) {
                    string = "";
                }
                t02.a = string;
            }
            if (!"".equals(t02.a)) return t02.a;
            return null;
        }
    }

    public final void d(String string, String string2, SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        r0 r02 = this;
        synchronized (r02) {
            b b3 = b.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Migrating legacy Crashlytics IID: ");
            stringBuilder.append(string);
            b3.b(stringBuilder.toString());
            sharedPreferences.edit().putString("crashlytics.installation.id", string).putString("firebase.installation.id", string2).apply();
            sharedPreferences2.edit().remove("crashlytics.installation.id").remove("crashlytics.advertising.id").apply();
            return;
        }
    }

    public final String e(String string) {
        return string.replaceAll(g, "");
    }
}

