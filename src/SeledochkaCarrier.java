public class SeledochkaCarrier extends Seledochka implements Carrier{
    public SeledochkaCarrier(){
        super();
    }
    public SeledochkaCarrier(String location){
        super(location);
    }
    @Override
    public void carry(MovableObject movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}

