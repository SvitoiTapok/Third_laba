public class PilulkinMover extends Pilulkin implements MovableObject{
    public PilulkinMover(){
        super();
    }
    public PilulkinMover(String location){super(location);}
    @Override
    public void move(String newLocation) {
        System.out.println(this.getName() + " go to " + newLocation + " from " + this.getLocation());
        this.setLocation(newLocation);
    }
}
