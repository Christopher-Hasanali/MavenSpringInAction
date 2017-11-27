package com.hasanac.maven.springinaction.test;


import com.hasanac.maven.springinaction.CDPlayerConfig;
import com.hasanac.maven.springinaction.CompactDisc;
import com.hasanac.maven.springinaction.MagicBean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;

    @Autowired(required = false)
    private MagicBean mb;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void otherBeanShouldBeNull() {
        Assert.assertNull(mb);
    }
}
