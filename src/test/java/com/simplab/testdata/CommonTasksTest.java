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
    public void shouldSum1() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldSum2() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldSum3() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldSum4() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldSum5() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldProduct1() {
        Assert.assertEquals(9, testedInstance.product(3, 3));
    }

    @Test
    public void shouldProduct2() {
        Assert.assertEquals(9, testedInstance.product(3, 3));
    }

    @Test
    public void shouldProduct3() {
        Assert.assertEquals(9, testedInstance.product(3, 3));
    }

    @Test
    public void shouldProduct4() {
        Assert.assertEquals(9, testedInstance.product(3, 3));
    }

    @Test
    public void shouldProduct5() {
        Assert.assertEquals(9, testedInstance.product(3, 3));
    }

}