package Classes;

import Interfaces.*;

public class Fossiler implements IFossily {
    @Override
    public void productes(Material material, int time) {
        System.out.println(material.getMassPerMeter3()*time + " kilos of " + material.getMaterialsName() + " was producted");
    }
}
