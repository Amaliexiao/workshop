package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BuildingSystem implements IBuildingManagementSystem{

    private List<Building> buildings = new ArrayList<>();

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public List<Building> getBuildings() {return buildings;}


    @Override
    public String toString(){
        String s = "";
        for (Building entry : buildings){
            s += entry.getName() + " ";
        }
        return "The building system contains: "+s;
    }
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        if (!getBuildings().add())) {
            building.getListOfTempSensors().add(tempSensor);
        }
        else {
            System.out.println("This sensor has already been added to the building");
        }
        return buildingId;
    }
    public UUID addCo2Sensor(CO2Sensor co2Sensor, Building building) {
        if (!building.getListOfCO2Sensors().contains(co2Sensor)) {
            building.getListOfCO2Sensors().add(co2Sensor);
        }
        else {
            System.out.println("This sensor has already been added to the building");
        }
    }
    public void addVentActuator(VentilationActuator ventActuator, Building building) {
        if (!building.getListOfVentActuators().contains(ventActuator)) {
            building.getListOfVentActuators().add(ventActuator);
        }
        else {
            System.out.println("This sensor has already been added to the building");
        }

    }
    public void removeTempSensor(TemperatureSensor tempSensor, Building building) {
        if (building.getListOfTempSensors().contains(tempSensor)) {
            building.getListOfTempSensors().remove(tempSensor);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }
    public void removeCO2Sensor(CO2Sensor co2Sensor, Building building) {
        if (building.getListOfCO2Sensors().contains(co2Sensor)) {
            building.getListOfCO2Sensors().remove(co2Sensor);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }
    public void removeVentActuator(VentilationActuator ventAcuator, Building building) {
        if (building.getListOfVentActuators().contains(ventAcuator)) {
            building.getListOfVentActuators().remove(ventAcuator);
        }
        else {
            System.out.println("This sensor does not exist or has already been removed");
        }
    }



    public String stringListTempratureSensors(Building building){
        String s = "";
        for (TemperatureSensor entry : building.getListOfTempSensors()){
            s += "Tempratur Sensor: " + entry.getId() + " has value: " + entry.getSensorValue();
        }
        return s;
    }
    public String stringListCo2Sensors(Building building){
        String s = "";
        for (CO2Sensor entry : building.getListOfCO2Sensors()){
            s += "CO2 sensor: " + entry.getId() + " has value: " + entry.getSensorValue();
        }
        return s;
    }
    public String stringListActuators(Building building){
        String s = "";
        for (VentilationActuator entry : building.getListOfVentActuators()){
            s += "Actuator: " + entry.getID() + " has value: " + entry.getPointValue();
        }
        return s;
    }
}
