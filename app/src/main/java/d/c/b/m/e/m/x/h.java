/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  android.util.JsonReader
 *  d.a.b.a.a
 *  d.c.b.m.e.m.a
 *  d.c.b.m.e.m.b
 *  d.c.b.m.e.m.b$b
 *  d.c.b.m.e.m.d
 *  d.c.b.m.e.m.f
 *  d.c.b.m.e.m.f$b
 *  d.c.b.m.e.m.g
 *  d.c.b.m.e.m.i
 *  d.c.b.m.e.m.i$b
 *  d.c.b.m.e.m.j
 *  d.c.b.m.e.m.k
 *  d.c.b.m.e.m.l
 *  d.c.b.m.e.m.n
 *  d.c.b.m.e.m.o
 *  d.c.b.m.e.m.q
 *  d.c.b.m.e.m.q$b
 *  d.c.b.m.e.m.r
 *  d.c.b.m.e.m.r$b
 *  d.c.b.m.e.m.s
 *  d.c.b.m.e.m.t
 *  d.c.b.m.e.m.u
 *  d.c.b.m.e.m.x.a
 *  d.c.b.m.e.m.x.b
 *  d.c.b.m.e.m.x.c
 *  d.c.b.m.e.m.x.d
 *  d.c.b.m.e.m.x.e
 *  d.c.b.m.e.m.x.f
 *  d.c.b.o.i.d
 *  d.c.b.o.i.e
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Objects
 */
package d.c.b.m.e.m.x;

