package Exercise03;

public class Exercise03 {

    // Method to calculate the area of a circle
    public static double calculateAreaCircle(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public static double calculateAreaRectangle(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public static double calculateAreaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double circleRadius = 5.0;
        double rectangleLength = 4.0;
        double rectangleWidth = 6.0;
        double triangleBase = 3.0;
        double triangleHeight = 7.0;

        // Calculate and display areas
        double circleArea = calculateAreaCircle(circleRadius);
        System.out.printf("Area of the circle (radius = %.2f): %.2f%n", circleRadius, circleArea);

        double rectangleArea = calculateAreaRectangle(rectangleLength, rectangleWidth);
        System.out.printf("Area of the rectangle (length = %.2f, width = %.2f): %.2f%n",
                rectangleLength, rectangleWidth, rectangleArea);

        double triangleArea = calculateAreaTriangle(triangleBase, triangleHeight);
        System.out.printf("Area of the triangle (base = %.2f, height = %.2f): %.2f%n",
                triangleBase, triangleHeight, triangleArea);
    }
}
