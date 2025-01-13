package io.cucumber.guice.integration.parallel;

import io.cucumber.guice.ScenarioScoped;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import jakarta.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

@ScenarioScoped
public class ThreadSafeSingletonScopedSteps {

    private SingletonResource singletonResource;

    @Inject
    public ThreadSafeSingletonScopedSteps(SingletonResource singletonResource) {
        this.singletonResource = singletonResource;
    }

    @Given("a singleton resource has been injected in this scenario")
    public void a_singleton_resource_has_been_injected_in_this_scenario() {
        assertThat(this.singletonResource, notNullValue());
    }

    @Then("total singleton instance count is one")
    public void total_singleton_instance_count_is_one() {
        assertThat(this.singletonResource.instanceCountAfterConstruction, is(1));
        assertThat(SingletonResource.GLOBAL_COUNT, is(1));
    }
}
