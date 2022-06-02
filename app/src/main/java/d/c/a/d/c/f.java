/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Parcelable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.a.d.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import d.c.a.d.c.a;
import java.util.Objects;

public final class f
implements Runnable {
    public final a e;
    public final Intent f;
    public final Context g;
    public final boolean h;
    public final BroadcastReceiver.PendingResult i;

    public f(a a2, Intent intent, Context context, boolean bl, BroadcastReceiver.PendingResult pendingResult) {
        this.e = a2;
        this.f = intent;
        this.g = context;
        this.h = bl;
        this.i = pendingResult;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        a a2 = this.e;
        Intent intent = this.f;
        Context context = this.g;
        boolean bl = this.h;
        BroadcastReceiver.PendingResult pendingResult = this.i;
        Objects.requireNonNull(a2);
        try {
            Parcelable parcelable = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelable instanceof Intent ? (Intent)parcelable : null;
            int n2 = intent2 != null ? a2.a(context, intent2) : a2.b(context, intent);
            if (bl) {
                pendingResult.setResultCode(n2);
            }
            return;
        }
        finally {
            pendingResult.finish();
        }
    }
}

