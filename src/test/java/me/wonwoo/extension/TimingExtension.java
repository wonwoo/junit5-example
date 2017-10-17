package me.wonwoo.extension;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import static org.junit.jupiter.api.extension.ExtensionContext.*;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

  private final Logger logger = Logger.getLogger(this.getClass().getSimpleName());

  @Override
  public void beforeTestExecution(ExtensionContext context) throws Exception {
    getStore(context).put(context.getRequiredTestMethod(), System.currentTimeMillis());
  }

  @Override
  public void afterTestExecution(ExtensionContext context) throws Exception {
    Method testMethod = context.getRequiredTestMethod();
    long start = getStore(context).remove(testMethod, long.class);
    long duration = System.currentTimeMillis() - start;
    logger.info(() -> "MethodName is [" + testMethod.getName() + "] took [" + duration + "] ms.");
  }

  private Store getStore(ExtensionContext context) {
    return context.getStore(Namespace.create(getClass(), context));
  }

}
