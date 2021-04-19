package com.simplab.testdata;

import org.junit.Assert;
import org.junit.Test;

public class CommonTasksTest {
    private CommonTasks testedInstance;

    @Test
    public void shouldSum() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldProduct() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldDivide() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }

    @Test
    public void shouldPow() {
        Assert.assertEquals(6, testedInstance.sum(3, 3));
    }
}