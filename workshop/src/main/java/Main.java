import Domain.Building;
import Domain.TemperatureSensor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Building building = new Building("Trump Tower");
        UUID tempSensUUID = UUID.randomUUID();
        TemperatureSensor something = new TemperatureSensor(15, tempSensUUID);

        building.addTempSensor(something);
        building.addTempSensor(something);
    }
}
