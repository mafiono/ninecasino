/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.text.TextUtils
 *  d.c.a.d.d.m.c0
 *  d.c.a.d.d.m.l
 *  d.c.a.d.d.m.m
 *  d.c.a.d.d.p.g
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Objects
 */
package d.c.b;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import d.c.a.d.b.a;
import d.c.a.d.d.m.c0;
import d.c.a.d.d.m.l;
import d.c.a.d.d.m.m;
import d.c.a.d.d.p.g;
import java.util.Arrays;
import java.util.Objects;

public final class i {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public i(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        m.k((boolean)(true ^ g.a((String)string)), (Object)"ApplicationId must be set.");
        this.b = string;
        this.a = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
    }

    public static i a(Context context) {
        Objects.requireNonNull((Object)context, "null reference");
        Resources resources = context.getResources();
        String string = resources.getResourcePackageName(2131624003);
        int n2 = resources.getIdentifier("google_app_id", "string", string);
        String string2 = n2 == 0 ? null : resources.getString(n2);
        if (TextUtils.isEmpty(string2)) {
            return null;
        }
        int n3 = resources.getIdentifier("google_api_key", "string", string);
        String string3 = n3 == 0 ? null : resources.getString(n3);
        int n4 = resources.getIdentifier("firebase_database_url", "string", string);
        String string4 = n4 == 0 ? null : resources.getString(n4);
        int n5 = resources.getIdentifier("ga_trackingId", "string", string);
        String string5 = n5 == 0 ? null : resources.getString(n5);
        int n6 = resources.getIdentifier("gcm_defaultSenderId", "string", string);
        String string6 = n6 == 0 ? null : resources.getString(n6);
        int n7 = resources.getIdentifier("google_storage_bucket", "string", string);
        String string7 = n7 == 0 ? null : resources.getString(n7);
        int n8 = resources.getIdentifier("project_id", "string", string);
        String string8 = n8 == 0 ? null : resources.getString(n8);
        i i2 = new i(string2, string3, string4, string5, string6, string7, string8);
        return i2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof i)) {
            return false;
        }
        i i2 = (i)object;
        boolean bl = a.j(this.b, i2.b);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = a.j(this.a, i2.a);
            bl2 = false;
            if (bl3) {
                boolean bl4 = a.j(this.c, i2.c);
                bl2 = false;
                if (bl4) {
                    boolean bl5 = a.j(this.d, i2.d);
                    bl2 = false;
                    if (bl5) {
                        boolean bl6 = a.j(this.e, i2.e);
                        bl2 = false;
                        if (bl6) {
                            boolean bl7 = a.j(this.f, i2.f);
                            bl2 = false;
                            if (bl7) {
                                boolean bl8 = a.j(this.g, i2.g);
                                bl2 = bl8;
                            }
                        }
                    }
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        Object[] arrobject = new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g};
        return Arrays.hashCode(arrobject);
    }

    public String toString() {
        l l2 = new l((Object)this, null);
        l2.a("applicationId", (Object)this.b);
        l2.a("apiKey", (Object)this.a);
        l2.a("databaseUrl", (Object)this.c);
        l2.a("gcmSenderId", (Object)this.e);
        l2.a("storageBucket", (Object)this.f);
        l2.a("projectId", (Object)this.g);
        return l2.toString();
    }
}

