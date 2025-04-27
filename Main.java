import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        if (num > 0) {
            System.out.println("The number is Positive");
        } else if (num < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        
        System.out.println("The number is " + ((num % 2 == 0) ? "even" : "odd"));
        
        if (num > 100) {
            System.out.println("The number is greater than 100.");
        } else {
            System.out.println("The number is less than or equal to 100.");
        }
        
        input.close();   
    }
}