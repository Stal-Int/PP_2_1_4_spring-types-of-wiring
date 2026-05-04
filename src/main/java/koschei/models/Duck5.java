package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    @Autowired
    private Egg6 fieldEgg;

    private Egg6 setterEgg;
    @Autowired
    public void setSetterEgg(Egg6 setterEgg) {
        this.setterEgg = setterEgg;
    }
    private final Egg6 constructorEgg;
    @Autowired
    public Duck5(Egg6 constructorEgg) {
        this.constructorEgg = constructorEgg;
    }

    @Override
    public String toString() {
        return ", в утке яйцо " + constructorEgg.toString();
    }
}
