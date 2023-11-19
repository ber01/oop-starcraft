package com.minkh.oop.unit.tank;

import com.minkh.oop.unit.DamageType;
import com.minkh.oop.unit.Unit;

public class RaynorTank extends Unit implements Tank {

    public RaynorTank() {
        this.init();
    }

    @Override
    public void siegeMode() {
        this.setOffensePower(70);
        this.setAttackCycle(75);
        this.setSpeed(0);
        this.setDamageType(DamageType.EXPLOSIVE);
        this.setRange(12);
    }

    @Override
    public void tankMode() {
        this.init();
    }

    public void init() {
        this.setOffensePower(30);
        this.setAttackCycle(37);
        this.setSpeed(1.875);
        this.setDamageType(DamageType.EXPLOSIVE);
        this.setRange(7);
    }

    public void performLightweightOperation() {
        this.setSpeed(this.getSpeed() * 2);
    }
}

