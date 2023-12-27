package org.example;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends TestCase {
    @Test
    public void testAdd(){
        var testAddFunc = new Main();
        int testFun  = testAddFunc.add(5,6);
        Assert.assertEquals(testFun,11);
    }
}