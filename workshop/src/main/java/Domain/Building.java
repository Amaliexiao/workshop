package Domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Building {
    private String name;
    private UUID id;
    private List<TemperatureSensor> listOfTempSensors;
    private List<CO2Sensor> listOfCO2Sensors;
    private List<VentilationActuator> listOfVentActuators;

    public Building(String name) {
        this.name = name;
        UUID tempSensUUID = UUID.randomUUID();
        setId(tempSensUUID);
        this.listOfTempSensors = new ArrayList<>();
        this.listOfCO2Sensors = new ArrayList<>();
        this.listOfVentActuators = new ArrayList<>();
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
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

    public String getName() {
        return name;
    }
    @Override
    public String toString(){
        return getName() + " Contains " + listOfTempSensors.size() +
                " Temp sensors, " + listOfCO2Sensors.size() + " CO2 sensors and "
                +listOfVentActuators.size() +" Ventilation actuators";
    }

}
