package com.atlassian.clover.eclipse.core.views.nodes;

import com.atlassian.clover.eclipse.core.CloverPlugin;
import com.atlassian.clover.eclipse.core.projects.CloverProject;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static clover.com.google.common.collect.Lists.newLinkedList;
import static clover.com.google.common.collect.Maps.newHashMap;

public class ProjToLeafPkgFragRelationship extends NodeRelationship {
    @Override
    public Object[] getChildren(Object object, NodeRelationshipFilter filter) {
        try {
            CloverProject cloverProject = CloverProject.getFor((IProject) object);
            if (cloverProject != null && cloverProject.getModel().isLoaded()) {
                IJavaProject javaProject = cloverProject.getJavaProject();

                Map<String, Set<IPackageFragment>> pkgNamesToFragments = newHashMap();

                for (IPackageFragmentRoot root : Arrays.asList(javaProject.getPackageFragmentRoots())) {
                    if (root.getKind() == IPackageFragmentRoot.K_SOURCE) {
                        IJavaElement[] packageFragments = root.getChildren();
                        for (IJavaElement packageFragment : packageFragments) {
                            if (packageFragment instanceof IPackageFragment
                                    && ((IPackageFragment) packageFragment).getCompilationUnits().length > 0) {

                                Set<IPackageFragment> fragments =
                                        pkgNamesToFragments.get(packageFragment.getElementName());
                                if (fragments == null) {
                                    fragments = new LinkedHashSet<>();
                                    pkgNamesToFragments.put(packageFragment.getElementName(), fragments);
                                }
                                fragments.add((IPackageFragment) packageFragment);
                            }
                        }
                    }
                }

                List<LeafPackageFragmentNode> multis = newLinkedList();
                for (Map.Entry<String, Set<IPackageFragment>> entry : pkgNamesToFragments.entrySet()) {
                    final String name = entry.getKey();
                    final Set<IPackageFragment> fragments = entry.getValue();
                    if (!fragments.isEmpty()) {
                        multis.add(new LeafPackageFragmentNode(name, fragments));
                    }
                }

                return filter.perform(multis);
            }
        } catch (Exception e) {
            CloverPlugin.logError("Unable to retrieve children for parent " + object, e);
        }
        return new Object[]{};
    }

    @Override
    public Boolean hasChildren(Object object, NodeRelationshipFilter filter) {
        try {
            CloverProject cloverProject = CloverProject.getFor((IProject) object);
            if (cloverProject != null && cloverProject.getModel().isLoaded()) {
                IJavaProject javaProject = cloverProject.getJavaProject();
                List<IPackageFragmentRoot> fragmentRoots = Arrays.asList(javaProject.getPackageFragmentRoots());
                for (IPackageFragmentRoot root : fragmentRoots) {
                    if (root.getKind() == IPackageFragmentRoot.K_SOURCE) {
                        IJavaElement[] packageFragments = root.getChildren();
                        for (IJavaElement packageFragment : packageFragments) {
                            if (packageFragment instanceof IPackageFragment
                                    && ((IPackageFragment) packageFragment).getCompilationUnits().length > 0) {

                                if (filter.accept(packageFragment)) {
                                    return true;
                                }
                            }
                        }
                    }
                }

            }
        } catch (Exception e) {
            CloverPlugin.logError("Unable to retrieve children for parent " + object, e);
        }
        return false;
    }

    @Override
    public boolean includes(Object object) {
        return object instanceof IProject;
    }
}
