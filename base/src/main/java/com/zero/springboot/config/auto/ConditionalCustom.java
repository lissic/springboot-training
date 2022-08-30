package com.zero.springboot.config.auto;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author zero
 * @description ConditionalCustom
 * @date 2022/8/30 10:37
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(MyCondition.class)
public @interface ConditionalCustom {
    String[] value() default {};
}
