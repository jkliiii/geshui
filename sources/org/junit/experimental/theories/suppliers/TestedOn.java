package org.junit.experimental.theories.suppliers;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.junit.experimental.theories.ParametersSuppliedBy;

@ParametersSuppliedBy(TestedOnSupplier.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: E:\78999\cookie_192572.dex */
public @interface TestedOn {
    int[] ints();
}
