package me.wonwoo.param;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestInfoTest {

  @Test
  void testInfo(TestInfo testInfo) {
    assertEquals(testInfo.getTestClass(), Optional.of(TestInfoTest.class));
    assertEquals(testInfo.getDisplayName(), "testInfo(TestInfo)");
  }

  @Test
  void testReporter(TestReporter testReporter) {
    testReporter.publishEntry("a key", "a value");
  }

  @Test
  void reportSeveralValues(TestReporter testReporter) {
    Map<String, String> values = new HashMap<>();
    values.put("user name", "dk38");
    values.put("award year", "1974");
    testReporter.publishEntry(values);
  }

  @RepeatedTest(value = 1, name = "{displayName} {currentRepetition}/{totalRepetitions}")
  @DisplayName("Repeat!")
  void customDisplayName(TestInfo testInfo) {
    assertEquals(testInfo.getDisplayName(), "Repeat! 1/1");
  }

}
