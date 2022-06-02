/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.ServiceConfigurationError
 *  kotlinx.coroutines.CoroutineExceptionHandler
 *  kotlinx.coroutines.android.AndroidDispatcherFactory
 *  kotlinx.coroutines.android.AndroidExceptionPreHandler
 *  kotlinx.coroutines.internal.MainDispatcherFactory
 */

import com.extragames.ninecasino.AndroidDispatcherFactory;
import com.extragames.ninecasino.AndroidExceptionPreHandler;
import com.extragames.ninecasino.CoroutineExceptionHandler;
import com.extragames.ninecasino.MainDispatcherFactory;

import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

public final class a {
    public static Iterator a() {
        try {
            Object[] arrobject = new CoroutineExceptionHandler[]{new AndroidExceptionPreHandler()};
            Iterator iterator = Arrays.asList(arrobject).iterator();
            return iterator;
        }
        catch (Throwable throwable) {
            throw new ServiceConfigurationError(throwable.getMessage(), throwable);
        }
    }

    public static Iterator b() {
        try {
            Object[] arrobject = new MainDispatcherFactory[]{new AndroidDispatcherFactory()};
            Iterator iterator = Arrays.asList(arrobject).iterator();
            return iterator;
        }
        catch (Throwable throwable) {
            throw new ServiceConfigurationError(throwable.getMessage(), throwable);
        }
    }
}

