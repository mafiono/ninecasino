/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.Resources
 *  d.b.g
 *  d.b.i0.a.a
 *  d.b.j
 *  d.b.j0.l
 *  d.b.j0.m
 *  d.b.j0.v
 *  d.b.j0.w
 *  d.b.j0.w$c
 *  d.b.j0.y
 *  d.b.k
 *  d.b.k0.c
 *  d.b.k0.c$d
 *  d.b.k0.e
 *  d.b.k0.f
 *  d.b.o
 *  d.b.o$c
 *  d.b.s
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Date
 *  java.util.EnumSet
 *  java.util.concurrent.atomic.AtomicBoolean
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package d.b.k0;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import d.b.i0.a.a;
import d.b.j;
import d.b.j0.l;
import d.b.j0.m;
import d.b.j0.v;
import d.b.j0.w;
import d.b.j0.y;
import d.b.k;
import d.b.k0.c;
import d.b.k0.e;
import d.b.k0.f;
import d.b.o;
import d.b.s;
import java.util.Date;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class g
implements o.c {
    public final /* synthetic */ String a;
    public final /* synthetic */ Date b;
    public final /* synthetic */ Date c;
    public final /* synthetic */ c d;

    public g(c c2, String string, Date date, Date date2) {
        this.d = c2;
        this.a = string;
        this.b = date;
        this.c = date2;
    }

    public void a(s s2) {
        String string;
        w.c c2;
        String string2;
        if (this.d.s0.get()) {
            return;
        }
        j j2 = s2.c;
        if (j2 != null) {
            this.d.E0(j2.n);
            return;
        }
        try {
            JSONObject jSONObject = s2.b;
            string2 = jSONObject.getString("id");
            c2 = w.s((JSONObject)jSONObject);
            string = jSONObject.getString("name");
        }
        catch (JSONException jSONException) {
            this.d.E0(new d.b.g((Throwable)jSONException));
            return;
        }
        a.a((String)this.d.v0.f);
        y.e();
        if (m.b((String)k.c).c.contains((Object)v.g)) {
            c c3 = this.d;
            if (!c3.x0) {
                c3.x0 = true;
                String string3 = this.a;
                Date date = this.b;
                Date date2 = this.c;
                String string4 = c3.u().getString(2131623993);
                String string5 = c3.u().getString(2131623992);
                String string6 = c3.u().getString(2131623991);
                String string7 = String.format(string5, new Object[]{string});
                AlertDialog.Builder builder = new AlertDialog.Builder(c3.k());
                AlertDialog.Builder builder2 = builder.setMessage(string4).setCancelable(true);
                f f2 = new f(c3, string2, c2, string3, date, date2);
                builder2.setNegativeButton(string7, (DialogInterface.OnClickListener)f2).setPositiveButton(string6, (DialogInterface.OnClickListener)new e(c3));
                builder.create().show();
                return;
            }
        }
        c.B0((c)this.d, (String)string2, (w.c)c2, (String)this.a, (Date)this.b, (Date)this.c);
    }
}

