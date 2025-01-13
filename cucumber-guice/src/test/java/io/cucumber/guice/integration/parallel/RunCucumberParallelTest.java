package io.cucumber.guice.integration.parallel;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME;

/**
 * Integration test that uses parallel execution.
 */
@Suite
@IncludeEngines("cucumber")
@SelectPackages("io.cucumber.guice.integration.parallel")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "io.cucumber.guice.integration")
@ConfigurationParameter(key = PARALLEL_EXECUTION_ENABLED_PROPERTY_NAME, value = "true")
public class RunCucumberParallelTest {

}
