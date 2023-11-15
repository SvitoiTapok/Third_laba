public class PilulkinCarrier extends Pilulkin implements Carrier{
    public PilulkinCarrier(){
        super();
    }
    public PilulkinCarrier(String location){
        super(location);
    }
    @Override
    public void carry(MovableObject movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.name + " move " + movable.getName() + " to " + newPlace);
    }
}
