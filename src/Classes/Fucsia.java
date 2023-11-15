package Classes;

import Interfaces.ICarry;
import Interfaces.Objectable;
import AbstractClasses.*;

public class Fucsia extends Human implements ICarry {
    public Fucsia(){
        this.setName("Fucsia");
    }
    public Fucsia(String location){
        this.setName("Fucsia");
        this.setLocation(location);
    }
    //Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}
