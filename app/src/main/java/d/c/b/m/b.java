/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  com.google.firebase.crashlytics.CrashlyticsRegistrar
 *  d.c.a.d.j.a
 *  d.c.a.d.j.h
 *  d.c.a.e.a
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Locale
 *  java.util.Objects
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.TimeUnit
 */
package d.c.b.m;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import d.c.b.i;
import d.c.b.k.a.a;
import d.c.b.m.e.i.a;
import d.c.b.m.e.i.c;
import d.c.b.m.e.i.d;
import d.c.b.m.e.i.e;
import d.c.b.m.e.i.f;
import d.c.b.m.e.k.b1;
import d.c.b.m.e.k.g;
import d.c.b.m.e.k.g0;
import d.c.b.m.e.k.h;
import d.c.b.m.e.k.h0;
import d.c.b.m.e.k.i0;
import d.c.b.m.e.k.l0;
import d.c.b.m.e.k.m0;
import d.c.b.m.e.k.n;
import d.c.b.m.e.k.o0;
import d.c.b.m.e.k.r0;
import d.c.b.m.e.k.s0;
import d.c.b.m.e.k.t;
import d.c.b.m.e.k.x;
import d.c.b.m.e.k.y0;
import d.c.b.m.e.q.b;
import java.io.File;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class b
implements d.c.b.l.f {
    public final CrashlyticsRegistrar a;

    public b(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.a = crashlyticsRegistrar;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public Object a(d.c.b.l.e var1_1) {
        block22 : {
            block20 : {
                block21 : {
                    Objects.requireNonNull(this.a);
                    var3_2 = var1_1.a(d.c.b.c.class);
                    var4_3 = var1_1.a(d.c.b.m.e.a.class);
                    var5_4 = var1_1.a(d.c.b.k.a.a.class);
                    var6_5 = var1_1.a(d.c.b.t.g.class);
                    var7_6 = d.c.b.m.e.b.a;
                    var3_2.a();
                    var8_7 = var3_2.a;
                    var9_8 = new r0(var8_7, var8_7.getPackageName(), var6_5);
                    var10_9 = new m0(var3_2);
                    var11_10 = var4_3 == null ? new d.c.b.m.e.c() : var4_3;
                    var12_11 = new d.c.b.m.e.h(var3_2, var8_7, var9_8, var10_9);
                    if (var5_4 != null) {
                        var7_6.b("Firebase Analytics is available.");
                        var107_12 = new e(var5_4);
                        var108_15 = new d.c.b.m.a();
                        var109_16 = var5_4.e("clx", var108_15);
                        if (var109_16 == null) {
                            var7_6.b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
                            var109_16 = var5_4.e("crash", var108_15);
                            if (var109_16 != null) {
                                var7_6.f("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
                            }
                        }
                        if (var109_16 != null) {
                            var7_6.b("Firebase Analytics listener registered successfully.");
                            var110_17 = new d();
                            var111_20 = new c(var107_12, 500, TimeUnit.MILLISECONDS);
                            var108_15.b = var110_17;
                            var108_15.a = var111_20;
                            var107_13 = var111_20;
                        } else {
                            var7_6.b("Firebase Analytics listener registration failed.");
                            var110_18 = new d.c.b.m.e.j.b();
                        }
                        var16_21 = var107_14;
                        var15_24 = var110_19;
                    } else {
                        var7_6.b("Firebase Analytics is unavailable.");
                        var13_27 = new d.c.b.m.e.j.b();
                        var14_28 = new f();
                        var15_25 = var13_27;
                        var16_22 = var14_28;
                    }
                    var17_29 = d.c.a.e.a.e((String)"Crashlytics Exception Handler");
                    var18_30 = new g0(var3_2, var9_8, var11_10, var10_9, (d.c.b.m.e.j.a)var15_26, (a)var16_23, var17_29);
                    try {
                        var12_11.i = var12_11.l.c();
                        var12_11.d = var12_11.c.getPackageManager();
                        var12_11.e = var104_31 = var12_11.c.getPackageName();
                        var12_11.f = var105_32 = var12_11.d.getPackageInfo(var104_31, 0);
                        var12_11.g = Integer.toString((int)var105_32.versionCode);
                        var106_33 = var12_11.f.versionName;
                        if (var106_33 == null) {
                            var106_33 = "0.0";
                        }
                        var12_11.h = var106_33;
                        var12_11.j = var12_11.d.getApplicationLabel(var12_11.c.getApplicationInfo()).toString();
                        var12_11.k = Integer.toString((int)var12_11.c.getApplicationInfo().targetSdkVersion);
                        var20_34 = true;
                    }
                    catch (PackageManager.NameNotFoundException var19_35) {
                        if (var7_6.a(6)) {
                            Log.e("FirebaseCrashlytics", "Failed init", var19_35);
                        }
                        var20_34 = false;
                    }
                    if (!var20_34) {
                        var7_6.d("Unable to start Crashlytics.");
                        return null;
                    }
                    var21_36 = d.c.a.e.a.e((String)"com.google.firebase.crashlytics.startup");
                    var3_2.a();
                    var22_37 = var3_2.c.b;
                    var23_38 = var12_11.l;
                    var24_39 = var12_11.a;
                    var25_40 = var12_11.g;
                    var26_41 = var12_11.h;
                    var27_42 = var12_11.c();
                    var28_43 = var12_11.m;
                    var29_44 = var23_38.c();
                    var30_45 = new y0();
                    var31_46 = new d.c.b.m.e.s.f(var30_45);
                    var32_47 = new d.c.b.m.e.s.a(var8_7);
                    var33_48 = Locale.US;
                    var34_49 = new d.c.b.m.e.s.j.c(var27_42, String.format((Locale)var33_48, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{var22_37}), var24_39);
                    var35_50 = new Object[]{var23_38.e(Build.MANUFACTURER), var23_38.e(Build.MODEL)};
                    var36_51 = String.format((Locale)var33_48, "%s/%s", (Object[])var35_50);
                    var37_52 = var23_38.e(Build.VERSION.INCREMENTAL);
                    var38_53 = var23_38.e(Build.VERSION.RELEASE);
                    var39_54 = new String[]{g.k(var8_7), var22_37, var26_41, var25_40};
                    var40_55 = g.e(var39_54);
                    var41_56 = o0.g((String)var29_44).e;
                    var42_57 = new d.c.b.m.e.s.i.g(var22_37, var36_51, var37_52, var38_53, var23_38, var40_55, var26_41, var25_40, var41_56);
                    var43_58 = new d.c.b.m.e.s.d(var8_7, var42_57, var30_45, var31_46, var32_47, var34_49, var28_43);
                    var43_58.d(d.c.b.m.e.s.c.e, (Executor)var21_36).g((Executor)var21_36, (d.c.a.d.j.a)new d.c.b.m.e.g(var12_11));
                    var45_59 = g.k(var18_30.a);
                    var46_60 = new StringBuilder();
                    var46_60.append("Mapping file ID is: ");
                    var46_60.append(var45_59);
                    var7_6.b(var46_60.toString());
                    if (g.i(var18_30.a, "com.crashlytics.RequireBuildId", true)) break block21;
                    var7_6.b("Configured not to require a build ID.");
                    ** GOTO lbl-1000
                }
                if (!g.r(var45_59)) lbl-1000: // 2 sources:
                {
                    var69_61 = true;
                    var49_62 = "FirebaseCrashlytics";
                } else {
                    var49_62 = "FirebaseCrashlytics";
                    Log.e((String)var49_62, ".");
                    Log.e((String)var49_62, ".     |  | ");
                    Log.e((String)var49_62, ".     |  |");
                    Log.e((String)var49_62, ".     |  |");
                    Log.e((String)var49_62, ".   \\ |  | /");
                    Log.e((String)var49_62, ".    \\    /");
                    Log.e((String)var49_62, ".     \\  /");
                    Log.e((String)var49_62, ".      \\/");
                    Log.e((String)var49_62, ".");
                    Log.e((String)var49_62, "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                    Log.e((String)var49_62, ".");
                    Log.e((String)var49_62, ".      /\\");
                    Log.e((String)var49_62, ".     /  \\");
                    Log.e((String)var49_62, ".    /    \\");
                    Log.e((String)var49_62, ".   / |  | \\");
                    Log.e((String)var49_62, ".     |  |");
                    Log.e((String)var49_62, ".     |  |");
                    Log.e((String)var49_62, ".     |  |");
                    Log.e((String)var49_62, ".");
                    var69_61 = false;
                }
                if (var69_61 == false) throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
                var70_63 = var18_30.b;
                var70_63.a();
                var71_64 = var70_63.c.b;
                if (var7_6.a(4)) {
                    Log.i((String)var49_62, "Initializing Crashlytics 17.3.0", null);
                }
                var77_65 = var18_30.a;
                var78_66 = new d.c.b.m.e.o.h(var77_65);
                var18_30.f = new i0("crash_marker", var78_66);
                var18_30.e = new i0("initialization_marker", var78_66);
                var79_67 = new d.c.b.m.e.n.c();
                var80_68 = new d.c.b.m.e.u.a(var77_65);
                var81_69 = var18_30.h;
                var82_70 = var77_65.getPackageName();
                var83_71 = var81_69.c();
                var84_72 = var77_65.getPackageManager().getPackageInfo(var82_70, 0);
                var85_73 = Integer.toString((int)var84_72.versionCode);
                var86_74 = var84_72.versionName;
                var87_75 = var86_74 == null ? "0.0" : var86_74;
                var88_76 = new d.c.b.m.e.k.b(var71_64, var45_59, var83_71, var82_70, var85_73, var87_75, var80_68);
                var89_77 = new StringBuilder();
                var89_77.append("Installer package name is: ");
                var89_77.append(var88_76.c);
                var7_6.b(var89_77.toString());
                var18_30.g = var92_78 = new t(var18_30.a, var18_30.l, var79_67, var18_30.h, var18_30.c, var78_66, var18_30.f, var88_76, null, null, var18_30.m, var18_30.j, var43_58);
                var93_79 = var18_30.e.b().exists();
                var94_80 = var18_30.l.b(new h0(var18_30));
                var100_81 = b1.a(var94_80);
                {
                    catch (Exception v0) {}
                }
                try {
                    Boolean.TRUE.equals((Object)var100_81);
                    var96_82 = var18_30.g;
                    var97_83 = Thread.getDefaultUncaughtExceptionHandler();
                    var96_82.e.b(new n(var96_82));
                    var96_82.t = var99_84 = new l0(new x(var96_82), var43_58, var97_83);
                    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)var99_84);
                    if (!var93_79 || !g.b(var18_30.a)) break block20;
                    var7_6.b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                    var18_30.b(var43_58);
                }
                catch (Exception var72_86) {
                    if (var7_6.a(6)) {
                        Log.e((String)var49_62, "Crashlytics was not started due to an exception during initialization", var72_86);
                    }
                    var18_30.g = null;
                }
            }
            var7_6.b("Exception handling initialization successful");
            var73_85 = true;
            break block22;
            var73_85 = false;
        }
        var74_87 = new d.c.b.m.c(var12_11, var21_36, var43_58, var73_85, var18_30);
        d.c.a.d.b.a.c(var21_36, var74_87);
        return new d.c.b.m.d(var18_30);
    }
}

