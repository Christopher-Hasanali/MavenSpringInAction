package com.hasanac.maven.springinaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
public class SomeOtherBean {
    @Bean
    @Conditional(MagicExistsCondition.class)
    public MagicBean magicBean() {
        System.out.println("CCCCCCCCCHHHHHHHHHHRRRRRRRRRRIIIIISSSSSS");
        return new MagicBean();
    }
}
