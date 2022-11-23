package Domain;

import java.util.List;

public class BuildingSystem {
    private List<Building> buildings;

    public void addBuilding(Building building){
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }
}
