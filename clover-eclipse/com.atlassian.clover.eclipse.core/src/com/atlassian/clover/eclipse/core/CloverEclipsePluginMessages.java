package com.atlassian.clover.eclipse.core;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public final class CloverEclipsePluginMessages {

    private static final String BUNDLE_NAME = "plugin";

    private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);

    private CloverEclipsePluginMessages() {
    }

    public static String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            CloverPlugin.logWarning("Missing string resource: " + key, e);
            return "!" + key + "!";
        }
    }

    public static String getFormattedString(String key, Object arg) {
        String format = null;
        try {
            format = RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            CloverPlugin.logWarning("Missing string resource: " + key, e);
            return "!" + key + "!";
        }
        if (arg == null)
            arg = ""; 
        return MessageFormat.format(format, (arg instanceof Object[]) ? arg : new Object[]{arg});
    }

    public static String CLOVER_COPYRIGHT() {
        return getString("clover.copyright");
    }

    public static String INITSTRING() {
        return getString("ProjectPropertyPage.initstring");
    }

    public static String INITSTRING_BLURB() {
        return getString("ProjectPropertyPage.initstringBlurb");
    }

    public static String INITSTRING_AUTOMATIC() {
        return getString("ProjectPropertyPage.initstringAutomatic");
    }

    public static String INITSTRING_USER_SPECIFIED() {
        return getString("ProjectPropertyPage.initstringUserSpecified");
    }

    public static String INITSTRING_RELATIVE() {
        return getString("ProjectPropertyPage.initstringRelative");
    }

    public static String ENABLE_CLOVER_COVERAGE() {
        return getString("ProjectPropertyPage.enableCloverCoverage");
    }

    public static String INSTRUMENTATION() {
        return getString("ProjectPropertyPage.instrumentation");
    }

    public static String COMPILATION() {
        return getString("ProjectPropertyPage.compilation");
    }

    public static String FILTERING() {
        return getString("ProjectPropertyPage.filtering");
    }

    public static String LICENSE() {
        return getString("ProjectPropertyPage.license");
    }

    public static String FLUSH_POLICY() {
        return getString("ProjectPropertyPage.flushPolicy");
    }

    public static String FLUSH_COVERAGE_WHEN() {
        return getString("ProjectPropertyPage.flushCoverageWhen");
    }

    public static String FLUSH_POLICY_EXPLANATION() {
        return getString("ProjectPropertyPage.flushPolicyExplanation");
    }

    public static String FLUSH_INTERVAL() {
        return getString("ProjectPropertyPage.flushInterval");
    }

    public static String FLUSH_POLICY_INTERVAL_MILISECONDS() {
        return getString("ProjectPropertyPage.flushPolicy.intervalMiliseconds");
    }

    public static String FLUSH_POLICY_THREADED() {
        return getString("ProjectPropertyPage.threadedFlush");
    }

    public static String FLUSH_POLICY_INTERVAL() {
        return getString("ProjectPropertyPage.intervalFlush");
    }

    public static String FLUSH_POLICY_DIRECTED() {
        return getString("ProjectPropertyPage.directedFlush");
    }

    public static String OUTPUT_DIR() {
        return getString("ProjectPropertyPage.outputDir");
    }

    public static String CUSTOM_OUTPUT_ROOT_IS_RELATIVE() {
        return getString("ProjectPropertyPage.customOutputRootIsRelative");
    }

    public static String PLACE_IN_PROJECT_DIRS() {
        return getString("ProjectPropertyPage.placeInProjectDirs");
    }

    public static String PLACE_IN_USER_DIRS() {
        return getString("ProjectPropertyPage.placeInUserDirs");
    }

    public static String QUALIFY_JAVA_LANG() {
        return getString("ProjectPropertyPage.qualifyJavaLang");
    }

    public static String METHOD_CONTEXT_FILTER_INSTRUCTIONS() {
        return getString("ProjectPropertyPage.methodContextFilterInstructions");
    }

    public static String STATEMENT_CONTEXT_FILTER_INSTRUCTIONS() {
        return getString("ProjectPropertyPage.statementContextFilterInstructions");
    }

    public static String WHEN_REBUILDING() {
        return getString("PreferencesPage.whenRebuilding");
    }

    public static String LEAVE_COVERAGE() {
        return getString("PreferencesPage.leaveOnRebuild");
    }

    public static String CLEAR_COVERAGE() {
        return getString("PreferencesPage.clearOnRebuild");
    }

    public static String PROMPT_ME_ON_REBUILD() {
        return getString("PreferencesPage.promptOnRebuild");
    }

    public static String WHEN_CONTEXT_CHANGES() {
        return getString("PreferencesPage.whenContextChanges");
    }

    public static String REBUILD_ON_CONTEXT_CHANGE() {
        return getString("PreferencesPage.rebuildOnContextChange");
    }

    public static String IGNORE_ON_CONTEXT_CHANGE() {
        return getString("PreferencesPage.ignoreOnContextChange");
    }

    public static String PROMPT_ME_ON_CONTEXT_CHANGE() {
        return getString("PreferencesPage.promptOnContextChange");
    }

    public static String WHEN_INSTRUMENTATION_SOURCE_CHANGES() {
        return getString("PreferencesPage.whenInstrumentedSourceChanges");
    }

    public static String INSTRUMENTATION_SOURCE_CHANGED_TITLE() {
            return getString("ProjectPropertyPage.rebuildSourceTitle");
    }

    public static String INSTRUMENTATION_SOURCE_CHANGED_QUESTION() {
            return getString("ProjectPropertyPage.rebuildSourceQuestion");
    }

    public static String DISPLAY_THIS_PROMPT_AGAIN() {
            return getString("ProjectPropertyPage.displayThisPromptAgain");
    }
    
    public static String PRIME_AWT_IN_UI_THREAD() {
        return getString("PreferencesPage.primeAWTInUIThread");
    }

    public static String SHOW_EXCLUSION_ANNOTATIONS() {
        return getString("PreferencesPage.showExclusionAnnotations");
    }

    public static String AUTO_REFRESH_COVERAGE_DATA() {
        return getString("PreferencesPage.autoRefreshCoverageData");
    }

    public static String AUTO_OPEN_CLOVER_VIEWS() {
        return getString("PreferencesPage.autoOpenCloverViews");
    }

    public static String COVERAGE_DATA() {
        return getString("PreferencesPage.coverageData");
    }

    public static String TWO_SECONDS() {
        return getString("PreferencesPage.twoSeconds");
    }

    public static String FIVE_SECONDS() {
        return getString("PreferencesPage.fiveSeconds");
    }

    public static String TEN_SECONDS() {
        return getString("PreferencesPage.tenSeconds");
    }

    public static String TWENTY_SECONDS() {
        return getString("PreferencesPage.twentySeconds");
    }

    public static String SPAN() {
        return getString("PreferencesPage.span");
    }

    public static String SPAN_BLURB() {
        return getString("PreferencesPage.spanBlurb");
    }

    public static String MISC_PREFERENCES() {
        return getString("PreferencesPage.miscellaneous");
    }

    public static String PRESERVE_INSTRUMENTED_SOURCES() {
        return getString("PreferencesPage.preserveInstrumentedSources");
    }

    public static String FILE_FILTERING() {
        return getString("ProjectPropertyPage.fileFiltering");
    }

    public static String FILE_FILTERING_ALL_FOLDERS() {
        return getString("ProjectPropertyPage.fileFilteringAllFolders");
    }

    public static String FILE_FILTERING_SELECTED_FOLDERS() {
        return getString("ProjectPropertyPage.fileFilteringSelectedFolders");
    }

    public static String FILE_FILTERING_INCLUDE() {
        return getString("ProjectPropertyPage.fileFilteringInclude");
    }

    public static String FILE_FILTERING_EXCLUDE() {
        return getString("ProjectPropertyPage.fileFilteringExclude");
    }

    public static String TEST_FOLDERS() {
        return getString("ProjectPropertyPage.testFolders");
    }

    public static String TEST_FOLDERS_ALL() {
        return getString("ProjectPropertyPage.testFoldersAll");
    }

    public static String TEST_FOLDERS_SELECTED() {
        return getString("ProjectPropertyPage.testFoldersSelected");
    }

    public static String TEST_FOLDERS_NONE() {
        return getString("ProjectPropertyPage.testFoldersNone");
    }

    public static String SOURCE_FILES_TAB() {
        return getString("ProjectPropertyPage.sourceFilesTab");
    }

    public static String TEST_CLASSES_TAB() {
        return getString("ProjectPropertyPage.testClassesTab");
    }

    public static String OUTPUT_FOLDER_GROUP() {
        return getString("ProjectPropertyPage.outputFolder.groupTitle");
    }

    public static String OUTPUT_FOLDER_DIALOG_CAPTION() {
        return getString("ProjectPropertyPage.outputFolder.folderDialog.caption");
    }

    public static String OUTPUT_FOLDER_RECREATE_ORIGINAL_FOLDERS() {
        return getString("ProjectPropertyPage.outputFolder.recreateOriginalFolders");
    }

    public static String OUTPUT_FOLDER_RECREATE_ORIGINAL_FOLDERS_TOOLTIP() {
        return getString("ProjectPropertyPage.outputFolder.recreateOriginalFolders.toolTip");
    }

    public static String ERROR_SELECT_WITHIN_PROJECT() {
        return getString("ProjectPropertyPage.outputFolder.folderDialog.errorSelectWithinProject");
    }

    public static String ERROR_OUTPUT_FOLDER_HAS_SOURCES() {
        return getString("ProjectPropertyPage.errorOutputFolderHasSources");
    }

    public static String ERROR_OUTPUT_FOLDER_HAS_SOURCES(String path, String packageName) {
        return getFormattedString("ProjectPropertyPage.errorOutputFolderHasSourcesExt", new Object[] { path, packageName });
    }

    public static String ERROR_UNEXPECTED_WHILE_APPLY_PROPERTIES() {
        return getString("ProjectPropertyPage.errorUnexpectedWhileApplyProperties");
    }

    public static String ERROR_CUSTOM_INITSTRING_NOT_EMPTY() {
        return getString("ProjectPropertyPage.errorCustomInitStringNotEmpty");
    }

    public static String ERROR_FLUSH_INTERVAL_NOT_POSITIVE() {
        return getString("ProjectPropertyPage.errorFlushIntervalNotPositive");
    }

    public static String ERROR_FLUSH_INTERVAL_NOT_A_NUMBER() {
        return getString("ProjectPropertyPage.errorFlushIntervalNotANumber");
    }

    public static String ERROR_OUTPUT_DIR_NAME_IS_NULL() {
        return getString("ProjectPropertyPage.errorOutputDirNameIsNull");
    }

    public static String ERROR_UNEXPECTED_WHILE_CUSTOM_OUTPUT_DIR() {
        return getString("ProjectPropertyPage.errorUnexpectedWhileCustomOutputDir");
    }

    public static String CONTEXT_FILTERING() {
        return getString("ProjectPropertyPage.contextFiltering");
    }

    public static String CONTEXT_FILTERING_BLURB() {
        return getString("ProjectPropertyPage.contextFilteringBlurb");
    }

    public static String MISC_INSTRUMENTATION() {
        return getString("ProjectPropertyPage.miscellaneousInstrumentationSettings");
    }

    public static String NOT_COVERED() {
        return getString("CoverageAnnotation.notCovered");
    }

    public static String COVERED() {
        return getString("CoverageAnnotation.covered");
    }

    public static String COVERAGE_ELEMENT_COL() {
        return getString("CoverageView.elementColumn");
    }

    public static String COVERAGE_ELEMENT_ABBREVIATED_COL() {
        return getString("CoverageView.elementAbbreviatedColumn");
    }

    public static String COVERAGE_ELEMENT_COL_TOOL_TIP() {
        return getString("CoverageView.elementColumnToolTip");
    }

    public static String COVERAGE_COL() {
        return getString("CoverageView.coverageColumn");
    }

    public static String COVERAGE_COL_TOOL_TIP() {
        return getString("CoverageView.coverageColumnToolTip");
    }

    public static String AVG_METH_COMPLEXITY_COL() {
        return getString("CoverageView.avgMethComplexityColumn");
    }

    public static String AVG_METH_COMPLEXITY_COL_TOOL_TIP() {
        return getString("CoverageView.avgMethComplexityColumnToolTip");
    }

    public static String TOTAL_COMPLEXITY_COL() {
        return getString("CoverageView.totalComplexityColumn");
    }

    public static String TOTAL_COMPLEXITY_COL_TOOL_TIP() {
        return getString("CoverageView.totalComplexityColumnToolTip");
    }

    public static String TEST_COL() {
        return getString("TestRunExplorerView.testColumn");
    }

    public static String TEST_ABBREVIATED_COL() {
        return getString("TestRunExplorerView.testAbbreviatedColumn");
    }

    public static String TESTT_TOOL_TIP() {
        return getString("TestRunExplorerView.testColumnToolTip");
    }

    public static String TEST_STARTED_COL() {
        return getString("TestRunExplorerView.startedColumn");
    }

    public static String TEST_STARTED_ABBREVIATED_COL() {
        return getString("TestRunExplorerView.startedAbbreviatedColumn");
    }

    public static String TEST_STARTED_COL_TOOL_TIP() {
        return getString("TestRunExplorerView.startedColumnToolTip");
    }

    public static String TEST_STATUS_COL() {
        return getString("TestRunExplorerView.statusColumn");
    }

    public static String TEST_STATUS_ABBREVIATED_COL() {
        return getString("TestRunExplorerView.statusAbbreviatedColumn");
    }

    public static String TEST_STATUS_COL_TOOL_TIP() {
        return getString("TestRunExplorerView.statusColumnToolTip");
    }

    public static String TEST_TIME_COL() {
        return getString("TestRunExplorerView.timeColumn");
    }

    public static String TEST_TIME_ABBREVIATED_COL() {
        return getString("TestRunExplorerView.timeAbbreviatedColumn");
    }

    public static String TEST_TIME_COL_TOOL_TIP() {
        return getString("TestRunExplorerView.timeColumnToolTip");
    }

    public static String TEST_MESSAGE_COL() {
        return getString("TestRunExplorerView.messageColumn");
    }

    public static String TEST_MESSAGE_ABBREVIATED_COL() {
        return getString("TestRunExplorerView.messageAbbreviatedColumn");
    }

    public static String TEST_MESSAGE_COL_TOOL_TIP() {
        return getString("TestRunExplorerView.messageColumnToolTip");
    }

    public static String LICENSE_SUMMARY() {
        return getString("LicensePreferencesPage.licenseSummary");
    }

    public static String LICENSE_STATUS() {
        return getString("LicensePreferencesPage.licenseStatus");
    }

    public static String LICENSE_STATUS_LICENSED() {
        return getString("LicensePreferencesPage.licenseStatusLicensed");
    }

    public static String LICENSE_TYPE() {
        return getString("LicensePreferencesPage.licenseType");
    }

    public static String LICENSE_STATEMENT() {
        return getString("LicensePreferencesPage.licenseMessage");
    }

    public static String LICENSE_SID() {
        return getString("LicensePreferencesPage.licenseSID");
    }

    public static String LICENSE_TEXT() {
        return getString("LicensePreferencesPage.licenseText");
    }

    public static String LICENSE_TEXT_EXPLANATION(String nextSteps) {
        return getFormattedString("LicensePreferencesPage.licenseTextExplanation", new Object[] {nextSteps});
    }

    public static String LICENSE_TEXT_PASTE() {
        return getString("LicensePreferencesPage.licenseTextPaste");
    }

    public static String LICENSE_TEXT_LOAD() {
        return getString("LicensePreferencesPage.licenseTextLoad");
    }

    public static String LICENSE_FILE_ERROR_TITLE() {
        return getString("LicensePreferencesPage.licenseFileErrorTitle");
    }

    public static String LICENSE_FILE_ERROR_MESSAGE(String path, String error) {
        return getFormattedString("LicensePreferencesPage.licenseFileErrorMessage", new Object[] { path, error });
    }

    public static String LICENSE_FILE_CANT_READ() {
        return getString("LicensePreferencesPage.licenseFileCantRead");
    }

    public static String LICENSE_FILE_NOT_LICENSE() {
        return getString("LicensePreferencesPage.licenseFileNotLicense");
    }

    public static String METRICS_SUMMARY() {
        return getString("CoverageView.metricsSummaryDetails");
    }

    public static String LOADING_DECORATION(String label) {
        return getFormattedString("CoverageView.loadingDecoration", label);
    }

    public static String PROJECT_RISKS() {
        return getString("CloudEditor.projectRisks");
    }

    public static String PACKAGE_RISKS() {
        return getString("CloudEditor.packageRisks");
    }

    public static String QUICK_WINS() {
        return getString("CloudEditor.quickWins");
    }

    public static String SHOW_AGGREGATE_CLOUD() {
        return getString("CloudEditor.showAggregateCloud");
    }

    public static String FAILED_TO_GENERATE_CLOUD() {
        return getString("OpenCloudAction.failedToGenerateCloud");
    }

    public static String FAILED_TO_OPEN_CLOUD_EDITOR() {
        return getString("OpenCloudAction.failedToOpenCloudEditor");
    }

    public static String GENERATING_CLOUD_FOR(String projectName) {
        return getFormattedString("OpenCloudAction.generatingCloudForProject", projectName);
    }

    public static String REFRESH_CLOUD() {
        return getString("RefreshCloudAction.refreshCloud");
    }

    public static String REFRESH_CLOUD_BUTTON() {
        return getString("RefreshCloudAction.refresh");
    }

    public static String REFRESH_CLOUD_TOOL_TIP() {
        return getString("RefreshCloudAction.refreshCloudToolTip");
    }

    public static String CLOVER_WORKING_SET() {
        return getString("CloverWorkingSet.title");
    }

    public static String HIERARCHY_LAYOUT() {
        return getString("CoverageView.hierarchyStyleMenuTitle");
    }

    public static String BLOCK_CONTEXT_FILTER_INSTRUCTIONS() {
        return getString("Contexts.blockContextFilterInstructions");
    }

    public static String REGEXP_CONTEXT_FILTER_MODIFICATION_INSTRUCTIONS() {
        return getString("Contexts.regexpContextFilterModificationInstructions");
    }

    public static String REGEXP_CONTEXT_FILTER_SELECTION_INSTRUCTIONS() {
        return getString("Contexts.regexpContextFilterSelectionInstructions");
    }

    public static String RESERVED_BLOCK_CONTEXT(String name) {
        return getString("Contexts.block." + name);
    }

    public static String RESERVED_REGEX_CONTEXT(String name) {
        return getString("Contexts.regex." + name);
    }

    public static String LAUNCH_TOOLBAR_LAST_CLOVERED_NAME() {
        return getString("launch.toolbar.last.clovered.name");
    }

    public static String LAUNCH_TOOLBAR_LAST_CLOVERED_DESCRIPTION() {
        return getString("launch.commands.last.clovered.description");
    }

    public static String REPORT_SHOW_IN_BROWSER() {
        return getString("Report.showInBrowser");
    }

    public static String SYSTEM_BROWSER() {
        return getString("Report.systemBrowser");
    }

    public static String ECLIPSE_BROWSER() {
        return getString("Report.eclipseBrowser");
    }

    public static String ECLIPSE_VIEWER(String name) {
        return getFormattedString("Report.eclipseViewer", name);
    }

    public static String SYSTEM_PDF_VIEWER() {
        return getString("Report.systemPDFViewer");
    }

    public static String SYSTEM_XML_VIEWER() {
        return getString("Report.systemXMLViewer");
    }

    public static String ECLIPSE_XML_TEXT_VIEWER() {
        return getString("Report.eclipseXMLTextViewer");
    }

    public static String REPORT_MESSAGEBOX_TITLE(String title) {
        return getFormattedString("Report.messageBoxTitle", title);
    }

    public static String REPORT_OPEN_IN() {
        return getString("Report.openReportIn");
    }

    public static String REPORT_SUCCESS_MESSAGE() {
        return getString("Report.successMessage");
    }

    public static String REPORT_CANCEL_MESSAGE() {
        return getString("Report.cancelMessage");
    }

    public static String PROJECT_REPORT() {
        return getString("project.report");
    }

    public static String PROJECT_REPORT_TOOL_TIP() {
        return getString("project.reporttooltip");
    }

    public static String PROJECT_GENERATE_REPORT() {
        return getString("project.generatereport");
    }

    public static String PROJECT_VIEW_REPORT() {
        return getString("project.viewreport");
    }

    public static String MARKERS_STALE_DB() {
        return MARKERS_STALE_DB("");
    }

    public static String MARKERS_STALE_DB(String message) {
        return getFormattedString("markers.staledb", message);
    }

    public static String MARKERS_ERROR_LOADING_DB(String message) {
        return getFormattedString("markers.errorloadingdb", message);
    }

    public static String MARKERS_ERROR_REMOVING_DB(String path) {
        return getFormattedString("markers.errorremovingdb", path);
    }
}
