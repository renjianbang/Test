package com.bang;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay() {
        Demo demo = new Demo();
        String res = demo.say("renhaoshuai");
        Assert.assertEquals("hello renhaoshuai", res);
    }
}
