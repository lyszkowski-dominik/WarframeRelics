package com.relicsearcher;

import java.util.ArrayList;
import java.util.List;

public class RelictWarehouse {
    static List<RelictPrototype> relictList = new ArrayList<>();

    public RelictWarehouse() {
        relictList.add(new RelictPrototype("Lith B8",true,"Aksomati Prime Blueprint", "Burston Prime Stock", "Dethcube Prime Systems", "Atlas Prime Chassis", "Ivara Prime Blueprint", "Baza Prime Blueprint"));
    }

    public static List<RelictPrototype> getRelictList() {
        return relictList;
    }
}
