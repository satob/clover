package com.atlassian.clover

import com.atlassian.clover.util.JavaEnvUtils

/**
 * The purpose of this test is to make sure that OpenClover handles the class name with whitespaces in annotation parameters properly
 */
class AnnotationParameterTest extends JavaSyntaxCompilationTestBase {

    protected File srcDir

    /** Regular expression for: __CLR_hash_code.R.inc(index) */
    protected final String R_INC = "__CLR[a-zA-Z0-9_]+\\.R\\.inc\\([0-9]+\\);"

    @Override
    protected void setUp() throws Exception {
        super.setUp()
        srcDir = new File(mTestcasesSrcDir, "testdetection\\version1")
        resetAntOutput()
    }

    void testAnnotationsOnJavaTypes() {
        final String fileName = "JUnit4TestCase.java"
        File srcFile = new File(srcDir, fileName)
        instrumentSourceFile(srcFile,  com.atlassian.clover.util.JavaEnvUtils.JAVA_7)

        // How to get the result of JUnit testcase?
        assertFileMatches(fileName, R_INC + "throw new MyException", false)
    }
}
