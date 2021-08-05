package org.koligrum;

import org.junit.Assert;
import org.junit.Test;
import org.koligrum.Operator;

public class OperatorTest {

    @Test
    public void testAdd(){
        Operator operator = new Operator();

        int result = operator.add(5,9);
        Assert.assertEquals(14, result);
    }

    @Test
    public void testMultiply(){
        Operator operator = new Operator();

        int result = operator.multiply(2,2);
        Assert.assertEquals(4, result);
    }
}
