/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$BigTextStyle
 *  android.app.Notification$Builder
 *  c.h.b.i
 *  c.h.b.n
 *  java.lang.CharSequence
 */
package c.h.b;

import android.app.Notification;
import c.h.b.i;
import c.h.b.n;
import c.h.b.o;

public class l
extends n {
    public CharSequence b;

    public void a(i i2) {
        new Notification.BigTextStyle(((o)i2).a).setBigContentTitle(null).bigText(this.b);
    }
}

