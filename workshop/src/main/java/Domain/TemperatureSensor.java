package Domain;

import java.util.UUID;

public class TemperatureSensor extends Sensor{
    String name;

    public TemperatureSensor(UUID id, String name) {
        this.name = name;
        super.setId(id);
    }

}
