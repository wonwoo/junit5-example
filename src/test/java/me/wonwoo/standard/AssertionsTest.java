package me.wonwoo.standard;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by wonwoo on 2016. 7. 17..
 */
@Tag("fast")
@Tag("model")
public class AssertionsTest {

  @Test
  void standardAssertions() {
    assertEquals(2, 2);
    assertEquals(4, 4, "The optional assertion message is now the last parameter.");
    assertTrue(2 == 2, () -> "Assertion messages can be lazily evaluated -- "
      + "to avoid constructing complex messages unnecessarily.");
  }

  @Test
  void groupedAssertions() {

    assertAll("address",
      () -> assertEquals("John", "John"),
      () -> assertEquals("User", "User")
    );
  }

  @Test
  void exceptionTesting() {
    Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
      throw new IllegalArgumentException("a message");
    });
    assertEquals("a message", exception.getMessage());
  }

}
