public class ZnaykaMover extends Znayka implements MovableObject{
    public ZnaykaMover(){
        super();
    }
    public ZnaykaMover(String location){
        super(location);
    }
    @Override
    public void move(String newLocation) {
        System.out.println(this.name + " go to " + newLocation + " from " + this.location);
        this.location = newLocation;
    }
}
