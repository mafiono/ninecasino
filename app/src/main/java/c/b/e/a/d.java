/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.util.StateSet
 *  c.b.e.a.b
 *  c.b.e.a.b$c
 *  java.lang.Object
 */
package c.b.e.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import c.b.e.a.b;

@SuppressLint(value={"RestrictedAPI"})
public class d
extends b {
    public a r;
    public boolean s;

    public d(a a2) {
    }

    public d(a a2, Resources resources) {
        this.e(new a(a2, this, resources));
        this.onStateChange(this.getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        this.onStateChange(this.getState());
    }

    public void e(b.c c2) {
        this.e = c2;
        int n2 = this.k;
        if (n2 >= 0) {
            Drawable drawable;
            this.g = drawable = c2.d(n2);
            if (drawable != null) {
                this.c(drawable);
            }
        }
        this.h = null;
        if (c2 instanceof a) {
            this.r = (a)c2;
        }
    }

    public a f() {
        return new a(this.r, this, null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.s) {
            super.mutate();
            if (this == this) {
                this.r.e();
                this.s = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] arrn) {
        boolean bl = super.onStateChange(arrn);
        int n2 = this.r.g(arrn);
        if (n2 < 0) {
            n2 = this.r.g(StateSet.WILD_CARD);
        }
        return this.d(n2) || bl;
        {
        }
    }

    public static class a
    extends b.c {
        public int[][] J;

        public a(a a2, d d2, Resources resources) {
            super((b.c)a2, (b)d2, resources);
            if (a2 != null) {
                this.J = a2.J;
                return;
            }
            this.J = new int[this.g.length][];
        }

        public void e() {
            int[][] arrn = this.J;
            int[][] arrarrn = new int[arrn.length][];
            for (int i2 = -1 + arrn.length; i2 >= 0; --i2) {
                int[][] arrn2 = this.J;
                int[] arrn3 = arrn2[i2] != null ? arrn2[i2].clone() : null;
                arrarrn[i2] = arrn3;
            }
            this.J = arrarrn;
        }

        public int g(int[] arrn) {
            int[][] arrn2 = this.J;
            int n2 = this.h;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!StateSet.stateSetMatches(arrn2[i2], arrn)) continue;
                return i2;
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

}

