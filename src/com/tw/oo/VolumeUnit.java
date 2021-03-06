package com.tw.oo;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: nickzhang
 * Date: 3/21/13
 * Time: 1:50 PM
 * To change this template use File | Settings | File Templates.
 */
public enum VolumeUnit implements IUnit {
    TSP,
    TBSP,
    OZ, CUP;

    private static HashMap<VolumeUnit, Integer> VolumeFactorMap = new HashMap<VolumeUnit, Integer>();

    static {
        VolumeFactorMap.put(VolumeUnit.TSP, 1);
        VolumeFactorMap.put(VolumeUnit.TBSP, 3);
        VolumeFactorMap.put(VolumeUnit.OZ, 3 * 2);
        VolumeFactorMap.put(VolumeUnit.CUP, 8 * 3 * 2);
    }

    @Override
    public int conversionFactor() {
        return VolumeFactorMap.get(this);
    }
}
