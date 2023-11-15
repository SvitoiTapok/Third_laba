public class ZnaykaMover extends Znayka implements MovableObject{
    public ZnaykaMover(){
        super();
    }
    public ZnaykaMover(String location){
        super(location);
    }
    @Override
    public void move(String newLocation) {
        System.out.println(this.getName() + " go to " + newLocation + " from " + this.getLocation());
        this.setLocation(newLocation);
    }
}
