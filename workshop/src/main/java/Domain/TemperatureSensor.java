package Domain;

import java.util.UUID;

public class TemperatureSensor extends Sensor{

    public TemperatureSensor(double sensorValue) {
        UUID tempSensUUID = UUID.randomUUID();
        super.setId(tempSensUUID);
        super.setSensorValue(sensorValue);
    }

}
