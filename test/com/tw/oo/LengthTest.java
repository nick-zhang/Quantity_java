package com.tw.oo;

import org.junit.Test;

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
        assertTrue("12 inches should equal 1 feet.", twelveInches.equals(oneFeet));
    }

    @Test
    public void Given3FeetShouldEqual1Yard()
    {
        Quantity threeFeet = new Quantity(3, LengthUnit.FEET);
        Quantity oneYard = new Quantity(1, LengthUnit.YARD);
        assertTrue("3 feet should equal 1 yard.", threeFeet.equals(oneYard));
    }

    @Test
    public void Given1760YardShouldEqual1Mile()
    {
        Quantity yard1760 = new Quantity(1760, LengthUnit.YARD);
        Quantity oneMile = new Quantity(1, LengthUnit.MILE);
        assertTrue("1760 yards should equal 1 mile.", yard1760.equals(oneMile));
    }
}
