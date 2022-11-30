package Domain;

import java.util.UUID;

public class VentilationActuator extends Actuator{

    public VentilationActuator(double pointValue) {
        UUID ventActuator = UUID.randomUUID();
        this.setPointValue(pointValue);
        this.setID(ventActuator);
    }
}
