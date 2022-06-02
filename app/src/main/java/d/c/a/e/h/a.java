/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.LayerDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  com.google.android.material.button.MaterialButton
 *  d.c.a.e.a
 *  d.c.a.e.w.g
 *  java.lang.Object
 */
package d.c.a.e.h;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import d.c.a.e.w.g;
import d.c.a.e.w.j;
import d.c.a.e.w.n;

public class a {
    public static final boolean s;
    public final MaterialButton a;
    public j b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;

    public static {
        boolean bl = Build.VERSION.SDK_INT >= 21;
        s = bl;
    }

    public a(MaterialButton materialButton, j j2) {
        this.a = materialButton;
        this.b = j2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public n a() {
        Drawable drawable;
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) return null;
        if (this.r.getNumberOfLayers() > 2) {
            drawable = this.r.getDrawable(2);
            do {
                return (n)drawable;
                break;
            } while (true);
        }
        drawable = this.r.getDrawable(1);
        return (n)drawable;
    }

    public g b() {
        return this.c(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final g c(boolean bl) {
        LayerDrawable layerDrawable;
        LayerDrawable layerDrawable2 = this.r;
        if (layerDrawable2 == null || layerDrawable2.getNumberOfLayers() <= 0) return null;
        if (s) {
            layerDrawable = (LayerDrawable)((InsetDrawable)this.r.getDrawable(0)).getDrawable();
            do {
                return (g)layerDrawable.getDrawable(bl ^ true);
                break;
            } while (true);
        }
        layerDrawable = this.r;
        return (g)layerDrawable.getDrawable((int)(bl ^ true));
    }

    public final g d() {
        return this.c(true);
    }

    public void e(j j2) {
        this.b = j2;
        if (this.b() != null) {
            g g2 = this.b();
            g2.e.a = j2;
            g2.invalidateSelf();
        }
        if (this.d() != null) {
            g g3 = this.d();
            g3.e.a = j2;
            g3.invalidateSelf();
        }
        if (this.a() != null) {
            this.a().setShapeAppearanceModel(j2);
        }
    }

    public final void f() {
        g g2 = this.b();
        g g3 = this.d();
        if (g2 != null) {
            g2.s((float)this.h, this.k);
            if (g3 != null) {
                float f2 = this.h;
                int n2 = this.n ? d.c.a.e.a.A((View)this.a, (int)2130903232) : 0;
                g3.r(f2, n2);
            }
        }
    }
}

