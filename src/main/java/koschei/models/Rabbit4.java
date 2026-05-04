package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    @Autowired
    private Duck5 fieldDuck;

    private Duck5 setterDuck;
    @Autowired
    public void setSetterDuck(Duck5 setterDuck) {
        this.setterDuck = setterDuck;
    }

    private final  Duck5 constructorDuck;
    @Autowired
    public Rabbit4(Duck5 constructorDuck) {
        this.constructorDuck = constructorDuck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + constructorDuck.toString();
    }
}
