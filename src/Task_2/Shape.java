package Task_2;

public abstract class Shape {

    protected String colorBackground;
    protected String colorBorder ;

    public Shape(String colorBackground, String colorBorder) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }

    public abstract void printResult() ;


}
