package me.wonwoo.custom;

import org.junit.jupiter.api.extension.ExtendWith;

import java.lang.annotation.*;

@ExtendWith(UserInfoParameterResolver.class)
@Documented
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface UserInfoExtension {
}
