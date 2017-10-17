package me.wonwoo.annotation;

import me.wonwoo.extension.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@ExtendWith(MockitoExtension.class)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface MockitoJUnitJupiter {
}
