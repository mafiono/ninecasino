/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 *  d.a.b.a.a
 *  d.c.a.d.d.q.b
 *  d.c.a.d.d.q.c
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  javax.annotation.concurrent.GuardedBy
 */
package d.c.a.d.c;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import d.c.a.d.b.a;
import d.c.a.d.d.q.b;
import d.c.a.d.d.q.c;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

public final class t {
    public final Context a;
    @GuardedBy(value="this")
    public int b;
    @GuardedBy(value="this")
    public int c = 0;

    public t(Context context) {
        this.a = context;
    }

    public final int a() {
        t t2 = this;
        synchronized (t2) {
            block12 : {
                PackageManager packageManager;
                block11 : {
                    block10 : {
                        block9 : {
                            int n2 = this.c;
                            if (n2 == 0) break block9;
                            return n2;
                        }
                        packageManager = this.a.getPackageManager();
                        if (c.a((Context)this.a).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) break block10;
                        Log.e("Metadata", "Google Play services missing or without correct permission.");
                        return 0;
                    }
                    if (a.p()) break block11;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    List list = packageManager.queryIntentServices(intent, 0);
                    if (list == null) break block11;
                    if (list.size() <= 0) break block11;
                    this.c = 1;
                    return 1;
                }
                Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                List list = packageManager.queryBroadcastReceivers(intent, 0);
                if (list == null) break block12;
                if (list.size() <= 0) break block12;
                this.c = 2;
                return 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            this.c = a.p() ? 2 : 1;
            int n3 = this.c;
            return n3;
        }
    }

    public final PackageInfo b(String string) {
        try {
            PackageInfo packageInfo = c.a((Context)this.a).a.getPackageManager().getPackageInfo(string, 0);
            return packageInfo;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            String string2 = String.valueOf(nameNotFoundException);
            d.a.b.a.a.g((int)(23 + string2.length()), (String)"Failed to find package ", (String)string2, (String)"Metadata");
            return null;
        }
    }
}

