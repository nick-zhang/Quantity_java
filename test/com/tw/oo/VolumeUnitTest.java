package com.tw.oo;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: nickzhang
 * Date: 3/21/13
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class VolumeUnitTest {
    @Test
    public void Given1TBSPShouldEqual3TSP() {
        Quantity threeTsp = new Quantity(3, VolumeUnit.TSP);
        Quantity oneTbsp = new Quantity(1, VolumeUnit.TBSP);
        assertTrue(threeTsp.equals(oneTbsp));
    }

    @Test
    public void Given1OZShouldEqual2TBSP() {
        Quantity oneOz = new Quantity(1, VolumeUnit.OZ);
        Quantity twoTbsp = new Quantity(2, VolumeUnit.TBSP);
        assertTrue(oneOz.equals(twoTbsp));
    }

    @Test
    public void Given1CUPShouldEqual8OZ() {
        Quantity oneCup = new Quantity(1, VolumeUnit.CUP);
        Quantity eightOz = new Quantity(8, VolumeUnit.OZ);
        assertTrue(oneCup.equals(eightOz));
    }

    @Test
    public void GivenLengthQuantityShouldNotEqualVolumeQuantity() {
        Quantity oneTsp = new Quantity(1, VolumeUnit.TSP);
        Quantity oneInch = new Quantity(1, LengthUnit.INCH);
        assertFalse(oneTsp.equals(oneInch));
    }
}
