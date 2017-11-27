package com.hasanac.maven.springinaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MainCourse {
    Dessert dessert1;
    @Autowired
    @Cold
    @Creamy
    public void setDessert1(Dessert dessert) {
        dessert1 = dessert;
    }
}
