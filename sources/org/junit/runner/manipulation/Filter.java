package org.junit.runner.manipulation;

import java.util.Iterator;
import org.junit.runner.Description;

/* loaded from: E:\78999\cookie_192572.dex */
public abstract class Filter {
    public static Filter ALL = new Filter() { // from class: org.junit.runner.manipulation.Filter.1
        @Override // org.junit.runner.manipulation.Filter
        public boolean shouldRun(Description description) {
            return true;
        }

        @Override // org.junit.runner.manipulation.Filter
        public String describe() {
            return "all tests";
        }

        @Override // org.junit.runner.manipulation.Filter
        public void apply(Object child) throws NoTestsRemainException {
        }

        @Override // org.junit.runner.manipulation.Filter
        public Filter intersect(Filter second) {
            return second;
        }
    };

    public abstract String describe();

    public abstract boolean shouldRun(Description description);

    public static Filter matchMethodDescription(final Description desiredDescription) {
        return new Filter() { // from class: org.junit.runner.manipulation.Filter.2
            @Override // org.junit.runner.manipulation.Filter
            public boolean shouldRun(Description description) {
                if (description.isTest()) {
                    return desiredDescription.equals(description);
                }
                Iterator i$ = description.getChildren().iterator();
                while (i$.hasNext()) {
                    Description each = i$.next();
                    if (shouldRun(each)) {
                        return true;
                    }
                }
                return false;
            }

            @Override // org.junit.runner.manipulation.Filter
            public String describe() {
                return String.format("Method %s", desiredDescription.getDisplayName());
            }
        };
    }

    public void apply(Object child) throws NoTestsRemainException {
        if (child instanceof Filterable) {
            Filterable filterable = (Filterable) child;
            filterable.filter(this);
        }
    }

    public Filter intersect(final Filter second) {
        if (second != this && second != ALL) {
            return new Filter() { // from class: org.junit.runner.manipulation.Filter.3
                @Override // org.junit.runner.manipulation.Filter
                public boolean shouldRun(Description description) {
                    return first.shouldRun(description) && second.shouldRun(description);
                }

                @Override // org.junit.runner.manipulation.Filter
                public String describe() {
                    return first.describe() + " and " + second.describe();
                }
            };
        }
        return this;
    }
}
