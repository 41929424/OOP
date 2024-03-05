public class Oceanarium extends Zoo{
    private double depth;

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getWater_type() {
        return water_type;
    }

    public void setWater_type(String water_type) {
        this.water_type = water_type;
    }

    private String water_type;

    public Oceanarium(String specie, double weight, int age, String gender, double depth, String water_type) {
        super(specie, weight, age, gender);
        this.depth = depth;
        this.water_type = water_type;
    }
    public String print_info(){
        return getSpecie() + ", " + getWeight() + " kg, " + getAge() + ", " + getGender() + ", " + getDepth() + "m, water must be " +  getWater_type() + " .";
    }
}

