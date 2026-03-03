package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* loaded from: E:\78999\cookie_192572.dex */
public class FrameworkField extends FrameworkMember<FrameworkField> {
    private final Field fField;

    FrameworkField(Field field) {
        this.fField = field;
    }

    @Override // org.junit.runners.model.FrameworkMember
    public String getName() {
        return getField().getName();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Annotation[] getAnnotations() {
        return this.fField.getAnnotations();
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isPublic() {
        int modifiers = this.fField.getModifiers();
        return Modifier.isPublic(modifiers);
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isShadowedBy(FrameworkField otherMember) {
        return otherMember.getName().equals(getName());
    }

    @Override // org.junit.runners.model.FrameworkMember
    public boolean isStatic() {
        int modifiers = this.fField.getModifiers();
        return Modifier.isStatic(modifiers);
    }

    public Field getField() {
        return this.fField;
    }

    @Override // org.junit.runners.model.FrameworkMember
    public Class<?> getType() {
        return this.fField.getType();
    }

    public Object get(Object target) throws IllegalArgumentException, IllegalAccessException {
        return this.fField.get(target);
    }
}
