/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  c.h.b.g
 *  c.h.c.a
 *  c.h.e.a.b
 *  c.h.j.b
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package c.b.g.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import c.h.b.g;
import c.h.e.a.b;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a
implements b {
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char d;
    public int e = 4096;
    public char f;
    public int g = 4096;
    public Drawable h;
    public Context i;
    public CharSequence j;
    public CharSequence k;
    public ColorStateList l = null;
    public PorterDuff.Mode m = null;
    public boolean n = false;
    public boolean o = false;
    public int p = 16;

    public a(Context context, int n2, int n3, int n4, CharSequence charSequence) {
        this.i = context;
        this.a = charSequence;
    }

    public b a(c.h.j.b b2) {
        throw new UnsupportedOperationException();
    }

    public c.h.j.b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null && (this.n || this.o)) {
            Drawable drawable2;
            Drawable drawable3;
            this.h = drawable3 = g.c0((Drawable)drawable);
            this.h = drawable2 = drawable3.mutate();
            if (this.n) {
                g.X((Drawable)drawable2, (ColorStateList)this.l);
            }
            if (this.o) {
                g.Y((Drawable)this.h, (PorterDuff.Mode)this.m);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.g;
    }

    public char getAlphabeticShortcut() {
        return this.f;
    }

    public CharSequence getContentDescription() {
        return this.j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.h;
    }

    public ColorStateList getIconTintList() {
        return this.l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    public Intent getIntent() {
        return this.c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.e;
    }

    public char getNumericShortcut() {
        return this.d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            return charSequence;
        }
        return this.a;
    }

    public CharSequence getTooltipText() {
        return this.k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (1 & this.p) != 0;
    }

    public boolean isChecked() {
        return (2 & this.p) != 0;
    }

    public boolean isEnabled() {
        return (16 & this.p) != 0;
    }

    public boolean isVisible() {
        return (8 & this.p) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int n2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int n2) {
        this.f = Character.toLowerCase(c2);
        this.g = KeyEvent.normalizeMetaState(n2);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        this.p = bl | -2 & this.p;
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        int n2 = -3 & this.p;
        int n3 = bl ? 2 : 0;
        this.p = n3 | n2;
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        int n2 = -17 & this.p;
        int n3 = bl ? 16 : 0;
        this.p = n3 | n2;
        return this;
    }

    public MenuItem setIcon(int n2) {
        this.h = c.h.c.a.c((Context)this.i, (int)n2);
        this.c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        this.c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.n = true;
        this.c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.o = true;
        this.c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int n2) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(n2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int n2, int n3) {
        this.d = c2;
        this.e = KeyEvent.normalizeMetaState(n2);
        this.f = Character.toLowerCase(c3);
        this.g = KeyEvent.normalizeMetaState(n3);
        return this;
    }

    public void setShowAsAction(int n2) {
    }

    public MenuItem setShowAsActionFlags(int n2) {
        return this;
    }

    public MenuItem setTitle(int n2) {
        this.a = this.i.getResources().getString(n2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        int n2 = this.p;
        int n3 = 8;
        int n4 = n2 & n3;
        if (bl) {
            n3 = 0;
        }
        this.p = n4 | n3;
        return this;
    }
}

