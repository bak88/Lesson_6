package Task_2;

public class Rectangle extends Shape implements Perimeter, Area {

    private double length;
    private double width;

    public Rectangle(String colorBackground, String colorBorder, double length, double width) {
        super(colorBackground, colorBorder);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public void printResult() {
        System.out.printf("Прямоугольник [ Периметр = %.2f, Площадь = %.2f, Цвет фона = %s, Цвет границ = %s ]%n", getPerimeter(), getArea(), super.getColorBackground(), super.getColorBorder());
    }
}
