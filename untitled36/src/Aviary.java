public class Aviary extends Zoo{
    private String climate;

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public Aviary(String specie, double weight, int age, String gender, String climate) {
        super(specie, weight, age, gender);
        this.climate = climate;
    }
    public String print_info(){
        return getSpecie() + ", " + getWeight() + " kg, " + getAge() + ", " + getGender() + ", " + getClimate() + " climate .";
    }
}
