package com.hasanac.maven.springinaction;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MagicExistsCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment env = context.getEnvironment();
        System.out.println("OOOOOOOOOOOOOOOOO:" + env.containsProperty("magic"));
        return env.containsProperty("magic");
    }
}
