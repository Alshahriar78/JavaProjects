import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Weight Converter");
        System.out.println("Option 1 is lbs to kgs");
        System.out.println("Option 2 is kgs to lbs");
        // declare variable
        double weight ;
        double newWeight;
        int choice;
        System.out.println("Choice any Option 1 or 2");
        choice = scanner.nextInt();
        System.out.println("Enter The Weight ");
        weight = scanner.nextDouble();
        if(choice==1){
            newWeight = weight *  0.453592;
            System.out.printf("The converted kgs  weight is %.2f ",newWeight);
        }else{
            newWeight = weight *  2.20462;
            System.out.printf("The converted lbs  weight is %.2f ",newWeight);
        }

    }
}