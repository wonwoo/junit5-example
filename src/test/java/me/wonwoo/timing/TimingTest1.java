package me.wonwoo.timing;

import me.wonwoo.annotation.TimingJUnitJupiter;
import me.wonwoo.extension.TimingExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.concurrent.TimeUnit;

@TimingJUnitJupiter
class TimingTest1 {

  @Test
  void timing_log_test() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
  }

}
