package com.google.errorprone.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
/* loaded from: E:\78999\cookie_5123796.dex */
public @interface InlineMeValidationDisabled {
    String value();
}
