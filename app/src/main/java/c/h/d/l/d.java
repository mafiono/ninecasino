/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Outline
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  c.h.d.l.e
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package c.h.d.l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import c.h.d.l.c;
import c.h.d.l.e;
import java.lang.reflect.Method;

public class d
extends c {
    public static Method l;

    public d(Drawable drawable) {
        super(drawable);
        this.e();
    }

    public d(e e2, Resources resources) {
        super(e2, resources);
        this.e();
    }

    @Override
    public boolean c() {
        boolean bl;
        block2 : {
            block3 : {
                int n2 = Build.VERSION.SDK_INT;
                bl = false;
                if (n2 != 21) break block2;
                Drawable drawable = this.j;
                if (drawable instanceof GradientDrawable || drawable instanceof DrawableContainer || drawable instanceof InsetDrawable) break block3;
                boolean bl2 = drawable instanceof RippleDrawable;
                bl = false;
                if (!bl2) break block2;
            }
            bl = true;
        }
        return bl;
    }

    public final void e() {
        if (l == null) {
            try {
                l = Drawable.class.getDeclaredMethod("isProjected");
                return;
            }
            catch (Exception exception) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", exception);
            }
        }
    }

    public Rect getDirtyBounds() {
        return this.j.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.j.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.j;
        if (drawable != null && (method = l) != null) {
            try {
                boolean bl = (Boolean)method.invoke(drawable, new Object[0]);
                return bl;
            }
            catch (Exception exception) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", exception);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.j.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        this.j.setHotspotBounds(n2, n3, n4, n5);
    }

    @Override
    public boolean setState(int[] arrn) {
        if (super.setState(arrn)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override
    public void setTint(int n2) {
        if (this.c()) {
            super.setTint(n2);
            return;
        }
        this.j.setTint(n2);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        if (this.c()) {
            this.h.c = colorStateList;
            this.d(this.getState());
            return;
        }
        this.j.setTintList(colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.c()) {
            this.h.d = mode;
            this.d(this.getState());
            return;
        }
        this.j.setTintMode(mode);
    }
}

