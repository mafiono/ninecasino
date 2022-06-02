/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.os.RemoteException
 *  com.android.installreferrer.api.InstallReferrerClient
 *  com.android.installreferrer.api.InstallReferrerStateListener
 *  com.android.installreferrer.api.ReferrerDetails
 *  d.b.e0.n
 *  d.b.j0.d0.i.a
 *  d.b.j0.o
 *  d.b.j0.o$a
 *  d.b.j0.y
 *  d.b.k
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Objects
 */
package d.b.j0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import d.b.e0.m;
import d.b.j0.d0.i.a;
import d.b.j0.o;
import d.b.j0.y;
import d.b.k;
import java.util.Objects;

public final class n
implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient a;
    public final /* synthetic */ o.a b;

    public n(InstallReferrerClient installReferrerClient, o.a a2) {
        this.a = installReferrerClient;
        this.b = a2;
    }

    public void onInstallReferrerServiceDisconnected() {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void onInstallReferrerSetupFinished(int var1_1) {
        block10 : {
            if (a.b((Object)this)) {
                return;
            }
            if (var1_1 == 0) ** GOTO lbl-1000
            if (var1_1 != 2) {
                return;
            }
            ** GOTO lbl30
lbl-1000: // 1 sources:
            {
                block11 : {
                    ** try [egrp 1[TRYBLOCK] [1 : 22->31)] { 
lbl8: // 1 sources:
                    var4_2 = this.a.getInstallReferrer();
                    var5_3 = var4_2.getInstallReferrer();
                    if (var5_3 == null || !var5_3.contains((CharSequence)"fb") && !var5_3.contains((CharSequence)"facebook")) break block11;
                    Objects.requireNonNull((Object)((m)this.b));
                    var7_4 = a.b(d.b.e0.n.class);
                    if (!var7_4) break block10;
                    ** GOTO lbl30
                }
lbl16: // 2 sources:
                do {
                    o.a();
                    return;
                    break;
                } while (true);
            }
        }
        try {
            y.e();
            k.i.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("install_referrer", var5_3).apply();
            ** GOTO lbl30
        }
        catch (Throwable var8_5) {
            try {
                a.a((Throwable)var8_5, d.b.e0.n.class);
            }
lbl27: // 2 sources:
            catch (Throwable var3_6) {
                a.a((Throwable)var3_6, (Object)this);
                return;
            }
lbl30: // 4 sources:
            ** try [egrp 0[TRYBLOCK] [0 : 18->81)] { 
lbl31: // 1 sources:
            ** continue;
        }
lbl32: // 1 sources:
        catch (RemoteException v0) {}
    }
}

