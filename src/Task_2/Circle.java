package Task_2;

public class Circle extends Shape implements Perimeter, Area {

    private double radius;

    public Circle(String colorBackground, String colorBorder, double radius) {
        super(colorBackground, colorBorder);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printResult() {
        System.out.printf("Круг [ Периметр = %.2f, Площадь = %.2f, Цвет фона = %s, Цвет границ = %s ]%n", getPerimeter(), getArea(), super.getColorBackground(), super.getColorBorder());
    }
}
