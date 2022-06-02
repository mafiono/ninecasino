/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.AdaptiveIconDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.atomic.AtomicInteger
 */
package d.c.b.w;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
    public static final AtomicInteger a = new AtomicInteger((int)SystemClock.elapsedRealtime());

    public static PendingIntent a(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, a.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), 1073741824);
    }

    @TargetApi(value=26)
    public static boolean b(Resources resources, int n2) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(n2, null) instanceof AdaptiveIconDrawable) {
                StringBuilder stringBuilder = new StringBuilder(77);
                stringBuilder.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
                stringBuilder.append(n2);
                Log.e("FirebaseMessaging", stringBuilder.toString());
                return false;
            }
            return true;
        }
        catch (Resources.NotFoundException notFoundException) {
            StringBuilder stringBuilder = new StringBuilder(66);
            stringBuilder.append("Couldn't find resource ");
            stringBuilder.append(n2);
            stringBuilder.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", stringBuilder.toString());
            return false;
        }
    }
}

