package Domain;

import java.util.UUID;

public class VentilationActuator extends Actuator{

    public VentilationActuator(double pointValue, UUID id) {
        this.setPointValue(pointValue);
        this.setID(id);
    }
}
