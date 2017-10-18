package me.wonwoo.custom;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@UserInfoExtension
class UserInfoTest {

  @Test
  void user_info_test(UserInfo userInfo) {
    assertEquals(userInfo.getName(), "wonwoo");
    assertEquals(userInfo.getEmail(), "wonwoo@test.com");
  }


  @ExtendWith(UserInfoParameterResolver.class)
  @Nested
  class NestedUserInfoTest {

    private final UserInfo userInfo;

    NestedUserInfoTest(UserInfo userInfo) {
      this.userInfo = userInfo;
    }

    @Test
    void user_info_test() {
      assertEquals(userInfo.getName(), "wonwoo");
      assertEquals(userInfo.getEmail(), "wonwoo@test.com");
    }
  }

}
