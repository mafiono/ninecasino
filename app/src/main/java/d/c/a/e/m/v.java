/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.LinearLayout
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$d
 *  androidx.recyclerview.widget.RecyclerView$e
 *  androidx.recyclerview.widget.RecyclerView$m
 *  androidx.recyclerview.widget.RecyclerView$z
 *  c.h.j.a
 *  c.h.j.n
 *  c.h.j.n$b
 *  com.google.android.material.datepicker.MaterialCalendarGridView
 *  d.c.a.e.m.g
 *  d.c.a.e.m.o
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Calendar
 */
package d.c.a.e.m;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c.h.j.n;
import c.h.j.q;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import d.c.a.e.m.d;
import d.c.a.e.m.g;
import d.c.a.e.m.o;
import d.c.a.e.m.s;
import d.c.a.e.m.t;
import d.c.a.e.m.u;
import java.util.Calendar;

public class v
extends RecyclerView.d<a> {
    public final d.c.a.e.m.a c;
    public final d<?> d;
    public final g.f e;
    public final int f;

    public v(Context context, d<?> d3, d.c.a.e.m.a a2, g.f f2) {
        s s4 = a2.e;
        s s5 = a2.f;
        s s8 = a2.g;
        if (s4.q(s8) <= 0) {
            if (s8.q(s5) <= 0) {
                int n2 = t.i;
                int n3 = n2 * context.getResources().getDimensionPixelSize(2131099867);
                int n4 = o.B0((Context)context) ? context.getResources().getDimensionPixelSize(2131099867) : 0;
                this.f = n3 + n4;
                this.c = a2;
                this.d = d3;
                this.e = f2;
                if (!a.a()) {
                    this.b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    public int a() {
        return this.c.j;
    }

    public long b(int n2) {
        return this.c.e.v(n2).e.getTimeInMillis();
    }

    public void c(RecyclerView.z z3, int n2) {
        a a2 = (a)z3;
        s s4 = this.c.e.v(n2);
        a2.t.setText(s4.f);
        MaterialCalendarGridView materialCalendarGridView = a2.u.findViewById(2131230954);
        if (materialCalendarGridView.a() != null && s4.equals(materialCalendarGridView.a().e)) {
            materialCalendarGridView.a().notifyDataSetChanged();
        } else {
            t t6 = new t(s4, this.d, this.c);
            materialCalendarGridView.setNumColumns(s4.i);
            materialCalendarGridView.setAdapter((ListAdapter)t6);
        }
        materialCalendarGridView.setOnItemClickListener((AdapterView.OnItemClickListener)new u(this, materialCalendarGridView));
    }

    public RecyclerView.z d(ViewGroup viewGroup, int n2) {
        LinearLayout linearLayout = (LinearLayout)LayoutInflater.from(viewGroup.getContext()).inflate(2131427401, viewGroup, false);
        if (o.B0((Context)viewGroup.getContext())) {
            linearLayout.setLayoutParams((ViewGroup.LayoutParams)new RecyclerView.m(-1, this.f));
            return new a(linearLayout, true);
        }
        return new a(linearLayout, false);
    }

    public s e(int n2) {
        return this.c.e.v(n2);
    }

    public int f(s s4) {
        return this.c.e.w(s4);
    }

    public static class a
    extends RecyclerView.z {
        public final TextView t;
        public final MaterialCalendarGridView u;

        public a(LinearLayout linearLayout, boolean bl) {
            TextView textView;
            super((View)linearLayout);
            this.t = textView = linearLayout.findViewById(2131230959);
            q q4 = new q(2131231086, Boolean.class, 28);
            Boolean bl2 = Boolean.TRUE;
            boolean bl3 = Build.VERSION.SDK_INT >= 28;
            if (bl3) {
                q4.d(textView, bl2);
            } else if (q4.e(q4.c((View)textView), (Object)bl2)) {
                c.h.j.a a2 = n.e((View)textView);
                if (a2 == null) {
                    a2 = new c.h.j.a();
                }
                n.t((View)textView, (c.h.j.a)a2);
                textView.setTag(q4.a, (Object)bl2);
                n.l((View)textView, (int)0);
            }
            this.u = linearLayout.findViewById(2131230954);
            if (!bl) {
                textView.setVisibility(8);
            }
        }
    }

}

