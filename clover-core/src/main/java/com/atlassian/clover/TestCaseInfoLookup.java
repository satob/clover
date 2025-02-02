package com.atlassian.clover;

import clover.com.google.common.collect.Sets;
import com.atlassian.clover.registry.entities.TestCaseInfo;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestCaseInfoLookup {
    private ConcurrentHashMap<Integer, TestCaseInfo> byId;
    private ConcurrentHashMap<String, TestCaseInfo> byQualifiedName;

    public TestCaseInfoLookup() {
        byId = new ConcurrentHashMap<>();
        byQualifiedName = new ConcurrentHashMap<>();
    }

    public void add(TestCaseInfo tci) {
        byId.putIfAbsent(tci.getId(), tci);
        byQualifiedName.putIfAbsent(tci.getQualifiedName(), tci);
    }

    public TestCaseInfo getBy(Integer id) {
        return byId.get(id);
    }

    /**
     * Search by a fully qualified test name, like "com.acme.FooTest.testThisFeature".
     */
    public TestCaseInfo getBy(String qualifiedName) {
        return byQualifiedName.get(qualifiedName);
    }

    public Set<TestCaseInfo> getTestCaseInfos() {
        return Sets.newHashSet(byId.values());
    }
}
