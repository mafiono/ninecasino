/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  d.a.b.a.a
 *  d.c.a.e.a
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 */
package d.c.b.m.e.q.d;

import d.c.b.m.e.k.a;
import d.c.b.m.e.n.c;
import d.c.b.m.e.q.d.b;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class d
extends a
implements b {
    public final String f;

    public d(String string, String string2, c c3, String string3) {
        super(string, string2, c3, d.c.b.m.e.n.a.f);
        this.f = string3;
    }

    @Override
    public boolean a(d.c.b.m.e.q.c.a a2, boolean bl) {
        RuntimeException runtimeException;
        if (bl) {
            d.c.b.m.e.n.b b3 = this.b();
            String string = a2.b;
            b3.d.put((Object)"User-Agent", (Object)"Crashlytics Android SDK/17.3.0");
            b3.d.put((Object)"X-CRASHLYTICS-API-CLIENT-TYPE", (Object)"android");
            String string2 = this.f;
            b3.d.put((Object)"X-CRASHLYTICS-API-CLIENT-VERSION", (Object)string2);
            b3.d.put((Object)"X-CRASHLYTICS-GOOGLE-APP-ID", (Object)string);
            String string3 = a2.a;
            d.c.b.m.e.q.c.c c3 = a2.c;
            if (string3 != null) {
                b3.b("org_id", string3);
            }
            b3.b("report_id", c3.d());
            for (File file : c3.b()) {
                String string4;
                String string5;
                if (file.getName().equals("minidump")) {
                    string4 = file.getName();
                    string5 = "minidump_file";
                } else if (file.getName().equals("metadata")) {
                    string4 = file.getName();
                    string5 = "crash_meta_file";
                } else if (file.getName().equals("binaryImages")) {
                    string4 = file.getName();
                    string5 = "binary_images_file";
                } else if (file.getName().equals("session")) {
                    string4 = file.getName();
                    string5 = "session_meta_file";
                } else if (file.getName().equals("app")) {
                    string4 = file.getName();
                    string5 = "app_meta_file";
                } else if (file.getName().equals("device")) {
                    string4 = file.getName();
                    string5 = "device_meta_file";
                } else if (file.getName().equals("os")) {
                    string4 = file.getName();
                    string5 = "os_meta_file";
                } else if (file.getName().equals("user")) {
                    string4 = file.getName();
                    string5 = "user_meta_file";
                } else if (file.getName().equals("logs")) {
                    string4 = file.getName();
                    string5 = "logs_file";
                } else {
                    if (!file.getName().equals("keys")) continue;
                    string4 = file.getName();
                    string5 = "keys_file";
                }
                b3.c(string5, string4, "application/octet-stream", file);
            }
            d.c.b.m.e.b b4 = d.c.b.m.e.b.a;
            StringBuilder stringBuilder = d.a.b.a.a.d((String)"Sending report to: ");
            stringBuilder.append(this.a);
            b4.b(stringBuilder.toString());
            try {
                int n2 = b3.a().a;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Result was: ");
                stringBuilder2.append(n2);
                b4.b(stringBuilder2.toString());
                int n3 = d.c.a.e.a.d0((int)n2);
                boolean bl2 = n3 == 0;
                return bl2;
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        runtimeException = new RuntimeException("An invalid data collection token was used.");
        throw runtimeException;
    }
}

