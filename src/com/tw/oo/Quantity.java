package com.tw.oo;

/**
 * Created with IntelliJ IDEA.
 * User: NickZhang
 * Date: 3/15/13
 * Time: 10:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Quantity {
    private int amount;
    private LengthUnit unit;

    public Quantity(int amount, LengthUnit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quantity quantity = (Quantity) o;

        int myBasicAmount =     amount * UnitConversionFactor.get(unit);
        int hisBasicAmount = quantity.amount * UnitConversionFactor.get(quantity.unit);

        if (myBasicAmount != hisBasicAmount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + unit.hashCode();
        return result;
    }
}
