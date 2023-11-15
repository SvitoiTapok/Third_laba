import AbstractClasses.GroupCarry;
import Enums.MaterialsName;
import Interfaces.*;
import Classes.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass_TheWonderfulStory {
    public static void main(String[] args) {
        Znayka znayka = new Znayka();
        znayka.say("доставьте Незнайку в ракету");
        znayka.say("то ракета не пострадала от метеоров, герметизация не нарушена; однако многие механизмы нуждаются в регулировке, а аккумуляторы -- в смене электролита и зарядке");
        znayka.say("Все оставшееся время использовать для добычи и погрузки в ракету лунита и антилунита.");
        IFossily fossiler = new Fossiler();
        fossiler.productes(new Material(10000, MaterialsName.LUNIT), 1);
        fossiler.productes(new Material(-10000, MaterialsName.ANTILUNIT), 1);
        Pilulkin pilulkin = new Pilulkin("Moon");
        pilulkin.move("rocket gateway");
        Neznayka neznayka = new Neznayka();
        pilulkin.carry(neznayka, "rocket gateway");
        Fucsia fucsia = new Fucsia();
        Seledochka seledochka = new Seledochka();
        ICarry[] ICarries = {pilulkin, fucsia, seledochka, znayka};
        ArrayList<ICarry> carriers1 = new ArrayList<>(Arrays.asList(ICarries));
        GroupCarry group = new SingleGroup(carriers1);
        group.groupCarry(neznayka, "rocket");
        neznayka.move("kayuta");
        String [] dresses0 = {"spacesuit", "clothes"};
        ArrayList<String> dresses = new ArrayList<>(Arrays.asList(dresses0));
        neznayka.setClothes(dresses);
        neznayka.takeOffCloth("spacesuit");
        neznayka.takeOffCloth("clothes");
        neznayka.lay("koyka");
    }
}
