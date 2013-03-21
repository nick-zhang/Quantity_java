package com.tw.oo;

import org.junit.Test;

import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: nickzhang
 * Date: 3/21/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class VolumeTest {
    @Test
    public void Given1TBSPShouldEqual3TSP()
    {
        Quantity threeTsp = new Quantity(3, VolumeUnit.TSP);
        Quantity oneTbsp = new Quantity(1, VolumeUnit.TBSP);
        assertTrue(threeTsp.equals(oneTbsp));
    }

}
