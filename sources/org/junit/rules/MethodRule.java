package org.junit.rules;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

/* loaded from: E:\78999\cookie_192572.dex */
public interface MethodRule {
    Statement apply(Statement statement, FrameworkMethod frameworkMethod, Object obj);
}
