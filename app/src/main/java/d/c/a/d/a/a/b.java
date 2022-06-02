/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.util.Log
 *  java.io.IOException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.Map
 *  java.util.Set
 */
package d.c.a.d.a.a;

import android.net.Uri;
import android.util.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public final class b
extends Thread {
    public final /* synthetic */ Map e;

    public b(Map map) {
        this.e = map;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void run() {
        StringBuilder stringBuilder;
        String string2;
        String string3;
        void var5_12;
        String string;
        block10 : {
            HttpURLConnection httpURLConnection;
            block8 : {
                Map map = this.e;
                Uri.Builder builder = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
                for (String string4 : map.keySet()) {
                    builder.appendQueryParameter(string4, (String)map.get(string4));
                }
                string = builder.build().toString();
                httpURLConnection = (HttpURLConnection)new URL(string).openConnection();
                int n2 = httpURLConnection.getResponseCode();
                if (n2 >= 200 && n2 < 300) break block8;
                StringBuilder stringBuilder2 = new StringBuilder(65 + String.valueOf(string).length());
                stringBuilder2.append("Received non-success response code ");
                stringBuilder2.append(n2);
                stringBuilder2.append(" from pinging URL: ");
                stringBuilder2.append(string);
                Log.w("HttpUrlPinger", stringBuilder2.toString());
                {
                    catch (Throwable throwable) {
                        httpURLConnection.disconnect();
                        throw throwable;
                    }
                }
            }
            try {
                httpURLConnection.disconnect();
                return;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            string2 = var5_12.getMessage();
            stringBuilder = new StringBuilder(27 + String.valueOf(string).length() + String.valueOf(string2).length());
            string3 = "Error while pinging URL: ";
            break block10;
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                string2 = indexOutOfBoundsException.getMessage();
                stringBuilder = new StringBuilder(32 + String.valueOf(string).length() + String.valueOf(string2).length());
                string3 = "Error while parsing ping URL: ";
            }
        }
        stringBuilder.append(string3);
        stringBuilder.append(string);
        stringBuilder.append(". ");
        stringBuilder.append(string2);
        Log.w("HttpUrlPinger", stringBuilder.toString(), (Throwable)var5_12);
    }
}

