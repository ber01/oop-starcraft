package com.minkh.oop.factory;

import com.minkh.oop.unit.goliath.Goliath;
import com.minkh.oop.unit.vulture.Vulture;
import com.minkh.oop.unit.tank.Tank;

public interface Factory {

    Vulture createVulture();

    Tank createTank();

    Goliath createGoliath();

}
