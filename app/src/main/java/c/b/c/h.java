/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  androidx.activity.ComponentActivity
 *  c.b.c.a
 *  c.b.c.i
 *  c.b.c.j
 *  c.b.g.a
 *  c.b.g.a$a
 *  c.b.h.c0
 *  c.h.b.g
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package c.b.c;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import c.b.c.a;
import c.b.c.i;
import c.b.c.j;
import c.b.c.k;
import c.b.c.u;
import c.b.g.a;
import c.b.h.c0;
import c.h.b.g;
import c.k.b.n;
import java.util.ArrayList;

public class h
extends n
implements i {
    public j s;

    public h() {
    }

    public h(int n2) {
        super(n2);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.r().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        Activity.super.attachBaseContext(this.r().d(context));
    }

    public void closeOptionsMenu() {
        this.s();
        if (this.getWindow().hasFeature(0)) {
            Activity.super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        this.s();
        return c.h.b.h.super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int n2) {
        return (T)this.r().e(n2);
    }

    public void g(c.b.g.a a2) {
    }

    public MenuInflater getMenuInflater() {
        return this.r().g();
    }

    public Resources getResources() {
        return Activity.super.getResources();
    }

    public void i(c.b.g.a a2) {
    }

    public void invalidateOptionsMenu() {
        this.r().j();
    }

    public c.b.g.a j(a.a a2) {
        return null;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.r().k(configuration);
    }

    public void onContentChanged() {
    }

    @Override
    public void onCreate(Bundle bundle) {
        j j2 = this.r();
        j2.i();
        j2.l(bundle);
        super.onCreate(bundle);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.r().m();
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        Window window;
        boolean bl = Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = this.getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
        if (bl) {
            return true;
        }
        return Activity.super.onKeyDown(n2, keyEvent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        a a2 = this.s();
        if (menuItem.getItemId() == 16908332 && a2 != null && (4 & ((u)a2).e.j()) != 0) {
            ArrayList arrayList;
            Intent intent = g.x((Activity)this);
            if (intent == null) {
                return false;
            }
            if (!this.shouldUpRecreateTask(intent)) {
                this.navigateUpTo(intent);
                return true;
            }
            arrayList = new ArrayList();
            Intent intent2 = this.t();
            if (intent2 == null) {
                intent2 = g.x((Activity)this);
            }
            if (intent2 != null) {
                ComponentName componentName = intent2.getComponent();
                if (componentName == null) {
                    componentName = intent2.resolveActivity(this.getPackageManager());
                }
                int n3 = arrayList.size();
                try {
                    Intent intent3;
                    while ((intent3 = g.y((Context)this, (ComponentName)componentName)) != null) {
                        arrayList.add(n3, intent3);
                        componentName = intent3.getComponent();
                    }
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(nameNotFoundException);
                }
                arrayList.add(intent2);
            }
            this.v();
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] arrintent = (Intent[])arrayList.toArray(new Intent[arrayList.size()]);
            arrintent[0] = new Intent(arrintent[0]).addFlags(268484608);
            this.startActivities(arrintent, null);
            try {
                this.finishAffinity();
                return true;
            }
            catch (IllegalStateException illegalStateException) {
                this.finish();
                return true;
            }
        }
        return false;
    }

    public boolean onMenuOpened(int n2, Menu menu) {
        return Activity.super.onMenuOpened(n2, menu);
    }

    @Override
    public void onPanelClosed(int n2, Menu menu) {
        super.onPanelClosed(n2, menu);
    }

    public void onPostCreate(Bundle bundle) {
        Activity.super.onPostCreate(bundle);
        this.r().n(bundle);
    }

    @Override
    public void onPostResume() {
        super.onPostResume();
        this.r().o();
    }

    public void onSaveInstanceState(Bundle bundle) {
        ComponentActivity.super.onSaveInstanceState(bundle);
        this.r().p(bundle);
    }

    @Override
    public void onStart() {
        super.onStart();
        this.r().q();
    }

    @Override
    public void onStop() {
        super.onStop();
        this.r().r();
    }

    public void onTitleChanged(CharSequence charSequence, int n2) {
        Activity.super.onTitleChanged(charSequence, n2);
        this.r().y(charSequence);
    }

    public void openOptionsMenu() {
        this.s();
        if (this.getWindow().hasFeature(0)) {
            Activity.super.openOptionsMenu();
        }
    }

    @Override
    public void q() {
        this.r().j();
    }

    public j r() {
        if (this.s == null) {
            this.s = new k((Context)this, null, this, (Object)this);
        }
        return this.s;
    }

    public a s() {
        return this.r().h();
    }

    public void setContentView(int n2) {
        this.r().u(n2);
    }

    public void setContentView(View view) {
        this.r().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.r().w(view, layoutParams);
    }

    public void setTheme(int n2) {
        Activity.super.setTheme(n2);
        this.r().x(n2);
    }

    public Intent t() {
        return g.x((Activity)this);
    }

    public void u() {
    }

    public void v() {
    }
}

