/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlarmManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.util.Base64
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver
 *  d.b.g0.a
 *  d.c.a.b.d
 *  d.c.a.b.j.i
 *  d.c.a.b.j.t.h.g
 *  d.c.a.b.j.t.h.s
 *  d.c.a.b.j.t.i.c
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.a.b.j.t.h;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import d.c.a.b.d;
import d.c.a.b.j.i;
import d.c.a.b.j.t.h.g;
import d.c.a.b.j.t.h.s;
import d.c.a.b.j.t.i.c;

public class a
implements s {
    public final Context a;
    public final c b;
    public AlarmManager c;
    public final g d;
    public final d.c.a.b.j.v.a e;

    public a(Context context, c c2, d.c.a.b.j.v.a a2, g g2) {
        AlarmManager alarmManager = (AlarmManager)context.getSystemService("alarm");
        this.a = context;
        this.b = c2;
        this.c = alarmManager;
        this.e = a2;
        this.d = g2;
    }

    public void a(i i2, int n2) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", i2.b());
        builder.appendQueryParameter("priority", String.valueOf(d.c.a.b.j.w.a.a(i2.d())));
        if (i2.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString((byte[])i2.c(), 0));
        }
        Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", n2);
        boolean bl = PendingIntent.getBroadcast(this.a, 0, intent, 536870912) != null;
        if (bl) {
            d.b.g0.a.a((String)"AlarmManagerScheduler", (String)"Upload for context %s is already scheduled. Returning...", (Object)i2);
            return;
        }
        long l2 = this.b.r(i2);
        long l3 = this.d.b(i2.d(), l2, n2);
        Object[] arrobject = new Object[]{i2, l3, l2, n2};
        d.b.g0.a.b((String)"AlarmManagerScheduler", (String)"Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", (Object[])arrobject);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(this.a, 0, intent, 0);
        this.c.set(3, l3 + this.e.a(), pendingIntent);
    }
}

