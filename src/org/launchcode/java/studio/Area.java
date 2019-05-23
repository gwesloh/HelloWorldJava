package org.launchcode.java.studio;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = in.nextDouble();

        area= radius*radius* 3.14;
        System.out.println("The area of the circle is: " + area);

    }
}
