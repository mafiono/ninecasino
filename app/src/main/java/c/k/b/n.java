/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  androidx.activity.ComponentActivity
 *  c.h.b.c$a
 *  c.h.b.c$b
 *  c.h.b.g
 *  c.k.b.a0
 *  c.k.b.h0
 *  c.k.b.m
 *  c.k.b.n$c
 *  c.k.b.u0
 *  c.k.b.v
 *  c.k.b.y
 *  c.n.f
 *  c.n.f$a
 *  c.n.f$b
 *  c.n.k
 *  c.o.a.a
 *  c.t.a
 *  c.t.a$b
 *  c.t.b
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 */
package c.k.b;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import c.h.b.c;
import c.h.b.g;
import c.k.b.a0;
import c.k.b.d0;
import c.k.b.h0;
import c.k.b.m;
import c.k.b.n;
import c.k.b.u0;
import c.k.b.v;
import c.k.b.x;
import c.k.b.y;
import c.n.f;
import c.n.k;
import c.t.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class n
extends ComponentActivity
implements c.a,
c.b {
    public final v n;
    public final c.n.m o;
    public boolean p;
    public boolean q;
    public boolean r;

    public n() {
        c c2 = new c(this);
        g.g((Object)c2, (Object)"callbacks == null");
        this.n = new v((x)c2);
        this.o = new c.n.m((k)this);
        this.r = true;
        this.n();
    }

    public n(int n2) {
        this.k = n2;
        c c2 = new c(this);
        g.g((Object)c2, (Object)"callbacks == null");
        this.n = new v((x)c2);
        this.o = new c.n.m((k)this);
        this.r = true;
        this.n();
    }

    public static boolean o(a0 a02, f.b b2) {
        f.b b3 = f.b.h;
        Iterator iterator = a02.c.j().iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            boolean bl2;
            boolean bl3;
            u0 u02;
            m m2 = (m)iterator.next();
            if (m2 == null) continue;
            x x2 = m2.w;
            Object var7_7 = x2 == null ? null : x2.i();
            if (var7_7 != null) {
                bl |= n.o(m2.j(), b2);
            }
            if ((u02 = m2.T) != null && (bl2 = ((c.n.m)u02.a()).c.compareTo((Enum)b3) >= 0)) {
                c.n.m m3 = m2.T.e;
                m3.d("setCurrentState");
                m3.g(b2);
                bl = true;
            }
            if (!(bl3 = m2.S.c.compareTo((Enum)b3) >= 0)) continue;
            c.n.m m4 = m2.S;
            m4.d("setCurrentState");
            m4.g(b2);
            bl = true;
        }
        return bl;
    }

    @Deprecated
    public final void b(int n2) {
    }

    public void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        Activity.super.dump(string, fileDescriptor, printWriter, arrstring);
        printWriter.print(string);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("  ");
        String string2 = stringBuilder.toString();
        printWriter.print(string2);
        printWriter.print("mCreated=");
        printWriter.print(this.p);
        printWriter.print(" mResumed=");
        printWriter.print(this.q);
        printWriter.print(" mStopped=");
        printWriter.print(this.r);
        if (this.getApplication() != null) {
            c.o.a.a.b((k)this).a(string2, fileDescriptor, printWriter, arrstring);
        }
        this.n.a.h.y(string, fileDescriptor, printWriter, arrstring);
    }

    public a0 m() {
        return this.n.a.h;
    }

    public final void n() {
        this.h.b.b("android:support:fragments", new a.b(this){
            public final /* synthetic */ n a;
            {
                this.a = n2;
            }

            public Bundle a() {
                Bundle bundle = new Bundle();
                n n2 = this.a;
                while (n.o(n2.m(), f.b.g)) {
                }
                this.a.o.e(f.a.ON_STOP);
                android.os.Parcelable parcelable = this.a.n.a.h.a0();
                if (parcelable != null) {
                    bundle.putParcelable("android:support:fragments", parcelable);
                }
                return bundle;
            }
        });
        c.a.d.b b2 = new c.a.d.b(this){
            public final /* synthetic */ n a;
            {
                this.a = n2;
            }

            public void a(Context context) {
                x x2 = this.a.n.a;
                x2.h.b(x2, (c.k.b.t)x2, null);
                Bundle bundle = this.a.h.b.a("android:support:fragments");
                if (bundle != null) {
                    android.os.Parcelable parcelable = bundle.getParcelable("android:support:fragments");
                    x x3 = this.a.n.a;
                    if (x3 instanceof c.n.b0) {
                        x3.h.Z(parcelable);
                        return;
                    }
                    throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                }
            }
        };
        c.a.d.a a2 = this.f;
        if (a2.b != null) {
            b2.a(a2.b);
        }
        a2.a.add(b2);
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        this.n.a();
        super.onActivityResult(n2, n3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        Activity.super.onConfigurationChanged(configuration);
        this.n.a();
        this.n.a.h.k(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o.e(f.a.ON_CREATE);
        this.n.a.h.m();
    }

    public boolean onCreatePanelMenu(int n2, Menu menu) {
        if (n2 == 0) {
            boolean bl = Activity.super.onCreatePanelMenu(n2, menu);
            v v2 = this.n;
            MenuInflater menuInflater = this.getMenuInflater();
            return bl | v2.a.h.n(menu, menuInflater);
        }
        return Activity.super.onCreatePanelMenu(n2, menu);
    }

    public View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        View view2 = this.n.a.h.f.onCreateView(view, string, context, attributeSet);
        if (view2 == null) {
            return Activity.super.onCreateView(view, string, context, attributeSet);
        }
        return view2;
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        View view = this.n.a.h.f.onCreateView(null, string, context, attributeSet);
        if (view == null) {
            return Activity.super.onCreateView(string, context, attributeSet);
        }
        return view;
    }

    public void onDestroy() {
        Activity.super.onDestroy();
        this.n.a.h.o();
        this.o.e(f.a.ON_DESTROY);
    }

    public void onLowMemory() {
        Activity.super.onLowMemory();
        this.n.a.h.p();
    }

    public boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (Activity.super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        if (n2 != 0) {
            if (n2 != 6) {
                return false;
            }
            return this.n.a.h.l(menuItem);
        }
        return this.n.a.h.r(menuItem);
    }

    public void onMultiWindowModeChanged(boolean bl) {
        this.n.a.h.q(bl);
    }

    public void onNewIntent(@SuppressLint(value={"UnknownNullness"}) Intent intent) {
        Activity.super.onNewIntent(intent);
        this.n.a();
    }

    public void onPanelClosed(int n2, Menu menu) {
        if (n2 == 0) {
            this.n.a.h.s(menu);
        }
        Activity.super.onPanelClosed(n2, menu);
    }

    public void onPause() {
        Activity.super.onPause();
        this.q = false;
        this.n.a.h.w(5);
        this.o.e(f.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean bl) {
        this.n.a.h.u(bl);
    }

    public void onPostResume() {
        Activity.super.onPostResume();
        this.o.e(f.a.ON_RESUME);
        a0 a02 = this.n.a.h;
        a02.B = false;
        a02.C = false;
        a02.J.g = false;
        a02.w(7);
    }

    public boolean onPreparePanel(int n2, View view, Menu menu) {
        if (n2 == 0) {
            return Activity.super.onPreparePanel(0, view, menu) | this.n.a.h.v(menu);
        }
        return Activity.super.onPreparePanel(n2, view, menu);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        this.n.a();
        super.onRequestPermissionsResult(n2, arrstring, arrn);
    }

    public void onResume() {
        Activity.super.onResume();
        this.q = true;
        this.n.a();
        this.n.a.h.C(true);
    }

    public void onStart() {
        Activity.super.onStart();
        this.r = false;
        if (!this.p) {
            this.p = true;
            a0 a02 = this.n.a.h;
            a02.B = false;
            a02.C = false;
            a02.J.g = false;
            a02.w(4);
        }
        this.n.a();
        this.n.a.h.C(true);
        this.o.e(f.a.ON_START);
        a0 a03 = this.n.a.h;
        a03.B = false;
        a03.C = false;
        a03.J.g = false;
        a03.w(5);
    }

    public void onStateNotSaved() {
        this.n.a();
    }

    public void onStop() {
        Activity.super.onStop();
        this.r = true;
        while (n.o(this.m(), f.b.g)) {
        }
        a0 a02 = this.n.a.h;
        a02.C = true;
        a02.J.g = true;
        a02.w(4);
        this.o.e(f.a.ON_STOP);
    }

    @Deprecated
    public void p() {
    }

    @Deprecated
    public void q() {
        this.invalidateOptionsMenu();
    }
}

