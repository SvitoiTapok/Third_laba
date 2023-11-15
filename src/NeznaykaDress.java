import java.util.ArrayList;

public class NeznaykaDress extends Neznayka implements Dressable{
    ArrayList<String> clothes = new ArrayList<>();
    public NeznaykaDress(){super();}
    public NeznaykaDress(String location){super(location);}
    public NeznaykaDress(ArrayList<String> clothes){
        this.clothes = clothes;
    }

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
}
