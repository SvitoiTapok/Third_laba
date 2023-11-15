public class NeznaykaLayer extends Neznayka implements Layer{
    public NeznaykaLayer(){super();}
    public NeznaykaLayer(String location){super(location);}

    @Override
    public void lay(String bed) {
        this.setLocation(bed);
        System.out.println(this.getName() + " lay on " + bed);
    }
}
