package org.junit.rules;

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/* loaded from: E:\78999\cookie_192572.dex */
public interface TestRule {
    Statement apply(Statement statement, Description description);
}
