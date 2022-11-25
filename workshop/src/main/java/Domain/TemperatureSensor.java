package Domain;

import java.util.UUID;

public class TemperatureSensor extends Sensor{

    public TemperatureSensor(double sensorValue, UUID id) {
        super.setId(id);
        super.setSensorValue(sensorValue);
    }
}
