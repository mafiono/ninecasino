/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package d.c.b.m.e.k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class e {
    public final Float a;
    public final boolean b;

    public e(Float f2, boolean bl) {
        this.b = bl;
        this.a = f2;
    }

    public static e a(Context context) {
        Float f2;
        boolean bl;
        block4 : {
            Intent intent;
            block6 : {
                block7 : {
                    int n2;
                    block5 : {
                        intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        bl = false;
                        f2 = null;
                        if (intent == null) break block4;
                        n2 = intent.getIntExtra("status", -1);
                        if (n2 != -1) break block5;
                        bl = false;
                        break block6;
                    }
                    if (n2 == 2) break block7;
                    bl = false;
                    if (n2 != 5) break block6;
                }
                bl = true;
            }
            int n3 = intent.getIntExtra("level", -1);
            int n4 = intent.getIntExtra("scale", -1);
            f2 = null;
            if (n3 != -1) {
                f2 = n4 == -1 ? null : Float.valueOf((float)n3 / (float)n4);
            }
        }
        return new e(f2, bl);
    }

    public int b() {
        Float f2;
        if (this.b && (f2 = this.a) != null) {
            if ((double)f2.floatValue() < 0.99) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}

