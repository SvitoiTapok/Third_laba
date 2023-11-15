public class FossilerPerHour implements FossilMaterials{
    @Override
    public void production(Material material) {
        System.out.println(material.getMassPerMeter3()*3600 + " kilos of " + material + " was producted");
    }
}
