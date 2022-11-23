package Domain;

import java.util.UUID;

public class TempatureSensor extends Sensor{

    public TempatureSensor(double sensorValue, UUID id) {
        super.setId(id);
        super.setSensorValue(sensorValue);
    }
}
