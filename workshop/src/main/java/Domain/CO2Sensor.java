package Domain;

import java.util.UUID;

public class CO2Sensor extends Sensor{

    public CO2Sensor(double sensorValue){
        UUID co2SensorId = UUID.randomUUID();
        super.setId(co2SensorId);
        super.setSensorValue(sensorValue);
    }

}
