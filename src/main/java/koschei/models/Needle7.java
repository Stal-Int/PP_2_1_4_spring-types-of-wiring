package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    @Autowired
    private Deth8 fieldDeth;

    private Deth8 setterDeth;
    @Autowired
    public void setSetterDeth(Deth8 setterDeth) {
        this.setterDeth = setterDeth;
    }

    private final Deth8 constructorDeth;
    @Autowired
    public Needle7(Deth8 constructorDeth) {
        this.constructorDeth = constructorDeth;
    }

    @Override
    public String toString() {
        return ", в яйце иголка " + constructorDeth.toString();
    }
}
