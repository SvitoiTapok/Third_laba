public class ZnaykaCarrier extends Znayka implements Carrier{
    public ZnaykaCarrier(){
        super();
    }
    public ZnaykaCarrier(String location){
        super(location);
    }
    @Override
    public void carry(MovableObject movable, String newPlace) {
        movable.setLocation(newPlace);
        System.out.println(this.name + " move " + movable.getName() + " to " + newPlace);
    }
}
