/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeInfo
 *  c.e.i
 *  c.h.b.g
 *  c.h.j.a
 *  c.h.j.x.b
 *  c.h.j.x.c
 *  c.j.b.b
 *  c.j.b.c
 *  c.j.b.d
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Objects
 */
package c.j.b;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import c.e.i;
import c.h.b.g;
import c.j.b.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public abstract class a
extends c.h.j.a {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final c.j.b.b<c.h.j.x.b> o = new c.j.b.b<c.h.j.x.b>(){

        public void a(Object object, Rect rect) {
            ((c.h.j.x.b)object).a.getBoundsInParent(rect);
        }
    };
    public static final c.j.b.c<i<c.h.j.x.b>, c.h.j.x.b> p = new c.j.b.c<i<c.h.j.x.b>, c.h.j.x.b>(){};
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    private int m = Integer.MIN_VALUE;

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager)view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public c.h.j.x.c b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, c.h.j.x.b b2) {
        this.a.onInitializeAccessibilityNodeInfo(view, b2.a);
        this.s(b2);
    }

    public final boolean j(int n2) {
        if (this.k == n2) {
            this.k = Integer.MIN_VALUE;
            this.i.invalidate();
            this.w(n2, 65536);
            return true;
        }
        return false;
    }

    public final boolean k(int n2) {
        if (this.l != n2) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        this.u(n2, false);
        this.w(n2, 8);
        return true;
    }

    public final c.h.j.x.b l(int n2) {
        RuntimeException runtimeException;
        AccessibilityNodeInfo accessibilityNodeInfo = AccessibilityNodeInfo.obtain();
        c.h.j.x.b b2 = new c.h.j.x.b(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        b2.a.setFocusable(true);
        b2.a.setClassName((CharSequence)"android.view.View");
        Rect rect = n;
        b2.a.setBoundsInParent(rect);
        b2.a.setBoundsInScreen(rect);
        View view = this.i;
        b2.b = -1;
        b2.a.setParent(view);
        this.t(n2, b2);
        if (b2.g() == null && b2.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        b2.a.getBoundsInParent(rect2);
        if (!this.e.equals(rect)) {
            int n3 = b2.a.getActions();
            if ((n3 & 64) == 0) {
                int n4 = 128;
                if ((n3 & n4) == 0) {
                    AccessibilityNodeInfo accessibilityNodeInfo2;
                    String string = this.i.getContext().getPackageName();
                    b2.a.setPackageName((CharSequence)string);
                    View view2 = this.i;
                    b2.c = n2;
                    b2.a.setSource(view2, n2);
                    if (this.k == n2) {
                        b2.a.setAccessibilityFocused(true);
                        accessibilityNodeInfo2 = b2.a;
                    } else {
                        b2.a.setAccessibilityFocused(false);
                        accessibilityNodeInfo2 = b2.a;
                        n4 = 64;
                    }
                    accessibilityNodeInfo2.addAction(n4);
                    boolean bl = this.l == n2;
                    if (bl) {
                        b2.a.addAction(2);
                    } else if (b2.a.isFocusable()) {
                        b2.a.addAction(1);
                    }
                    b2.a.setFocused(bl);
                    this.i.getLocationOnScreen(this.g);
                    Rect rect3 = this.d;
                    b2.a.getBoundsInScreen(rect3);
                    if (this.d.equals(rect)) {
                        Rect rect4 = this.d;
                        b2.a.getBoundsInParent(rect4);
                        if (b2.b != -1) {
                            c.h.j.x.b b3 = new c.h.j.x.b(AccessibilityNodeInfo.obtain());
                            int n5 = b2.b;
                            while (n5 != -1) {
                                View view3 = this.i;
                                b3.b = -1;
                                b3.a.setParent(view3, -1);
                                Rect rect5 = n;
                                b3.a.setBoundsInParent(rect5);
                                this.t(n5, b3);
                                Rect rect6 = this.e;
                                b3.a.getBoundsInParent(rect6);
                                Rect rect7 = this.d;
                                Rect rect8 = this.e;
                                rect7.offset(rect8.left, rect8.top);
                                n5 = b3.b;
                            }
                            b3.a.recycle();
                        }
                        this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    }
                    if (this.i.getLocalVisibleRect(this.f)) {
                        this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                        if (this.d.intersect(this.f)) {
                            boolean bl2;
                            block23 : {
                                Rect rect9 = this.d;
                                b2.a.setBoundsInScreen(rect9);
                                Rect rect10 = this.d;
                                bl2 = false;
                                if (rect10 != null) {
                                    if (rect10.isEmpty()) {
                                        bl2 = false;
                                    } else if (this.i.getWindowVisibility() != 0) {
                                        bl2 = false;
                                    } else {
                                        ViewParent viewParent;
                                        View view4 = this.i;
                                        while ((viewParent = view4.getParent()) instanceof View) {
                                            view4 = (View)viewParent;
                                            float f2 = view4.getAlpha() FCMPG 0.0f;
                                            bl2 = false;
                                            if (f2 > 0) {
                                                if (view4.getVisibility() == 0) continue;
                                                bl2 = false;
                                            }
                                            break block23;
                                        }
                                        bl2 = viewParent != null;
                                    }
                                }
                            }
                            if (bl2) {
                                b2.a.setVisibleToUser(true);
                            }
                        }
                    }
                    return b2;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        runtimeException = new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        throw runtimeException;
    }

    public final boolean m(MotionEvent motionEvent) {
        if (this.h.isEnabled() && this.h.isTouchExplorationEnabled()) {
            int n2 = motionEvent.getAction();
            if (n2 != 7 && n2 != 9) {
                if (n2 != 10) {
                    return false;
                }
                int n3 = this.m;
                if (n3 != Integer.MIN_VALUE) {
                    if (n3 == Integer.MIN_VALUE) {
                        return true;
                    }
                    this.m = Integer.MIN_VALUE;
                    this.w(Integer.MIN_VALUE, 128);
                    this.w(n3, 256);
                    return true;
                }
                return false;
            }
            int n4 = this.m;
            int n5 = this.n(motionEvent.getX(), motionEvent.getY());
            if (n4 != n5) {
                this.m = n5;
                this.w(n5, 128);
                this.w(n4, 256);
            }
            return n5 != Integer.MIN_VALUE;
        }
        return false;
    }

    public abstract int n(float var1, float var2);

    public abstract void o(List<Integer> var1);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean p(int var1_1, Rect var2_2) {
        block22 : {
            block28 : {
                block27 : {
                    block23 : {
                        block26 : {
                            block24 : {
                                block25 : {
                                    block19 : {
                                        block21 : {
                                            block20 : {
                                                var3_3 = new ArrayList();
                                                this.o((List<Integer>)var3_3);
                                                var4_4 = new i();
                                                for (var5_5 = 0; var5_5 < var3_3.size(); ++var5_5) {
                                                    var4_4.g(var5_5, (Object)this.l(var5_5));
                                                }
                                                var6_6 = this.l;
                                                var7_7 = var6_6 == Integer.MIN_VALUE ? null : (c.h.j.x.b)var4_4.d(var6_6);
                                                var8_8 = -1;
                                                if (var1_1 != 1 && var1_1 != 2) break block19;
                                                var9_30 = this.i;
                                                var11_31 = var9_30.getLayoutDirection() == 1;
                                                var12_32 = a.p;
                                                var13_33 = a.o;
                                                Objects.requireNonNull(var12_32);
                                                var15_34 = var4_4.h();
                                                var16_35 = new ArrayList(var15_34);
                                                for (var17_36 = 0; var17_36 < var15_34; ++var17_36) {
                                                    var16_35.add((Object)((c.h.j.x.b)var4_4.f[var17_36]));
                                                }
                                                Collections.sort(var16_35, new d(var11_31, var13_33));
                                                if (var1_1 == 1) break block20;
                                                if (var1_1 != 2) throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                                                var25_37 = var16_35.size();
                                                var26_38 = var7_7 == null ? -1 : var16_35.lastIndexOf((Object)var7_7);
                                                var27_39 = var26_38 + 1;
                                                if (var27_39 >= var25_37) ** GOTO lbl-1000
                                                var20_40 = var16_35.get(var27_39);
                                                break block21;
                                            }
                                            var18_41 = var16_35.size();
                                            if (var7_7 != null) {
                                                var18_41 = var16_35.indexOf((Object)var7_7);
                                            }
                                            if ((var19_42 = var18_41 + var8_8) >= 0) {
                                                var20_40 = var16_35.get(var19_42);
                                            } else lbl-1000: // 2 sources:
                                            {
                                                var20_40 = null;
                                            }
                                        }
                                        var21_22 = (c.h.j.x.b)var20_40;
                                        break block22;
                                    }
                                    if (var1_1 != 17 && var1_1 != 33 && var1_1 != 66) {
                                        if (var1_1 != 130) throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    }
                                    var29_9 = new Rect();
                                    var30_10 = this.l;
                                    if (var30_10 != Integer.MIN_VALUE) {
                                        this.q((int)var30_10).a.getBoundsInParent(var29_9);
                                    } else if (var2_2 != null) {
                                        var29_9.set(var2_2);
                                    } else {
                                        var31_11 = this.i;
                                        var32_12 = var31_11.getWidth();
                                        var33_13 = var31_11.getHeight();
                                        if (var1_1 != 17) {
                                            if (var1_1 != 33) {
                                                if (var1_1 != 66) {
                                                    if (var1_1 != 130) throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                                    var29_9.set(0, var8_8, var32_12, var8_8);
                                                } else {
                                                    var29_9.set(var8_8, 0, var8_8, var33_13);
                                                }
                                            } else {
                                                var29_9.set(0, var33_13, var32_12, var33_13);
                                            }
                                        } else {
                                            var29_9.set(var32_12, 0, var32_12, var33_13);
                                        }
                                    }
                                    var34_14 = a.p;
                                    var35_15 = a.o;
                                    var36_16 = new Rect(var29_9);
                                    if (var1_1 == 17) break block23;
                                    if (var1_1 == 33) break block24;
                                    if (var1_1 == 66) break block25;
                                    if (var1_1 != 130) throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    var49_17 = -(1 + var29_9.height());
                                    break block26;
                                }
                                var37_18 = -(1 + var29_9.width());
                                break block27;
                            }
                            var49_17 = 1 + var29_9.height();
                        }
                        var36_16.offset(0, var49_17);
                        break block28;
                    }
                    var37_18 = 1 + var29_9.width();
                }
                var36_16.offset(var37_18, 0);
            }
            Objects.requireNonNull(var34_14);
            var39_19 = var4_4.h();
            var40_20 = new Rect();
            var21_22 = null;
            for (var41_21 = 0; var41_21 < var39_19; ++var41_21) {
                var42_23 = (c.h.j.x.b)var4_4.f[var41_21];
                if (var42_23 == var7_7) continue;
                (var35_15).a((Object)var42_23, var40_20);
                var48_29 = g.C((Rect)var29_9, (Rect)var40_20, (int)var1_1) != false && (g.C((Rect)var29_9, (Rect)var36_16, (int)var1_1) == false || g.a((int)var1_1, (Rect)var29_9, (Rect)var40_20, (Rect)var36_16) != false || g.a((int)var1_1, (Rect)var29_9, (Rect)var36_16, (Rect)var40_20) == false && (var45_26 = (var43_24 = g.F((int)var1_1, (Rect)var29_9, (Rect)var40_20)) * (var43_24 * 13) + (var44_25 = g.G((int)var1_1, (Rect)var29_9, (Rect)var40_20)) * var44_25) < (var46_27 = g.F((int)var1_1, (Rect)var29_9, (Rect)var36_16)) * (var46_27 * 13) + (var47_28 = g.G((int)var1_1, (Rect)var29_9, (Rect)var36_16)) * var47_28);
                if (!var48_29) continue;
                var36_16.set(var40_20);
                var21_22 = var42_23;
            }
        }
        var22_43 = var21_22;
        if (var22_43 == null) {
            var24_45 = Integer.MIN_VALUE;
            return this.v(var24_45);
        }
        for (var23_44 = 0; var23_44 < var4_4.g; ++var23_44) {
            if (var4_4.f[var23_44] != var22_43) continue;
            var8_8 = var23_44;
            break;
        }
        var24_45 = var4_4.f(var8_8);
        return this.v(var24_45);
    }

    public c.h.j.x.b q(int n2) {
        if (n2 == -1) {
            AccessibilityNodeInfo accessibilityNodeInfo = AccessibilityNodeInfo.obtain(this.i);
            c.h.j.x.b b2 = new c.h.j.x.b(accessibilityNodeInfo);
            View view = this.i;
            view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ArrayList arrayList = new ArrayList();
            this.o((List<Integer>)arrayList);
            if (b2.a.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int n3 = arrayList.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                View view2 = this.i;
                int n4 = (Integer)arrayList.get(i2);
                b2.a.addChild(view2, n4);
            }
            return b2;
        }
        return this.l(n2);
    }

    public abstract boolean r(int var1, int var2, Bundle var3);

    public void s(c.h.j.x.b b2) {
    }

    public abstract void t(int var1, c.h.j.x.b var2);

    public void u(int n2, boolean bl) {
    }

    public final boolean v(int n2) {
        if (!this.i.isFocused() && !this.i.requestFocus()) {
            return false;
        }
        int n3 = this.l;
        if (n3 == n2) {
            return false;
        }
        if (n3 != Integer.MIN_VALUE) {
            this.k(n3);
        }
        this.l = n2;
        this.u(n2, true);
        this.w(n2, 8);
        return true;
    }

    public final boolean w(int n2, int n3) {
        if (n2 != Integer.MIN_VALUE) {
            AccessibilityEvent accessibilityEvent;
            if (!this.h.isEnabled()) {
                return false;
            }
            ViewParent viewParent = this.i.getParent();
            if (viewParent == null) {
                return false;
            }
            if (n2 != -1) {
                accessibilityEvent = AccessibilityEvent.obtain(n3);
                c.h.j.x.b b2 = this.q(n2);
                accessibilityEvent.getText().add((Object)b2.g());
                accessibilityEvent.setContentDescription(b2.e());
                accessibilityEvent.setScrollable(b2.a.isScrollable());
                accessibilityEvent.setPassword(b2.a.isPassword());
                accessibilityEvent.setEnabled(b2.a.isEnabled());
                accessibilityEvent.setChecked(b2.a.isChecked());
                if (accessibilityEvent.getText().isEmpty() && accessibilityEvent.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                accessibilityEvent.setClassName(b2.a.getClassName());
                accessibilityEvent.setSource(this.i, n2);
                accessibilityEvent.setPackageName(this.i.getContext().getPackageName());
            } else {
                accessibilityEvent = AccessibilityEvent.obtain(n3);
                this.i.onInitializeAccessibilityEvent(accessibilityEvent);
            }
            return viewParent.requestSendAccessibilityEvent(this.i, accessibilityEvent);
        }
        return false;
    }

    public final void x(int n2) {
        int n3 = this.m;
        if (n3 == n2) {
            return;
        }
        this.m = n2;
        this.w(n2, 128);
        this.w(n3, 256);
    }

    public class c
    extends c.h.j.x.c {
        public c.h.j.x.b a(int n2) {
            return new c.h.j.x.b(AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)a.this.q(n2).a));
        }

        public c.h.j.x.b b(int n2) {
            int n3 = n2 == 2 ? a.this.k : a.this.l;
            if (n3 == Integer.MIN_VALUE) {
                return null;
            }
            return new c.h.j.x.b(AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)a.this.q(n3).a));
        }

        public boolean c(int n2, int n3, Bundle bundle) {
            a a2 = a.this;
            if (n2 != -1) {
                int n4 = 1;
                if (n3 != n4) {
                    if (n3 != 2) {
                        int n5;
                        if (n3 != 64) {
                            if (n3 != 128) {
                                return a2.r(n2, n3, bundle);
                            }
                            return a2.j(n2);
                        }
                        if (a2.h.isEnabled() && a2.h.isTouchExplorationEnabled() && (n5 = a2.k) != n2) {
                            if (n5 != Integer.MIN_VALUE) {
                                a2.j(n5);
                            }
                            a2.k = n2;
                            a2.i.invalidate();
                            a2.w(n2, 32768);
                        } else {
                            n4 = 0;
                        }
                        return n4;
                    }
                    return a2.k(n2);
                }
                return a2.v(n2);
            }
            View view = a2.i;
            return view.performAccessibilityAction(n3, bundle);
        }
    }

}

