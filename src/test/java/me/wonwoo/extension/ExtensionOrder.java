package me.wonwoo.extension;

import org.junit.jupiter.api.extension.*;

public class ExtensionOrder implements BeforeAllCallback, BeforeEachCallback,
    BeforeTestExecutionCallback, TestInstancePostProcessor, AfterTestExecutionCallback,
    AfterEachCallback, AfterAllCallback {

  @Override
  public void beforeAll(ExtensionContext context) throws Exception {
    System.out.println("1. beforeAll");
  }

  @Override
  public void postProcessTestInstance(Object testInstance, ExtensionContext context) throws Exception {
    System.out.println("2. postProcessTestInstance");
  }
  @Override
  public void beforeEach(ExtensionContext context) throws Exception {
    System.out.println("3. beforeEach");
  }

  @Override
  public void beforeTestExecution(ExtensionContext context) throws Exception {
    System.out.println("4. beforeTestExecution");
  }

  @Override
  public void afterTestExecution(ExtensionContext context) throws Exception {
    System.out.println("5. afterTestExecution");
  }

  @Override
  public void afterEach(ExtensionContext context) throws Exception {
    System.out.println("6. afterEach");
  }

  @Override
  public void afterAll(ExtensionContext context) throws Exception {
    System.out.println("7. afterAll");
  }
}
