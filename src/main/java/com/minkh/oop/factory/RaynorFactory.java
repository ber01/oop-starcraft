package com.minkh.oop.factory;

import com.minkh.oop.unit.goliath.Goliath;
import com.minkh.oop.unit.vulture.Vulture;
import com.minkh.oop.unit.tank.RaynorTank;
import com.minkh.oop.unit.tank.Tank;

public class RaynorFactory implements Factory {

    @Override
    public Vulture createVulture() {
        return null;
    }

    @Override
    public Tank createTank() {
        RaynorTank tank = new RaynorTank();
        tank.performLightweightOperation();
        return tank;
    }

    @Override
    public Goliath createGoliath() {
        return null;
    }
}
