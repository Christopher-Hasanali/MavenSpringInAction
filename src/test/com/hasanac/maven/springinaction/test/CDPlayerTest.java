package com.hasanac.maven.springinaction.test;


import com.google.gson.Gson;
import com.hasanac.maven.springinaction.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc cd;

    @Autowired(required = false)
    private MagicBean mb;

    // To test injection of beans via custom qualifiers
    @Autowired
    private MainCourse mc;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void otherBeanShouldBeNull() {
        Assert.assertNull(mb);
    }

    @Test
    public void testGson() {
        Gson g = new Gson();
        System.out.println(g.toJson(new ClassWithSyntheticMethodOrClass()));
        System.out.println(new ClassWithSyntheticMethodOrClass().getB().getClass().isAnonymousClass());
        System.out.println(g.toJson(new ClassWithSyntheticMethodOrClass().getB()));
        new ClassWithSyntheticMethodOrClass().someMethodName();
    }
}
