public class Terrarium extends Zoo{
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private double temperature;

    public Terrarium(String specie, double weight, int age, String gender, double temperature) {
        super(specie, weight, age, gender);
        this.temperature = temperature;

    }
    public String print_info(){
        return getSpecie() + ", " + getWeight() + " kg, " + getAge() + ", " + getGender() + ", Temperature must be " + getTemperature() + " Celsius degrees" + " .";
    }
}
