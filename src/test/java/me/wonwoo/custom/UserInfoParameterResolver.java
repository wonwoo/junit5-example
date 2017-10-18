package me.wonwoo.custom;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;

class UserInfoParameterResolver implements ParameterResolver {

  @Override
  public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
    return (parameterContext.getParameter().getType() == UserInfo.class);
  }

  @Override
  public UserInfo resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
    return new UserInfo("wonwoo", "wonwoo@test.com");
  }
}
