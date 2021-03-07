package home_works.hw_2021_02_21.shapes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ShapesMain {

    private static final String OUTPUT_FILE_LOCATION = "/home/deimantas/IdeaProjects/SDA/testProjectCloning/JavaRemoteLT7/src/main/java/home_works/hw_2021_02_21/shapes/result.txt";

    public static void main(String[] args) {
        Circle circle = new Circle("apskritimas", 1);
        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle("status trikampis", 1, 2);
        Rectangle rectangle = new Rectangle("stačiakampis", 3, 4);

        writeResultToFile(circle, rightAngleTriangle, rectangle);
    }

    private static void writeResultToFile(Circle circle, RightAngleTriangle rightAngleTriangle, Rectangle rectangle) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write("Apskritimo ilgis = " + circle.calculateCircleLength() + "\n");
            bw.write("Apskritimo plotas = " + circle.calculateCircleArea() + "\n");
            bw.write("Stataus trikampio plotas = " + rightAngleTriangle.calculateRightAngleRectangleArea() + "\n");
            bw.write("Stačiakampio plotas = " + rectangle.calculateRectangleArea());
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila!");
        }
    }
}