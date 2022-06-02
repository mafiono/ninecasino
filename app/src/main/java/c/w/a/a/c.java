/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.Keyframe
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.InflateException
 *  android.view.animation.Interpolator
 *  c.h.b.g
 *  c.h.c.b.h
 *  c.h.d.c
 *  c.s.a
 *  d.a.b.a.a
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Objects
 *  org.xmlpull.v1.XmlPullParser
 */
package c.w.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.Interpolator;
import c.h.b.g;
import c.h.c.b.h;
import c.w.a.a.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

public class c {
    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Animator a(Context var0, Resources var1_1, Resources.Theme var2_2, XmlPullParser var3_3, AttributeSet var4_4, AnimatorSet var5_5, int var6_6, float var7_7) {
        var8_8 = var1_1;
        var9_9 = var2_2;
        var10_10 = var3_3.getDepth();
        var11_11 = null;
        var12_12 = null;
        while (((var13_13 = var3_3.next()) != (var14_14 = 3) || var3_3.getDepth() > var10_10) && var13_13 != (var15_15 = 1)) {
            block55 : {
                block53 : {
                    block54 : {
                        var21_16 = 2;
                        if (var13_13 != var21_16) continue;
                        var22_17 = var3_3.getName();
                        if (var22_17.equals((Object)"objectAnimator")) {
                            var23_18 = new ObjectAnimator();
                            c.e(var0, var1_1, var2_2, var4_4, (ValueAnimator)var23_18, var7_7, var3_3);
                            var11_11 = var23_18;
lbl14: // 2 sources:
                            do {
                                var25_19 = var10_10;
                                var26_20 = false;
                                break block53;
                                break;
                            } while (true);
                        }
                        if (var22_17.equals((Object)"animator")) {
                            var11_11 = c.e(var0, var1_1, var2_2, var4_4, null, var7_7, var3_3);
                            ** continue;
                        }
                        if (!var22_17.equals((Object)"set")) break block54;
                        var28_21 = new AnimatorSet();
                        var29_22 = h.e((Resources)var8_8, (Resources.Theme)var9_9, (AttributeSet)var4_4, (int[])c.w.a.a.a.h);
                        var30_23 = h.c((XmlPullParser)var3_3, (String)"ordering") == false ? 0 : var29_22.getInt(0, 0);
                        c.a(var0, var1_1, var2_2, var3_3, var4_4, var28_21, var30_23, var7_7);
                        var29_22.recycle();
                        var25_19 = var10_10;
                        var11_11 = var28_21;
                        var26_20 = false;
                        break block53;
                    }
                    var32_24 = "propertyValuesHolder";
                    if (!var22_17.equals((Object)var32_24)) break block55;
                    var35_25 = Xml.asAttributeSet(var3_3);
                    var36_26 = null;
                    while ((var37_27 = var3_3.getEventType()) != var14_14 && var37_27 != var15_15) {
                        if (var37_27 != var21_16) {
                            var3_3.next();
                            continue;
                        }
                        if (var3_3.getName().equals((Object)var32_24)) {
                            var45_34 = h.e((Resources)var8_8, (Resources.Theme)var9_9, (AttributeSet)var35_25, (int[])c.w.a.a.a.i);
                            var46_35 = h.b((TypedArray)var45_34, (XmlPullParser)var3_3, (String)"propertyName", (int)var14_14);
                            var47_36 = h.c((XmlPullParser)var3_3, (String)"valueType") == false ? 4 : var45_34.getInt(var21_16, 4);
                            var48_37 = c.w.a.a.a.j;
                            var49_38 = null;
                            var41_31 = var35_25;
                            var50_39 = var47_36;
                            var42_32 = var32_24;
                            while ((var51_40 = var3_3.next()) != var14_14 && var51_40 != 1) {
                                if (var3_3.getName().equals("keyframe")) {
                                    if (var50_39 == 4) {
                                        var86_71 = h.e((Resources)var8_8, (Resources.Theme)var9_9, (AttributeSet)Xml.asAttributeSet(var3_3), (int[])var48_37);
                                        var87_72 = h.c((XmlPullParser)var3_3, (String)"value") == false ? null : var86_71.peekValue(0);
                                        var88_73 = var87_72 != null;
                                        var89_74 = var88_73 != false && c.d(var87_72.type) != false ? 3 : 0;
                                        var86_71.recycle();
                                        var50_39 = var89_74;
                                    }
                                    var74_61 = h.e((Resources)var8_8, (Resources.Theme)var9_9, (AttributeSet)Xml.asAttributeSet(var3_3), (int[])var48_37);
                                    var75_62 = h.c((XmlPullParser)var3_3, (String)"fraction");
                                    var76_63 = -1.0f;
                                    if (var75_62) {
                                        var76_63 = var74_61.getFloat(3, var76_63);
                                    }
                                    var77_64 = h.c((XmlPullParser)var3_3, (String)"value") == false ? null : var74_61.peekValue(0);
                                    var73_60 = var10_10;
                                    var78_65 = var77_64 != null;
                                    var79_66 = var50_39 == 4 ? (var78_65 && c.d(var77_64.type) ? 3 : 0) : var50_39;
                                    if (var78_65) {
                                        if (var79_66 != 0) {
                                            if (var79_66 != 1 && var79_66 != 3) {
                                                var80_67 = null;
                                            } else {
                                                var85_70 = h.c((XmlPullParser)var3_3, (String)"value") == false ? 0 : var74_61.getInt(0, 0);
                                                var80_67 = Keyframe.ofInt((float)var76_63, (int)var85_70);
                                            }
                                        } else {
                                            var84_69 = h.c((XmlPullParser)var3_3, (String)"value") == false ? 0.0f : var74_61.getFloat(0, 0.0f);
                                            var80_67 = Keyframe.ofFloat((float)var76_63, (float)var84_69);
                                        }
                                    } else {
                                        var80_67 = var79_66 == 0 ? Keyframe.ofFloat((float)var76_63) : Keyframe.ofInt((float)var76_63);
                                    }
                                    var81_68 = h.c((XmlPullParser)var3_3, (String)"interpolator") == false ? 0 : var74_61.getResourceId(1, 0);
                                    if (var81_68 > 0) {
                                        var80_67.setInterpolator((TimeInterpolator)c.s.a.k((Context)var0, (int)var81_68));
                                    }
                                    var74_61.recycle();
                                    if (var80_67 != null) {
                                        if (var49_38 == null) {
                                            var49_38 = new ArrayList();
                                        }
                                        var49_38.add((Object)var80_67);
                                    }
                                    var3_3.next();
                                } else {
                                    var73_60 = var10_10;
                                }
                                var14_14 = 3;
                                var8_8 = var1_1;
                                var9_9 = var2_2;
                                var10_10 = var73_60;
                            }
                            var43_33 = var10_10;
                            if (var49_38 != null && (var55_43 = var49_38.size()) > 0) {
                                var56_44 = (Keyframe)var49_38.get(0);
                                var57_45 = (Keyframe)var49_38.get(var55_43 - 1);
                                var58_46 = var57_45.getFraction();
                                if (var58_46 < 1.0f) {
                                    if (var58_46 < 0.0f) {
                                        var57_45.setFraction(1.0f);
                                    } else {
                                        var49_38.add(var49_38.size(), (Object)c.b(var57_45, 1.0f));
                                        ++var55_43;
                                    }
                                }
                                if ((var59_47 = var56_44.getFraction()) != 0.0f) {
                                    if (var59_47 < 0.0f) {
                                        var56_44.setFraction(0.0f);
                                    } else {
                                        var49_38.add(0, (Object)c.b(var56_44, 0.0f));
                                        ++var55_43;
                                    }
                                }
                                var60_48 = new Keyframe[var55_43];
                                var49_38.toArray(var60_48);
                                for (var62_49 = 0; var62_49 < var55_43; ++var62_49) {
                                    var63_50 = var60_48[var62_49];
                                    if (var63_50.getFraction() < 0.0f) {
                                        var64_51 = 0.0f;
                                        if (var62_49 == 0) {
                                            do {
                                                var63_50.setFraction(var64_51);
                                                break;
                                            } while (true);
                                        } else {
                                            var65_52 = var55_43 - 1;
                                            var64_51 = 1.0f;
                                            if (var62_49 == var65_52) ** continue;
                                            var66_53 = var62_49 + 1;
                                            var67_54 = var62_49;
                                            while (var66_53 < var65_52 && !(var60_48[var66_53].getFraction() >= 0.0f)) {
                                                var72_59 = var66_53 + 1;
                                                var67_54 = var66_53;
                                                var66_53 = var72_59;
                                            }
                                            var68_55 = (var60_48[var67_54 + 1].getFraction() - var60_48[var62_49 - 1].getFraction()) / (float)(2 + (var67_54 - var62_49));
                                            for (var69_56 = var62_49; var69_56 <= var67_54; ++var69_56) {
                                                var71_58 = var55_43;
                                                var60_48[var69_56].setFraction(var68_55 + var60_48[var69_56 - 1].getFraction());
                                                var55_43 = var71_58;
                                            }
                                        }
                                    }
                                    var70_57 = var55_43;
                                    var55_43 = var70_57;
                                }
                                var53_42 = PropertyValuesHolder.ofKeyframe((String)var46_35, (Keyframe[])var60_48);
                                var52_41 = 3;
                                if (var50_39 == var52_41) {
                                    var53_42.setEvaluator((TypeEvaluator)d.a);
                                }
                            } else {
                                var52_41 = 3;
                                var53_42 = null;
                            }
                            if (var53_42 == null) {
                                var53_42 = c.c(var45_34, var47_36, 0, 1, var46_35);
                            }
                            if (var53_42 != null) {
                                if (var36_26 == null) {
                                    var36_26 = new ArrayList();
                                }
                                var36_26.add((Object)var53_42);
                            }
                            var45_34.recycle();
                            var14_14 = var52_41;
                            var15_15 = 1;
                        } else {
                            var41_31 = var35_25;
                            var42_32 = var32_24;
                            var43_33 = var10_10;
                        }
                        var3_3.next();
                        var21_16 = 2;
                        var8_8 = var1_1;
                        var9_9 = var2_2;
                        var35_25 = var41_31;
                        var32_24 = var42_32;
                        var10_10 = var43_33;
                    }
                    var25_19 = var10_10;
                    if (var36_26 != null) {
                        var39_29 = var36_26.size();
                        var38_28 = new PropertyValuesHolder[var39_29];
                        for (var40_30 = 0; var40_30 < var39_29; ++var40_30) {
                            var38_28[var40_30] = (PropertyValuesHolder)var36_26.get(var40_30);
                        }
                    } else {
                        var38_28 = null;
                    }
                    if (var38_28 != null && var11_11 instanceof ValueAnimator) {
                        var11_11.setValues(var38_28);
                    }
                    var26_20 = true;
                }
                if (var5_5 != null && !var26_20) {
                    if (var12_12 == null) {
                        var12_12 = new ArrayList();
                    }
                    var12_12.add((Object)var11_11);
                }
                var8_8 = var1_1;
                var9_9 = var2_2;
                var10_10 = var25_19;
                continue;
            }
            var33_75 = d.a.b.a.a.d((String)"Unknown animator name: ");
            var33_75.append(var3_3.getName());
            throw new RuntimeException(var33_75.toString());
        }
        if (var5_5 == null || var12_12 == null) return var11_11;
        var16_76 = new Animator[var12_12.size()];
        var17_77 = var12_12.iterator();
        var18_78 = 0;
        while (var17_77.hasNext()) {
            var19_79 = (Animator)var17_77.next();
            var20_80 = var18_78 + 1;
            var16_76[var18_78] = var19_79;
            var18_78 = var20_80;
        }
        if (var6_6 == 0) {
            var5_5.playTogether(var16_76);
            return var11_11;
        }
        var5_5.playSequentially(var16_76);
        return var11_11;
    }

