package Task_2;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle("Red", "White", 2, 3, 4);
        Circle circle = new Circle("Green", "Blue", 4);
        Rectangle rectangle = new Rectangle("Black", "Yellow", 2, 6);

        triangle.printResult();
        circle.printResult();
        rectangle.printResult();
    }
}
