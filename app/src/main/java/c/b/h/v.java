/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.Spinner
 *  android.widget.SpinnerAdapter
 *  androidx.appcompat.app.AlertController
 *  androidx.appcompat.app.AlertController$b
 *  c.b.b
 *  c.b.c.g
 *  c.b.c.g$a
 *  c.b.d.a.a
 *  c.b.g.c
 *  c.b.h.e
 *  c.b.h.g0
 *  c.b.h.r0
 *  c.b.h.v$a
 *  c.b.h.v$c
 *  c.b.h.v$d
 *  c.b.h.v$e
 *  c.b.h.v$f
 *  c.b.h.w0
 *  c.h.j.m
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package c.b.h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AlertController;
import c.b.c.g;
import c.b.h.g0;
import c.b.h.j0;
import c.b.h.r0;
import c.b.h.u;
import c.b.h.v;
import c.b.h.w0;
import c.h.j.m;

/*
 * Exception performing whole class analysis.
 */
public class v
extends Spinner
implements m {
    public static final int[] m;
    public final c.b.h.e e;
    public final Context f;
    public g0 g;
    public SpinnerAdapter h;
    public final boolean i;
    public f j;
    public int k;
    public final Rect l;

    public static {
        m = new int[]{16843505};
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public v(Context context, AttributeSet attributeSet, int n2) {
        TypedArray typedArray;
        void var19_11;
        block18 : {
            TypedArray typedArray2;
            int[] arrn;
            int n3;
            block20 : {
                TypedArray typedArray3;
                block17 : {
                    Exception exception;
                    block19 : {
                        arrn = c.b.b.v;
                        super(context, attributeSet, n2);
                        this.l = new Rect();
                        r0.a((View)this, (Context)this.getContext());
                        typedArray2 = context.obtainStyledAttributes(attributeSet, arrn, n2, 0);
                        this.e = new c.b.h.e((View)this);
                        int n4 = typedArray2.getResourceId(4, 0);
                        this.f = n4 != 0 ? new c.b.g.c(context, n4) : context;
                        n3 = -1;
                        typedArray3 = context.obtainStyledAttributes(attributeSet, m, n2, 0);
                        try {
                            if (typedArray3.hasValue(0)) {
                                n3 = typedArray3.getInt(0, 0);
                            }
                            break block17;
                        }
                        catch (Throwable throwable) {
                            typedArray = typedArray3;
                            break block18;
                        }
                        catch (Exception exception2) {
                            break block19;
                        }
                        catch (Throwable throwable) {
                            typedArray = null;
                            break block18;
                        }
                        catch (Exception exception3) {
                            exception = exception3;
                            typedArray3 = null;
                        }
                    }
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", exception);
                    if (typedArray3 == null) break block20;
                }
                typedArray3.recycle();
            }
            if (n3 != 0) {
                if (n3 == 1) {
                    d d2 = new /* Unavailable Anonymous Inner Class!! */;
                    w0 w02 = w0.q((Context)this.f, (AttributeSet)attributeSet, (int[])arrn, (int)n2, (int)0);
                    this.k = w02.k(3, -2);
                    Drawable drawable = w02.g(1);
                    d2.D.setBackgroundDrawable(drawable);
                    d2.H = typedArray2.getString(2);
                    w02.b.recycle();
                    this.j = d2;
                    this.g = new u(this, (View)this, d2);
                }
            } else {
                b b2 = new b();
                this.j = b2;
                b2.l(typedArray2.getString(2));
            }
            Object[] arrobject = typedArray2.getTextArray(0);
            if (arrobject != null) {
                ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, arrobject);
                arrayAdapter.setDropDownViewResource(2131427436);
                this.setAdapter(arrayAdapter);
            }
            typedArray2.recycle();
            this.i = true;
            SpinnerAdapter spinnerAdapter = this.h;
            if (spinnerAdapter != null) {
                this.setAdapter(spinnerAdapter);
                this.h = null;
            }
            this.e.d(attributeSet, n2);
            return;
        }
        if (typedArray == null) throw var19_11;
        typedArray.recycle();
        throw var19_11;
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int n2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int n3 = MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
        int n4 = MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
        int n5 = Math.max(0, this.getSelectedItemPosition());
        int n6 = Math.min(spinnerAdapter.getCount(), n5 + 15);
        View view = null;
        int n7 = 0;
        for (int i2 = Math.max(0, n5 - (15 - (n6 - n5))); i2 < n6; ++i2) {
            int n8 = spinnerAdapter.getItemViewType(i2);
            if (n8 != n2) {
                view = null;
                n2 = n8;
            }
            if ((view = spinnerAdapter.getView(i2, view, this)).getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(n3, n4);
            n7 = Math.max(n7, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.l);
            Rect rect = this.l;
            n7 += rect.left + rect.right;
        }
        return n7;
    }

    public void b() {
        this.j.d(this.getTextDirection(), this.getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        c.b.h.e e2 = this.e;
        if (e2 != null) {
            e2.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f f2 = this.j;
        if (f2 != null) {
            return f2.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f f2 = this.j;
        if (f2 != null) {
            return f2.g();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.j != null) {
            return this.k;
        }
        return super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.j;
    }

    public Drawable getPopupBackground() {
        f f2 = this.j;
        if (f2 != null) {
            return f2.i();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f;
    }

    public CharSequence getPrompt() {
        f f2 = this.j;
        if (f2 != null) {
            return f2.j();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        c.b.h.e e2 = this.e;
        if (e2 != null) {
            return e2.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        c.b.h.e e2 = this.e;
        if (e2 != null) {
            return e2.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f f2 = this.j;
        if (f2 != null && f2.b()) {
            this.j.dismiss();
        }
    }

    public void onMeasure(int n2, int n3) {
        super.onMeasure(n2, n3);
        if (this.j != null && MeasureSpec.getMode(n2) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), MeasureSpec.getSize(n2)), this.getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e e2 = parcelable;
        super.onRestoreInstanceState(e2.getSuperState());
        if (e2.e && (viewTreeObserver = this.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)new a(this));
        }
    }

    public Parcelable onSaveInstanceState() {
        e e2 = new /* Unavailable Anonymous Inner Class!! */;
        f f2 = this.j;
        boolean bl = f2 != null && f2.b();
        e2.e = bl;
        return e2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g02 = this.g;
        if (g02 != null && g02.onTouch((View)this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        f f2 = this.j;
        if (f2 != null) {
            if (!f2.b()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.j != null) {
            Context context = this.f;
            if (context == null) {
                context = this.getContext();
            }
            this.j.o((ListAdapter)new /* Unavailable Anonymous Inner Class!! */);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        c.b.h.e e2 = this.e;
        if (e2 != null) {
            e2.e();
        }
    }

    public void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        c.b.h.e e2 = this.e;
        if (e2 != null) {
            e2.f(n2);
        }
    }

    public void setDropDownHorizontalOffset(int n2) {
        f f2 = this.j;
        if (f2 != null) {
            f2.p(n2);
            this.j.a(n2);
            return;
        }
        super.setDropDownHorizontalOffset(n2);
    }

    public void setDropDownVerticalOffset(int n2) {
        f f2 = this.j;
        if (f2 != null) {
            f2.n(n2);
            return;
        }
        super.setDropDownVerticalOffset(n2);
    }

    public void setDropDownWidth(int n2) {
        if (this.j != null) {
            this.k = n2;
            return;
        }
        super.setDropDownWidth(n2);
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f f2 = this.j;
        if (f2 != null) {
            f2.m(drawable);
            return;
        }
        super.setPopupBackgroundDrawable(drawable);
    }

    public void setPopupBackgroundResource(int n2) {
        this.setPopupBackgroundDrawable(c.b.d.a.a.b((Context)this.getPopupContext(), (int)n2));
    }

    public void setPrompt(CharSequence charSequence) {
        f f2 = this.j;
        if (f2 != null) {
            f2.l(charSequence);
            return;
        }
        super.setPrompt(charSequence);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        c.b.h.e e2 = this.e;
        if (e2 != null) {
            e2.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        c.b.h.e e2 = this.e;
        if (e2 != null) {
            e2.i(mode);
        }
    }

    public class b
    implements f,
    DialogInterface.OnClickListener {
        public g e;
        public ListAdapter f;
        public CharSequence g;

        public void a(int n2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public boolean b() {
            g g2 = this.e;
            if (g2 != null) {
                return g2.isShowing();
            }
            return false;
        }

        public int c() {
            return 0;
        }

        public void d(int n2, int n3) {
            g g2;
            if (this.f == null) {
                return;
            }
            g.a a2 = new g.a(v.this.getPopupContext());
            CharSequence charSequence = this.g;
            if (charSequence != null) {
                a2.a.d = charSequence;
            }
            ListAdapter listAdapter = this.f;
            int n4 = v.this.getSelectedItemPosition();
            AlertController.b b2 = a2.a;
            b2.g = listAdapter;
            b2.h = this;
            b2.j = n4;
            b2.i = true;
            this.e = g2 = a2.a();
            ListView listView = g2.g.g;
            listView.setTextDirection(n2);
            listView.setTextAlignment(n3);
            this.e.show();
        }

        public void dismiss() {
            g g2 = this.e;
            if (g2 != null) {
                g2.dismiss();
                this.e = null;
            }
        }

        public int g() {
            return 0;
        }

        public Drawable i() {
            return null;
        }

        public CharSequence j() {
            return this.g;
        }

        public void l(CharSequence charSequence) {
            this.g = charSequence;
        }

        public void m(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void n(int n2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void o(ListAdapter listAdapter) {
            this.f = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int n2) {
            g g2;
            v.this.setSelection(n2);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, n2, this.f.getItemId(n2));
            }
            if ((g2 = this.e) != null) {
                g2.dismiss();
                this.e = null;
            }
        }

        public void p(int n2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

}

