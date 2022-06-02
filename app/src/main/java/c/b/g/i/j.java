/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.CollapsibleActionView
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  android.widget.FrameLayout
 *  c.b.g.b
 *  c.b.g.i.c
 *  c.b.g.i.j$b
 *  c.b.g.i.j$d
 *  c.b.g.i.j$e
 *  c.h.e.a.b
 *  c.h.j.b
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package c.b.g.i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import c.b.g.i.j;
import java.lang.reflect.Method;

/*
 * Exception performing whole class analysis.
 */
public class j
extends c.b.g.i.c
implements MenuItem {
    public final c.h.e.a.b d;
    public Method e;

    public j(Context context, c.h.e.a.b b2) {
        super(context);
        if (b2 != null) {
            this.d = b2;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        c.h.j.b b2 = this.d.b();
        if (b2 instanceof a) {
            return ((a)b2).b;
        }
        return null;
    }

    public View getActionView() {
        View view = this.d.getActionView();
        if (view instanceof c) {
            view = (View)((c)view).e;
        }
        return view;
    }

    public int getAlphabeticModifiers() {
        return this.d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.d.getContentDescription();
    }

    public int getGroupId() {
        return this.d.getGroupId();
    }

    public Drawable getIcon() {
        return this.d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.d.getIntent();
    }

    public int getItemId() {
        return this.d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.d.getNumericShortcut();
    }

    public int getOrder() {
        return this.d.getOrder();
    }

    public SubMenu getSubMenu() {
        return this.d(this.d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.d.isCheckable();
    }

    public boolean isChecked() {
        return this.d.isChecked();
    }

    public boolean isEnabled() {
        return this.d.isEnabled();
    }

    public boolean isVisible() {
        return this.d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b b2 = new /* Unavailable Anonymous Inner Class!! */;
        c.h.e.a.b b3 = this.d;
        if (actionProvider == null) {
            b2 = null;
        }
        b3.a((c.h.j.b)b2);
        return this;
    }

    public MenuItem setActionView(int n2) {
        this.d.setActionView(n2);
        View view = this.d.getActionView();
        if (view instanceof CollapsibleActionView) {
            this.d.setActionView((View)new c(view));
        }
        return this;
    }

    public MenuItem setActionView(View object) {
        if (object instanceof CollapsibleActionView) {
            object = new c(object);
        }
        this.d.setActionView(object);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int n2) {
        this.d.setAlphabeticShortcut(c2, n2);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        this.d.setCheckable(bl);
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        this.d.setChecked(bl);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        this.d.setEnabled(bl);
        return this;
    }

    public MenuItem setIcon(int n2) {
        this.d.setIcon(n2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int n2) {
        this.d.setNumericShortcut(c2, n2);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        c.h.e.a.b b2 = this.d;
        d d2 = onActionExpandListener != null ? new /* Unavailable Anonymous Inner Class!! */ : null;
        b2.setOnActionExpandListener(d2);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        c.h.e.a.b b2 = this.d;
        e e2 = onMenuItemClickListener != null ? new /* Unavailable Anonymous Inner Class!! */ : null;
        b2.setOnMenuItemClickListener(e2);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int n2, int n3) {
        this.d.setShortcut(c2, c3, n2, n3);
        return this;
    }

    public void setShowAsAction(int n2) {
        this.d.setShowAsAction(n2);
    }

    public MenuItem setShowAsActionFlags(int n2) {
        this.d.setShowAsActionFlags(n2);
        return this;
    }

    public MenuItem setTitle(int n2) {
        this.d.setTitle(n2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        return this.d.setVisible(bl);
    }

    public class a
    extends c.h.j.b {
        public final ActionProvider b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        public boolean a() {
            return this.b.hasSubMenu();
        }

        public View c() {
            return this.b.onCreateActionView();
        }

        public boolean e() {
            return this.b.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.b.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    public static class c
    extends FrameLayout
    implements c.b.g.b {
        public final CollapsibleActionView e;

        public c(View view) {
            super(view.getContext());
            this.e = (CollapsibleActionView)view;
            this.addView(view);
        }

        public void c() {
            this.e.onActionViewExpanded();
        }

        public void e() {
            this.e.onActionViewCollapsed();
        }
    }

}

