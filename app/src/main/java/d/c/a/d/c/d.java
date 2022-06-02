/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  d.c.a.d.c.b$a
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package d.c.a.d.c;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import d.c.a.d.c.b;
import d.c.a.d.c.e;
import java.util.Objects;

/*
 * Exception performing whole class analysis.
 */
public class d
implements Parcelable {
    public static final Creator<d> CREATOR;
    public Messenger e;
    public b f;

    public static {
        CREATOR = new e();
    }

    public d(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.e = new Messenger(iBinder);
            return;
        }
        this.f = new /* Unavailable Anonymous Inner Class!! */;
    }

    public final IBinder a() {
        Messenger messenger = this.e;
        if (messenger != null) {
            return messenger.getBinder();
        }
        return (this.f).a;
    }

    public final void b(Message message) {
        Messenger messenger = this.e;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        b.a a2 = this.f;
        Objects.requireNonNull(a2);
        Parcel parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        parcel.writeInt(1);
        message.writeToParcel(parcel, 0);
        try {
            a2.a.transact(1, parcel, null, 1);
            return;
        }
        finally {
            parcel.recycle();
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        try {
            boolean bl = this.a().equals(((d)object).a());
            return bl;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public int hashCode() {
        return this.a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int n2) {
        Messenger messenger = this.e;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
            return;
        }
        parcel.writeStrongBinder((this.f).a);
    }

    public static final class a
    extends ClassLoader {
        public final Class<?> loadClass(String string, boolean bl) {
            if ("com.google.android.gms.iid.MessengerCompat".equals(string)) {
                boolean bl2 = Log.isLoggable("CloudMessengerCompat", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("CloudMessengerCompat", 3);
                if (bl2) {
                    Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
                }
                return d.class;
            }
            return super.loadClass(string, bl);
        }
    }

}

