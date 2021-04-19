package com.simplab.testdata;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CommonTasksTest {
    private CommonTasks testedInstance;

    @Before
    public void setUp() {
        testedInstance = new CommonTasks();
    }

    @Test
    public void shouldDivide1() {
        Assert.assertEquals(1, testedInstance.division(3, 3));
    }

    @Test
    public void shouldDivide2() {
        Assert.assertEquals(1, testedInstance.division(3, 3));
    }

    @Test
    public void shouldDivide3() {
        Assert.assertEquals(1, testedInstance.division(3, 3));
    }

    @Test
    public void shouldDivide4() {
        Assert.assertEquals(1, testedInstance.division(3, 3));
    }

    @Test
    public void shouldDivide5() {
        Assert.assertEquals(1, testedInstance.division(3, 3));
    }

    @Test
    public void shouldPow1() {
        Assert.assertEquals(4, testedInstance.pow(2, 2));
    }

    @Test
    public void shouldPow2() {
        Assert.assertEquals(4, testedInstance.pow(2, 2));
    }

    @Test
    public void shouldPow3() {
        Assert.assertEquals(4, testedInstance.pow(2, 2));
    }

    @Test
    public void shouldPow4() {
        Assert.assertEquals(4, testedInstance.pow(2, 2));
    }

    @Test
    public void shouldPow5() {
        Assert.assertEquals(4, testedInstance.pow(2, 2));
    }

}