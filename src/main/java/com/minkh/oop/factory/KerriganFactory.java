package com.minkh.oop.factory;

import com.minkh.oop.unit.goliath.Goliath;
import com.minkh.oop.unit.tank.KerriganTank;
import com.minkh.oop.unit.vulture.Vulture;
import com.minkh.oop.unit.tank.Tank;

public class KerriganFactory implements Factory {

    @Override
    public Vulture createVulture() {
        return null;
    }

    @Override
    public Tank createTank() {
        return new KerriganTank();
    }

    @Override
    public Goliath createGoliath() {
        return null;
    }
}
