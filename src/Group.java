import java.util.ArrayList;

public class Group implements GroupCarriers{
    private ArrayList<Carrier> carriers;
    public Group(ArrayList<Carrier> carriers){
        this.carriers = carriers;
    }

    public ArrayList<Carrier> getCarriers() {
        return carriers;
    }

    public void setCarriers(ArrayList<Carrier> carriers) {
        this.carriers = carriers;
    }

    @Override
    public void groupCarry(MovableObject movableObject, String newPlace) {
        if (this.carriers.size() >= 1) {

            for (Carrier i : this.carriers) {
                System.out.print(i.getName() + " ");
            }
            System.out.println("move " + movableObject.getName() + " to " + newPlace + " from " + movableObject.getLocation());
            movableObject.setLocation(newPlace);
        }else {
            System.out.println("Have no carriers");
        }
    }
}
