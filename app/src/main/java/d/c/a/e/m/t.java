/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.icu.text.DateFormat
 *  android.icu.util.TimeZone
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.TextView
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.TimeZone
 */
package d.c.a.e.m;

import android.content.Context;
import android.icu.text.DateFormat;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import d.c.a.e.m.a;
import d.c.a.e.m.a0;
import d.c.a.e.m.b;
import d.c.a.e.m.c;
import d.c.a.e.m.d;
import d.c.a.e.m.s;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;

public class t
extends BaseAdapter {
    public static final int i = a0.e().getMaximum(4);
    public final s e;
    public final d<?> f;
    public c g;
    public final a h;

    public t(s s2, d<?> d2, a a2) {
        this.e = s2;
        this.f = d2;
        this.h = a2;
    }

    public int a() {
        return this.e.u();
    }

    public Long b(int n2) {
        if (n2 >= this.e.u() && n2 <= this.c()) {
            s s2 = this.e;
            int n3 = 1 + (n2 - s2.u());
            Calendar calendar = a0.b(s2.e);
            calendar.set(5, n3);
            return calendar.getTimeInMillis();
        }
        return null;
    }

    public int c() {
        return -1 + (this.e.u() + this.e.j);
    }

    public int getCount() {
        return this.e.j + this.a();
    }

    public long getItemId(int n2) {
        return n2 / this.e.i;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public View getView(int var1_1, View var2_2, ViewGroup var3_3) {
        block14 : {
            var4_4 = Build.VERSION.SDK_INT;
            var5_5 = var3_3.getContext();
            if (this.g == null) {
                this.g = new c(var5_5);
            }
            var6_6 = (TextView)var2_2;
            if (var2_2 == null) {
                var6_6 = (TextView)LayoutInflater.from(var3_3.getContext()).inflate(2131427396, var3_3, false);
            }
            if ((var7_7 = var1_1 - this.a()) < 0) ** GOTO lbl-1000
            var13_8 = this.e;
            if (var7_7 < var13_8.j) {
                var14_9 = var7_7 + 1;
                var6_6.setTag((Object)var13_8);
                var6_6.setText((CharSequence)String.valueOf((int)var14_9));
                var15_10 = a0.b(this.e.e);
                var15_10.set(5, var14_9);
                var16_11 = var15_10.getTimeInMillis();
                if (this.e.h == s.t().h) {
                    var24_12 = Locale.getDefault();
                    if (var4_4 >= 24) {
                        var28_13 = DateFormat.getInstanceForSkeleton("MMMEd", (Locale)var24_12);
                        var28_13.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
                        var21_14 = var28_13.format(new Date(var16_11));
                    } else {
                        var26_15 = java.text.DateFormat.getDateInstance(0, (Locale)var24_12);
                        var26_15.setTimeZone(a0.c());
                        var21_14 = var26_15.format(new Date(var16_11));
                    }
                } else {
                    var18_16 = Locale.getDefault();
                    if (var4_4 >= 24) {
                        var23_17 = DateFormat.getInstanceForSkeleton("yMMMEd", (Locale)var18_16);
                        var23_17.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
                        var21_14 = var23_17.format(new Date(var16_11));
                    } else {
                        var20_18 = java.text.DateFormat.getDateInstance(0, (Locale)var18_16);
                        var20_18.setTimeZone(a0.c());
                        var21_14 = var20_18.format(new Date(var16_11));
                    }
                }
                var6_6.setContentDescription((CharSequence)var21_14);
                var6_6.setVisibility(0);
                var6_6.setEnabled(true);
            } else lbl-1000: // 2 sources:
            {
                var6_6.setVisibility(8);
                var6_6.setEnabled(false);
            }
            var8_19 = this.b(var1_1);
            if (var8_19 == null) {
                return var6_6;
            }
            if (this.h.h.k(var8_19)) {
                var6_6.setEnabled(true);
                var10_20 = this.f.p().iterator();
                while (var10_20.hasNext()) {
                    var11_21 = (Long)var10_20.next();
                    if (a0.a(var8_19) != a0.a(var11_21)) continue;
                    var9_22 = this.g.b;
                    break block14;
                }
                var9_22 = a0.d().getTimeInMillis() == var8_19.longValue() ? this.g.c : this.g.a;
            } else {
                var6_6.setEnabled(false);
                var9_22 = this.g.g;
            }
        }
        var9_22.b(var6_6);
        return var6_6;
    }

    public boolean hasStableIds() {
        return true;
    }
}

