package org.junit.experimental.theories.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.TestClass;

/* loaded from: E:\78999\cookie_192572.dex */
public class Assignments {
    private List<PotentialAssignment> fAssigned;
    private final TestClass fClass;
    private final List<ParameterSignature> fUnassigned;

    private Assignments(List<PotentialAssignment> assigned, List<ParameterSignature> unassigned, TestClass testClass) {
        this.fUnassigned = unassigned;
        this.fAssigned = assigned;
        this.fClass = testClass;
    }

    public static Assignments allUnassigned(Method testMethod, TestClass testClass) throws Exception {
        List<ParameterSignature> signatures = ParameterSignature.signatures(testClass.getOnlyConstructor());
        signatures.addAll(ParameterSignature.signatures(testMethod));
        return new Assignments(new ArrayList(), signatures, testClass);
    }

    public boolean isComplete() {
        return this.fUnassigned.size() == 0;
    }

    public ParameterSignature nextUnassigned() {
        return this.fUnassigned.get(0);
    }

    public Assignments assignNext(PotentialAssignment source) {
        List<PotentialAssignment> assigned = new ArrayList<>(this.fAssigned);
        assigned.add(source);
        return new Assignments(assigned, this.fUnassigned.subList(1, this.fUnassigned.size()), this.fClass);
    }

    public Object[] getActualValues(int start, int stop, boolean nullsOk) throws PotentialAssignment.CouldNotGenerateValueException {
        Object[] values = new Object[stop - start];
        for (int i5 = start; i5 < stop; i5++) {
            Object value = this.fAssigned.get(i5).getValue();
            if (value == null && !nullsOk) {
                throw new PotentialAssignment.CouldNotGenerateValueException();
            }
            values[i5 - start] = value;
        }
        return values;
    }

    public List<PotentialAssignment> potentialsForNextUnassigned() throws InstantiationException, IllegalAccessException {
        ParameterSignature unassigned = nextUnassigned();
        return getSupplier(unassigned).getValueSources(unassigned);
    }

    public ParameterSupplier getSupplier(ParameterSignature unassigned) throws InstantiationException, IllegalAccessException {
        ParameterSupplier supplier = getAnnotatedSupplier(unassigned);
        return supplier != null ? supplier : new AllMembersSupplier(this.fClass);
    }

    public ParameterSupplier getAnnotatedSupplier(ParameterSignature unassigned) throws InstantiationException, IllegalAccessException {
        ParametersSuppliedBy annotation = (ParametersSuppliedBy) unassigned.findDeepAnnotation(ParametersSuppliedBy.class);
        if (annotation == null) {
            return null;
        }
        return annotation.value().newInstance();
    }

    public Object[] getConstructorArguments(boolean nullsOk) throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, getConstructorParameterCount(), nullsOk);
    }

    public Object[] getMethodArguments(boolean nullsOk) throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(getConstructorParameterCount(), this.fAssigned.size(), nullsOk);
    }

    public Object[] getAllArguments(boolean nullsOk) throws PotentialAssignment.CouldNotGenerateValueException {
        return getActualValues(0, this.fAssigned.size(), nullsOk);
    }

    private int getConstructorParameterCount() {
        List<ParameterSignature> signatures = ParameterSignature.signatures(this.fClass.getOnlyConstructor());
        int constructorParameterCount = signatures.size();
        return constructorParameterCount;
    }

    public Object[] getArgumentStrings(boolean nullsOk) throws PotentialAssignment.CouldNotGenerateValueException {
        Object[] values = new Object[this.fAssigned.size()];
        for (int i5 = 0; i5 < values.length; i5++) {
            values[i5] = this.fAssigned.get(i5).getDescription();
        }
        return values;
    }
}
