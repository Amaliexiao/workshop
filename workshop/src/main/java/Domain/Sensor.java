package Domain;

import java.util.UUID;

public abstract class Sensor {
    private UUID id;
    private double sensorValue;

    public void setId(UUID id) {
        this.id = id;
    }

    public void setSensorValue(double sensorValue) {
        this.sensorValue = sensorValue;
    }

    public UUID getId() {
        return id;
    }

    public double getSensorValue() {
        return sensorValue;
    }
}
