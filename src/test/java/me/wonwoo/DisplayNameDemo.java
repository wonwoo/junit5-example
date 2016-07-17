package me.wonwoo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Created by wonwoo on 2016. 7. 17..
 */
@DisplayName("A special test case")
class DisplayNameDemo {

  @Test
  @DisplayName("Custom test name containing spaces")
  void testWithDisplayNameContainingSpaces() {
  }

  @Test
  @DisplayName("╯°□°）╯")
  void testWithDisplayNameContainingSpecialCharacters() {
  }

  @Test
  @DisplayName("")
  void testWithDisplayNameContainingEmoji() {
  }
}