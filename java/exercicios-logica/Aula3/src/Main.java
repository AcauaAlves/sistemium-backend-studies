import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your height in meters");
        double height = scanner.nextDouble();
        
        System.out.println("Are you a student? (true/false)");
        
        boolean isStudent = scanner.nextBoolean();
        
        System.out.println("Hello: " + name);

        System.out.println("You are " + age + " years old");

        System.out.println("Your height is " + height + " meters");

        if(isStudent == true){
            System.out.println("You are a student! congratulations!");
        }
        else if(isStudent == false){
            System.out.println("You are not a student, sorry...");
        }
        else{
            System.out.println("Not an valid option, choose between (true or false), exactly as written");
        }
        scanner.close();
    }    
}

