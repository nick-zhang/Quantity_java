package com.tw.oo;

/**
 * Created with IntelliJ IDEA.
 * User: nickzhang
 * Date: 3/19/13
 * Time: 4:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class UnitConversionFactor {

    public static int get(LengthUnit unit) {
        int factor = 1;
        if (unit == LengthUnit.FEET) {
            factor *= 12;
        }

        if (unit == LengthUnit.YARD) {
            factor *= 12 * 3;
        }

        if (unit == LengthUnit.MILE) {
            factor *= 12 * 3 * 1760;
        }

        return factor;
    }

}
