package school.lesson1;

public class Main {

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 8;
        int sum = a+b;
        if (sum>=0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");
    }

    public static void printColor() {
        int value = 10;

        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else if (value > 100)
            System.out.println("Зеленый");
    }

    public static void compareNumbers() {
        int a = 15;
        int b = 18;

        if (a >= b)
            System.out.println("a >= b");
        else System.out.println("a < b");
    }


    public static void main(String[] args) {

      Main.printThreeWords();
      Main.checkSumSign();
      Main.printColor();
      Main.compareNumbers();

    }

}
