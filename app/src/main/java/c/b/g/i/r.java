/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package c.b.g.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.b.g.i.g;
import c.b.g.i.i;

public class r
extends g
implements SubMenu {
    public i A;
    public g z;

    public r(Context context, g g2, i i2) {
        super(context);
        this.z = g2;
        this.A = i2;
    }

    @Override
    public boolean d(i i2) {
        return this.z.d(i2);
    }

    @Override
    public boolean e(g g2, MenuItem menuItem) {
        return super.e(g2, menuItem) || this.z.e(g2, menuItem);
        {
        }
    }

    @Override
    public boolean f(i i2) {
        return this.z.f(i2);
    }

    public MenuItem getItem() {
        return this.A;
    }

    @Override
    public String j() {
        i i2 = this.A;
        int n2 = i2 != null ? i2.a : 0;
        if (n2 == 0) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android:menu:actionviewstates");
        stringBuilder.append(":");
        stringBuilder.append(n2);
        return stringBuilder.toString();
    }

    @Override
    public g k() {
        return this.z.k();
    }

    @Override
    public boolean m() {
        return this.z.m();
    }

    @Override
    public boolean n() {
        return this.z.n();
    }

    @Override
    public boolean o() {
        return this.z.o();
    }

    @Override
    public void setGroupDividerEnabled(boolean bl) {
        this.z.setGroupDividerEnabled(bl);
    }

    public SubMenu setHeaderIcon(int n2) {
        this.x(0, null, n2, null, null);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.x(0, null, 0, drawable, null);
        return this;
    }

    public SubMenu setHeaderTitle(int n2) {
        this.x(n2, null, 0, null, null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.x(0, charSequence, 0, null, null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.x(0, null, 0, null, view);
        return this;
    }

    public SubMenu setIcon(int n2) {
        this.A.setIcon(n2);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override
    public void setQwertyMode(boolean bl) {
        this.z.setQwertyMode(bl);
    }
}

