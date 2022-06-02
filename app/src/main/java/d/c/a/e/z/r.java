/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.text.TextWatcher
 *  android.text.method.PasswordTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 *  c.b.d.a.a
 *  com.google.android.material.internal.CheckableImageButton
 *  com.google.android.material.textfield.TextInputLayout
 *  com.google.android.material.textfield.TextInputLayout$f
 *  com.google.android.material.textfield.TextInputLayout$g
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.LinkedHashSet
 */
package d.c.a.e.z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import d.c.a.e.z.m;
import d.c.a.e.z.r;
import java.util.LinkedHashSet;

public class r
extends m {
    public final TextWatcher d = new TextWatcher(this){
        public final /* synthetic */ r e;
        {
            this.e = r3;
        }

        public void afterTextChanged(android.text.Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
            r r3 = this.e;
            r3.c.setChecked(true ^ r.e(r3));
        }

        public void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
        }
    };
    public final TextInputLayout.f e = new TextInputLayout.f(){

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            textInputLayout.setEndIconCheckable(true);
            r r3 = r.this;
            r3.c.setChecked(true ^ r.e(r3));
            editText.removeTextChangedListener(r.this.d);
            editText.addTextChangedListener(r.this.d);
        }
    };
    public final TextInputLayout.g f = new TextInputLayout.g(){

        public void a(TextInputLayout textInputLayout, int n2) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && n2 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.removeTextChangedListener(r.this.d);
            }
        }
    };

    public r(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public static boolean e(r r3) {
        EditText editText = r3.a.getEditText();
        return editText != null && editText.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    @Override
    public void a() {
        this.a.setEndIconDrawable(c.b.d.a.a.b((Context)this.b, (int)2131165332));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(2131624070));
        this.a.setEndIconOnClickListener(new View.OnClickListener(this){
            public final /* synthetic */ r e;
            {
                this.e = r3;
            }

            public void onClick(View view) {
                EditText editText = this.e.a.getEditText();
                if (editText == null) {
                    return;
                }
                int n2 = editText.getSelectionEnd();
                PasswordTransformationMethod passwordTransformationMethod = r.e(this.e) ? null : PasswordTransformationMethod.getInstance();
                editText.setTransformationMethod(passwordTransformationMethod);
                if (n2 >= 0) {
                    editText.setSelection(n2);
                }
            }
        });
        this.a.a(this.e);
        TextInputLayout textInputLayout2 = this.a;
        TextInputLayout.g g2 = this.f;
        textInputLayout2.j0.add((Object)g2);
        EditText editText = this.a.getEditText();
        boolean bl = editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
        if (bl) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

}

