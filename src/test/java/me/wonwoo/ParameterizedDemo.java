package me.wonwoo;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.*;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ParameterizedDemo {

  @ParameterizedTest
  @ValueSource(strings = { "Hello", "World" })
  void testWithStringParameter(String argument) {
    assertNotNull(argument);
  }

  @ParameterizedTest
  @ValueSource(ints = { 1, 2, 3 })
  void testWithValueSource(int argument) {
    assertNotNull(argument);
  }

  @ParameterizedTest
  @EnumSource(TimeUnit.class)
  void testWithEnumSource(TimeUnit timeUnit) {
    assertNotNull(timeUnit);
  }

  @ParameterizedTest
  @EnumSource(value = TimeUnit.class, names = { "DAYS", "HOURS" })
  void testWithEnumSourceInclude(TimeUnit timeUnit) {
    assertTrue(EnumSet.of(TimeUnit.DAYS, TimeUnit.HOURS).contains(timeUnit));
  }

  @ParameterizedTest
  @MethodSource("stringProvider")
  void testWithSimpleMethodSource(String argument) {
    assertNotNull(argument);
  }

  private static Stream<String> stringProvider() {
    return Stream.of("foo", "bar");
  }

  @ParameterizedTest
  @MethodSource("range")
  void testWithRangeMethodSource(int argument) {
    assertNotEquals(9, argument);
  }

  static IntStream range() {
    return IntStream.range(0, 20).skip(10);
  }

  @ParameterizedTest
  @ArgumentsSource(MyArgumentsProvider.class)
  void testWithArgumentsSource(String argument) {
    assertNotNull(argument);
  }

  static class MyArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
      return Stream.of("foo", "bar").map(Arguments::of);
    }
  }


  @ParameterizedTest
  @EnumSource(TimeUnit.class)
  void testWithExplicitArgumentConversion(@ConvertWith(ToStringArgumentConverter.class) String argument) {
    assertNotNull(TimeUnit.valueOf(argument));
  }

  static class ToStringArgumentConverter extends SimpleArgumentConverter {

    @Override
    protected Object convert(Object source, Class<?> targetType) {
      assertEquals(String.class, targetType, "Can only convert to String");
      return String.valueOf(source);
    }
  }

}
