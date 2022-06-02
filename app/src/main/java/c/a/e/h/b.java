/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  c.a.e.h.a
 *  c.a.e.h.a$a
 *  c.h.c.a
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package c.a.e.h;

import android.content.Context;
import android.content.Intent;
import c.a.e.h.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b
extends a<String[], Map<String, Boolean>> {
    public Intent a(Context context, Object object) {
        String[] arrstring = (String[])object;
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arrstring);
    }

    public a.a b(Context context, Object object) {
        String[] arrstring = (String[])object;
        if (arrstring != null && arrstring.length != 0) {
            c.e.a a2 = new c.e.a();
            int n2 = arrstring.length;
            boolean bl = true;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string = arrstring[i2];
                boolean bl2 = c.h.c.a.a((Context)context, (String)string) == 0;
                a2.put(string, bl2);
                if (bl2) continue;
                bl = false;
            }
            if (bl) {
                return new a.a(a2);
            }
            return null;
        }
        return new a.a((Object)Collections.emptyMap());
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object c(int n2, Intent intent) {
        if (n2 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] arrstring = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] arrn = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (arrn == null) return Collections.emptyMap();
        if (arrstring == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        int n3 = arrstring.length;
        int n4 = 0;
        while (n4 < n3) {
            String string = arrstring[n4];
            boolean bl = arrn[n4] == 0;
            hashMap.put(string, bl);
            ++n4;
        }
        return hashMap;
    }
}

