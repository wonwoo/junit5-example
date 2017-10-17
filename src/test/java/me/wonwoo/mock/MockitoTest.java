package me.wonwoo.mock;

import me.wonwoo.extension.MockitoExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;

import java.util.List;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MockitoTest {

  @Test
  void injection_mock(@Mock List<Integer> numbers) {
    numbers.add(1);
    numbers.add(2);
    verify(numbers).add(1);
    verify(numbers).add(2);
  }

}
