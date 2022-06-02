/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.text.TextUtils
 *  android.webkit.CookieSyncManager
 *  c.k.b.n
 *  d.a.b.a.a
 *  d.b.a
 *  d.b.d0
 *  d.b.e
 *  d.b.g
 *  d.b.j
 *  d.b.j0.w
 *  d.b.j0.y
 *  d.b.k
 *  d.b.k0.b
 *  d.b.k0.o
 *  d.b.k0.o$d
 *  d.b.k0.o$e
 *  d.b.k0.t
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Collection
 *  java.util.Locale
 *  java.util.Set
 */
package d.b.k0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import c.k.b.n;
import d.b.a;
import d.b.d0;
import d.b.e;
import d.b.g;
import d.b.i;
import d.b.j;
import d.b.j0.w;
import d.b.j0.y;
import d.b.k;
import d.b.k0.b;
import d.b.k0.o;
import d.b.k0.t;
import d.b.m;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;

public abstract class v
extends t {
    public String g;

    public v(Parcel parcel) {
        super(parcel);
    }

    public v(o o2) {
        super(o2);
    }

    public Bundle u(o.d d2) {
        Bundle bundle = new Bundle();
        Set set = d2.f;
        boolean bl = set == null || set.size() == 0;
        if (!bl) {
            String string = TextUtils.join(",", (Iterable)d2.f);
            bundle.putString("scope", string);
            this.a("scope", (Object)string);
        }
        bundle.putString("default_audience", d2.g.e);
        bundle.putString("state", this.d(d2.i));
        a a2 = a.b();
        String string = a2 != null ? a2.i : null;
        String string2 = "1";
        if (string != null && string.equals((Object)this.f.e().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            bundle.putString("access_token", string);
            this.a("access_token", (Object)string2);
        } else {
            n n2 = this.f.e();
            w.d((Context)n2, (String)"facebook.com");
            w.d((Context)n2, (String)".facebook.com");
            w.d((Context)n2, (String)"https://facebook.com");
            w.d((Context)n2, (String)"https://.facebook.com");
            this.a("access_token", (Object)"0");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (!d0.c()) {
            string2 = "0";
        }
        bundle.putString("ies", string2);
        return bundle;
    }

    public String v() {
        StringBuilder stringBuilder = d.a.b.a.a.d((String)"fb");
        y.e();
        return d.a.b.a.a.o((StringBuilder)stringBuilder, (String)k.c, (String)"://authorize");
    }

    public abstract e w();

    public void x(o.d d2, Bundle bundle, g g2) {
        o.e e2;
        this.g = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.g = bundle.getString("e2e");
            }
            try {
                a a2 = t.c((Collection)d2.f, (Bundle)bundle, (e)this.w(), (String)d2.h);
                e2 = o.e.d((o.d)this.f.k, (a)a2);
                CookieSyncManager.createInstance((Context)this.f.e()).sync();
                String string = a2.i;
                this.f.e().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", string).apply();
            }
            catch (g g3) {
                e2 = o.e.b((o.d)this.f.k, null, (String)g3.getMessage());
            }
        } else if (g2 instanceof i) {
            e2 = o.e.a((o.d)this.f.k, (String)"User canceled log in.");
        } else {
            String string;
            this.g = null;
            String string2 = g2.getMessage();
            if (g2 instanceof m) {
                j j2 = ((m)g2).e;
                Locale locale = Locale.ROOT;
                Object[] arrobject = new Object[]{j2.g};
                string = String.format(locale, "%d", arrobject);
                string2 = j2.toString();
            } else {
                string = null;
            }
            e2 = o.e.c((o.d)this.f.k, null, (String)string2, string);
        }
        if (!w.y((String)this.g)) {
            this.f(this.g);
        }
        this.f.d(e2);
    }
}

