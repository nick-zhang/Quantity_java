package com.tw.oo;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: nickzhang
 * Date: 3/19/13
 * Time: 4:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class UnitConversionFactor {

    private static HashMap<LengthUnit, Integer> LengthFactorMap = new HashMap<LengthUnit, Integer>();

    static {
        LengthFactorMap.put(LengthUnit.INCH, 1);
        LengthFactorMap.put(LengthUnit.FEET, 12);
        LengthFactorMap.put(LengthUnit.YARD, 12 * 3);
        LengthFactorMap.put(LengthUnit.MILE, 1760 * 12 * 3);
    }

    public static int get(LengthUnit unit) {
        return LengthFactorMap.get(unit);
    }

}
