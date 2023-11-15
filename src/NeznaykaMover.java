public class NeznaykaMover extends Neznayka implements MovableObject{
    public NeznaykaMover(){super();}
    public NeznaykaMover(String location){super(location);}
    @Override
    public void move(String newLocation){
        System.out.println(this.name + " go to " + newLocation + " from " + this.location);
        this.setLocation(newLocation);
    }
}
