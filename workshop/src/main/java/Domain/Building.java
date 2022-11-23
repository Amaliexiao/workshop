package Domain;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<TempatureSensor> listOfTempSensors;
    private List<CO2Sensor> listOfCO2Sensors;
    private List<VentilationActuator> listOfVentActuators;

    public List<TempatureSensor> getListOfTempSensors() {
        return listOfTempSensors;
    }

    public List<CO2Sensor> getListOfCO2Sensors() {
        return listOfCO2Sensors;
    }

    public List<VentilationActuator> getListOfVentActuators() {
        return listOfVentActuators;
    }

    public void addTempSensor(TempatureSensor tempSensor) {
        listOfTempSensors.add(tempSensor);
    }
    public void addCO2Sensor(CO2Sensor co2Sensor) {
        listOfCO2Sensors.add(co2Sensor);
    }
    public void addVentActuator(VentilationActuator ventActuator) {
        listOfVentActuators.add(ventActuator);
    }
    public void removeTempSensor() {

    }
}