import android.util.Base64;
import android.util.JsonReader;
import d.c.b.m.e.m.b;
import d.c.b.m.e.m.d;
import d.c.b.m.e.m.f;
import d.c.b.m.e.m.g;
import d.c.b.m.e.m.i;
import d.c.b.m.e.m.j;
import d.c.b.m.e.m.k;
import d.c.b.m.e.m.l;
import d.c.b.m.e.m.n;
import d.c.b.m.e.m.o;
import d.c.b.m.e.m.q;
import d.c.b.m.e.m.r;
import d.c.b.m.e.m.s;
import d.c.b.m.e.m.t;
import d.c.b.m.e.m.u;
import d.c.b.m.e.m.v;
import d.c.b.m.e.m.w;
import d.c.b.m.e.m.x.c;
import d.c.b.m.e.m.x.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class h {
    public static final d.c.b.o.a a;

    public static {
        d.c.b.o.i.e e2 = new d.c.b.o.i.e();
        ((d.c.b.m.e.m.a)d.c.b.m.e.m.a.a).a(e2);
        e2.d = true;
        a = new d.c.b.o.i.d(e2);
    }

    public static <T> w<T> a(JsonReader jsonReader, a<T> a2) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(a2.a(jsonReader));
        }
        jsonReader.endArray();
        return new w(arrayList);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static v.d.d b(JsonReader var0) {
        var0.beginObject();
        var1_1 = null;
        var2_2 = null;
        var3_3 = null;
        var4_4 = null;
        var5_5 = null;
        var6_6 = null;
        do {
            block70 : {
                block77 : {
                    block74 : {
                        block76 : {
                            block71 : {
                                block73 : {
                                    block75 : {
                                        block72 : {
                                            var7_7 = var0.hasNext();
                                            var8_8 = "";
                                            if (!var7_7) break block71;
                                            var11_9 = var0.nextName();
                                            var11_9.hashCode();
                                            switch (var11_9.hashCode()) {
                                                default: {
                                                    break;
                                                }
                                                case 55126294: {
                                                    if (!var11_9.equals((Object)"timestamp")) break;
                                                    var13_10 = 4;
                                                    break block72;
                                                }
                                                case 3575610: {
                                                    if (!var11_9.equals((Object)"type")) break;
                                                    var13_10 = 3;
                                                    break block72;
                                                }
                                                case 107332: {
                                                    if (!var11_9.equals((Object)"log")) break;
                                                    var13_10 = 2;
                                                    break block72;
                                                }
                                                case 96801: {
                                                    if (!var11_9.equals((Object)"app")) break;
                                                    var13_10 = 1;
                                                    break block72;
                                                }
                                                case -1335157162: {
                                                    if (!var11_9.equals((Object)"device")) break;
                                                    var13_10 = 0;
                                                    break block72;
                                                }
                                            }
                                            var13_10 = -1;
                                        }
                                        if (var13_10 == 0) break block73;
                                        if (var13_10 == 1) break block74;
                                        if (var13_10 == 2) break block75;
                                        if (var13_10 != 3) {
                                            if (var13_10 != 4) {
                                                var0.skipValue();
                                            } else {
                                                var1_1 = var0.nextLong();
                                            }
                                        } else {
                                            var52_41 = var0.nextString();
                                            Objects.requireNonNull(var52_41, "Null type");
                                            var3_3 = var52_41;
                                        }
                                        break block70;
                                    }
                                    var0.beginObject();
                                    var48_39 = null;
                                    break block76;
                                }
                                var14_11 = new r.b();
                                var0.beginObject();
                                break block77;
                            }
                            var0.endObject();
                            if (var1_1 == null) {
                                var8_8 = " timestamp";
                            }
                            if (var3_3 == null) {
                                var8_8 = d.a.b.a.a.m((String)var8_8, (String)" type");
                            }
                            if (var4_4 == null) {
                                var8_8 = d.a.b.a.a.m((String)var8_8, (String)" app");
                            }
                            if (var5_5 == null) {
                                var8_8 = d.a.b.a.a.m((String)var8_8, (String)" device");
                            }
                            if (var8_8.isEmpty()) {
                                return new j(var1_1.longValue(), var3_3, var4_4, var5_5, var6_6, null);
                            }
                            var10_43 = new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var8_8));
                            throw var10_43;
                        }
                        while (var0.hasNext()) {
                            var49_40 = var0.nextName();
                            var49_40.hashCode();
                            if (!var49_40.equals((Object)"content")) {
                                var0.skipValue();
                                continue;
                            }
                            var48_39 = var0.nextString();
                            Objects.requireNonNull(var48_39, "Null content");
                        }
                        var0.endObject();
                        if (var48_39 == null) {
                            var8_8 = " content";
                        }
                        if (var8_8.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var8_8));
                        var6_6 = new s(var48_39, null);
                        break block70;
                    }
                    var0.beginObject();
                    var18_14 = null;
                    var19_15 = null;
                    var20_16 = null;
                    block29 : do {
                        block78 : {
                            var21_17 = 3;
                            if (!var0.hasNext()) ** GOTO lbl134
                            var23_19 = var0.nextName();
                            var23_19.hashCode();
                            switch (var23_19.hashCode()) {
                                default: {
                                    break;
                                }
                                case 928737948: {
                                    if (!var23_19.equals((Object)"uiOrientation")) break;
                                    var25_20 = 3;
                                    break block78;
                                }
                                case 555169704: {
                                    if (!var23_19.equals((Object)"customAttributes")) break;
                                    var25_20 = 2;
                                    break block78;
                                }
                                case -1090974952: {
                                    if (!var23_19.equals((Object)"execution")) break;
                                    var25_20 = 1;
                                    break block78;
                                }
                                case -1332194002: {
                                    if (!var23_19.equals((Object)"background")) break;
                                    var25_20 = 0;
                                    break block78;
                                }
                            }
                            var25_20 = -1;
                        }
                        if (var25_20 != 0) {
                            if (var25_20 != 1) {
                                if (var25_20 != 2) {
                                    if (var25_20 != var21_17) {
                                        var0.skipValue();
                                        continue;
                                    }
                                    var2_2 = var0.nextInt();
                                    continue;
                                }
                                var19_15 = h.a(var0, c.a);
                                continue;
                            }
                        } else {
                            var20_16 = var0.nextBoolean();
                            continue;
lbl134: // 1 sources:
                            var0.endObject();
                            if (var18_14 == null) {
                                var8_8 = " execution";
                            }
                            if (var2_2 == null) {
                                var8_8 = d.a.b.a.a.m((String)var8_8, (String)" uiOrientation");
                            }
                            if (var8_8.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var8_8));
                            var4_4 = var22_18 = new k(var18_14, var19_15, var20_16, var2_2.intValue(), null);
                            break block70;
                        }
                        var0.beginObject();
                        var26_21 = null;
                        var27_22 = null;
                        var28_23 = null;
                        var29_24 = null;
                        do {
                            block83 : {
                                block82 : {
                                    block79 : {
                                        block81 : {
                                            block80 : {
                                                if (!var0.hasNext()) break block79;
                                                var32_27 = var0.nextName();
                                                var32_27.hashCode();
                                                switch (var32_27.hashCode()) {
                                                    default: {
                                                        break;
                                                    }
                                                    case 1481625679: {
                                                        if (!var32_27.equals((Object)"exception")) break;
                                                        var34_28 = 3;
                                                        break block80;
                                                    }
                                                    case 937615455: {
                                                        if (!var32_27.equals((Object)"binaries")) break;
                                                        var34_28 = 2;
                                                        break block80;
                                                    }
                                                    case -902467928: {
                                                        if (!var32_27.equals((Object)"signal")) break;
                                                        var34_28 = 1;
                                                        break block80;
                                                    }
                                                    case -1337936983: {
                                                        if (!var32_27.equals((Object)"threads")) break;
                                                        var34_28 = 0;
                                                        break block80;
                                                    }
                                                }
                                                var34_28 = -1;
                                            }
                                            if (var34_28 == 0) break block81;
                                            if (var34_28 != 1) {
                                                if (var34_28 != 2) {
                                                    if (var34_28 != var21_17) {
                                                        var0.skipValue();
                                                        continue;
                                                    }
                                                    var26_21 = h.c(var0);
                                                    continue;
                                                }
                                                var28_23 = h.a(var0, e.a);
                                                continue;
                                            }
                                            var0.beginObject();
                                            var35_29 = null;
                                            var36_30 = null;
                                            var37_31 = null;
                                            break block82;
                                        }
                                        var29_24 = h.a(var0, d.c.b.m.e.m.x.d.a);
                                        break block83;
                                    }
                                    var0.endObject();
                                    var30_25 = var29_24 == null ? " threads" : var8_8;
                                    if (var26_21 == null) {
                                        var30_25 = d.a.b.a.a.m((String)var30_25, (String)" exception");
                                    }
                                    if (var27_22 == null) {
                                        var30_25 = d.a.b.a.a.m((String)var30_25, (String)" signal");
                                    }
                                    if (var28_23 == null) {
                                        var30_25 = d.a.b.a.a.m((String)var30_25, (String)" binaries");
                                    }
                                    if (var30_25.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var30_25));
                                    var18_14 = var31_26 = new l(var29_24, var26_21, var27_22, var28_23, null);
                                    continue block29;
                                }
                                while (var0.hasNext()) {
                                    block86 : {
                                        block84 : {
                                            block85 : {
                                                var40_34 = var0.nextName();
                                                var40_34.hashCode();
                                                var42_35 = var40_34.hashCode();
                                                if (var42_35 == -1147692044) break block84;
                                                if (var42_35 == 3059181) break block85;
                                                if (var42_35 != 3373707 || !var40_34.equals((Object)"name")) ** GOTO lbl-1000
                                                var43_36 = 2;
                                                break block86;
                                            }
                                            if (!var40_34.equals((Object)"code")) ** GOTO lbl-1000
                                            var43_36 = 1;
                                            break block86;
                                        }
                                        if (!var40_34.equals((Object)"address")) lbl-1000: // 3 sources:
                                        {
                                            var43_36 = -1;
                                        } else {
                                            var43_36 = 0;
                                        }
                                    }
                                    if (var43_36 != 0) {
                                        if (var43_36 != 1) {
                                            if (var43_36 != 2) {
                                                var0.skipValue();
                                                continue;
                                            }
                                            var46_38 = var0.nextString();
                                            Objects.requireNonNull(var46_38, "Null name");
                                            var36_30 = var46_38;
                                            continue;
                                        }
                                        var44_37 = var0.nextString();
                                        Objects.requireNonNull(var44_37, "Null code");
                                        var37_31 = var44_37;
                                        continue;
                                    }
                                    var35_29 = var0.nextLong();
                                }
                                var0.endObject();
                                var38_32 = var36_30 == null ? " name" : var8_8;
                                if (var37_31 == null) {
                                    var38_32 = d.a.b.a.a.m((String)var38_32, (String)" code");
                                }
                                if (var35_29 == null) {
                                    var38_32 = d.a.b.a.a.m((String)var38_32, (String)" address");
                                }
                                if (var38_32.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var38_32));
                                var27_22 = var39_33 = new o(var36_30, var37_31, var35_29.longValue(), null);
                            }
                            var21_17 = 3;
                        } while (true);
                        break;
                    } while (true);
                }
                while (var0.hasNext()) {
                    block87 : {
                        var15_12 = var0.nextName();
                        var15_12.hashCode();
                        switch (var15_12.hashCode()) {
                            default: {
                                break;
                            }
                            case 1516795582: {
                                if (!var15_12.equals((Object)"proximityOn")) break;
                                var17_13 = 5;
                                break block87;
                            }
                            case 976541947: {
                                if (!var15_12.equals((Object)"ramUsed")) break;
                                var17_13 = 4;
                                break block87;
                            }
                            case 279795450: {
                                if (!var15_12.equals((Object)"diskUsed")) break;
                                var17_13 = 3;
                                break block87;
                            }
                            case -1439500848: {
                                if (!var15_12.equals((Object)"orientation")) break;
                                var17_13 = 2;
                                break block87;
                            }
                            case -1455558134: {
                                if (!var15_12.equals((Object)"batteryVelocity")) break;
                                var17_13 = 1;
                                break block87;
                            }
                            case -1708606089: {
                                if (!var15_12.equals((Object)"batteryLevel")) break;
                                var17_13 = 0;
                                break block87;
                            }
                        }
                        var17_13 = -1;
                    }
                    if (var17_13 != 0) {
                        if (var17_13 != 1) {
                            if (var17_13 != 2) {
                                if (var17_13 != 3) {
                                    if (var17_13 != 4) {
                                        if (var17_13 != 5) {
                                            var0.skipValue();
                                            continue;
                                        }
                                        var14_11.c = var0.nextBoolean();
                                        continue;
                                    }
                                    var14_11.e = var0.nextLong();
                                    continue;
                                }
                                var14_11.f = var0.nextLong();
                                continue;
                            }
                            var14_11.d = var0.nextInt();
                            continue;
                        }
                        var14_11.b = var0.nextInt();
                        continue;
                    }
                    var14_11.a = var0.nextDouble();
                }
                var0.endObject();
                var5_5 = var14_11.a();
            }
            var2_2 = null;
        } while (true);
    }

    public static v.d.d.a.b.b c(JsonReader jsonReader) {
        IllegalStateException illegalStateException;
        jsonReader.beginObject();
        Integer n2 = null;
        String string = null;
        String string2 = null;
        w<T> w2 = null;
        v.d.d.a.b.b b2 = null;
        block14 : while (jsonReader.hasNext()) {
            String string3 = jsonReader.nextName();
            string3.hashCode();
            string3.hashCode();
            int n3 = -1;
            switch (string3.hashCode()) {
                default: {
                    break;
                }
                case 581754413: {
                    if (!string3.equals("overflowCount")) break;
                    n3 = 4;
                    break;
                }
                case 91997906: {
                    if (!string3.equals("causedBy")) break;
                    n3 = 3;
                    break;
                }
                case 3575610: {
                    if (!string3.equals("type")) break;
                    n3 = 2;
                    break;
                }
                case -934964668: {
                    if (!string3.equals("reason")) break;
                    n3 = 1;
                    break;
                }
                case -1266514778: {
                    if (!string3.equals("frames")) break;
                    n3 = 0;
                }
            }
            switch (n3) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    n2 = jsonReader.nextInt();
                    continue block14;
                }
                case 3: {
                    b2 = h.c(jsonReader);
                    continue block14;
                }
                case 2: {
                    string = jsonReader.nextString();
                    Objects.requireNonNull((Object)string, "Null type");
                    continue block14;
                }
                case 1: {
                    string2 = jsonReader.nextString();
                    continue block14;
                }
                case 0: 
            }
            w2 = h.a(jsonReader, d.c.b.m.e.m.x.f.a);
        }
        jsonReader.endObject();
        String string4 = string == null ? " type" : "";
        if (w2 == null) {
            string4 = d.a.b.a.a.m((String)string4, (String)" frames");
        }
        if (n2 == null) {
            string4 = d.a.b.a.a.m((String)string4, (String)" overflowCount");
        }
        if (string4.isEmpty()) {
            n n4 = new n(string, string2, w2, b2, n2.intValue(), null);
            return n4;
        }
        illegalStateException = new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)string4));
        throw illegalStateException;
    }

    public static v.d.d.a.b.d.a d(JsonReader jsonReader) {
        q.b b2 = new q.b();
        jsonReader.beginObject();
        block14 : while (jsonReader.hasNext()) {
            String string = jsonReader.nextName();
            string.hashCode();
            int n2 = -1;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2125650548: {
                    if (!string.equals("importance")) break;
                    n2 = 4;
                    break;
                }
                case 3143036: {
                    if (!string.equals("file")) break;
                    n2 = 3;
                    break;
                }
                case 3571: {
                    if (!string.equals("pc")) break;
                    n2 = 2;
                    break;
                }
                case -887523944: {
                    if (!string.equals("symbol")) break;
                    n2 = 1;
                    break;
                }
                case -1019779949: {
                    if (!string.equals("offset")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    jsonReader.skipValue();
                    continue block14;
                }
                case 4: {
                    b2.e = jsonReader.nextInt();
                    continue block14;
                }
                case 3: {
                    b2.c = jsonReader.nextString();
                    continue block14;
                }
                case 2: {
                    b2.a = jsonReader.nextLong();
                    continue block14;
                }
                case 1: {
                    String string2 = jsonReader.nextString();
                    Objects.requireNonNull((Object)string2, "Null symbol");
                    b2.b = string2;
                    continue block14;
                }
                case 0: 
            }
            b2.d = jsonReader.nextLong();
        }
        jsonReader.endObject();
        return b2.a();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static v e(JsonReader var0) {
        var2_1 = new b.b();
        var0.beginObject();
        block82 : do {
            block115 : {
                if (!var0.hasNext()) {
                    var0.endObject();
                    return var2_1.a();
                }
                var3_2 = var0.nextName();
                var3_2.hashCode();
                switch (var3_2.hashCode()) {
                    default: {
                        break;
                    }
                    case 1984987798: {
                        if (!var3_2.equals((Object)"session")) break;
                        var5_3 = 7;
                        break block115;
                    }
                    case 1975623094: {
                        if (!var3_2.equals((Object)"displayVersion")) break;
                        var5_3 = 6;
                        break block115;
                    }
                    case 1874684019: {
                        if (!var3_2.equals((Object)"platform")) break;
                        var5_3 = 5;
                        break block115;
                    }
                    case 719853845: {
                        if (!var3_2.equals((Object)"installationUuid")) break;
                        var5_3 = 4;
                        break block115;
                    }
                    case 344431858: {
                        if (!var3_2.equals((Object)"gmpAppId")) break;
                        var5_3 = 3;
                        break block115;
                    }
                    case -911706486: {
                        if (!var3_2.equals((Object)"buildVersion")) break;
                        var5_3 = 2;
                        break block115;
                    }
                    case -1962630338: {
                        if (!var3_2.equals((Object)"sdkVersion")) break;
                        var5_3 = 1;
                        break block115;
                    }
                    case -2118372775: {
                        if (!var3_2.equals((Object)"ndkPayload")) break;
                        var5_3 = 0;
                        break block115;
                    }
                }
                var5_3 = -1;
            }
            var6_4 = "";
            switch (var5_3) {
                default: {
                    var0.skipValue();
                    continue block82;
                }
                case 7: {
                    var23_15 = new f.b();
                    var23_15.b(false);
                    var0.beginObject();
                    while (var0.hasNext()) {
                        var25_16 = var0.nextName();
                        var25_16.hashCode();
                        switch (var25_16.hashCode()) {
                            default: {
                                break;
                            }
                            case 2047016109: {
                                if (!var25_16.equals((Object)"generatorType")) break;
                                var27_17 = 10;
                                ** GOTO lbl106
                            }
                            case 1025385094: {
                                if (!var25_16.equals((Object)"crashed")) break;
                                var27_17 = 9;
                                ** GOTO lbl106
                            }
                            case 286956243: {
                                if (!var25_16.equals((Object)"generator")) break;
                                var27_17 = 8;
                                ** GOTO lbl106
                            }
                            case 3599307: {
                                if (!var25_16.equals((Object)"user")) break;
                                var27_17 = 7;
                                ** GOTO lbl106
                            }
                            case 96801: {
                                if (!var25_16.equals((Object)"app")) break;
                                var27_17 = 6;
                                ** GOTO lbl106
                            }
                            case 3556: {
                                if (!var25_16.equals((Object)"os")) break;
                                var27_17 = 5;
                                ** GOTO lbl106
                            }
                            case -1291329255: {
                                if (!var25_16.equals((Object)"events")) break;
                                var27_17 = 4;
                                ** GOTO lbl106
                            }
                            case -1335157162: {
                                if (!var25_16.equals((Object)"device")) break;
                                var27_17 = 3;
                                ** GOTO lbl106
                            }
                            case -1606742899: {
                                if (!var25_16.equals((Object)"endedAt")) break;
                                var27_17 = 2;
                                ** GOTO lbl106
                            }
                            case -1618432855: {
                                if (!var25_16.equals((Object)"identifier")) break;
                                var27_17 = 1;
                                ** GOTO lbl106
                            }
                            case -2128794476: {
                                if (!var25_16.equals((Object)"startedAt")) break;
                                var27_17 = 0;
                                ** GOTO lbl106
                            }
                        }
                        var27_17 = -1;
lbl106: // 12 sources:
                        switch (var27_17) {
                            default: {
                                var28_18 = var6_4;
                                var0.skipValue();
                                ** GOTO lbl380
                            }
                            case 10: {
                                var23_15.k = var0.nextInt();
                                ** GOTO lbl138
                            }
                            case 9: {
                                var23_15.b(var0.nextBoolean());
                                ** GOTO lbl138
                            }
                            case 8: {
                                var73_51 = var0.nextString();
                                Objects.requireNonNull(var73_51, "Null generator");
                                var23_15.a = var73_51;
                                ** GOTO lbl138
                            }
                            case 7: {
                                var0.beginObject();
                                var68_48 = null;
                                while (var0.hasNext()) {
                                    var70_50 = var0.nextName();
                                    var70_50.hashCode();
                                    if (!var70_50.equals((Object)"identifier")) {
                                        var0.skipValue();
                                        continue;
                                    }
                                    var68_48 = var0.nextString();
                                    Objects.requireNonNull(var68_48, "Null identifier");
                                }
                                var0.endObject();
                                var69_49 = var68_48 == null ? " identifier" : var6_4;
                                if (var69_49.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var69_49));
                                var23_15.g = new u(var68_48, null);
lbl138: // 4 sources:
                                var28_18 = var6_4;
                                ** GOTO lbl380
                            }
                            case 6: {
                                var0.beginObject();
                                var52_35 = null;
                                var53_36 = null;
                                var54_37 = null;
                                var55_38 = null;
                                var56_39 = null;
                                var57_40 = null;
                                while (var0.hasNext()) {
                                    var60_43 = var0.nextName();
                                    var60_43.hashCode();
                                    switch (var60_43.hashCode()) {
                                        case 1975623094: {
                                            if (!var60_43.equals((Object)"displayVersion")) ** GOTO lbl162
                                            var63_45 = 5;
                                            ** GOTO lbl166
                                        }
                                        case 719853845: {
                                            if (!var60_43.equals((Object)"installationUuid")) ** GOTO lbl162
                                            var63_45 = 4;
                                            ** GOTO lbl166
                                        }
                                        case 351608024: {
                                            if (var60_43.equals((Object)"version")) ** GOTO lbl165
                                        }
lbl162: // 4 sources:
                                        default: {
                                            var62_44 = var6_4;
                                            ** GOTO lbl-1000
                                        }
lbl165: // 1 sources:
                                        var63_45 = 3;
lbl166: // 3 sources:
                                        var62_44 = var6_4;
                                        ** GOTO lbl184
                                        case 213652010: {
                                            var62_44 = var6_4;
                                            if (!var60_43.equals((Object)"developmentPlatformVersion")) ** GOTO lbl-1000
                                            var63_45 = 2;
                                            ** GOTO lbl184
                                        }
                                        case -519438642: {
                                            var62_44 = var6_4;
                                            if (!var60_43.equals((Object)"developmentPlatform")) ** GOTO lbl-1000
                                            var63_45 = 1;
                                            ** GOTO lbl184
                                        }
                                        case -1618432855: 
                                    }
                                    var62_44 = var6_4;
                                    if (var60_43.equals((Object)"identifier")) {
                                        var63_45 = 0;
                                    } else lbl-1000: // 4 sources:
                                    {
                                        var63_45 = -1;
                                    }
lbl184: // 5 sources:
                                    if (var63_45 != 0) {
                                        if (var63_45 != 1) {
                                            if (var63_45 != 2) {
                                                if (var63_45 != 3) {
                                                    if (var63_45 != 4) {
                                                        if (var63_45 != 5) {
                                                            var0.skipValue();
                                                        } else {
                                                            var54_37 = var0.nextString();
                                                        }
                                                    } else {
                                                        var55_38 = var0.nextString();
                                                    }
                                                } else {
                                                    var66_47 = var0.nextString();
                                                    Objects.requireNonNull(var66_47, "Null version");
                                                    var53_36 = var66_47;
                                                }
                                            } else {
                                                var57_40 = var0.nextString();
                                            }
                                        } else {
                                            var56_39 = var0.nextString();
                                        }
                                    } else {
                                        var64_46 = var0.nextString();
                                        Objects.requireNonNull(var64_46, "Null identifier");
                                        var52_35 = var64_46;
                                    }
                                    var6_4 = var62_44;
                                }
                                var28_18 = var6_4;
                                var0.endObject();
                                var58_41 = var52_35 == null ? " identifier" : var28_18;
                                if (var53_36 == null) {
                                    var58_41 = d.a.b.a.a.m((String)var58_41, (String)" version");
                                }
                                if (var58_41.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var58_41));
                                var59_42 = new g(var52_35, var53_36, var54_37, null, var55_38, var56_39, var57_40, null);
                                var23_15.f = var59_42;
                                ** GOTO lbl380
                            }
                            case 5: {
                                var28_18 = var6_4;
                                var0.beginObject();
                                var39_25 = null;
                                var40_26 = null;
                                var41_27 = null;
                                var42_28 = null;
                                while (var0.hasNext()) {
                                    var45_31 = var0.nextName();
                                    var45_31.hashCode();
                                    switch (var45_31.hashCode()) {
                                        default: {
                                            break;
                                        }
                                        case 1874684019: {
                                            if (!var45_31.equals((Object)"platform")) break;
                                            var47_32 = 3;
                                            ** GOTO lbl248
                                        }
                                        case 351608024: {
                                            if (!var45_31.equals((Object)"version")) break;
                                            var47_32 = 2;
                                            ** GOTO lbl248
                                        }
                                        case -293026577: {
                                            if (!var45_31.equals((Object)"jailbroken")) break;
                                            var47_32 = 1;
                                            ** GOTO lbl248
                                        }
                                        case -911706486: {
                                            if (!var45_31.equals((Object)"buildVersion")) break;
                                            var47_32 = 0;
                                            ** GOTO lbl248
                                        }
                                    }
                                    var47_32 = -1;
lbl248: // 5 sources:
                                    if (var47_32 != 0) {
                                        if (var47_32 != 1) {
                                            if (var47_32 != 2) {
                                                if (var47_32 != 3) {
                                                    var0.skipValue();
                                                    continue;
                                                }
                                                var40_26 = var0.nextInt();
                                                continue;
                                            }
                                            var50_34 = var0.nextString();
                                            Objects.requireNonNull(var50_34, "Null version");
                                            var41_27 = var50_34;
                                            continue;
                                        }
                                        var39_25 = var0.nextBoolean();
                                        continue;
                                    }
                                    var48_33 = var0.nextString();
                                    Objects.requireNonNull(var48_33, "Null buildVersion");
                                    var42_28 = var48_33;
                                }
                                var0.endObject();
                                var43_29 = var40_26 == null ? " platform" : var28_18;
                                if (var41_27 == null) {
                                    var43_29 = d.a.b.a.a.m((String)var43_29, (String)" version");
                                }
                                if (var42_28 == null) {
                                    var43_29 = d.a.b.a.a.m((String)var43_29, (String)" buildVersion");
                                }
                                if (var39_25 == null) {
                                    var43_29 = d.a.b.a.a.m((String)var43_29, (String)" jailbroken");
                                }
                                if (var43_29.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var43_29));
                                var44_30 = new t(var40_26.intValue(), var41_27, var42_28, var39_25.booleanValue(), null);
                                var23_15.h = var44_30;
                                ** GOTO lbl380
                            }
                            case 4: {
                                var28_18 = var6_4;
                                var23_15.j = h.a(var0, d.c.b.m.e.m.x.a.a);
                                ** GOTO lbl380
                            }
                            case 3: {
                                var28_18 = var6_4;
                                var29_19 = new i.b();
                                var0.beginObject();
                                block87 : while (var0.hasNext()) {
                                    var30_20 = var0.nextName();
                                    var30_20.hashCode();
                                    switch (var30_20.hashCode()) {
                                        default: {
                                            break;
                                        }
                                        case 2078953423: {
                                            if (!var30_20.equals((Object)"modelClass")) break;
                                            var32_21 = 8;
                                            ** GOTO lbl329
                                        }
                                        case 109757585: {
                                            if (!var30_20.equals((Object)"state")) break;
                                            var32_21 = 7;
                                            ** GOTO lbl329
                                        }
                                        case 104069929: {
                                            if (!var30_20.equals((Object)"model")) break;
                                            var32_21 = 6;
                                            ** GOTO lbl329
                                        }
                                        case 94848180: {
                                            if (!var30_20.equals((Object)"cores")) break;
                                            var32_21 = 5;
                                            ** GOTO lbl329
                                        }
                                        case 81784169: {
                                            if (!var30_20.equals((Object)"diskSpace")) break;
                                            var32_21 = 4;
                                            ** GOTO lbl329
                                        }
                                        case 3002454: {
                                            if (!var30_20.equals((Object)"arch")) break;
                                            var32_21 = 3;
                                            ** GOTO lbl329
                                        }
                                        case 112670: {
                                            if (!var30_20.equals((Object)"ram")) break;
                                            var32_21 = 2;
                                            ** GOTO lbl329
                                        }
                                        case -1969347631: {
                                            if (!var30_20.equals((Object)"manufacturer")) break;
                                            var32_21 = 1;
                                            ** GOTO lbl329
                                        }
                                        case -1981332476: {
                                            if (!var30_20.equals((Object)"simulator")) break;
                                            var32_21 = 0;
                                            ** GOTO lbl329
                                        }
                                    }
                                    var32_21 = -1;
lbl329: // 10 sources:
                                    switch (var32_21) {
                                        default: {
                                            var0.skipValue();
                                            continue block87;
                                        }
                                        case 8: {
                                            var37_24 = var0.nextString();
                                            Objects.requireNonNull(var37_24, "Null modelClass");
                                            var29_19.i = var37_24;
                                            continue block87;
                                        }
                                        case 7: {
                                            var29_19.g = var0.nextInt();
                                            continue block87;
                                        }
                                        case 6: {
                                            var35_23 = var0.nextString();
                                            Objects.requireNonNull(var35_23, "Null model");
                                            var29_19.b = var35_23;
                                            continue block87;
                                        }
                                        case 5: {
                                            var29_19.c = var0.nextInt();
                                            continue block87;
                                        }
                                        case 4: {
                                            var29_19.e = var0.nextLong();
                                            continue block87;
                                        }
                                        case 3: {
                                            var29_19.a = var0.nextInt();
                                            continue block87;
                                        }
                                        case 2: {
                                            var29_19.d = var0.nextLong();
                                            continue block87;
                                        }
                                        case 1: {
                                            var33_22 = var0.nextString();
                                            Objects.requireNonNull(var33_22, "Null manufacturer");
                                            var29_19.h = var33_22;
                                            continue block87;
                                        }
                                        case 0: 
                                    }
                                    var29_19.f = var0.nextBoolean();
                                }
                                var0.endObject();
                                var23_15.i = var29_19.a();
                                ** GOTO lbl380
                            }
                            case 2: {
                                var28_18 = var6_4;
                                var23_15.d = var0.nextLong();
                                ** GOTO lbl380
                            }
                            case 1: {
                                var28_18 = var6_4;
                                var23_15.b = new String(Base64.decode(var0.nextString(), 2), v.a);
                                ** GOTO lbl380
                            }
                            case 0: 
                        }
                        var28_18 = var6_4;
                        var23_15.c = var0.nextLong();
lbl380: // 9 sources:
                        var6_4 = var28_18;
                    }
                    var0.endObject();
                    var2_1.g = var23_15.a();
                    continue block82;
                }
                case 6: {
                    var21_14 = var0.nextString();
                    Objects.requireNonNull(var21_14, "Null displayVersion");
                    var2_1.f = var21_14;
                    continue block82;
                }
                case 5: {
                    var2_1.c = var0.nextInt();
                    continue block82;
                }
                case 4: {
                    var19_13 = var0.nextString();
                    Objects.requireNonNull(var19_13, "Null installationUuid");
                    var2_1.d = var19_13;
                    continue block82;
                }
                case 3: {
                    var17_12 = var0.nextString();
                    Objects.requireNonNull(var17_12, "Null gmpAppId");
                    var2_1.b = var17_12;
                    continue block82;
                }
                case 2: {
                    var15_11 = var0.nextString();
                    Objects.requireNonNull(var15_11, "Null buildVersion");
                    var2_1.e = var15_11;
                    continue block82;
                }
                case 1: {
                    var13_10 = var0.nextString();
                    Objects.requireNonNull(var13_10, "Null sdkVersion");
                    var2_1.a = var13_10;
                    continue block82;
                }
                case 0: 
            }
            var7_5 = var6_4;
            var0.beginObject();
            var8_6 = null;
            var9_7 = null;
            while (var0.hasNext()) {
                var11_9 = var0.nextName();
                var11_9.hashCode();
                if (!var11_9.equals((Object)"files")) {
                    if (!var11_9.equals((Object)"orgId")) {
                        var0.skipValue();
                        continue;
                    }
                    var8_6 = var0.nextString();
                    continue;
                }
                var9_7 = h.a(var0, d.c.b.m.e.m.x.b.a);
            }
            var0.endObject();
            var10_8 = var9_7 == null ? " files" : var7_5;
            if (var10_8.isEmpty() == false) throw new IllegalStateException(d.a.b.a.a.m((String)"Missing required properties:", (String)var10_8));
            var2_1.h = new d(var9_7, var8_6, null);
        } while (true);
    }

    /*
     * Exception decompiling
     */
    public v f(String var1_1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
        // org.benf.cfr.reader.b.a.a.j.b(Op04StructuredStatement.java:409)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:487)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public String g(v v2) {
        return ((d.c.b.o.i.d)a).a(v2);
    }

    public interface a<T> {
        T a(JsonReader var1);
    }

}

