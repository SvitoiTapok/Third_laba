import java.util.ArrayList;
import java.util.Arrays;

public class MainClass_TheWonderfulStory {
    public static void main(String[] args) {
        Speaker znaykaSpeaker = new ZnaykaSpeaker();
        znaykaSpeaker.say("доставьте Незнайку в ракету");
        znaykaSpeaker.say("то ракета не пострадала от метеоров, герметизация не нарушена; однако многие механизмы нуждаются в регулировке, а аккумуляторы -- в смене электролита и зарядке");
        znaykaSpeaker.say("Все оставшееся время использовать для добычи и погрузки в ракету лунита и антилунита.");
        FossilMaterials materials = new FossilerPerHour();
        materials.production(lunit.LUNIT);
        materials.production(lunit.LUNIT);
        Movable pilulkinMover = new PilulkinMover("Moon");
        pilulkinMover.move("rocket gateway");
        MovableObject neznaykaMover = new NeznaykaMover();
        Carrier pilulkinCarrier = new PilulkinCarrier();
        pilulkinCarrier.carry(neznaykaMover, "rocket gateway");
        Carrier[] carriers = {new PilulkinCarrier(), new FucsiaCarrier(), new SeledochkaCarrier(), new ZnaykaCarrier()};
        ArrayList<Carrier> carriers1 = new ArrayList<>(Arrays.asList(carriers));
        GroupCarriers groupCarriers = new Group(carriers1);
        groupCarriers.groupCarry(neznaykaMover, "rocket");
        neznaykaMover.move("kayuta");
        String [] dresses0 = {"spacesuit", "clothes"};
        ArrayList<String> dresses = new ArrayList<>(Arrays.asList(dresses0));
        Dressable neznaykaDress = new NeznaykaDress(dresses);
        neznaykaDress.takeOffCloth("spacesuit");
        neznaykaDress.takeOffCloth("clothes");
        Layer neznaykaLayer = new NeznaykaLayer();
        neznaykaLayer.lay("koyka");
    }
}
