package Domain;

import java.util.*;

public class BuildingSystem implements IBuildingManagementSystem{
    private HashMap<UUID, String> buildings = new HashMap<>();
    private Building building;

    @Override
    public Map<UUID,String> getBuildingInformation(){
        return buildings;
    }
    @Override
    public Map<UUID,String> getSensorInformation(UUID buildingId){
        return building.getListOfSensors();
    }
    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        return building.getListOfVentActuators();
    }
    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name){
        UUID nySensor = UUID.randomUUID();
        building.addSensor(name,nySensor);
        return nySensor;
    }
    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        UUID nySensor = UUID.randomUUID();
        building.addSensor(name,nySensor);
        return nySensor;
    }
    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        building.removeSensor(sensorId);
    }
    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
        UUID nyId = UUID.randomUUID();
        building.addVentActuator(name,nyId);
        return nyId;
    }
    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
        building.removeVentActuator(actuatorId);
    }
}
