package Domain;

import java.util.UUID;

public abstract class Actuator {
    private     UUID    id;
//    private     double  pointValue;

    public UUID getID(){
        return id;
    }
    public void setID(UUID id){
        this.id = id;
    }

//    public double getPointValue() {
//        return pointValue;
//    }

//    public void setPointValue(double pointValue) {
//        this.pointValue = pointValue;
//    }
}
