public enum lunit implements Material{
    LUNIT(10000), ANTILUNIT(-10000);

    private int kiloPerMeter3;
    lunit(int kiloPerMeter3){
        this.kiloPerMeter3 = kiloPerMeter3;
    }

    public int getMassPerMeter3() {
        return kiloPerMeter3;
    }
}
