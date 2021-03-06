package home_works.hw_2021_02_13.circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite apskritimo spindulio ilgi");
        int radius = scanner.nextInt();

        Circle circle = new Circle(radius, "zalias");
        double circleSquare = getCircleSquare(circle);

        System.out.printf("Apskritimo plotas: %.2f", circleSquare);
    }

    private static double getCircleSquare(Circle circle) {
        return Math.pow(circle.getRadius(), 2) * Math.PI;
    }

}