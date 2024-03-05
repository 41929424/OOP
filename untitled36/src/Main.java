import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please, tell me some information about animals.");

        System.out.println("What is fish's weight?");
        double fish_w = scan.nextDouble();
        System.out.println("What is bird's weight?");
        double bird_w = scan.nextDouble();
        System.out.println("What is lizard's weight?");
        double ter_w = scan.nextDouble();

        ArrayList<Zoo> animals = new ArrayList<>();
        Oceanarium ocean1 = new Oceanarium("Fish", fish_w, 13, "male", 540, "salty");
        Aviary aviary1= new Aviary("Bird", bird_w, 6, "female", "dry");
        Terrarium ter1 = new Terrarium("Lizard", ter_w, 11, "male", 31);
        animals.add(ocean1);
        animals.add(aviary1);
        animals.add(ter1);
        System.out.println(ocean1.print_info());
        System.out.println(ocean1.daily_food());
        System.out.println(" ");
        System.out.println(aviary1.print_info());
        System.out.println(aviary1.daily_food());
        System.out.println(" ");
        System.out.println(ter1.print_info());
        System.out.println(ter1.daily_food());



        try {
            FileWriter writer = new FileWriter("zoo.txt");

            for(Zoo i: animals){
                writer.write(i.print_info() + "\n");
                writer.write(i.daily_food() + "\n");
                writer.write("\n");

            }
            writer.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}