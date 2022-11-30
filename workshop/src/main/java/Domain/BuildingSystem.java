package Domain;

import java.util.ArrayList;
import java.util.List;

public class BuildingSystem {

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
}
