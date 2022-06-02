/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Looper
 *  d.c.a.d.d.f
 *  d.c.a.d.d.m.b
 *  d.c.a.d.d.m.b$a
 *  d.c.a.d.d.m.b$b
 *  d.c.a.d.d.m.f
 *  d.c.a.d.h.b.k3
 *  d.c.a.d.h.b.m3
 *  java.lang.String
 */
package d.c.a.d.h.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d.c.a.d.d.f;
import d.c.a.d.d.m.b;
import d.c.a.d.h.b.k3;
import d.c.a.d.h.b.m3;

public final class t3
extends b<k3> {
    public t3(Context context, Looper looper, b.a a2, b.b b3) {
        super(context, looper, d.c.a.d.d.m.f.a((Context)context), f.b, 93, a2, b3, null);
    }

    public final /* synthetic */ IInterface c(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (iInterface instanceof k3) {
            return iInterface;
        }
        return new m3(iBinder);
    }

    public final int g() {
        return 12451000;
    }

    public final String k() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String l() {
        return "com.google.android.gms.measurement.START";
    }
}

