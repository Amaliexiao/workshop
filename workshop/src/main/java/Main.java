import Domain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        BuildingSystem system = new BuildingSystem();
        Building trumpTower = new Building("Trump Tower");
        TemperatureSensor ts1 = new TemperatureSensor(15);
        CO2Sensor cs1 = new CO2Sensor(20);
        VentilationActuator va1 = new VentilationActuator(10);

        system.addBuilding(trumpTower);
        trumpTower.addTempSensor(ts1);
        trumpTower.addTempSensor(ts1);
        trumpTower.addCO2Sensor(cs1);
        trumpTower.addVentActuator(va1);

        System.out.println(trumpTower.stringListTempratureSensors(trumpTower));
        System.out.println(trumpTower.stringListCo2Sensors(trumpTower));
        System.out.println(trumpTower.stringListActuators(trumpTower));
        System.out.println(system);
        System.out.println(trumpTower);

        trumpTower.removeTempSensor(ts1);
        trumpTower.removeTempSensor(ts1);

    }
}
