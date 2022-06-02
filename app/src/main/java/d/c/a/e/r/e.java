/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  d.c.a.e.b
 *  java.lang.Math
 *  java.lang.Object
 */
package d.c.a.e.r;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d.c.a.e.b;

public class e
extends ViewGroup {
    public int e;
    public int f;
    public boolean g = false;
    public int h;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public e(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attributeSet, b.g, 0, 0);
        this.e = typedArray.getDimensionPixelSize(1, 0);
        this.f = typedArray.getDimensionPixelSize(0, 0);
        typedArray.recycle();
    }

    public boolean a() {
        return this.g;
    }

    public int getItemSpacing() {
        return this.f;
    }

    public int getLineSpacing() {
        return this.e;
    }

    public int getRowCount() {
        return this.h;
    }

    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        if (this.getChildCount() == 0) {
            this.h = 0;
            return;
        }
        this.h = 1;
        boolean bl2 = this.getLayoutDirection() == 1;
        int n6 = bl2 ? this.getPaddingRight() : this.getPaddingLeft();
        int n7 = bl2 ? this.getPaddingLeft() : this.getPaddingRight();
        int n8 = this.getPaddingTop();
        int n9 = n4 - n2 - n7;
        int n10 = n6;
        int n11 = n8;
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            int n12;
            int n13;
            View view = this.getChildAt(i2);
            if (view.getVisibility() == 8) {
                view.setTag(2131231025, (Object)-1);
                continue;
            }
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams)layoutParams;
                n13 = marginLayoutParams.getMarginStart();
                n12 = marginLayoutParams.getMarginEnd();
            } else {
                n12 = 0;
                n13 = 0;
            }
            int n14 = n10 + n13 + view.getMeasuredWidth();
            if (!this.g && n14 > n9) {
                n11 = n8 + this.e;
                this.h = 1 + this.h;
                n10 = n6;
            }
            view.setTag(2131231025, this.h - 1);
            int n15 = n10 + n13;
            int n16 = n15 + view.getMeasuredWidth();
            int n17 = n11 + view.getMeasuredHeight();
            if (bl2) {
                n15 = n9 - n16;
                n16 = n9 - n10 - n13;
            }
            view.layout(n15, n11, n16, n17);
            n10 += n13 + n12 + view.getMeasuredWidth() + this.f;
            n8 = n17;
        }
    }

    public void onMeasure(int n2, int n3) {
        int n4;
        int n5 = MeasureSpec.getSize(n2);
        int n6 = MeasureSpec.getMode(n2);
        int n7 = MeasureSpec.getSize(n3);
        int n8 = MeasureSpec.getMode(n3);
        int n9 = n6 != Integer.MIN_VALUE && n6 != 1073741824 ? Integer.MAX_VALUE : n5;
        int n10 = this.getPaddingLeft();
        int n11 = this.getPaddingTop();
        int n12 = n9 - this.getPaddingRight();
        int n13 = n11;
        int n14 = 0;
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            int n15;
            int n16;
            View view = this.getChildAt(i2);
            if (view.getVisibility() == 8) continue;
            this.measureChild(view, n2, n3);
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof MarginLayoutParams) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams)layoutParams;
                n15 = 0 + marginLayoutParams.leftMargin;
                n16 = 0 + marginLayoutParams.rightMargin;
            } else {
                n16 = 0;
                n15 = 0;
            }
            if (n10 + n15 + view.getMeasuredWidth() > n12 && !this.a()) {
                n10 = this.getPaddingLeft();
                n13 = n11 + this.e;
            }
            int n17 = n10 + n15 + view.getMeasuredWidth();
            int n18 = n13 + view.getMeasuredHeight();
            if (n17 > n14) {
                n14 = n17;
            }
            int n19 = n10 + (n15 + n16 + view.getMeasuredWidth() + this.f);
            if (i2 == -1 + this.getChildCount()) {
                n14 += n16;
            }
            n10 = n19;
            n11 = n18;
        }
        int n20 = n14 + this.getPaddingRight();
        int n21 = n11 + this.getPaddingBottom();
        if (n6 != Integer.MIN_VALUE) {
            n4 = 1073741824;
            if (n6 != n4) {
                n5 = n20;
            }
        } else {
            n4 = 1073741824;
            n5 = Math.min(n20, n5);
        }
        if (n8 != Integer.MIN_VALUE) {
            if (n8 != n4) {
                n7 = n21;
            }
        } else {
            n7 = Math.min(n21, n7);
        }
        this.setMeasuredDimension(n5, n7);
    }

    public void setItemSpacing(int n2) {
        this.f = n2;
    }

    public void setLineSpacing(int n2) {
        this.e = n2;
    }

    public void setSingleLine(boolean bl) {
        this.g = bl;
    }
}

