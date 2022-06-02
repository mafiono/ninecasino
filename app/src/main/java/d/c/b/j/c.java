/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Date
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 */
package d.c.b.j;

import android.os.Bundle;
import android.text.TextUtils;
import d.c.b.j.a;
import d.c.b.j.b;
import d.c.b.k.a.a;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class c {
    public final d.c.b.k.a.a a;
    public final String b;
    public Integer c;

    public c(d.c.b.k.a.a a2, String string) {
        this.a = a2;
        this.b = string;
        this.c = null;
    }

    public final List<a.c> a() {
        return this.a.d(this.b, "");
    }

    public final void b(Collection<a.c> collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            String string = ((a.c)iterator.next()).b;
            this.a.clearConditionalUserProperty(string, null, null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(List<Map<String, String>> list) {
        if (this.a == null) {
            a a2 = new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            throw a2;
        }
        ArrayList arrayList = new ArrayList();
        for (Map map : list) {
            b b2;
            ArrayList arrayList2 = new ArrayList();
            for (String string : b.g) {
                if (map.containsKey(string)) continue;
                arrayList2.add(string);
            }
            if (!arrayList2.isEmpty()) {
                throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList2}));
            }
            try {
                Date date = b.h.parse((String)map.get("experimentStartTime"));
                long l2 = Long.parseLong(map.get("triggerTimeoutMillis"));
                long l3 = Long.parseLong(map.get("timeToLiveMillis"));
                String string = (String)map.get("experimentId");
                String string2 = (String)map.get("variantId");
                String string3 = map.containsKey("triggerEvent") ? (String)map.get("triggerEvent") : "";
                b2 = new b(string, string2, string3, date, l2, l3);
            }
            catch (NumberFormatException numberFormatException) {
                throw new a("Could not process experiment: one of the durations could not be converted into a long.", (Exception) numberFormatException);
            }
            catch (ParseException parseException) {
                throw new a("Could not process experiment: parsing experiment start time failed.", (Exception) parseException);
            }
            arrayList.add(b2);
        }
        if (arrayList.isEmpty()) {
            if (this.a == null) throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            this.b(this.a());
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            hashSet.add(((b)iterator.next()).a);
        }
        List<a.c> list2 = this.a();
        HashSet hashSet2 = new HashSet();
        Iterator iterator2 = list2.iterator();
        while (iterator2.hasNext()) {
            hashSet2.add((Object)((a.c)iterator2.next()).b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (a.c c2 : list2) {
            if (hashSet.contains((Object)c2.b)) continue;
            arrayList3.add((Object)c2);
        }
        this.b((Collection<a.c>)arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (b b3 : arrayList) {
            if (hashSet2.contains(b3.a)) continue;
            arrayList4.add(b3);
        }
        ArrayDeque arrayDeque = new ArrayDeque(this.a());
        if (this.c == null) {
            this.c = this.a.g(this.b);
        }
        int n2 = this.c;
        Iterator iterator3 = arrayList4.iterator();
        while (iterator3.hasNext()) {
            b b4 = (b)iterator3.next();
            while (arrayDeque.size() >= n2) {
                String string = ((a.c)arrayDeque.pollFirst()).b;
                this.a.clearConditionalUserProperty(string, null, null);
            }
            String string = this.b;
            Objects.requireNonNull((Object)b4);
            a.c c3 = new a.c();
            c3.a = string;
            c3.m = b4.d.getTime();
            c3.b = b4.a;
            c3.c = b4.b;
            String string4 = TextUtils.isEmpty(b4.c) ? null : b4.c;
            c3.d = string4;
            c3.e = b4.e;
            c3.j = b4.f;
            this.a.c(c3);
            arrayDeque.offer((Object)c3);
        }
    }
}

