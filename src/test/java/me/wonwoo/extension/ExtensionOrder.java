package me.wonwoo.extension;

import org.junit.jupiter.api.extension.*;

public class ExtensionOrder implements BeforeAllCallback, BeforeEachCallback,
    BeforeTestExecutionCallback, AfterTestExecutionCallback,
    AfterEachCallback, AfterAllCallback {

  @Override
  public void beforeAll(ExtensionContext context) throws Exception {
    System.out.println("1. beforeAll");
  }

  @Override
  public void beforeEach(ExtensionContext context) throws Exception {
    System.out.println("2. beforeEach");
  }

  @Override
  public void beforeTestExecution(ExtensionContext context) throws Exception {
    System.out.println("3. beforeTestExecution");
  }

  @Override
  public void afterTestExecution(ExtensionContext context) throws Exception {
    System.out.println("4. afterTestExecution");
  }

  @Override
  public void afterEach(ExtensionContext context) throws Exception {
    System.out.println("5. afterEach");
  }

  @Override
  public void afterAll(ExtensionContext context) throws Exception {
    System.out.println("6. afterAll");
  }


}
