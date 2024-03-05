public class Zoo {

    private String specie;
    private double weight;
    private int age;
    private String gender;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Zoo(String specie, double weight, int age, String gender){
        this.specie = specie;
        this.weight = weight;
        this.age = age;
        this.gender = gender;
    }
    public String print_info(){
        return getSpecie() + ", " +  getWeight() + ", " + getAge() + ", " + getGender() + " .";
    }


    public String daily_food(){
        if (weight == 0){
            return "Weight is incorrect";
        }
        else {
            double i = 112 + (20 * weight) + (6.1 * age);
            return "This animal must eat " + i + " kcal per day.";
        }
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
