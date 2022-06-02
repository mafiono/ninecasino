/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  c.r.a
 *  c.r.a$a
 *  c.r.b
 *  com.appsflyer.AppsFlyerConversionListener
 *  com.appsflyer.AppsFlyerLib
 *  com.appsflyer.attribution.AppsFlyerRequestListener
 *  d.a.a.d$a$a
 *  d.a.a.d$c
 *  d.a.a.k0
 *  d.c.a.e.a
 *  f.d
 *  f.k
 *  f.m.d
 *  f.m.f
 *  f.o.a.a
 *  f.o.a.p
 *  f.o.b.i
 *  g.a.h0
 *  g.a.s0
 *  g.a.x
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package d.a.a;

import android.app.Application;
import android.content.Context;
import c.r.a;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import d.a.a.d;
import d.a.a.k0;
import f.k;
import f.m.f;
import f.o.a.p;
import f.o.b.i;
import g.a.h0;
import g.a.s0;
import g.a.x;
import g.a.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class d
extends c.r.b {
    public static final /* synthetic */ int f;
    public final f.d e = a.a.b((f.o.a.a)new c(this));

    public final k0 a() {
        return (k0)this.e.getValue();
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        c.r.a.e((Context)this);
    }

    public final void b() {
        AppsFlyerLib.getInstance().init("m9gefbLpByMPaDK85Fnwbb", (AppsFlyerConversionListener)new a(), (Context)this);
        AppsFlyerLib.getInstance().setDebugLog(false);
        AppsFlyerLib.getInstance().start((Context)this, "m9gefbLpByMPaDK85Fnwbb", new AppsFlyerRequestListener(){

            public void onError(int n2, String string) {
                i.e((Object)string, (String)"p1");
            }

            public void onSuccess() {
            }
        });
    }

    public void onCreate() {
        Application.super.onCreate();
        this.b();
    }

    public final class d.a.a.d$a
    implements AppsFlyerConversionListener {
        public void onAppOpenAttribution(Map<String, String> map) {
            ArrayList arrayList = new ArrayList(map.size());
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) {
                (Map.Entry)iterator.next();
                arrayList.add((Object)k.a);
            }
        }

        public void onAttributionFailure(String string) {
        }

        public void onConversionDataFail(String string) {
        }

        public void onConversionDataSuccess(Map<String, Object> map) {
            d.c.a.e.a.W((z)s0.e, (f)h0.a, null, (p)new a(this, map, null), (int)2, null);
        }
    }

}

