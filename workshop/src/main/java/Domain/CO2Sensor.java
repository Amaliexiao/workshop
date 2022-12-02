package Domain;

import java.util.UUID;

public class CO2Sensor extends Sensor{
    private String name;

    public CO2Sensor(UUID id, String name){
        super.setId(id);
        this.name= name;

    }

}
