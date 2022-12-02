package Domain;

import java.util.*;

public class Building {
    private String name;
    private UUID id;

    private Map<UUID,String> listOfSensors;
    private Map<UUID,String> listOfVentActuators;

    public Building(String name, UUID id) {
        this.name = name;
        setId(id);
        this.listOfSensors = new HashMap<>();
        this.listOfVentActuators = new HashMap<>();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public Map<UUID,String> getListOfSensors() {
        return listOfSensors;
    }

    public Map<UUID,String> getListOfVentActuators() {
        return listOfVentActuators;
    }
    public String getName() {
        return name;
    }
    public void addSensor (String name, UUID sensorID){
        if(!listOfSensors.containsKey(sensorID)){
            TemperatureSensor sensor = new TemperatureSensor(sensorID,name);
            listOfSensors.put(sensorID,name);
        }
        else System.out.println("This sensor has already been added to the building");
    }
    public void addVentActuator(String name, UUID id) {
        if (!listOfVentActuators.containsKey(id)) {
            listOfVentActuators.put(id,name);
        }
        else {
            System.out.println("This sensor has already been added to the building");
        }

    }
    public void removeSensor(UUID id) {
        if (listOfSensors.containsKey(id)) {
            listOfSensors.remove(id);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }
    public void removeVentActuator(UUID id) {
        if (listOfVentActuators.containsKey(id)) {
            listOfVentActuators.remove(id);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }
//    @Override
//    public String toString(){
//        return getName() + " Contains " + listOfTempSensors.size() +
//                " Temp sensors, " + listOfCO2Sensors.size() + " CO2 sensors and "
//                +listOfVentActuators.size() +" Ventilation actuators";
//    }
//    public String stringListTempratureSensors(Building building){
//        String s = "";
//        for (TemperatureSensor entry : building.getListOfTempSensors()){
//            s += "Tempratur Sensor: " + entry.getId() + " has value: " ;+ entry.getSensorValue()
//        }
//        return s;
//    }
//    public String stringListCo2Sensors(Building building){
//        String s = "";
//        for (CO2Sensor entry : building.getListOfCO2Sensors()){
//            s += "CO2 sensor: " + entry.getId() + " has value: " + entry.getSensorValue();
//        }
//        return s;
//    }
//    public String stringListActuators(Building building){
//        String s = "";
//        for (VentilationActuator entry : building.getListOfVentActuators()){
//            s += "Actuator: " + entry.getID() + " has value: " + entry.getPointValue();
//        }
//        return s;
//    }

}
