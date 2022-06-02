/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  c.e.a
 *  c.e.e
 *  c.e.h
 *  c.v.a
 *  c.v.c0
 *  c.v.m$a$a
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Objects
 */
package c.v;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c.e.e;
import c.e.h;
import c.v.c0;
import c.v.d0;
import c.v.i;
import c.v.m;
import c.v.q;
import c.v.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class m {
    public static i a = new c.v.a();
    public static ThreadLocal<WeakReference<c.e.a<ViewGroup, ArrayList<i>>>> b = new ThreadLocal();
    public static ArrayList<ViewGroup> c = new ArrayList();

    public static c.e.a<ViewGroup, ArrayList<i>> a() {
        c.e.a a2;
        WeakReference weakReference = b.get();
        if (weakReference != null && (a2 = (c.e.a)weakReference.get()) != null) {
            return a2;
        }
        c.e.a a3 = new c.e.a();
        WeakReference weakReference2 = new WeakReference(a3);
        b.set(weakReference2);
        return a3;
    }

    public static class c.v.m$a
    implements ViewTreeObserver.OnPreDrawListener,
    View.OnAttachStateChangeListener {
        public i e;
        public ViewGroup f;

        public c.v.m$a(i i2, ViewGroup viewGroup) {
            this.e = i2;
            this.f = viewGroup;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        public boolean onPreDraw() {
            block26 : {
                block27 : {
                    this.f.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    this.f.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
                    var1_1 = m.c.remove((Object)this.f);
                    var2_2 = 1;
                    if (!var1_1) {
                        return (boolean)var2_2;
                    }
                    var3_3 = m.a();
                    var4_4 = (ArrayList)var3_3.get((Object)this.f);
                    if (var4_4 != null) break block27;
                    var4_4 = new ArrayList();
                    var3_3.put((Object)this.f, (Object)var4_4);
                    ** GOTO lbl-1000
                }
                if (var4_4.size() > 0) {
                    var6_5 = new ArrayList((Collection)var4_4);
                } else lbl-1000: // 2 sources:
                {
                    var6_5 = null;
                }
                var4_4.add((Object)this.e);
                this.e.b((i.d)new a(this, var3_3));
                this.e.i(this.f, false);
                if (var6_5 != null) {
                    var86_6 = var6_5.iterator();
                    while (var86_6.hasNext()) {
                        ((i)var86_6.next()).y((View)this.f);
                    }
                }
                var9_7 = this.e;
                var10_8 = this.f;
                Objects.requireNonNull(var9_7);
                var9_7.o = new ArrayList();
                var9_7.p = new ArrayList();
                var12_9 = var9_7.k;
                var13_10 = var9_7.l;
                var14_11 = new c.e.a(var12_9.a);
                var15_12 = new c.e.a(var13_10.a);
                var16_13 = 0;
                do {
                    block33 : {
                        block32 : {
                            block28 : {
                                block29 : {
                                    block30 : {
                                        block31 : {
                                            if (var16_13 >= (var17_27 = var9_7.n).length) break block28;
                                            var39_29 = var17_27[var16_13];
                                            if (var39_29 == var2_2) break block29;
                                            if (var39_29 == 2) break block30;
                                            if (var39_29 == 3) break block31;
                                            if (var39_29 == 4) {
                                                break;
                                            }
                                            break block32;
                                        }
                                        var40_30 = var12_9;
                                        var59_43 = var40_30.b;
                                        var60_44 = var13_10.b;
                                        var61_45 = var59_43.size();
                                        for (var62_46 = 0; var62_46 < var61_45; ++var62_46) {
                                            var63_47 = (View)var59_43.valueAt(var62_46);
                                            if (var63_47 == null || !var9_7.t(var63_47) || (var64_14 = (View)var60_44.get(var59_43.keyAt(var62_46))) == null || !var9_7.t(var64_14)) continue;
                                            var65_15 = (q)var14_11.getOrDefault((Object)var63_47, null);
                                            var66_16 = (q)var15_12.getOrDefault((Object)var64_14, null);
                                            if (var65_15 == null || var66_16 == null) continue;
                                            var9_7.o.add((Object)var65_15);
                                            var9_7.p.add((Object)var66_16);
                                            var14_11.remove((Object)var63_47);
                                            var15_12.remove((Object)var64_14);
                                        }
                                        break block33;
                                    }
                                    var40_30 = var12_9;
                                    var47_35 = var40_30.d;
                                    var48_36 = var13_10.d;
                                    var49_37 = var47_35.g;
                                    for (var50_38 = 0; var50_38 < var49_37; ++var50_38) {
                                        var51_39 = (View)var47_35.k(var50_38);
                                        if (var51_39 == null || !var9_7.t(var51_39) || (var52_40 = (View)var48_36.get(var47_35.h(var50_38))) == null || !var9_7.t(var52_40)) continue;
                                        var53_41 = (q)var14_11.getOrDefault((Object)var51_39, null);
                                        var54_42 = (q)var15_12.getOrDefault((Object)var52_40, null);
                                        if (var53_41 == null || var54_42 == null) continue;
                                        var9_7.o.add((Object)var53_41);
                                        var9_7.p.add((Object)var54_42);
                                        var14_11.remove((Object)var51_39);
                                        var15_12.remove((Object)var52_40);
                                    }
                                    break block33;
                                }
                                var40_30 = var12_9;
                                var41_31 = var14_11.g;
                                while (--var41_31 >= 0) {
                                    var42_32 = (View)var14_11.h(var41_31);
                                    if (var42_32 == null || !var9_7.t(var42_32) || (var43_33 = (q)var15_12.remove((Object)var42_32)) == null || !var9_7.t(var43_33.b)) continue;
                                    var44_34 = (q)var14_11.i(var41_31);
                                    var9_7.o.add((Object)var44_34);
                                    var9_7.p.add((Object)var43_33);
                                }
                                break block33;
                            }
                            for (var18_48 = 0; var18_48 < var14_11.g; ++var18_48) {
                                var36_49 = (q)var14_11.k(var18_48);
                                if (!var9_7.t(var36_49.b)) continue;
                                var9_7.o.add((Object)var36_49);
                                var9_7.p.add(null);
                            }
                            for (var19_50 = 0; var19_50 < var15_12.g; ++var19_50) {
                                var33_51 = (q)var15_12.k(var19_50);
                                if (!var9_7.t(var33_51.b)) continue;
                                var9_7.p.add((Object)var33_51);
                                var9_7.o.add(null);
                            }
                            break block26;
                        }
                        do {
                            var85_28 = var12_9;
                            var40_30 = var85_28;
                            break;
                        } while (true);
                    }
                    ++var16_13;
                    var12_9 = var40_30;
                    var2_2 = 1;
                } while (true);
                var71_17 = var12_9.c;
                var72_18 = var13_10.c;
                var73_19 = var71_17.i();
                var74_20 = 0;
                do {
                    if (var74_20 >= var73_19) ** continue;
                    var75_21 = (View)var71_17.j(var74_20);
                    if (var75_21 != null && var9_7.t(var75_21)) {
                        if (var71_17.e) {
                            var71_17.e();
                        }
                        var77_23 = var71_17.f;
                        var76_22 = var12_9;
                        var78_24 = (View)var72_18.f(var77_23[var74_20]);
                        if (var78_24 != null && var9_7.t(var78_24)) {
                            var79_25 = (q)var14_11.getOrDefault((Object)var75_21, null);
                            var80_26 = (q)var15_12.getOrDefault((Object)var78_24, null);
                            if (var79_25 != null && var80_26 != null) {
                                var9_7.o.add((Object)var79_25);
                                var9_7.p.add((Object)var80_26);
                                var14_11.remove((Object)var75_21);
                                var15_12.remove((Object)var78_24);
                            }
                        }
                    } else {
                        var76_22 = var12_9;
                    }
                    ++var74_20;
                    var12_9 = var76_22;
                } while (true);
            }
            var20_52 = i.p();
            var21_53 = var20_52.g;
            var23_54 = new c0((View)var10_8);
            var24_55 = var21_53 - 1;
            do {
                if (var24_55 < 0) {
                    var9_7.m(var10_8, var9_7.k, var9_7.l, var9_7.o, var9_7.p);
                    var9_7.z();
                    return true;
                }
                var25_56 = (Animator)var20_52.h(var24_55);
                if (var25_56 != null && (var26_57 = (i.b)var20_52.getOrDefault((Object)var25_56, null)) != null && var26_57.a != null && var23_54.equals((Object)var26_57.d)) {
                    var27_58 = var26_57.c;
                    var28_59 = var26_57.a;
                    var29_60 = var9_7.r(var28_59, true);
                    var30_61 = var9_7.o(var28_59, true);
                    if (var29_60 == null && var30_61 == null) {
                        var30_61 = (q)var9_7.l.a.get((Object)var28_59);
                    }
                    if (var31_62 = (var29_60 != null || var30_61 != null) && var26_57.e.s(var27_58, var30_61) != false) {
                        if (!var25_56.isRunning() && !var25_56.isStarted()) {
                            var20_52.remove((Object)var25_56);
                        } else {
                            var25_56.cancel();
                        }
                    }
                }
                --var24_55;
            } while (true);
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
            this.f.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            m.c.remove((Object)this.f);
            ArrayList arrayList = m.a().get((Object)this.f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    ((i)iterator.next()).y((View)this.f);
                }
            }
            this.e.j(true);
        }
    }

}

