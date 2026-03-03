package com.google.errorprone.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
/* loaded from: E:\78999\cookie_5123796.dex */
public @interface InlineMe {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
