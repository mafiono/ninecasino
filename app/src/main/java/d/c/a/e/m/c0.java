/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$d
 *  androidx.recyclerview.widget.RecyclerView$z
 *  d.c.a.e.m.g
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Calendar
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Locale
 */
package d.c.a.e.m;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import d.c.a.e.m.a0;
import d.c.a.e.m.b;
import d.c.a.e.m.b0;
import d.c.a.e.m.c;
import d.c.a.e.m.d;
import d.c.a.e.m.g;
import d.c.a.e.m.s;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

public class c0
extends RecyclerView.d<a> {
    public final g<?> c;

    public c0(g<?> g2) {
        this.c = g2;
    }

    public int a() {
        return this.c.b0.i;
    }

    public void c(RecyclerView.z z3, int n2) {
        a a2 = (a)z3;
        int n3 = n2 + this.c.b0.e.h;
        String string = a2.t.getContext().getString(2131624052);
        TextView textView = a2.t;
        Locale locale = Locale.getDefault();
        Object[] arrobject = new Object[]{n3};
        textView.setText(String.format(locale, "%d", arrobject));
        TextView textView2 = a2.t;
        Object[] arrobject2 = new Object[]{n3};
        textView2.setContentDescription(String.format(string, arrobject2));
        c c3 = this.c.e0;
        Calendar calendar = a0.d();
        b b3 = calendar.get(1) == n3 ? c3.f : c3.d;
        Iterator iterator = this.c.a0.p().iterator();
        while (iterator.hasNext()) {
            calendar.setTimeInMillis(((Long)iterator.next()).longValue());
            if (calendar.get(1) != n3) continue;
            b3 = c3.e;
        }
        b3.b(a2.t);
        a2.t.setOnClickListener(new b0(this, n3));
    }

    public RecyclerView.z d(ViewGroup viewGroup, int n2) {
        return new a((TextView)LayoutInflater.from(viewGroup.getContext()).inflate(2131427405, viewGroup, false));
    }

    public int e(int n2) {
        return n2 - this.c.b0.e.h;
    }

    public static class a
    extends RecyclerView.z {
        public final TextView t;

        public a(TextView textView) {
            super((View)textView);
            this.t = textView;
        }
    }

}

