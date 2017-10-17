package me.wonwoo.timing;

import me.wonwoo.annotation.TimingJUnitJupiter;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

@TimingJUnitJupiter
class TimingTest1 {

  @Test
  void timing_log_test() throws InterruptedException {
    TimeUnit.SECONDS.sleep(2);
  }

}
