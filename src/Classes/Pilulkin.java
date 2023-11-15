package Classes;

import Interfaces.ICarry;
import Interfaces.Objectable;
import AbstractClasses.*;
public class Pilulkin extends Human implements ICarry {
    public Pilulkin(){
        this.setName("Classes.Pilulkin");
    }
    public Pilulkin(String location){
        this.setName("Pilulkin");
        this.setLocation(location);
    }
    //Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}
