package org.example; //DO NOT DELETE
import java.util.Scanner;
import java.text.NumberFormat;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1 - Substring Fun\n2 - Run of Integers\n3 - Sum of a Range\n4 - Echo\n5 - Dot Separation\n6 - Adding Integers\n7 - Shipping Cost Calculator\n");
        int x = input.nextInt();
        int y;
        int z;
        String a = "";
        if (x == 1) {
            System.out.print("Enter a string: ");
            a = input.nextLine();
            System.out.print("Enter a start index: ");
            y = input.nextInt();
            System.out.print("Enter an end index: ");
            z = input.nextInt();
            System.out.println("Original string: " + a);
            System.out.println("Substring: " + a.substring(y, z));
        }   
        else if (x == 2) {
            System.out.println("Enter start: ");
            y = input.nextInt();
            System.out.println("Enter end: ");
            z = input.nextInt();
            for (int i = y; i <= z; i++) {
                System.err.println(i);
            }
        } 
        else if (x == 3) {
            System.out.println("Enter low: ");
            y = input.nextInt();
            System.out.println("Enter high: ");
            z = input.nextInt();
            int w = 0;
            for (int i = y; i <= z; i++) {
                w += i;
            }
            System.out.println("Sum = " + w);
        } 
        else if (x == 4) {
            System.out.println("Enter a word: ");
            a = input.next();
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a);
            }
        } 
        else if (x == 5) {
            System.out.println("Enter first word: ");
            a = input.next();
            System.out.println("Enter second word: ");
            String d = input.next();
            int g = 30 - (a.length() + d.length());
            String e = "";
            for (int i = 1; i <= g; i++) {
                e = e + ".";
            }
            System.out.println(a + e + d);
        } 
        else if (x == 6) {
            System.out.println("How many integers will be added: ");
            y = input.nextInt();
            int u = 0;
            for (int i = 1; i <= y; i++ ) {
                System.out.println("Enter an integer: ");
                z = input.nextInt();
                u += z;
            }
            System.out.println("The sum is " + u);
        } 
        else if (x == 7) {
            y = 69;
            NumberFormat money = NumberFormat.getCurrencyInstance();
            do {
                System.out.println("Weight of order: ");
                y = input.nextInt();
                if (y <= 10) {
                    System.out.println("Shipping cost: $3.00");
                }
                else if (y > 10) {
                    System.out.println("Shipping cost: " + money.format(3 + ((y-10)*0.25)));
                }
            } while (y != 0);
            System.out.println("Bye");
        } 
        else {
            System.out.println("Invalid option");
        }
    }
}
//IMPORT STATEMENTS

//CLASS 

//main METHOD
