/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.SearchableInfo
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.database.Cursor
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.TextAppearanceSpan
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.BaseAdapter
 *  android.widget.ImageView
 *  android.widget.TextView
 *  androidx.appcompat.widget.SearchView
 *  c.b.h.q0$a
 *  java.io.FileNotFoundException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.WeakHashMap
 */
package c.b.h;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import c.b.h.q0;
import c.i.a.c;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/*
 * Exception performing whole class analysis.
 */
@SuppressLint(value={"RestrictedAPI"})
public class q0
extends c
implements View.OnClickListener {
    public static final /* synthetic */ int C;
    public int A;
    public int B;
    public final SearchView p;
    public final SearchableInfo q;
    public final Context r;
    public final WeakHashMap<String, Drawable.ConstantState> s;
    public final int t;
    public int u;
    public ColorStateList v;
    public int w;
    public int x;
    public int y;
    public int z;

    public q0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.u = 1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.p = searchView;
        this.q = searchableInfo;
        this.t = searchView.getSuggestionCommitIconResId();
        this.r = context;
        this.s = weakHashMap;
    }

    public static String h(Cursor cursor, int n2) {
        if (n2 == -1) {
            return null;
        }
        try {
            String string = cursor.getString(n2);
            return string;
        }
        catch (Exception exception) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", exception);
            return null;
        }
    }

    @Override
    public void a(View view, Context context, Cursor cursor) {
        int n2;
        int n3;
        a a2;
        ImageView imageView;
        block18 : {
            Object object;
            ImageView imageView2;
            block20 : {
                block22 : {
                    String string;
                    Drawable drawable;
                    block24 : {
                        block23 : {
                            String string2;
                            ActivityInfo activityInfo;
                            ComponentName componentName;
                            block21 : {
                                int n4;
                                block19 : {
                                    a2 = view.getTag();
                                    int n5 = this.B;
                                    n2 = n5 != -1 ? cursor.getInt(n5) : 0;
                                    if (a2.a != null) {
                                        String string3 = q0.h(cursor, this.w);
                                        TextView textView = a2.a;
                                        textView.setText(string3);
                                        int n6 = TextUtils.isEmpty(string3) ? 8 : 0;
                                        textView.setVisibility(n6);
                                    }
                                    if (a2.b != null) {
                                        String string4;
                                        String string5 = q0.h(cursor, this.y);
                                        if (string5 != null) {
                                            if (this.v == null) {
                                                TypedValue typedValue = new TypedValue();
                                                this.h.getTheme().resolveAttribute(2130903812, typedValue, true);
                                                this.v = this.h.getResources().getColorStateList(typedValue.resourceId);
                                            }
                                            string4 = new SpannableString(string5);
                                            TextAppearanceSpan textAppearanceSpan = new TextAppearanceSpan(null, 0, 0, this.v, null);
                                            string4.setSpan((Object)textAppearanceSpan, 0, string5.length(), 33);
                                        } else {
                                            string4 = q0.h(cursor, this.x);
                                        }
                                        if (TextUtils.isEmpty(string4)) {
                                            TextView textView = a2.a;
                                            if (textView != null) {
                                                textView.setSingleLine(false);
                                                a2.a.setMaxLines(2);
                                            }
                                        } else {
                                            TextView textView = a2.a;
                                            if (textView != null) {
                                                textView.setSingleLine(true);
                                                a2.a.setMaxLines(1);
                                            }
                                        }
                                        TextView textView = a2.b;
                                        textView.setText(string4);
                                        int n7 = TextUtils.isEmpty(string4) ? 8 : 0;
                                        textView.setVisibility(n7);
                                    }
                                    if ((imageView2 = a2.c) == null) break block18;
                                    n4 = this.z;
                                    if (n4 != -1) break block19;
                                    object = null;
                                    break block20;
                                }
                                object = this.f(cursor.getString(n4));
                                if (object != null) break block20;
                                componentName = this.q.getSearchActivity();
                                string = componentName.flattenToShortString();
                                if (!this.s.containsKey(string)) break block21;
                                Drawable.ConstantState constantState = this.s.get(string);
                                object = constantState == null ? null : constantState.newDrawable(this.r.getResources());
                                break block22;
                            }
                            PackageManager packageManager = this.h.getPackageManager();
                            try {
                                activityInfo = packageManager.getActivityInfo(componentName, 128);
                            }
                            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                                string2 = nameNotFoundException.toString();
                            }
                            int n8 = activityInfo.getIconResource();
                            if (n8 == 0) break block23;
                            drawable = packageManager.getDrawable(componentName.getPackageName(), n8, activityInfo.applicationInfo);
                            if (drawable != null) break block24;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid icon resource ");
                            stringBuilder.append(n8);
                            stringBuilder.append(" for ");
                            stringBuilder.append(componentName.flattenToShortString());
                            string2 = stringBuilder.toString();
                            Log.w("SuggestionsAdapter", string2);
                        }
                        drawable = null;
                    }
                    Drawable.ConstantState constantState = drawable == null ? null : drawable.getConstantState();
                    this.s.put((Object)string, (Object)constantState);
                    object = drawable;
                }
                if (object == null) {
                    object = this.h.getPackageManager().getDefaultActivityIcon();
                }
            }
            imageView2.setImageDrawable(object);
            if (object == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                object.setVisible(false, false);
                object.setVisible(true, false);
            }
        }
        if ((imageView = a2.d) != null) {
            int n9 = this.A;
            Drawable drawable = n9 == -1 ? null : this.f(cursor.getString(n9));
            imageView.setImageDrawable(drawable);
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                drawable.setVisible(false, false);
                drawable.setVisible(true, false);
            }
        }
        if ((n3 = this.u) != 2 && (n3 != 1 || (n2 & 1) == 0)) {
            a2.e.setVisibility(8);
            return;
        }
        a2.e.setVisibility(0);
        a2.e.setTag((Object)a2.a.getText());
        a2.e.setOnClickListener((View.OnClickListener)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void b(Cursor cursor) {
        c.i.a.a.super.b(cursor);
        if (cursor == null) return;
        try {
            this.w = cursor.getColumnIndex("suggest_text_1");
            this.x = cursor.getColumnIndex("suggest_text_2");
            this.y = cursor.getColumnIndex("suggest_text_2_url");
            this.z = cursor.getColumnIndex("suggest_icon_1");
            this.A = cursor.getColumnIndex("suggest_icon_2");
            this.B = cursor.getColumnIndex("suggest_flags");
            return;
        }
        catch (Exception exception) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", exception);
        }
    }

    @Override
    public CharSequence c(Cursor cursor) {
        String string;
        String string2;
        if (cursor == null) {
            return null;
        }
        String string3 = q0.h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (string3 != null) {
            return string3;
        }
        if (this.q.shouldRewriteQueryFromData() && (string2 = q0.h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return string2;
        }
        if (this.q.shouldRewriteQueryFromText() && (string = q0.h(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
            return string;
        }
        return null;
    }

    @Override
    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View view = this.o.inflate(this.m, viewGroup, false);
        view.setTag((Object)new /* Unavailable Anonymous Inner Class!! */);
        ((ImageView)view.findViewById(2131230891)).setImageResource(this.t);
        return view;
    }

    public Drawable e(Uri uri) {
        block10 : {
            block11 : {
                block12 : {
                    Resources resources;
                    int n2;
                    String string = uri.getAuthority();
                    if (TextUtils.isEmpty(string)) break block10;
                    try {
                        resources = this.h.getPackageManager().getResourcesForApplication(string);
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("No package found for authority: ");
                        stringBuilder.append(uri);
                        throw new FileNotFoundException(stringBuilder.toString());
                    }
                    List list = uri.getPathSegments();
                    if (list == null) break block11;
                    int n3 = list.size();
                    if (n3 == 1) {
                        try {
                            n2 = Integer.parseInt(list.get(0));
                        }
                        catch (NumberFormatException numberFormatException) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Single path segment is not a resource ID: ");
                            stringBuilder.append(uri);
                            throw new FileNotFoundException(stringBuilder.toString());
                        }
                    }
                    if (n3 != 2) break block12;
                    n2 = resources.getIdentifier((String)list.get(1), (String)list.get(0), string);
                    if (n2 != 0) {
                        return resources.getDrawable(n2);
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No resource found for: ");
                    stringBuilder.append(uri);
                    throw new FileNotFoundException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("More than two path segments: ");
                stringBuilder.append(uri);
                throw new FileNotFoundException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No path: ");
            stringBuilder.append(uri);
            throw new FileNotFoundException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No authority: ");
        stringBuilder.append(uri);
        throw new FileNotFoundException(stringBuilder.toString());
    }

    /*
     * Exception decompiling
     */
    public final Drawable f(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl183 : ALOAD : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:920)
        throw new IllegalStateException("Decompilation failed");
    }

    public Cursor g(SearchableInfo searchableInfo, String string, int n2) {
        String[] arrstring = null;
        if (searchableInfo == null) {
            return null;
        }
        String string2 = searchableInfo.getSuggestAuthority();
        if (string2 == null) {
            return null;
        }
        Uri.Builder builder = new Uri.Builder().scheme("content").authority(string2).query("").fragment("");
        String string3 = searchableInfo.getSuggestPath();
        if (string3 != null) {
            builder.appendEncodedPath(string3);
        }
        builder.appendPath("search_suggest_query");
        String string4 = searchableInfo.getSuggestSelection();
        if (string4 != null) {
            arrstring = new String[]{string};
        } else {
            builder.appendPath(string);
        }
        String[] arrstring2 = arrstring;
        if (n2 > 0) {
            builder.appendQueryParameter("limit", String.valueOf(n2));
        }
        Uri uri = builder.build();
        return this.h.getContentResolver().query(uri, null, string4, arrstring2, null);
    }

    @Override
    public View getDropDownView(int n2, View view, ViewGroup viewGroup) {
        try {
            View view2 = c.i.a.a.super.getDropDownView(n2, view, viewGroup);
            return view2;
        }
        catch (RuntimeException runtimeException) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
            View view3 = this.o.inflate(this.n, viewGroup, false);
            if (view3 != null) {
                (view3.getTag()).a.setText((CharSequence)runtimeException.toString());
            }
            return view3;
        }
    }

    @Override
    public View getView(int n2, View view, ViewGroup viewGroup) {
        try {
            View view2 = c.i.a.a.super.getView(n2, view, viewGroup);
            return view2;
        }
        catch (RuntimeException runtimeException) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", runtimeException);
            View view3 = this.d(this.h, this.g, viewGroup);
            (view3.getTag()).a.setText((CharSequence)runtimeException.toString());
            return view3;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public final void i(Cursor cursor) {
        Bundle bundle = cursor != null ? cursor.getExtras() : null;
        if (bundle == null || bundle.getBoolean("in_progress")) {
            // empty if block
        }
    }

    public void notifyDataSetChanged() {
        BaseAdapter.super.notifyDataSetChanged();
        this.i(this.g);
    }

    public void notifyDataSetInvalidated() {
        BaseAdapter.super.notifyDataSetInvalidated();
        this.i(this.g);
    }

    public void onClick(View view) {
        Object object = view.getTag();
        if (object instanceof CharSequence) {
            this.p.x((CharSequence)object);
        }
    }
}

