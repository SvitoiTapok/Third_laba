public class ZnaykaSpeaker extends Znayka implements Speaker{
    public ZnaykaSpeaker(){
        super();
    }
    public ZnaykaSpeaker(String location){
        super(location);
    }
    @Override
    public void say(String phrase) {
        System.out.println(this.getName() + " say: " + phrase);
    }
}
