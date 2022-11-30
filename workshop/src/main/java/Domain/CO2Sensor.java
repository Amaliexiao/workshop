package Domain;

import java.util.UUID;

public class CO2Sensor extends Sensor{

    public CO2Sensor(double sensorValue, UUID id) {
        super.setId(id);
        super.setSensorValue(sensorValue);
    }
}
