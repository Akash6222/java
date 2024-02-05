import java.util.Scanner;      // this class is used to take user input

public class FirstJavaClass {
     public static void main(String[] args){

        // Taking user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();         // For different data types different function are there for example for float sc.nextFloat()
        System.out.println(age);
    }
}
