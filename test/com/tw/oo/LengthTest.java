package com.tw.oo;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: NickZhang
 * Date: 3/15/13
 * Time: 9:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class LengthTest {
    @Test
    public void Given12InchesShouldEqual1Feet()
    {
        Quantity twelveInches = new Quantity(12, LengthUnit.INCH);
        Quantity oneFeet = new Quantity(1, LengthUnit.FEET);
        assertTrue(twelveInches.equals(oneFeet));
    }
}
