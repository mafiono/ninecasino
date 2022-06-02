/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ObjectAnimator
 *  android.animation.TimeInterpolator
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimationDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  c.b.e.a.a$f
 *  c.b.e.a.a$g
 *  c.b.e.a.b
 *  c.b.e.a.b$c
 *  c.b.f.a
 *  c.b.h.m0
 *  c.e.e
 *  c.e.i
 *  c.h.c.b.h
 *  c.h.d.l.a
 *  c.w.a.a.b
 *  c.w.a.a.g
 *  d.a.b.a.a
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package c.b.e.a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import c.b.e.a.a;
import c.b.e.a.b;
import c.b.e.a.d;
import c.b.h.m0;
import c.e.i;
import c.h.c.b.h;
import c.w.a.a.b;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@SuppressLint(value={"RestrictedAPI"})
public class a
extends d
implements c.h.d.l.a {
    public c t;
    public g u;
    public int v = -1;
    public int w = -1;
    public boolean x;

    public a() {
        this(null, null);
    }

    public a(c c2, Resources resources) {
        super(null);
        c c3 = new c(c2, this, resources);
        super.e(c3);
        this.t = c3;
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static a g(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String string = xmlPullParser.getName();
        if (string.equals("animated-selector")) {
            int n2;
            int n3;
            a a2 = new a(null, null);
            TypedArray typedArray = h.e((Resources)resources, (Resources.Theme)theme2, (AttributeSet)attributeSet2, (int[])c.b.f.a.a);
            int n4 = 1;
            a2.setVisible(typedArray.getBoolean(n4, (boolean)n4), (boolean)n4);
            c c2 = a2.t;
            int n5 = Build.VERSION.SDK_INT;
            if (n5 >= 21) {
                c2.d |= typedArray.getChangingConfigurations();
            }
            boolean bl = c2.i;
            int n6 = 2;
            c2.i = typedArray.getBoolean(n6, bl);
            boolean bl2 = c2.l;
            int n7 = 3;
            c2.l = typedArray.getBoolean(n7, bl2);
            int n8 = c2.A;
            int n9 = 4;
            c2.A = typedArray.getInt(n9, n8);
            c2.B = typedArray.getInt(5, c2.B);
            a2.setDither(typedArray.getBoolean(0, c2.x));
            a2.e.f(resources);
            typedArray.recycle();
            int n10 = n4 + xmlPullParser.getDepth();
            while ((n2 = xmlPullParser.next()) != n4 && ((n3 = xmlPullParser.getDepth()) >= n10 || n2 != n7)) {
                int n11;
                if (n2 != n6 || n3 > n10) continue;
                if (xmlPullParser.getName().equals("item")) {
                    void var47_44;
                    void var47_41;
                    TypedArray typedArray2 = h.e((Resources)resources, (Resources.Theme)theme2, (AttributeSet)attributeSet2, (int[])c.b.f.a.b);
                    int n12 = typedArray2.getResourceId(0, 0);
                    int n13 = typedArray2.getResourceId(n4, -1);
                    if (n13 > 0) {
                        Drawable drawable = m0.d().f(context2, n13);
                    } else {
                        Object var47_43 = null;
                    }
                    typedArray2.recycle();
                    int n14 = attributeSet.getAttributeCount();
                    int[] arrn = new int[n14];
                    int n15 = 0;
                    int n16 = 0;
                    do {
                        n11 = n10;
                        if (n16 >= n14) break;
                        int n17 = attributeSet2.getAttributeNameResource(n16);
                        int n18 = n14;
                        if (n17 != 0 && n17 != 16842960 && n17 != 16843161) {
                            int n19 = n15 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(n16, false)) {
                                n17 = -n17;
                            }
                            arrn[n15] = n17;
                            n15 = n19;
                        }
                        ++n16;
                        n10 = n11;
                        n14 = n18;
                    } while (true);
                    int[] arrn2 = StateSet.trimStateSet(arrn, n15);
                    if (var47_44 == null) {
                        int n20;
                        while ((n20 = xmlPullParser.next()) == n9) {
                        }
                        if (n20 != 2) throw new XmlPullParserException(a.b.a.a.p((XmlPullParser)xmlPullParser, (StringBuilder)new StringBuilder(), (String)": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        if (xmlPullParser.getName().equals("vector")) {
                            c.w.a.a.g g2 = c.w.a.a.g.a((Resources)resources, (XmlPullParser)xmlPullParser, (AttributeSet)attributeSet, (Resources.Theme)theme);
                        } else if (n5 >= 21) {
                            Drawable drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                        } else {
                            Drawable drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                        }
                    }
                    if (var47_41 == null) throw new XmlPullParserException(a.b.a.a.p((XmlPullParser)xmlPullParser, (StringBuilder)new StringBuilder(), (String)": <item> tag requires a 'drawable' attribute or child tag defining a drawable"));
                    c c3 = a2.t;
                    int n21 = c3.a((Drawable)var47_41);
                    c3.J[n21] = arrn2;
                    c3.L.g(n21, (Object)n12);
                    n4 = 1;
                    n6 = 2;
                    n7 = 3;
                } else {
                    n11 = n10;
                    if (xmlPullParser.getName().equals("transition")) {
                        TypedArray typedArray3 = h.e((Resources)resources, (Resources.Theme)theme2, (AttributeSet)attributeSet2, (int[])c.b.f.a.c);
                        int n22 = typedArray3.getResourceId(2, -1);
                        int n23 = typedArray3.getResourceId(1, -1);
                        int n24 = typedArray3.getResourceId(0, -1);
                        Drawable drawable = n24 > 0 ? m0.d().f(context2, n24) : null;
                        boolean bl3 = typedArray3.getBoolean(3, false);
                        typedArray3.recycle();
                        if (drawable == null) {
                            int n25;
                            while ((n25 = xmlPullParser.next()) == n9) {
                            }
                            if (n25 != 2) throw new XmlPullParserException(a.b.a.a.p((XmlPullParser)xmlPullParser, (StringBuilder)new StringBuilder(), (String)": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                            if (xmlPullParser.getName().equals("animated-vector")) {
                                drawable = new c.w.a.a.b(context2, null, null);
                                drawable.inflate(resources, xmlPullParser, attributeSet2, theme2);
                            } else {
                                drawable = n5 >= 21 ? Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                            }
                        }
                        if (drawable == null) throw new XmlPullParserException(a.b.a.a.p((XmlPullParser)xmlPullParser, (StringBuilder)new StringBuilder(), (String)": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"));
                        if (n22 == -1 || n23 == -1) throw new XmlPullParserException(a.b.a.a.p((XmlPullParser)xmlPullParser, (StringBuilder)new StringBuilder(), (String)": <transition> tag requires 'fromId' & 'toId' attributes"));
                        c c4 = a2.t;
                        int n26 = c4.a(drawable);
                        long l2 = c.h(n22, n23);
                        long l3 = bl3 ? 0x200000000L : 0L;
                        c.e.e<Long> e2 = c4.K;
                        long l4 = n26;
                        e2.b(l2, (Object)(l4 | l3));
                        if (bl3) {
                            long l5 = c.h(n23, n22);
                            c4.K.b(l5, (Object)(l3 | (l4 | 0x100000000L)));
                        }
                    }
                    n4 = 1;
                    n6 = 2;
                    n7 = 3;
                    n9 = 4;
                    context2 = context;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                }
                n10 = n11;
            }
            a2.onStateChange(a2.getState());
            return a2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid animated-selector tag ");
        stringBuilder.append(string);
        XmlPullParserException xmlPullParserException = new XmlPullParserException(stringBuilder.toString());
        throw xmlPullParserException;
    }

    @Override
    public b.c b() {
        return new c(this.t, this, null);
    }

    @Override
    public void e(b.c c2) {
        super.e(c2);
        if (c2 instanceof c) {
            this.t = (c)c2;
        }
    }

    @Override
    public a f() {
        return new c(this.t, this, null);
    }

    @Override
    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        c.b.e.a.b.super.jumpToCurrentState();
        g g2 = this.u;
        if (g2 != null) {
            g2.d();
            this.u = null;
            this.d(this.v);
            this.v = -1;
            this.w = -1;
        }
    }

    @Override
    public Drawable mutate() {
        if (!this.x) {
            super.mutate();
            if (this == this) {
                this.t.e();
                this.x = true;
            }
        }
        return this;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public boolean onStateChange(int[] var1_1) {
        block6 : {
            block11 : {
                block10 : {
                    block9 : {
                        block7 : {
                            block8 : {
                                var2_2 = this.t;
                                var3_3 = var2_2.g(var1_1);
                                if (var3_3 < 0) {
                                    var3_3 = var2_2.g(StateSet.WILD_CARD);
                                }
                                var4_4 = this.k;
                                var5_5 = false;
                                if (var3_3 == var4_4) break block6;
                                var7_6 = this.u;
                                if (var7_6 == null) break block7;
                                if (var3_3 == this.v) ** GOTO lbl47
                                if (var3_3 != this.w || !var7_6.a()) break block8;
                                var7_6.b();
                                this.v = this.w;
                                this.w = var3_3;
                                ** GOTO lbl47
                            }
                            var4_4 = this.v;
                            var7_6.d();
                        }
                        this.u = null;
                        this.w = -1;
                        this.v = -1;
                        var8_8 = this.t;
                        var9_9 = var8_8.i(var4_4);
                        var10_10 = var8_8.i(var3_3);
                        if (var10_10 == 0 || var9_9 == 0 || (var15_12 = (int)((Long)var8_8.K.g(var13_11 = c.h(var9_9, var10_10), (Object)-1L)).longValue()) < 0) ** GOTO lbl-1000
                        var16_13 = c.h(var9_9, var10_10);
                        var18_14 = (0x200000000L & (Long)var8_8.K.g(var16_13, (Object)-1L)) != 0L;
                        this.d(var15_12);
                        var20_15 = this.g;
                        if (!(var20_15 instanceof AnimationDrawable)) break block9;
                        var22_16 = c.h(var9_9, var10_10);
                        var24_17 = (0x100000000L & (Long)var8_8.K.g(var22_16, (Object)-1L)) != 0L;
                        var21_18 = new g((AnimationDrawable)var20_15, var24_17, var18_14){
                            public final ObjectAnimator a;
                            public final boolean b;
                            {
                                int n2 = animationDrawable.getNumberOfFrames();
                                int n3 = bl ? n2 - 1 : 0;
                                int n4 = bl ? 0 : n2 - 1;
                                f f2 = new /* Unavailable Anonymous Inner Class!! */;
                                ObjectAnimator objectAnimator = ObjectAnimator.ofInt((Object)animationDrawable, "currentIndex", new int[]{n3, n4});
                                objectAnimator.setAutoCancel(true);
                                objectAnimator.setDuration((long)f2.c);
                                objectAnimator.setInterpolator((TimeInterpolator)f2);
                                this.b = bl2;
                                this.a = objectAnimator;
                            }

                            public boolean a() {
                                return this.b;
                            }

                            public void b() {
                                this.a.reverse();
                            }

                            public void c() {
                                this.a.start();
                            }

                            public void d() {
                                this.a.cancel();
                            }
                        };
                        ** GOTO lbl43
                    }
                    if (!(var20_15 instanceof c.w.a.a.b)) break block10;
                    var21_18 = new g((c.w.a.a.b)var20_15){
                        public final c.w.a.a.b a;
                        {
                            this.a = b2;
                        }

                        public void c() {
                            this.a.start();
                        }

                        public void d() {
                            this.a.stop();
                        }
                    };
                    ** GOTO lbl43
                }
                if (var20_15 instanceof Animatable) {
                    var21_18 = new g((Animatable)var20_15){
                        public final Animatable a;
                        {
                            this.a = animatable;
                        }

                        public void c() {
                            this.a.start();
                        }

                        public void d() {
                            this.a.stop();
                        }
                    };
lbl43: // 3 sources:
                    var21_18.c();
                    this.u = var21_18;
                    this.w = var4_4;
                    this.v = var3_3;
lbl47: // 3 sources:
                    var11_7 = true;
                } else lbl-1000: // 2 sources:
                {
                    var11_7 = false;
                }
                if (var11_7) break block11;
                var12_19 = this.d(var3_3);
                var5_5 = false;
                if (!var12_19) break block6;
            }
            var5_5 = true;
        }
        if ((var6_20 = this.g) == null) return var5_5;
        var5_5 |= var6_20.setState(var1_1);
        return var5_5;
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        boolean bl3 = c.b.e.a.b.super.setVisible(bl, bl2);
        g g2 = this.u;
        if (g2 != null && (bl3 || bl2)) {
            if (bl) {
                g2.c();
                return bl3;
            }
            this.jumpToCurrentState();
        }
        return bl3;
    }

    public static class c
    extends a {
        public c.e.e<Long> K;
        public i<Integer> L;

        public c(c c2, a a2, Resources resources) {
            i i2;
            super(c2, a2, resources);
            if (c2 != null) {
                this.K = c2.K;
                i2 = c2.L;
            } else {
                this.K = new c.e.e();
                i2 = new i();
            }
            this.L = i2;
        }

        public static long h(int n2, int n3) {
            return (long)n2 << 32 | (long)n3;
        }

        @Override
        public void e() {
            this.K = this.K.d();
            this.L = this.L.c();
        }

        public int i(int n2) {
            if (n2 < 0) {
                return 0;
            }
            return (Integer)this.L.e(n2, (Object)0);
        }

        @Override
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

}

