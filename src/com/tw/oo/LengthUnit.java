package com.tw.oo;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: NickZhang
 * Date: 3/15/13
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */
public enum LengthUnit implements IUnit {
    FEET,
    YARD,
    MILE,
    INCH;

    private static HashMap<LengthUnit, Integer> LengthFactorMap = new HashMap<LengthUnit, Integer>();

    static {
        LengthFactorMap.put(LengthUnit.INCH, 1);
        LengthFactorMap.put(LengthUnit.FEET, 12);
        LengthFactorMap.put(LengthUnit.YARD, 12 * 3);
        LengthFactorMap.put(LengthUnit.MILE, 1760 * 12 * 3);
    }

    @Override
    public int conversionFactor(){
        return LengthFactorMap.get(this);
    }
}
