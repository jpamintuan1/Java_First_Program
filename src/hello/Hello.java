/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.Scanner;
/**
 *
 * @author josep
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myName = "Joseph";
        int age = 34;
        String secondName = "May";
        int length = myName.length() + secondName.length();
        
        System.out.println("hello");
        System.out.println("My name is " + myName + "." + age );
        System.out.println(length);
        System.out.print("Welcome to ");
        System.out.println("Java Programming!");
        System.out.println("Fuck\nyou\nAss\nProgramming!");
        System.out.printf("%s%n%s%n", "Hello Asshole", "my Ass");
        
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read first number from user
        
        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read second number from user
        
        int sum = number1 + number2; // add numbers, then store total in sum
        
        System.out.printf("Sum is %d%n", sum);
    }
    
}
    
