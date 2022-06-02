/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  d.c.b.l.k
 *  d.c.b.o.i.d
 *  d.c.b.o.i.e
 *  d.c.b.w.n$a
 *  d.c.b.w.n$c
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 */
package d.c.b.w;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import d.c.b.c;
import d.c.b.l.k;
import d.c.b.o.a;
import d.c.b.o.i.d;
import d.c.b.o.i.e;
import d.c.b.w.n;
import d.c.b.w.s;
import java.util.Map;

/*
 * Exception performing whole class analysis.
 */
public class r {
    public static final a a;

    public static {
        e e2 = new e();
        n.c c2 = new /* Unavailable Anonymous Inner Class!! */;
        e2.a.put(n.b.class, (Object)c2);
        e2.b.remove(n.b.class);
        n.a a2 = new /* Unavailable Anonymous Inner Class!! */;
        e2.a.put(n.class, (Object)a2);
        e2.b.remove(n.class);
        a = new d(e2);
    }

    public static String a(Intent intent) {
        String string = intent.getStringExtra("from");
        if (string != null && string.startsWith("/topics/")) {
            return string;
        }
        return null;
    }

    public static void b(String string, Intent intent) {
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        Bundle bundle = new Bundle();
        String string8 = intent.getStringExtra("google.c.a.c_id");
        if (string8 != null) {
            bundle.putString("_nmid", string8);
        }
        if ((string3 = intent.getStringExtra("google.c.a.c_l")) != null) {
            bundle.putString("_nmn", string3);
        }
        if (!TextUtils.isEmpty(string7 = intent.getStringExtra("google.c.a.m_l"))) {
            bundle.putString("label", string7);
        }
        if (!TextUtils.isEmpty(string2 = intent.getStringExtra("google.c.a.m_c"))) {
            bundle.putString("message_channel", string2);
        }
        if ((string5 = r.a(intent)) != null) {
            bundle.putString("_nt", string5);
        }
        if ((string6 = intent.getStringExtra("google.c.a.ts")) != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(string6));
            }
            catch (NumberFormatException numberFormatException) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", numberFormatException);
            }
        }
        if ((string4 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null) != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(string4));
            }
            catch (NumberFormatException numberFormatException) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", numberFormatException);
            }
        }
        String string9 = intent.getExtras() != null && s.f(intent.getExtras()) ? "display" : "data";
        if ("_nr".equals(string) || "_nf".equals(string)) {
            bundle.putString("_nmc", string9);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String string10 = String.valueOf(bundle);
            StringBuilder stringBuilder = new StringBuilder(37 + string.length() + string10.length());
            stringBuilder.append("Logging to scion event=");
            stringBuilder.append(string);
            stringBuilder.append(" scionPayload=");
            stringBuilder.append(string10);
            Log.d("FirebaseMessaging", stringBuilder.toString());
        }
        c c2 = c.b();
        c2.a();
        d.c.b.k.a.a a2 = (d.c.b.k.a.a)c2.d.a(d.c.b.k.a.a.class);
        if (a2 != null) {
            a2.f("fcm", string, bundle);
            return;
        }
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }

    public static boolean c(Intent intent) {
        if (intent != null && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return "1".equals(intent.getStringExtra("google.c.a.e"));
        }
        return false;
    }
}

