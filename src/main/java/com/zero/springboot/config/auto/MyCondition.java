package com.zero.springboot.config.auto;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Map;

/**
 * @author zero
 * @description 处理自定义conditional注解
 * @date 2022/8/30 10:33
 */
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionalCustom.class.getName());
        String[] vals = (String[]) map.get("value");
        Environment env = context.getEnvironment();
        for (Object val : vals) {
            if (env.getProperty(val.toString()) == null) {
                return false;
            }
        }
        return true;
    }
}
