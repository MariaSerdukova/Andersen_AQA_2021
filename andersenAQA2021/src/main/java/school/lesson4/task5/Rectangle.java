package school.lesson4.task5;

public class Rectangle implements GeometrFigure {

    String backgroundColor;
    String borderColor;

    private int a;
    private int b;

    public Rectangle(String backgroundColor, String borderColor, int a, int b) {
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String toString() {
        return "[" + getPerimetr() + ", " + getArea() + ", " + backgroundColor + ", " + borderColor + "]";
    }
}