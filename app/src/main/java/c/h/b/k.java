/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.Notification$BigPictureStyle
 *  android.app.Notification$Builder
 *  android.graphics.Bitmap
 *  c.h.b.i
 *  c.h.b.n
 *  java.lang.CharSequence
 */
package c.h.b;

import android.app.Notification;
import android.graphics.Bitmap;
import c.h.b.i;
import c.h.b.n;
import c.h.b.o;

public class k
extends n {
    public Bitmap b;
    public Bitmap c;
    public boolean d;

    public void a(i i2) {
        Notification.BigPictureStyle bigPictureStyle = new Notification.BigPictureStyle(((o)i2).a).setBigContentTitle(null).bigPicture(this.b);
        if (this.d) {
            bigPictureStyle.bigLargeIcon(this.c);
        }
    }
}

