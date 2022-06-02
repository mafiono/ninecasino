/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.Animator$AnimatorPauseListener
 *  android.animation.AnimatorListenerAdapter
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Picture
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroupOverlay
 *  android.view.ViewParent
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  c.v.a0
 *  c.v.c
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.ImageView;
import c.v.a0;
import c.v.c;
import c.v.i;
import c.v.p;
import c.v.q;
import c.v.s;
import c.v.t;
import c.v.z;
import java.util.Map;

public abstract class b0
extends i {
    public static final String[] C = new String[]{"android:visibility:visibility", "android:visibility:parent"};
    public int B = 3;

    public final void I(q q2) {
        int n2 = q2.b.getVisibility();
        q2.a.put("android:visibility:visibility", n2);
        q2.a.put("android:visibility:parent", q2.b.getParent());
        int[] arrn = new int[2];
        q2.b.getLocationOnScreen(arrn);
        q2.a.put("android:visibility:screenLocation", arrn);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final b J(q q2, q q3) {
        Object object;
        block11 : {
            block14 : {
                block10 : {
                    block13 : {
                        block12 : {
                            block8 : {
                                block9 : {
                                    object = new Object(){
                                        public boolean a;
                                        public boolean b;
                                        public int c;
                                        public int d;
                                        public ViewGroup e;
                                        public ViewGroup f;
                                    };
                                    object.a = false;
                                    object.b = false;
                                    if (q2 != null && q2.a.containsKey("android:visibility:visibility")) {
                                        object.c = (Integer)q2.a.get("android:visibility:visibility");
                                        object.e = (ViewGroup)q2.a.get("android:visibility:parent");
                                    } else {
                                        object.c = -1;
                                        object.e = null;
                                    }
                                    if (q3 != null && q3.a.containsKey("android:visibility:visibility")) {
                                        object.d = (Integer)q3.a.get("android:visibility:visibility");
                                        object.f = (ViewGroup)q3.a.get("android:visibility:parent");
                                    } else {
                                        object.d = -1;
                                        object.f = null;
                                    }
                                    if (q2 == null || q3 == null) break block8;
                                    int n2 = object.c;
                                    int n3 = object.d;
                                    if (n2 == n3 && object.e == object.f) {
                                        return object;
                                    }
                                    if (n2 == n3) break block9;
                                    if (n2 == 0) break block10;
                                    if (n3 != 0) break block11;
                                    break block12;
                                }
                                if (object.f == null) break block10;
                                if (object.e != null) break block11;
                                break block12;
                            }
                            if (q2 != null || object.d != 0) break block13;
                        }
                        object.b = true;
                        break block14;
                    }
                    if (q3 != null || object.c != 0) break block11;
                }
                object.b = false;
            }
            object.a = true;
            return object;
        }
        return object;
    }

    public abstract Animator K(ViewGroup var1, View var2, q var3, q var4);

    @Override
    public void e(q q2) {
        this.I(q2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public Animator l(ViewGroup var1_1, q var2_2, q var3_3) {
        block23 : {
            block27 : {
                block36 : {
                    block25 : {
                        block28 : {
                            block34 : {
                                block35 : {
                                    block32 : {
                                        block33 : {
                                            block31 : {
                                                block30 : {
                                                    block29 : {
                                                        block26 : {
                                                            block24 : {
                                                                block22 : {
                                                                    var4_4 = this.J(var2_2, var3_3);
                                                                    if (var4_4.a == false) return null;
                                                                    if (var4_4.e == null) {
                                                                        if (var4_4.f == null) return null;
                                                                    }
                                                                    var5_5 = var4_4.b;
                                                                    var6_6 = true;
                                                                    if (var5_5) {
                                                                        if ((var6_6 & this.B) != var6_6) return null;
                                                                        if (var3_3 == null) {
                                                                            return null;
                                                                        }
                                                                        if (var2_2 == null) {
                                                                            var61_7 = (View)var3_3.b.getParent();
                                                                            if (this.J(this.o((View)var61_7, false), this.r((View)var61_7, false)).a) {
                                                                                return null;
                                                                            }
                                                                        }
                                                                        var56_8 = var3_3.b;
                                                                        var57_9 = (c)this;
                                                                        var58_11 = var2_2 != null && (var60_10 = (Float)var2_2.a.get("android:fade:transitionAlpha")) != null ? var60_10.floatValue() : 0.0f;
                                                                        if (var58_11 == 1.0f) {
                                                                            var59_12 = 0.0f;
                                                                            return var57_9.L(var56_8, var59_12, 1.0f);
                                                                        }
                                                                        var59_12 = var58_11;
                                                                        return var57_9.L(var56_8, var59_12, 1.0f);
                                                                    }
                                                                    var7_13 = var4_4.d;
                                                                    if ((2 & this.B) != 2) {
                                                                        return null;
                                                                    }
                                                                    if (var2_2 == null) {
                                                                        return null;
                                                                    }
                                                                    var8_14 = var2_2.b;
                                                                    var9_15 = var3_3 != null ? var3_3.b : null;
                                                                    var10_16 = (View)var8_14.getTag(2131231027);
                                                                    if (var10_16 == null) break block22;
                                                                    var12_17 = var7_13;
                                                                    var9_15 = null;
                                                                    break block23;
                                                                }
                                                                if (var9_15 == null || var9_15.getParent() == null) break block24;
                                                                if (var7_13 != 4 && var8_14 != var9_15) ** GOTO lbl-1000
                                                                var10_16 = null;
                                                                ** GOTO lbl44
                                                            }
                                                            if (var9_15 != null) {
                                                                var10_16 = var9_15;
                                                                var9_15 = null;
lbl44: // 2 sources:
                                                                var11_18 = false;
                                                            } else lbl-1000: // 2 sources:
                                                            {
                                                                var9_15 = null;
                                                                var10_16 = null;
                                                                var11_18 = true;
                                                            }
                                                            if (!var11_18) break block25;
                                                            if (var8_14.getParent() != null) break block26;
                                                            var12_17 = var7_13;
                                                            var10_16 = var8_14;
                                                            break block27;
                                                        }
                                                        if (!(var8_14.getParent() instanceof View)) break block25;
                                                        var24_19 = (View)var8_14.getParent();
                                                        if (this.J(this.r((View)var24_19, (boolean)var6_6), this.o((View)var24_19, (boolean)var6_6)).a) break block28;
                                                        var28_20 = new Matrix();
                                                        var28_20.setTranslate((float)(-var24_19.getScrollX()), (float)(-var24_19.getScrollY()));
                                                        var29_21 = t.a;
                                                        var29_21.g(var8_14, var28_20);
                                                        var29_21.h((View)var1_1, var28_20);
                                                        var30_22 = new RectF(0.0f, 0.0f, (float)var8_14.getWidth(), (float)var8_14.getHeight());
                                                        var28_20.mapRect(var30_22);
                                                        var32_23 = Math.round((float)var30_22.left);
                                                        var33_24 = Math.round((float)var30_22.top);
                                                        var34_25 = Math.round((float)var30_22.right);
                                                        var35_26 = Math.round((float)var30_22.bottom);
                                                        var36_27 = new ImageView(var8_14.getContext());
                                                        var36_27.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                                        if (!p.a) break block29;
                                                        var37_28 = var6_6 ^ var8_14.isAttachedToWindow();
                                                        if (var1_1 == null) break block30;
                                                        var38_29 = var1_1.isAttachedToWindow();
                                                        break block31;
                                                    }
                                                    var37_28 = false;
                                                }
                                                var38_29 = false;
                                            }
                                            var39_30 = p.b;
                                            if (!var39_30 || !var37_28) break block32;
                                            if (var38_29) break block33;
                                            var12_17 = var7_13;
                                            var13_31 = var9_15;
                                            var45_32 = null;
                                            break block34;
                                        }
                                        var54_33 = (ViewGroup)var8_14.getParent();
                                        var55_34 = var54_33.indexOfChild(var8_14);
                                        var1_1.getOverlay().add(var8_14);
                                        var40_35 = var54_33;
                                        var13_31 = var9_15;
                                        var41_36 = var55_34;
                                        break block35;
                                    }
                                    var13_31 = var9_15;
                                    var40_35 = null;
                                    var41_36 = 0;
                                }
                                var42_37 = var30_22.width();
                                var12_17 = var7_13;
                                var43_38 = Math.round((float)var42_37);
                                var44_39 = Math.round((float)var30_22.height());
                                if (var43_38 > 0 && var44_39 > 0) {
                                    var46_40 = Math.min(1.0f, 1048576.0f / (float)(var43_38 * var44_39));
                                    var47_41 = Math.round((float)(var46_40 * (float)var43_38));
                                    var48_42 = Math.round((float)(var46_40 * (float)var44_39));
                                    var28_20.postTranslate(-var30_22.left, -var30_22.top);
                                    var28_20.postScale(var46_40, var46_40);
                                    if (p.c) {
                                        var51_43 = new Picture();
                                        var52_44 = var51_43.beginRecording(var47_41, var48_42);
                                        var52_44.concat(var28_20);
                                        var8_14.draw(var52_44);
                                        var51_43.endRecording();
                                        var45_32 = Bitmap.createBitmap((Picture)var51_43);
                                    } else {
                                        var45_32 = Bitmap.createBitmap((int)var47_41, (int)var48_42, Bitmap.Config.ARGB_8888);
                                        var53_45 = new Canvas(var45_32);
                                        var53_45.concat(var28_20);
                                        var8_14.draw(var53_45);
                                    }
                                } else {
                                    var45_32 = null;
                                }
                                if (var39_30 && var37_28) {
                                    var1_1.getOverlay().remove(var8_14);
                                    var40_35.addView(var8_14, var41_36);
                                }
                            }
                            if (var45_32 != null) {
                                var36_27.setImageBitmap(var45_32);
                            }
                            var36_27.measure(View.MeasureSpec.makeMeasureSpec((int)(var34_25 - var32_23), 1073741824), View.MeasureSpec.makeMeasureSpec((int)(var35_26 - var33_24), 1073741824));
                            var36_27.layout(var32_23, var33_24, var34_25, var35_26);
                            var10_16 = var36_27;
                            break block36;
                        }
                        var12_17 = var7_13;
                        var13_31 = var9_15;
                        var25_46 = var24_19.getId();
                        if (var24_19.getParent() == null && var25_46 != -1) {
                            var1_1.findViewById(var25_46);
                        }
                        break block36;
                    }
                    var12_17 = var7_13;
                    var13_31 = var9_15;
                }
                var9_15 = var13_31;
            }
            var6_6 = false;
        }
        if (var10_16 != null) {
            if (!var6_6) {
                var20_47 = (int[])var2_2.a.get("android:visibility:screenLocation");
                var21_48 = var20_47[0];
                var22_49 = var20_47[1];
                var23_50 = new int[2];
                var1_1.getLocationOnScreen(var23_50);
                var10_16.offsetLeftAndRight(var21_48 - var23_50[0] - var10_16.getLeft());
                var10_16.offsetTopAndBottom(var22_49 - var23_50[1] - var10_16.getTop());
                var1_1.getOverlay().add(var10_16);
            }
            var14_51 = this;
            var17_52 = var14_51.K(var1_1, var10_16, var2_2, var3_3);
            if (var6_6 != false) return var17_52;
            if (var17_52 == null) {
                var1_1.getOverlay().remove(var10_16);
                return var17_52;
            }
            var8_14.setTag(2131231027, (Object)var10_16);
            var18_53 = new a0(var14_51, var1_1, var10_16, var8_14);
        } else {
            var14_51 = this;
            if (var9_15 == null) return null;
            var15_56 = var9_15.getVisibility();
            var16_57 = t.a;
            var16_57.f(var9_15, 0);
            var17_52 = var14_51.K(var1_1, var9_15, var2_2, var3_3);
            if (var17_52 == null) {
                var16_57.f(var9_15, var15_56);
                return var17_52;
            }
            var18_55 = new a(var9_15, var12_17, true);
            var17_52.addListener((Animator.AnimatorListener)var18_55);
            var17_52.addPauseListener((Animator.AnimatorPauseListener)var18_55);
        }
        var14_51.b((d)var18_54);
        return var17_52;
    }

    @Override
    public String[] q() {
        return C;
    }

    @Override
    public boolean s(q q2, q q3) {
        boolean bl;
        block5 : {
            block6 : {
                if (q2 == null && q3 == null) {
                    return false;
                }
                if (q2 != null && q3 != null && q3.a.containsKey("android:visibility:visibility") != q2.a.containsKey("android:visibility:visibility")) {
                    return false;
                }
                b b2 = this.J(q2, q3);
                boolean bl2 = b2.a;
                bl = false;
                if (!bl2) break block5;
                if (b2.c == 0) break block6;
                int n2 = b2.d;
                bl = false;
                if (n2 != 0) break block5;
            }
            bl = true;
        }
        return bl;
    }

    public static class a
    extends AnimatorListenerAdapter
    implements i.d {
        public final View a;
        public final int b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;
        public boolean f = false;

        public a(View view, int n2, boolean bl) {
            this.a = view;
            this.b = n2;
            this.c = (ViewGroup)view.getParent();
            this.d = bl;
            this.g(true);
        }

        @Override
        public void a(i i2) {
            this.g(false);
        }

        @Override
        public void b(i i2) {
            this.g(true);
        }

        @Override
        public void c(i i2) {
        }

        @Override
        public void d(i i2) {
        }

        @Override
        public void e(i i2) {
            this.f();
            i2.w(this);
        }

        public final void f() {
            if (!this.f) {
                View view = this.a;
                int n2 = this.b;
                t.a.f(view, n2);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            this.g(false);
        }

        public final void g(boolean bl) {
            ViewGroup viewGroup;
            if (this.d && this.e != bl && (viewGroup = this.c) != null) {
                this.e = bl;
                s.a(viewGroup, bl);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f = true;
        }

        public void onAnimationEnd(Animator animator) {
            this.f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f) {
                View view = this.a;
                int n2 = this.b;
                t.a.f(view, n2);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f) {
                View view = this.a;
                t.a.f(view, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

}

