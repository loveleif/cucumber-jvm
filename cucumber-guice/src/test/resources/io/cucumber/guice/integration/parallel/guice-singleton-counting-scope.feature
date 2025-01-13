Feature: cucumber-guice supports singleton scope in parallel execution

  Scenario: cucumber-guice injects a singleton scope instance in scenario 1
    Given a singleton resource has been injected in this scenario
    Then total singleton instance count is one

  Scenario: cucumber-guice injects a singleton scope instance in scenario 2
    Given a singleton resource has been injected in this scenario
    Then total singleton instance count is one

  Scenario: cucumber-guice injects a singleton scope instance in scenario 3
    Given a singleton resource has been injected in this scenario
    Then total singleton instance count is one

  Scenario: cucumber-guice injects a singleton scope instance in scenario 4
    Given a singleton resource has been injected in this scenario
    Then total singleton instance count is one
