/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  c.s.a
 *  c.v.b$h
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package c.v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.v.b;
import c.v.i;
import c.v.q;
import c.v.s;
import c.v.t;
import java.util.Map;

public class b
extends c.v.i {
    public static final String[] C = new String[]{"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> D = new Property<Drawable, PointF>(PointF.class, "boundsOrigin"){
        public final Rect a;
        {
            this.a = new Rect();
        }

        public Object get(Object object) {
            ((Drawable)object).copyBounds(this.a);
            Rect rect = this.a;
            return new PointF((float)rect.left, (float)rect.top);
        }

        public void set(Object object, Object object2) {
            Drawable drawable = (Drawable)object;
            PointF pointF = (PointF)object2;
            drawable.copyBounds(this.a);
            this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.a);
        }
    };
    public static final Property<i, PointF> E = new Property<i, PointF>(PointF.class, "topLeft"){

        public void set(Object object, Object object2) {
            int n2;
            int n3;
            i i2 = object;
            PointF pointF = (PointF)object2;
            java.util.Objects.requireNonNull((Object)i2);
            i2.a = Math.round(pointF.x);
            i2.b = n2 = Math.round(pointF.y);
            i2.f = n3 = 1 + i2.f;
            if (n3 == i2.g) {
                t.b(i2.e, i2.a, n2, i2.c, i2.d);
                i2.f = 0;
                i2.g = 0;
            }
        }
    };
    public static final Property<i, PointF> F = new Property<i, PointF>(PointF.class, "bottomRight"){

        public void set(Object object, Object object2) {
            int n2;
            int n3;
            i i2 = object;
            PointF pointF = (PointF)object2;
            java.util.Objects.requireNonNull((Object)i2);
            i2.c = Math.round(pointF.x);
            i2.d = n2 = Math.round(pointF.y);
            i2.g = n3 = 1 + i2.g;
            if (i2.f == n3) {
                t.b(i2.e, i2.a, i2.b, i2.c, n2);
                i2.f = 0;
                i2.g = 0;
            }
        }
    };
    public static final Property<View, PointF> G = new Property<View, PointF>(PointF.class, "bottomRight"){

        public void set(Object object, Object object2) {
            View view = (View)object;
            PointF pointF = (PointF)object2;
            t.b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };
    public static final Property<View, PointF> H = new Property<View, PointF>(PointF.class, "topLeft"){

        public void set(Object object, Object object2) {
            View view = (View)object;
            PointF pointF = (PointF)object2;
            t.b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };
    public static final Property<View, PointF> I = new Property<View, PointF>(PointF.class, "position"){

        public void set(Object object, Object object2) {
            View view = (View)object;
            PointF pointF = (PointF)object2;
            int n2 = Math.round(pointF.x);
            int n3 = Math.round(pointF.y);
            t.b(view, n2, n3, n2 + view.getWidth(), n3 + view.getHeight());
        }
    };
    public static c.v.g J = new g();
    public int[] B = new int[2];

    public final void I(q q2) {
        View view = q2.b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            q2.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            q2.a.put("android:changeBounds:parent", q2.b.getParent());
        }
    }

    @Override
    public void e(q q2) {
        this.I(q2);
    }

    @Override
    public void h(q q2) {
        this.I(q2);
    }

    @Override
    public Animator l(ViewGroup viewGroup, q q2, q q3) {
        block7 : {
            block8 : {
                block9 : {
                    b b2;
                    ObjectAnimator objectAnimator;
                    View view;
                    block13 : {
                        Property<View, PointF> property;
                        Path path;
                        block12 : {
                            int n2;
                            int n3;
                            int n4;
                            int n5;
                            int n6;
                            int n7;
                            int n8;
                            int n9;
                            block10 : {
                                block11 : {
                                    int n10;
                                    int n11;
                                    if (q2 == null || q3 == null) break block7;
                                    Map<String, Object> map = q2.a;
                                    Map<String, Object> map2 = q3.a;
                                    ViewGroup viewGroup2 = (ViewGroup)map.get("android:changeBounds:parent");
                                    ViewGroup viewGroup3 = (ViewGroup)map2.get("android:changeBounds:parent");
                                    if (viewGroup2 == null || viewGroup3 == null) break block8;
                                    view = q3.b;
                                    Rect rect = (Rect)q2.a.get("android:changeBounds:bounds");
                                    Rect rect2 = (Rect)q3.a.get("android:changeBounds:bounds");
                                    n5 = rect.left;
                                    n8 = rect2.left;
                                    n3 = rect.top;
                                    n9 = rect2.top;
                                    n2 = rect.right;
                                    n6 = rect2.right;
                                    n7 = rect.bottom;
                                    n4 = rect2.bottom;
                                    int n12 = n2 - n5;
                                    int n13 = n7 - n3;
                                    int n14 = n6 - n8;
                                    int n15 = n4 - n9;
                                    Rect rect3 = (Rect)q2.a.get("android:changeBounds:clip");
                                    Rect rect4 = (Rect)q3.a.get("android:changeBounds:clip");
                                    if (n12 != 0 && n13 != 0 || n14 != 0 && n15 != 0) {
                                        n11 = n5 == n8 && n3 == n9 ? 0 : 1;
                                        if (n2 != n6 || n7 != n4) {
                                            ++n11;
                                        }
                                    } else {
                                        n11 = 0;
                                    }
                                    if (rect3 != null && !rect3.equals(rect4) || rect3 == null && rect4 != null) {
                                        ++n11;
                                    }
                                    if ((n10 = n11) <= 0) break block9;
                                    t.b(view, n5, n3, n2, n7);
                                    if (n10 != 2) break block10;
                                    if (n12 != n14 || n13 != n15) break block11;
                                    b2 = this;
                                    path = b2.x.a(n5, n3, n8, n9);
                                    property = I;
                                    break block12;
                                }
                                b2 = this;
                                Object object = new Object(view){
                                    public int a;
                                    public int b;
                                    public int c;
                                    public int d;
                                    public final View e;
                                    public int f;
                                    public int g;
                                    {
                                        this.e = view;
                                    }
                                };
                                Path path2 = b2.x.a(n5, n3, n8, n9);
                                ObjectAnimator objectAnimator2 = c.s.a.l((Object)object, E, (Path)path2);
                                Path path3 = b2.x.a(n2, n7, n6, n4);
                                ObjectAnimator objectAnimator3 = c.s.a.l((Object)object, F, (Path)path3);
                                objectAnimator = new AnimatorSet();
                                objectAnimator.playTogether(new Animator[]{objectAnimator2, objectAnimator3});
                                objectAnimator.addListener(new AnimatorListenerAdapter(b2, object){
                                    public final /* synthetic */ i a;
                                    private final i mViewBounds;
                                    {
                                        this.a = i2;
                                        this.mViewBounds = i2;
                                    }
                                });
                                break block13;
                            }
                            b2 = this;
                            if (n5 == n8 && n3 == n9) {
                                path = b2.x.a(n2, n7, n6, n4);
                                property = G;
                            } else {
                                path = b2.x.a(n5, n3, n8, n9);
                                property = H;
                            }
                        }
                        objectAnimator = c.s.a.l((Object)view, property, (Path)path);
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup)view.getParent();
                        s.a(viewGroup4, true);
                        b2.b((d)new h(b2, viewGroup4));
                    }
                    return objectAnimator;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public String[] q() {
        return C;
    }

}

