package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.runners.MethodSorters;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: E:\78999\cookie_192572.dex */
public @interface FixMethodOrder {
    MethodSorters value() default MethodSorters.DEFAULT;
}
