/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  org.json.JSONObject
 */
package d.c.b.m.e.s;

import android.content.Context;
import android.util.Log;
import d.c.b.m.e.b;
import d.c.b.m.e.k.g;
import d.c.b.m.e.o.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.json.JSONObject;

public class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public JSONObject a() {
        FileInputStream fileInputStream;
        void var6_11;
        block11 : {
            FileInputStream fileInputStream2;
            block12 : {
                b b2;
                block10 : {
                    JSONObject jSONObject;
                    FileInputStream fileInputStream3;
                    block9 : {
                        block8 : {
                            b2 = b.a;
                            b2.b("Reading cached settings...");
                            fileInputStream3 = null;
                            File file = new File(new h(this.a).a(), "com.crashlytics.settings.json");
                            if (!file.exists()) break block8;
                            fileInputStream2 = new FileInputStream(file);
                            try {
                                jSONObject = new JSONObject(g.u(fileInputStream2));
                                fileInputStream3 = fileInputStream2;
                                break block9;
                            }
                            catch (Exception exception) {
                                break block10;
                            }
                        }
                        try {
                            b2.b("No cached settings found.");
                            jSONObject = null;
                        }
                        catch (Throwable throwable) {
                            fileInputStream = null;
                            break block11;
                        }
                        catch (Exception exception) {
                            fileInputStream2 = null;
                        }
                    }
                    g.c(fileInputStream3, "Error while closing settings cache file.");
                    return jSONObject;
                }
                try {
                    void var4_8;
                    if (!b2.a(6)) break block12;
                    Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", (Throwable)var4_8);
                }
                catch (Throwable throwable) {
                    fileInputStream = fileInputStream2;
                }
            }
            g.c(fileInputStream2, "Error while closing settings cache file.");
            return null;
        }
        g.c(fileInputStream, "Error while closing settings cache file.");
        throw var6_11;
    }
}

