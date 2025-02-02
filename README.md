# About #

This repository contains source code of OpenClover Core as well as its integrations: Clover-for-Ant, Clover-for-Eclipse
and Clover-for-IDEA plugins. Sources are licensed under Apache 2.0 license.

# Documentation #

User documentation:

* http://openclover.org/documentation
* http://confluence.atlassian.com/display/CLOVER/Clover+Documentation+Home

Developer guides:

* http://openclover.org/documentation
* https://confluence.atlassian.com/display/CLOVER/Clover+Development+Hub

Support Knowledge Base:

* http://openclover.org/documentation
* http://confluence.atlassian.com/display/CLOVERKB/Clover+Knowledge+Base+Home

Q&A forums:

* Stackoverflow: https://stackoverflow.com/tags/clover
* Atlassian Community: https://community.atlassian.com/t5/Clover/ct-p/clover

Bug and feature tracker:

* https://github.com/openclover/clover/issues
* https://jira.atlassian.com/browse/CLOV

Download page:

* http://openclover.org/downloads

Source code:

* https://github.com/openclover/clover

See also:

* https://github.com/openclover/clover-maven-plugin
* https://github.com/openclover/gradle-clover-plugin
* https://github.com/openclover/grails-clover-plugin
* https://github.com/openclover/clover-examples
* https://github.com/openclover/clover-aspectj-compiler
* https://github.com/jenkinsci/clover-plugin
* https://github.com/hudson3-plugins/clover-plugin

# Quick setup for developing OpenClover #

* Install JDK 1.8, Ant 1.10+, Maven 3.8+, Git
* Prepare work environment: 

```
# Prepare repacked third party libraries
mvn install -f clover-core-libs/jarjar/pom.xml
mvn install -Prepack -f clover-core-libs/pom.xml
mvn install -Prepack -f clover-idea/clover-jtreemap/pom.xml

# Download Eclipse IDE binaries
ant clover-eclipse-libs.build

# Download KTremap fork and install it
git clone https://bitbucket.org/atlassian/ktreemap
cd ktreemap
git checkout ktreemap-1.1.0-atlassian-01
# an old maven-antrun-plugin does not recognize <target> tag
sed -i -e 's@<artifactId>maven-antrun-plugin</artifactId>@<artifactId>maven-antrun-plugin</artifactId><version>3.1.0</version>@' pom.xml
# maven-dependency-plugin fails because of missing eclipse artifact so copy JARs manually
mkdir -p target/eclipse; cp ../target/dependencies/eclipse/4.4/plugins/*.jar target/eclipse
mvn install -Dmdep.skip=true  
cd ..
```

Now you can work with the code. A naming convention for Ant targets is:

< global | module-name >.< build | test.build | test | clean | repkg >

There are more global and module-specific targets available, see build.xml files.

Examples:

```
# Compile everything, including tests
ant global.test.build

# Check binary compatibility wtih all Eclipse versions supported 
ant clover-eclipse.build.all.versions

# Check binary compatibility wtih all IntelliJ versions supported
ant clover-idea.test.all.versions

# Run tests for three main modules
ant clover-core.test clover-ant.test groovy.test
```

---

Copyright @ 2002 - 2017 Atlassian Pty Ltd
Copyright @ 2017 - 2022 modifications by OpenClover.org
