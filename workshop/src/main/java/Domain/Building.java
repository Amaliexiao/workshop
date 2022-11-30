package Domain;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private String name;
    private List<TemperatureSensor> listOfTempSensors;
    private List<CO2Sensor> listOfCO2Sensors;
    private List<VentilationActuator> listOfVentActuators;

    public Building(String name) {
        this.name = name;
        this.listOfTempSensors = new ArrayList<>();
        this.listOfCO2Sensors = new ArrayList<>();
        this.listOfVentActuators = new ArrayList<>();
    }

    public List<TemperatureSensor> getListOfTempSensors() {
        return listOfTempSensors;
    }

    public List<CO2Sensor> getListOfCO2Sensors() {
        return listOfCO2Sensors;
    }

    public List<VentilationActuator> getListOfVentActuators() {
        return listOfVentActuators;
    }

    public void addTempSensor(TemperatureSensor tempSensor) {
            if (!listOfTempSensors.contains(tempSensor)) {
                listOfTempSensors.add(tempSensor);
            }
            else {
                System.out.println("This sensor has already been added to the building");
            }
    }
    public void addCO2Sensor(CO2Sensor co2Sensor) {
        if (!listOfCO2Sensors.contains(co2Sensor)) {
        listOfCO2Sensors.add(co2Sensor);
    }
        else {
            System.out.println("This sensor has already been added to the building");
        }
    }
    public void addVentActuator(VentilationActuator ventActuator) {
        if (!listOfVentActuators.contains(ventActuator)) {
            listOfVentActuators.add(ventActuator);
        }
        else {
            System.out.println("This sensor has already been added to the building");
        }

    }
    public void removeTempSensor(TemperatureSensor tempSensor) {
        if (listOfTempSensors.contains(tempSensor)) {
            listOfTempSensors.remove(tempSensor);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }
    public void removeCO2Sensor(CO2Sensor co2Sensor) {
        if (listOfTempSensors.contains(co2Sensor)) {
            listOfTempSensors.remove(co2Sensor);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }
    public void removeVentActuator(VentilationActuator ventAcuator) {
        if (listOfVentActuators.contains(ventAcuator)) {
            listOfTempSensors.remove(ventAcuator);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
       return getName() + " Contains " + listOfTempSensors.size() +
               " Temp sensors, " + listOfCO2Sensors.size() + " CO2 sensors and "
               +listOfVentActuators.size() +" Ventilation actuators";
    }
    public String stringListTempratureSensors(Building building){
        String s = "";
        for (TemperatureSensor entry : listOfTempSensors){
            s += "Tempratur Sensor: " + entry.getId() + " has value: " + entry.getSensorValue();
        }
        return s;
    }
    public String stringListCo2Sensors(Building building){
        String s = "";
        for (CO2Sensor entry : listOfCO2Sensors){
            s += "CO2 sensor: " + entry.getId() + " has value: " + entry.getSensorValue();
        }
        return s;
    }
    public String stringListActuators(Building building){
        String s = "";
        for (VentilationActuator entry : listOfVentActuators){
            s += "Actuator: " + entry.getID() + " has value: " + entry.getPointValue();
        }
        return s;
    }
}
