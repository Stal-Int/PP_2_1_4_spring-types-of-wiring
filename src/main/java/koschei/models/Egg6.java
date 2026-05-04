package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Egg6 {

    @Autowired
    private Needle7 fieldNeedle;

    private Needle7 setterNeedle;
    @Autowired
    public void setSetterNeedle(Needle7 setterNeedle) {
        this.setterNeedle = setterNeedle;
    }

    private final Needle7 constructorNeedle;
    @Autowired
    public Egg6(Needle7 constructorNeedle) {
        this.constructorNeedle = constructorNeedle;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + constructorNeedle.toString();
    }
}
