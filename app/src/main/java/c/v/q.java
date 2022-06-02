/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  d.a.b.a.a
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 */
package c.v;

import android.view.View;
import c.v.i;
import d.a.b.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class q {
    public final Map<String, Object> a = new HashMap();
    public View b;
    public final ArrayList<i> c = new ArrayList();

    @Deprecated
    public q() {
    }

    public q(View view) {
        this.b = view;
    }

    public boolean equals(Object object) {
        if (object instanceof q) {
            View view = this.b;
            q q2 = (q)object;
            return view == q2.b && this.a.equals(q2.a);
        }
        return false;
    }

    public int hashCode() {
        return 31 * this.b.hashCode() + this.a.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = a.d((String)"TransitionValues@");
        stringBuilder.append(Integer.toHexString(this.hashCode()));
        stringBuilder.append(":\n");
        StringBuilder stringBuilder2 = a.e((String)stringBuilder.toString(), (String)"    view = ");
        stringBuilder2.append(this.b);
        stringBuilder2.append("\n");
        String string = a.m((String)stringBuilder2.toString(), (String)"    values:");
        for (String string2 : this.a.keySet()) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string);
            stringBuilder3.append("    ");
            stringBuilder3.append(string2);
            stringBuilder3.append(": ");
            stringBuilder3.append(this.a.get(string2));
            stringBuilder3.append("\n");
            string = stringBuilder3.toString();
        }
        return string;
    }
}

