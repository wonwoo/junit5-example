package me.wonwoo.annotation;

import me.wonwoo.extension.TimingExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@ExtendWith(TimingExtension.class)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface TimingJUnitJupiter {
}
