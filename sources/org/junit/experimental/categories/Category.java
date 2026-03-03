package org.junit.experimental.categories;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: E:\78999\cookie_192572.dex */
public @interface Category {
    Class<?>[] value();
}
