/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  d.c.a.d.h.b.z5
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package d.c.b.k.a.c;

import android.os.Bundle;
import d.c.a.d.h.b.z5;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class c {
    public static final Set<String> a = new HashSet(Arrays.asList((Object[])new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
    public static final List<String> b = Arrays.asList((Object[])new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"});
    public static final List<String> c = Arrays.asList((Object[])new String[]{"auto", "app", "am"});
    public static final List<String> d = Arrays.asList((Object[])new String[]{"_r", "_dbg"});
    public static final List<String> e;
    public static final List<String> f;

    public static {
        String[][] arrarrstring = new String[2][];
        arrarrstring[0] = z5.a;
        String[] arrstring = z5.b;
        int n2 = 1;
        arrarrstring[n2] = arrstring;
        int n3 = 0;
        for (int i2 = 0; i2 < 2; ++i2) {
            n3 += arrarrstring[i2].length;
        }
        Object[] arrobject = Arrays.copyOf((Object[])arrarrstring[0], n3);
        int n4 = arrarrstring[0].length;
        while (n2 < 2) {
            String[] arrstring2 = arrarrstring[n2];
            System.arraycopy(arrstring2, 0, arrobject, n4, arrstring2.length);
            n4 += arrstring2.length;
            ++n2;
        }
        e = Arrays.asList((Object[]) arrobject);
        f = Arrays.asList((Object[])new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
    }

    public static boolean a(String string) {
        return !c.contains(string);
    }

    public static boolean b(String string, Bundle bundle) {
        if (b.contains(string)) {
            return false;
        }
        if (bundle != null) {
            Iterator iterator = d.iterator();
            while (iterator.hasNext()) {
                if (!bundle.containsKey((String)iterator.next())) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean c(String string, String string2) {
        if (!"_ce1".equals(string2) && !"_ce2".equals(string2)) {
            if ("_ln".equals(string2)) {
                if (!string.equals("fcm")) {
                    return string.equals("fiam");
                }
                return true;
            }
            if (e.contains(string2)) {
                return false;
            }
            Iterator iterator = f.iterator();
            while (iterator.hasNext()) {
                if (!string2.matches((String)iterator.next())) continue;
                return false;
            }
            return true;
        }
        if (!string.equals("fcm")) {
            return string.equals("frc");
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean d(String string, String string2, Bundle bundle) {
        String string3;
        if (!"_cmp".equals(string2)) {
            return true;
        }
        if (!c.a(string)) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        Iterator iterator = d.iterator();
        while (iterator.hasNext()) {
            if (!bundle.containsKey((String)iterator.next())) continue;
            return false;
        }
        string.hashCode();
        int n2 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 3142703: {
                if (!string.equals("fiam")) break;
                n2 = 2;
                break;
            }
            case 101230: {
                if (!string.equals("fdl")) break;
                n2 = 1;
                break;
            }
            case 101200: {
                if (!string.equals("fcm")) break;
                n2 = 0;
            }
        }
        switch (n2) {
            default: {
                return false;
            }
            case 2: {
                string3 = "fiam_integration";
                break;
            }
            case 1: {
                string3 = "fdl_integration";
                break;
            }
            case 0: {
                string3 = "fcm_integration";
            }
        }
        bundle.putString("_cis", string3);
        return true;
    }
}

