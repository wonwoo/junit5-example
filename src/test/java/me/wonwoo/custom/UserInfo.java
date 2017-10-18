package me.wonwoo.custom;

class UserInfo {
  private final String name;
  private final String email;

  UserInfo(String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public String getName() {
    return name;
  }
}
