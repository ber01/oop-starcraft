package com.minkh.oop;

import com.minkh.oop.factory.KerriganFactory;
import com.minkh.oop.factory.RaynorFactory;
import com.minkh.oop.unit.tank.Tank;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserFactoryIntegrationTests {

    @Test
    void buttonT() {
        // given
        User user1 = new User(new RaynorFactory());
        User user2 = new User(new KerriganFactory());

        // when
        Tank raynorTank = user1.buttonT();
        Tank kerriganTank = user2.buttonT();

        // then
        assertThat(raynorTank.getSpeed()).isNotEqualTo(kerriganTank.getSpeed());
        assertThat(raynorTank.getSpeed()).isEqualTo(kerriganTank.getSpeed() * 2);
    }

}
