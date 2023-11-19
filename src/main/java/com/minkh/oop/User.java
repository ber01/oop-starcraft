package com.minkh.oop;

import com.minkh.oop.factory.Factory;
import com.minkh.oop.unit.goliath.Goliath;
import com.minkh.oop.unit.tank.Tank;
import com.minkh.oop.unit.vulture.Vulture;

public class User {

    private final Factory factory;

    public User(Factory factory) {
        this.factory = factory;
    }

    public Vulture buttonV() {
        return this.factory.createVulture();
    }

    public Tank buttonT() {
        return this.factory.createTank();
    }

    public Goliath buttonG() {
        return this.factory.createGoliath();
    }
}
