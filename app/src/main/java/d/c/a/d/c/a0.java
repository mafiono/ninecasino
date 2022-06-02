/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcelable
 *  android.util.Log
 *  c.e.h
 *  d.c.a.d.g.c.a
 *  d.c.a.d.j.i
 *  java.lang.CharSequence
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Objects
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package d.c.a.d.c;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import c.e.h;
import d.c.a.d.c.c;
import d.c.a.d.c.d;
import d.c.a.d.g.c.a;
import d.c.a.d.j.i;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a0
extends a {
    public final /* synthetic */ c a;

    public a0(c c2, Looper looper) {
        this.a = c2;
        super(looper);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void handleMessage(Message var1_1) {
        block18 : {
            block14 : {
                block21 : {
                    block22 : {
                        block16 : {
                            block19 : {
                                block20 : {
                                    block17 : {
                                        block15 : {
                                            var2_2 = this.a;
                                            Objects.requireNonNull(var2_2);
                                            if (var1_1 == null || !((var7_3 = var1_1.obj) instanceof Intent)) break block14;
                                            var8_4 = (Intent)var7_3;
                                            var8_4.setExtrasClassLoader((ClassLoader)new d.a());
                                            if (var8_4.hasExtra("google.messenger")) {
                                                var34_5 = var8_4.getParcelableExtra("google.messenger");
                                                if (var34_5 instanceof d) {
                                                    var2_2.g = (d)var34_5;
                                                }
                                                if (var34_5 instanceof Messenger) {
                                                    var2_2.f = (Messenger)var34_5;
                                                }
                                            }
                                            if ("com.google.android.c2dm.intent.REGISTRATION".equals(var10_7 = (var9_6 = (Intent)var1_1.obj).getAction())) break block15;
                                            if (Log.isLoggable("Rpc", 3) == false) return;
                                            var16_8 = "Rpc";
                                            var17_9 = "Unexpected response action: ";
                                            var11_10 = String.valueOf((Object)var10_7);
                                            if (var11_10.length() != 0) ** GOTO lbl-1000
                                            var18_11 = new String(var17_9);
                                            ** GOTO lbl74
                                        }
                                        var11_10 = var9_6.getStringExtra("registration_id");
                                        if (var11_10 == null) {
                                            var11_10 = var9_6.getStringExtra("unregistered");
                                        }
                                        if (var11_10 != null) break block16;
                                        var21_12 = var9_6.getStringExtra("error");
                                        if (var21_12 != null) break block17;
                                        var4_13 = "Rpc";
                                        var30_14 = String.valueOf((Object)var9_6.getExtras());
                                        var31_15 = new StringBuilder(49 + var30_14.length());
                                        var31_15.append("Unexpected response, no error or registration id ");
                                        var31_15.append(var30_14);
                                        var5_16 = var31_15.toString();
                                        break block18;
                                    }
                                    if (Log.isLoggable("Rpc", 3)) {
                                        var28_17 = var21_12.length() != 0 ? "Received InstanceID error ".concat(var21_12) : "Received InstanceID error ";
                                        Log.d("Rpc", (String)var28_17);
                                    }
                                    if (!var21_12.startsWith("|")) break block19;
                                    var26_18 = var21_12.split("\\|");
                                    if (var26_18.length <= 2 || !"ID".equals((Object)var26_18[1])) break block20;
                                    var13_19 = var26_18[2];
                                    var27_20 = var26_18[3];
                                    if (var27_20.startsWith(":")) {
                                        var27_20 = var27_20.substring(1);
                                    }
                                    var15_21 = var9_6.putExtra("error", var27_20).getExtras();
                                    break block21;
                                }
                                var4_13 = "Rpc";
                                var5_16 = var21_12.length() != 0 ? "Unexpected structured response ".concat(var21_12) : "Unexpected structured response ";
                                break block18;
                            }
                            var35_23 = var22_22 = var2_2.a;
                            // MONITORENTER : var35_23
                            var23_24 = 0;
                            do {
                                var25_25 = var2_2.a;
                                if (var23_24 >= var25_25.g) {
                                    // MONITOREXIT : var35_23
                                    return;
                                }
                                var2_2.a((String)var25_25.h(var23_24), var9_6.getExtras());
                                ++var23_24;
                            } while (true);
                        }
                        var12_26 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher((CharSequence)var11_10);
                        if (!var12_26.matches()) {
                            if (Log.isLoggable("Rpc", 3) == false) return;
                            var16_8 = "Rpc";
                            var17_9 = "Unexpected response string: ";
                            ** if (var11_10.length() == 0) goto lbl-1000
                        }
                        break block22;
lbl-1000: // 2 sources:
                        {
                            var19_27 = var17_9.concat(var11_10);
                            ** GOTO lbl75
                        }
lbl-1000: // 1 sources:
                        {
                            var18_11 = new String(var17_9);
lbl74: // 2 sources:
                            var19_27 = var18_11;
                        }
lbl75: // 2 sources:
                        Log.d((String)var16_8, (String)var19_27);
                        return;
                    }
                    var13_19 = var12_26.group(1);
                    var14_28 = var12_26.group(2);
                    if (var13_19 == null) return;
                    var15_21 = var9_6.getExtras();
                    var15_21.putString("registration_id", var14_28);
                }
                var2_2.a(var13_19, var15_21);
                return;
            }
            var4_13 = "Rpc";
            var5_16 = "Dropping invalid message";
        }
        Log.w((String)var4_13, (String)var5_16);
    }
}

