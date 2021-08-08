package school.lesson4.task5;

public class Circle implements GeometrFigure {

    String backgroundColor;
    String borderColor;

    int r;

    public Circle( String backgroundColor, String borderColor, int r) {
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
        this.r = r;
    }

    @Override
    public double getPerimetr() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.pow((Math.PI*r), 2);
    }

    @Override
    public String toString() {
        return "[" + getPerimetr() + ", " + getArea() + ", " + backgroundColor + ", " + borderColor + "]";

    }
}
