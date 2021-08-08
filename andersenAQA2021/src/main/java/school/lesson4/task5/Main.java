package school.lesson4.task5;

/**
 * Применяя интерфейсы написать программу расчета периметра и площади
 * геометрических фигур: круг, прямоугольник, треугольник. Задать для каждой
 * фигуры цвет заливки и цвет границы. Результат полученных характеристик [
 * Периметр, площадь, цвет фона, цвет границ ] по каждой фигуре вывести в
 * консоль.
 * Попробуйте реализовать базовые методы, такие как расчет периметра фигур, в
 * качестве дефолтных методов в интерфейсе.
 */

public class Main {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle("Blue", "Black", 8, 6);
        System.out.println(rect.toString());

        Triangle triangle = new Triangle("Red", "Purple", 4, 5, 3, 7);
        System.out.println(triangle.toString());

        Circle circle = new Circle("Green", "Black", 25);
        System.out.println(circle.toString());




    }
}
