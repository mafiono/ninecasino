/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package d.c.a.d.c;

import android.os.Bundle;
import android.util.Log;
import d.c.a.d.j.a;
import d.c.a.d.j.h;
import java.io.IOException;

public final class v
implements a {
    public static final a a = new v();

    public final Object a(h h2) {
        if (h2.n()) {
            return (Bundle)h2.j();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String string = String.valueOf((Object)h2.i());
            StringBuilder stringBuilder = new StringBuilder(22 + string.length());
            stringBuilder.append("Error making request: ");
            stringBuilder.append(string);
            Log.d("Rpc", stringBuilder.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", (Throwable)h2.i());
    }
}

