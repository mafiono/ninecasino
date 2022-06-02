/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.job.JobInfo
 *  android.app.job.JobInfo$Builder
 *  android.app.job.JobScheduler
 *  android.content.ComponentName
 *  android.content.Context
 *  android.os.PersistableBundle
 *  android.util.Base64
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService
 *  d.b.g0.a
 *  d.c.a.b.d
 *  d.c.a.b.j.i
 *  d.c.a.b.j.t.h.g
 *  d.c.a.b.j.t.h.g$a
 *  d.c.a.b.j.t.h.g$b
 *  d.c.a.b.j.t.h.s
 *  d.c.a.b.j.t.i.c
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.charset.Charset
 *  java.util.List
 *  java.util.Map
 *  java.util.Set
 *  java.util.zip.Adler32
 */
package d.c.a.b.j.t.h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import d.b.g0.a;
import d.c.a.b.d;
import d.c.a.b.j.i;
import d.c.a.b.j.t.h.g;
import d.c.a.b.j.t.h.s;
import d.c.a.b.j.t.i.c;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.Adler32;

public class e
implements s {
    public final Context a;
    public final c b;
    public final g c;

    public e(Context context, c c2, g g2) {
        this.a = context;
        this.b = c2;
        this.c = g2;
    }

    public void a(i i2, int n2) {
        int n3;
        boolean bl;
        boolean bl2;
        ComponentName componentName;
        JobScheduler jobScheduler;
        block8 : {
            componentName = new ComponentName(this.a, JobInfoSchedulerService.class);
            jobScheduler = (JobScheduler)this.a.getSystemService("jobscheduler");
            Adler32 adler32 = new Adler32();
            adler32.update(this.a.getPackageName().getBytes(Charset.forName("UTF-8")));
            adler32.update(i2.b().getBytes(Charset.forName("UTF-8")));
            adler32.update(ByteBuffer.allocate(4).putInt(d.c.a.b.j.w.a.a(i2.d())).array());
            if (i2.c() != null) {
                adler32.update(i2.c());
            }
            n3 = (int)adler32.getValue();
            for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                int n4 = jobInfo.getExtras().getInt("attemptNumber");
                if (jobInfo.getId() != n3) continue;
                if (n4 < n2) break;
                bl = true;
                break block8;
            }
            bl = false;
        }
        if (bl) {
            a.a((String)"JobInfoScheduler", (String)"Upload for context %s is already scheduled. Returning...", (Object)i2);
            return;
        }
        long l2 = this.b.r(i2);
        g g2 = this.c;
        JobInfo.Builder builder = new JobInfo.Builder(n3, componentName);
        d d2 = i2.d();
        builder.setMinimumLatency(g2.b(d2, l2, n2));
        Set set = ((g.a)g2.c().get((Object)d2)).c();
        if (set.contains((Object)g.b.e)) {
            builder.setRequiredNetworkType(2);
            bl2 = true;
        } else {
            bl2 = true;
            builder.setRequiredNetworkType((int)bl2);
        }
        if (set.contains((Object)g.b.g)) {
            builder.setRequiresCharging(bl2);
        }
        if (set.contains((Object)g.b.f)) {
            builder.setRequiresDeviceIdle(bl2);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", n2);
        persistableBundle.putString("backendName", i2.b());
        persistableBundle.putInt("priority", d.c.a.b.j.w.a.a(i2.d()));
        if (i2.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString((byte[])i2.c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] arrobject = new Object[]{i2, n3, this.c.b(i2.d(), l2, n2), l2, n2};
        a.b((String)"JobInfoScheduler", (String)"Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", (Object[])arrobject);
        jobScheduler.schedule(builder.build());
    }
}

