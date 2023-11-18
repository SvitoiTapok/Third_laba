package Classes;

import Interfaces.Dressable;
import Interfaces.ILying;
import Interfaces.Objectable;

import java.util.ArrayList;
import AbstractClasses.*;
public class Neznayka extends Human implements Dressable, ILying {
    private ArrayList<String> clothes = new ArrayList<>();
    public Neznayka(){
        this.setName("Neznayka");
    }
    public Neznayka(String location){
        this.setName("Neznayka");
        this.setLocation(location);
    }
    public Neznayka(ArrayList<String> clothes){
        this.clothes = clothes;
    }
    //dressable
    @Override
    public ArrayList<String> getClothes() {
        return this.clothes;
    }
    @Override
    public void setClothes(ArrayList<String> clothes) {
        this.clothes = clothes;
    }

    @Override
    public void showClothes() {
        if(this.clothes.size() >= 1) {
            System.out.println(this.getName() + " now wear: ");
            for (String i : this.clothes) {
                System.out.println(i);
            }
        }else {
            System.out.println(this.getName() +"have no clothes");
        }
    }

    @Override
    public void takeOffCloth(String cloth) {
        if(this.clothes.contains(cloth)){
            this.clothes.remove(cloth);
            System.out.println(this.getName() + " take off " + cloth);
        }else {
            System.out.println("Can't find this cloth");
        }
    }
    //Lying
    @Override
    public void lay(String bed) {
        this.setLocation(bed);
        System.out.println(this.getName() + " lay on " + bed);
    }

}
