package Task_2;

public class Triangle extends Shape implements Perimeter, Area {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(String colorBackground, String colorBorder, double side1, double side2, double side3) {
        super(colorBackground, colorBorder);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return (side1 + side2 + side3) / 2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public void printResult() {
        System.out.printf("Треугольник [ Периметр = %.2f, Площадь = %.2f, Цвет фона = %s, Цвет границ = %s ]%n", getPerimeter(), getArea(), colorBackground, colorBorder);
    }
}