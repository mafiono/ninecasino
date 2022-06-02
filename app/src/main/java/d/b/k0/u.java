/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcel
 *  d.b.a
 *  d.b.e
 *  d.b.g
 *  d.b.j0.u
 *  d.b.j0.w
 *  d.b.k0.a
 *  d.b.k0.o
 *  d.b.k0.o$d
 *  d.b.k0.o$e
 *  d.b.k0.t
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Set
 */
package d.b.k0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import d.b.e;
import d.b.g;
import d.b.j0.w;
import d.b.k0.a;
import d.b.k0.o;
import d.b.k0.t;
import java.util.Collection;
import java.util.Set;

public abstract class u
extends t {
    public u(Parcel parcel) {
        super(parcel);
    }

    public u(o o2) {
        super(o2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public boolean q(int var1_1, int var2_2, Intent var3_3) {
        block14 : {
            block18 : {
                block17 : {
                    block16 : {
                        block15 : {
                            block13 : {
                                var4_4 = this.f.k;
                                if (var3_3 != null) break block13;
                                var10_5 = o.e.a((o.d)var4_4, (String)"Operation canceled");
                                break block14;
                            }
                            if (var2_2 != 0) break block15;
                            var12_6 = var3_3.getExtras();
                            var13_7 = var12_6.getString("error");
                            if (var13_7 == null) {
                                var13_7 = var12_6.getString("error_type");
                            }
                            var14_8 = var12_6.get("error_code");
                            var15_9 = null;
                            if (var14_8 != null) {
                                var15_9 = var12_6.get("error_code").toString();
                            }
                            if (d.b.j0.u.c.equals(var15_9)) {
                                var16_10 = var12_6.getString("error_message");
                                if (var16_10 == null) {
                                    var16_10 = var12_6.getString("error_description");
                                }
                                var10_5 = o.e.c((o.d)var4_4, (String)var13_7, (String)var16_10, (String)var15_9);
                            } else {
                                var10_5 = o.e.a((o.d)var4_4, (String)var13_7);
                            }
                            break block14;
                        }
                        if (var2_2 == -1) break block16;
                        var10_5 = o.e.b((o.d)var4_4, (String)"Unexpected resultCode from authorization.", null);
                        break block14;
                    }
                    var5_11 = var3_3.getExtras();
                    var6_12 = var5_11.getString("error");
                    if (var6_12 == null) {
                        var6_12 = var5_11.getString("error_type");
                    }
                    var7_13 = var5_11.get("error_code") != null ? var5_11.get("error_code").toString() : null;
                    var8_14 = var5_11.getString("error_message");
                    if (var8_14 == null) {
                        var8_14 = var5_11.getString("error_description");
                    }
                    if (!w.y((String)(var9_15 = var5_11.getString("e2e")))) {
                        this.f(var9_15);
                    }
                    if (var6_12 != null || var7_13 != null || var8_14 != null) break block17;
                    try {
                        var10_5 = o.e.d((o.d)var4_4, (d.b.a)t.c((Collection)var4_4.f, (Bundle)var5_11, (e)e.g, (String)var4_4.h));
                    }
                    catch (g var11_16) {
                        var10_5 = o.e.b((o.d)var4_4, null, (String)var11_16.getMessage());
                    }
                    break block14;
                }
                if (!var6_12.equals((Object)"logged_out")) break block18;
                a.k = true;
                ** GOTO lbl-1000
            }
            if (d.b.j0.u.a.contains((Object)var6_12)) lbl-1000: // 2 sources:
            {
                var10_5 = null;
            } else {
                var10_5 = d.b.j0.u.b.contains((Object)var6_12) != false ? o.e.a((o.d)var4_4, null) : o.e.c((o.d)var4_4, (String)var6_12, (String)var8_14, (String)var7_13);
            }
        }
        if (var10_5 != null) {
            this.f.d(var10_5);
            return true;
        }
        this.f.s();
        return true;
    }
}

