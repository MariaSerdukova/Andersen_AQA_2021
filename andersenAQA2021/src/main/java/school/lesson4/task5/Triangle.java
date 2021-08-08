package school.lesson4.task5;

/**Площадь треугольника равна половине произведения
 двух его сторон умноженного на синус угла между ними.
 */

public class Triangle implements GeometrFigure {

    String backgroundColor;
    String borderColor;

    int a, b, c, h;

    public Triangle(String backgroundColor, String borderColor, int a, int b, int c, int h) {
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getPerimetr() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        return h*a/2;
    }

    @Override
    public String toString() {
        return "[" + getPerimetr() + ", " + getArea() + ", " + backgroundColor + ", " + borderColor + "]";

    }
}
