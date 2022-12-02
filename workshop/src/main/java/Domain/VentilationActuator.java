package Domain;

import java.util.UUID;

public class VentilationActuator extends Actuator{
    private String name;

    public VentilationActuator(UUID id, String name) {
        this.setID(id);
        this.name = name;
    }
}
