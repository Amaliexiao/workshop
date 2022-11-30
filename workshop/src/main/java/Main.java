import Domain.Building;
import Domain.TemperatureSensor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Building trumpTower = new Building("Trump Tower");
        UUID tempSensUUID = UUID.randomUUID();
        TemperatureSensor something = new TemperatureSensor(15, tempSensUUID);

        trumpTower.addTempSensor(something);
        trumpTower.addTempSensor(something);

        trumpTower.removeTempSensor(something);
        trumpTower.removeTempSensor(something);
    }
}
