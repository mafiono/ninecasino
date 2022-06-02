/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.util.Log
 *  d.c.a.d.g.e.c
 *  d.c.a.d.j.h
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.AssertionError
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.URL
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package d.c.b.w;

import android.graphics.Bitmap;
import android.util.Log;
import d.c.a.d.g.e.c;
import d.c.a.d.j.h;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class p
implements Closeable {
    public final URL e;
    public h<Bitmap> f;
    public volatile InputStream g;

    public p(URL uRL) {
        this.e = uRL;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        try {
            InputStream inputStream = this.g;
            if (inputStream == null) {
                return;
            }
            try {
                inputStream.close();
                return;
            }
            catch (IOException iOException) {
                try {
                    c.a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", (Throwable)iOException);
                    return;
                }
                catch (IOException iOException2) {
                    throw new AssertionError(iOException2);
                }
            }
        }
        catch (NullPointerException nullPointerException) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", nullPointerException);
            return;
        }
    }
}

