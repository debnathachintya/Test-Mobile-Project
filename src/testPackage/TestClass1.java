package testPackage;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestClass1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner bucky = new Scanner(System.in);
        System.out.println("Enter first number: ");
        a = bucky.nextInt();
        System.out.println("Enter Second Number: ");
        b = bucky.nextInt();
        System.out.println("Entered Numbers are:"+a + "  " + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Swapping of two Numbers are:"+a + "  " + b);
    }
}