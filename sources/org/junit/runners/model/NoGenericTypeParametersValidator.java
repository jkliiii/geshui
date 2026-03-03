package org.junit.runners.model;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

/* loaded from: E:\78999\cookie_192572.dex */
class NoGenericTypeParametersValidator {
    private final Method fMethod;

    NoGenericTypeParametersValidator(Method method) {
        this.fMethod = method;
    }

    void validate(List<Throwable> errors) {
        Type[] arr$ = this.fMethod.getGenericParameterTypes();
        for (Type each : arr$) {
            validateNoTypeParameterOnType(each, errors);
        }
    }

    private void validateNoTypeParameterOnType(Type type, List<Throwable> errors) {
        if (type instanceof TypeVariable) {
            errors.add(new Exception("Method " + this.fMethod.getName() + "() contains unresolved type variable " + type));
            return;
        }
        if (type instanceof ParameterizedType) {
            validateNoTypeParameterOnParameterizedType((ParameterizedType) type, errors);
        } else if (type instanceof WildcardType) {
            validateNoTypeParameterOnWildcardType((WildcardType) type, errors);
        } else if (type instanceof GenericArrayType) {
            validateNoTypeParameterOnGenericArrayType((GenericArrayType) type, errors);
        }
    }

    private void validateNoTypeParameterOnParameterizedType(ParameterizedType parameterized, List<Throwable> errors) {
        Type[] arr$ = parameterized.getActualTypeArguments();
        for (Type each : arr$) {
            validateNoTypeParameterOnType(each, errors);
        }
    }

    private void validateNoTypeParameterOnWildcardType(WildcardType wildcard, List<Throwable> errors) {
        Type[] arr$ = wildcard.getUpperBounds();
        for (Type each : arr$) {
            validateNoTypeParameterOnType(each, errors);
        }
        Type[] arr$2 = wildcard.getLowerBounds();
        for (Type each2 : arr$2) {
            validateNoTypeParameterOnType(each2, errors);
        }
    }

    private void validateNoTypeParameterOnGenericArrayType(GenericArrayType arrayType, List<Throwable> errors) {
        validateNoTypeParameterOnType(arrayType.getGenericComponentType(), errors);
    }
}
