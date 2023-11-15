package Classes;

import Interfaces.ICarry;
import Interfaces.ISpeak;
import Interfaces.Objectable;
import AbstractClasses.*;

public class Znayka extends  Human implements ICarry, ISpeak, Objectable{
    public Znayka(){
        this.setName("Znayka");
    }
    public Znayka(String location){
        this.setName("Znayka");
        this.setLocation(location);
    }
    // Interfaces.ICarry
    @Override
    public void carry(Objectable movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
    //Interfaces.ISpeak
    @Override
    public void say(String phrase) {
        System.out.println(this.getName() + " say: " + phrase);
    }
}
