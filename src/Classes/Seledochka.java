package Classes;

import Interfaces.ICarry;
import Interfaces.Objectable;
import AbstractClasses.*;

public class Seledochka extends Human implements ICarry {
    public Seledochka(){
        this.setName("Seledochka");
    }
    public Seledochka(String location){
        this.setName("Seledochka");
        this.setLocation(location);
    }
    //Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}
