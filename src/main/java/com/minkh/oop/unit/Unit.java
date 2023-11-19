package com.minkh.oop.unit;

public class Unit {

    private int offensePower; // 공격력
    private int attackCycle; // 공격 주기
    private double speed; // 이동 속도
    private DamageType damageType; // 피해 유형
    private int range; // 사거리

    public int getOffensePower() {
        return offensePower;
    }

    public void setOffensePower(int offensePower) {
        this.offensePower = offensePower;
    }

    public int getAttackCycle() {
        return attackCycle;
    }

    public void setAttackCycle(int attackCycle) {
        this.attackCycle = attackCycle;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public DamageType getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}

