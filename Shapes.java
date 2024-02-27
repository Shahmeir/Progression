/*
By: Shahmeir Shaikh
Date: February 2 2024
Description: This program calculates the area of a circle and a square.
 */
import java.util.Scanner;

public class Shapes {
    private Scanner input = new Scanner(System.in);
    private String shapeName;
    private double radius;
    private double pi = 3.14;
    private double circleArea;
    private double length;
    private double width;
    private double squareArea;

    public Shapes(){
        while (true) {
                System.out.println("Please Input the shapes name");
                this.shapeName = input.nextLine();

                if (this.shapeName.equals("Circle")) {
                    System.out.println("Please Enter the radius of circle: ");
                    this.radius = input.nextDouble();
                    this.circleArea = pi * radius * radius;
                    break;
                } else if (this.shapeName.equals("Square")) {
                    System.out.print("Please Enter the Length of Square: ");
                    this.length = input.nextDouble();

                    System.out.print("Please Enter the width of Square: ");
                    this.width = input.nextDouble();
                    this.squareArea = length * width;
                    break;
                } else {
                    System.out.println("Invalid shape entered. Please enter either 'Circle' or 'Square'.");
                }

        }
    }

    public double getArea() {
           if (shapeName.equals("Circle")) {
                return circleArea;
            } else if (shapeName.equals("Square")) {
                return squareArea;
            } else {
                System.out.println("Please enter either Circle or Square");
                return 0;

            }
    }

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        double area = shapes.getArea();
        System.out.println("Area of the shape is: " + area);
    }
}