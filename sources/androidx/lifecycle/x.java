package androidx.lifecycle;

import androidx.lifecycle.l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: OnLifecycleEvent.java */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Deprecated
/* loaded from: E:\78999\cookie_5123796.dex */
public @interface x {
    l.a value();
}