    public static Keyframe b(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static PropertyValuesHolder c(TypedArray typedArray, int n2, int n3, int n4, String string) {
        d d2;
        PropertyValuesHolder propertyValuesHolder;
        block17 : {
            PropertyValuesHolder propertyValuesHolder2;
            block15 : {
                int n5;
                boolean bl;
                block16 : {
                    boolean bl2;
                    int n6;
                    block14 : {
                        TypedValue typedValue = typedArray.peekValue(n3);
                        bl2 = typedValue != null;
                        n6 = bl2 ? typedValue.type : 0;
                        TypedValue typedValue2 = typedArray.peekValue(n4);
                        bl = typedValue2 != null;
                        n5 = bl ? typedValue2.type : 0;
                        if (n2 == 4) {
                            n2 = bl2 && c.d(n6) || bl && c.d(n5) ? 3 : 0;
                        }
                        boolean bl3 = n2 == 0;
                        if (n2 == 2) {
                            String string2 = typedArray.getString(n3);
                            String string3 = typedArray.getString(n4);
                            c.h.d.c[] arrc = g.p((String)string2);
                            c.h.d.c[] arrc2 = g.p((String)string3);
                            if (arrc == null) {
                                propertyValuesHolder = null;
                                if (arrc2 == null) return propertyValuesHolder;
                            }
                            if (arrc != null) {
                                a a2 = new a();
                                if (arrc2 == null) return PropertyValuesHolder.ofObject(string, a2, new Object[]{arrc});
                                if (g.e((c.h.d.c[])arrc, (c.h.d.c[])arrc2)) {
                                    return PropertyValuesHolder.ofObject(string, a2, new Object[]{arrc, arrc2});
                                }
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append(" Can't morph from ");
                                stringBuilder.append(string2);
                                stringBuilder.append(" to ");
                                stringBuilder.append(string3);
                                throw new InflateException(stringBuilder.toString());
                            }
                            propertyValuesHolder = null;
                            if (arrc2 == null) return propertyValuesHolder;
                            return PropertyValuesHolder.ofObject(string, new a(), new Object[]{arrc2});
                        }
                        d2 = n2 == 3 ? d.a : null;
                        if (!bl3) break block14;
                        if (bl2) {
                            float f2 = n6 == 5 ? typedArray.getDimension(n3, 0.0f) : typedArray.getFloat(n3, 0.0f);
                            if (bl) {
                                float f3 = n5 == 5 ? typedArray.getDimension(n4, 0.0f) : typedArray.getFloat(n4, 0.0f);
                                propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string, new float[]{f2, f3});
                            } else {
                                propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string, new float[]{f2});
                            }
                        } else {
                            float f4 = n5 == 5 ? typedArray.getDimension(n4, 0.0f) : typedArray.getFloat(n4, 0.0f);
                            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string, new float[]{f4});
                        }
                        break block15;
                    }
                    if (!bl2) break block16;
                    int n7 = n6 == 5 ? (int)typedArray.getDimension(n3, 0.0f) : (c.d(n6) ? typedArray.getColor(n3, 0) : typedArray.getInt(n3, 0));
                    if (bl) {
                        int n8 = n5 == 5 ? (int)typedArray.getDimension(n4, 0.0f) : (c.d(n5) ? typedArray.getColor(n4, 0) : typedArray.getInt(n4, 0));
                        propertyValuesHolder2 = PropertyValuesHolder.ofInt(string, new int[]{n7, n8});
                    } else {
                        propertyValuesHolder2 = PropertyValuesHolder.ofInt(string, new int[]{n7});
                    }
                    break block15;
                }
                propertyValuesHolder = null;
                if (!bl) break block17;
                int n9 = n5 == 5 ? (int)typedArray.getDimension(n4, 0.0f) : (c.d(n5) ? typedArray.getColor(n4, 0) : typedArray.getInt(n4, 0));
                propertyValuesHolder2 = PropertyValuesHolder.ofInt(string, new int[]{n9});
            }
            propertyValuesHolder = propertyValuesHolder2;
        }
        if (propertyValuesHolder == null) return propertyValuesHolder;
        if (d2 == null) return propertyValuesHolder;
        propertyValuesHolder.setEvaluator(d2);
        return propertyValuesHolder;
    }

    public static boolean d(int n2) {
        return n2 >= 28 && n2 <= 31;
    }

    public static ValueAnimator e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        int n2;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        ValueAnimator valueAnimator3;
        TypedArray typedArray3 = h.e((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])c.w.a.a.a.g);
        TypedArray typedArray4 = h.e((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])c.w.a.a.a.k);
        ValueAnimator valueAnimator4 = valueAnimator == null ? new ValueAnimator() : valueAnimator;
        boolean bl = h.c((XmlPullParser)xmlPullParser, (String)"duration");
        int n3 = 300;
        if (bl) {
            n3 = typedArray3.getInt(1, n3);
        }
        long l = n3;
        boolean bl2 = h.c((XmlPullParser)xmlPullParser, (String)"startOffset");
        int n4 = 0;
        int n5 = !bl2 ? 0 : typedArray3.getInt(2, 0);
        long l2 = n5;
        int n6 = !h.c((XmlPullParser)xmlPullParser, (String)"valueType") ? 4 : typedArray3.getInt(7, 4);
        if (h.c((XmlPullParser)xmlPullParser, (String)"valueFrom") && h.c((XmlPullParser)xmlPullParser, (String)"valueTo")) {
            PropertyValuesHolder propertyValuesHolder;
            if (n6 == 4) {
                TypedValue typedValue = typedArray3.peekValue(5);
                boolean bl3 = typedValue != null;
                int n7 = bl3 ? typedValue.type : 0;
                TypedValue typedValue2 = typedArray3.peekValue(6);
                boolean bl4 = typedValue2 != null;
                int n8 = bl4 ? typedValue2.type : 0;
                n6 = bl3 && c.d(n7) || bl4 && c.d(n8) ? 3 : 0;
            }
            if ((propertyValuesHolder = c.c(typedArray3, n6, 5, 6, "")) != null) {
                valueAnimator4.setValues(propertyValuesHolder);
            }
        }
        valueAnimator4.setDuration(l);
        valueAnimator4.setStartDelay(l2);
        int n9 = !h.c((XmlPullParser)xmlPullParser, (String)"repeatCount") ? 0 : typedArray3.getInt(3, 0);
        valueAnimator4.setRepeatCount(n9);
        int n10 = !h.c((XmlPullParser)xmlPullParser, (String)"repeatMode") ? 1 : typedArray3.getInt(4, 1);
        valueAnimator4.setRepeatMode(n10);
        if (typedArray4 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator)valueAnimator4;
            String string = h.b((TypedArray)typedArray4, (XmlPullParser)xmlPullParser, (String)"pathData", (int)1);
            if (string != null) {
                String string2 = h.b((TypedArray)typedArray4, (XmlPullParser)xmlPullParser, (String)"propertyXName", (int)2);
                String string3 = h.b((TypedArray)typedArray4, (XmlPullParser)xmlPullParser, (String)"propertyYName", (int)3);
                if (string2 == null && string3 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(typedArray4.getPositionDescription());
                    stringBuilder.append(" propertyXName or propertyYName is needed for PathData");
                    throw new InflateException(stringBuilder.toString());
                }
                Path path = g.q((String)string);
                float f3 = 0.5f * f2;
                PathMeasure pathMeasure = new PathMeasure(path, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float f4 = 0.0f;
                do {
                    arrayList.add(Float.valueOf(f4 += pathMeasure.getLength()));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(path, false);
                int n11 = Math.min(100, 1 + (int)(f4 / f3));
                float[] arrf = new float[n11];
                float[] arrf2 = new float[n11];
                float[] arrf3 = new float[2];
                float f5 = f4 / (float)(n11 - 1);
                valueAnimator3 = valueAnimator4;
                typedArray2 = typedArray3;
                int n12 = 0;
                float f6 = 0.0f;
                while (n4 < n11) {
                    float f7 = ((Float)arrayList.get(n12)).floatValue();
                    int n13 = n11;
                    pathMeasure2.getPosTan(f6 - f7, arrf3, null);
                    arrf[n4] = arrf3[0];
                    arrf2[n4] = arrf3[1];
                    f6 += f5;
                    int n14 = n12 + 1;
                    if (n14 < arrayList.size() && f6 > ((Float)arrayList.get(n14)).floatValue()) {
                        pathMeasure2.nextContour();
                        n12 = n14;
                    }
                    ++n4;
                    n11 = n13;
                }
                PropertyValuesHolder propertyValuesHolder = string2 != null ? PropertyValuesHolder.ofFloat(string2, arrf) : null;
                PropertyValuesHolder propertyValuesHolder2 = null;
                if (string3 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(string3, arrf2);
                }
                if (propertyValuesHolder == null) {
                    objectAnimator.setValues(propertyValuesHolder2);
                } else if (propertyValuesHolder2 == null) {
                    objectAnimator.setValues(propertyValuesHolder);
                } else {
                    objectAnimator.setValues(propertyValuesHolder, propertyValuesHolder2);
                }
            } else {
                valueAnimator3 = valueAnimator4;
                typedArray2 = typedArray3;
                objectAnimator.setPropertyName(h.b((TypedArray)typedArray4, (XmlPullParser)xmlPullParser, (String)"propertyName", (int)0));
            }
        } else {
            valueAnimator3 = valueAnimator4;
            typedArray2 = typedArray3;
        }
        if (!h.c((XmlPullParser)xmlPullParser, (String)"interpolator")) {
            typedArray = typedArray2;
            n2 = 0;
        } else {
            typedArray = typedArray2;
            n2 = typedArray.getResourceId(0, 0);
        }
        if (n2 > 0) {
            Interpolator interpolator = c.s.a.k((Context)context, (int)n2);
            valueAnimator2 = valueAnimator3;
            valueAnimator2.setInterpolator(interpolator);
        } else {
            valueAnimator2 = valueAnimator3;
        }
        typedArray.recycle();
        if (typedArray4 != null) {
            typedArray4.recycle();
        }
        return valueAnimator2;
    }

    public static class a
    implements TypeEvaluator<c.h.d.c[]> {
        public c.h.d.c[] a;

        public Object evaluate(float f2, Object object, Object object2) {
            IllegalArgumentException illegalArgumentException;
            c.h.d.c[] arrc = (c.h.d.c[])object;
            c.h.d.c[] arrc2 = (c.h.d.c[])object2;
            if (g.e((c.h.d.c[])arrc, (c.h.d.c[])arrc2)) {
                if (!g.e((c.h.d.c[])this.a, (c.h.d.c[])arrc)) {
                    this.a = g.r((c.h.d.c[])arrc);
                }
                for (int i2 = 0; i2 < arrc.length; ++i2) {
                    float[] arrf;
                    c.h.d.c c2 = this.a[i2];
                    c.h.d.c c3 = arrc[i2];
                    c.h.d.c c4 = arrc2[i2];
                    Objects.requireNonNull(c2);
                    c2.a = c3.a;
                    for (int i3 = 0; i3 < (arrf = c3.b).length; ++i3) {
                        c2.b[i3] = arrf[i3] * (1.0f - f2) + f2 * c4.b[i3];
                    }
                }
                return this.a;
            }
            illegalArgumentException = new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            throw illegalArgumentException;
        }
    }

}

