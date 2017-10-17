package me.wonwoo.mock;

import me.wonwoo.extension.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MockitoTest {
  private final List<Integer> numbers;

  private MockitoTest(@Mock List<Integer> numbers) {
    this.numbers = numbers;
  }

  @Test
  void constructor_injection_mock() {

    given(this.numbers.get(0)).willReturn(10);
    given(this.numbers.get(1)).willReturn(99);
    int number = numbers.get(0);
    assertEquals(number, 10);
  }

  @Test
  void parameter_injection_mock(@Mock List<Integer> numbers) {
    numbers.add(1);
    numbers.add(2);
    verify(numbers).add(1);
    verify(numbers).add(2);
  }


}
