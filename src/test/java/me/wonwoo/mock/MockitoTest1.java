package me.wonwoo.mock;

import me.wonwoo.annotation.MockitoJUnitJupiter;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.verify;

@MockitoJUnitJupiter
class MockitoTest1 {

  private MockitoTest1() {
  }

  @Test
  void injection_mock(@Mock List<Integer> numbers) {
    numbers.add(1);
    numbers.add(2);
    verify(numbers).add(1);
    verify(numbers).add(2);
  }

}
