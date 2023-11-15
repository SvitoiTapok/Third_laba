public class FucsiaCarrier extends Fucsia implements Carrier{
    public FucsiaCarrier(){
        super();
    }
    public FucsiaCarrier(String location){
        super(location);
    }
    @Override
    public void carry(MovableObject movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.getName() + " move " + movable.getName() + " to " + newPlace);
    }
}
