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
    private static HashMap<VolumeUnit, Integer> VolumeFactorMap = new HashMap<VolumeUnit, Integer>();

    static {
        LengthFactorMap.put(LengthUnit.INCH, 1);
        LengthFactorMap.put(LengthUnit.FEET, 12);
        LengthFactorMap.put(LengthUnit.YARD, 12 * 3);
        LengthFactorMap.put(LengthUnit.MILE, 1760 * 12 * 3);
    }

    static {
        VolumeFactorMap.put(VolumeUnit.TSP, 1);
        VolumeFactorMap.put(VolumeUnit.TBSP, 3);
    }

    public static int get(IUnit unit) {
        if (unit instanceof LengthUnit)
            return LengthFactorMap.get(unit);
        else
            return VolumeFactorMap.get(unit);
    }

}
