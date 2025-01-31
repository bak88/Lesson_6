package Task_2;

public abstract class Shape {

    private String colorBackground;
    private String colorBorder ;

    public Shape(String colorBackground, String colorBorder) {
        this.colorBackground = colorBackground;
        this.colorBorder = colorBorder;
    }

    public String getColorBackground() {
        return colorBackground;
    }

    public String getColorBorder() {
        return colorBorder;
    }


    public abstract void printResult() ;


}
