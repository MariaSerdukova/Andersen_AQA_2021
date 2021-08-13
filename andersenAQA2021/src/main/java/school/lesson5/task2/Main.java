package school.lesson5.task2;

public class Main {

    public static void main(String[] args) {

        Box boxApple = new Box();
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());
        boxApple.addFruit(new Apple());

        Box boxApple1 = new Box();
        boxApple1.addFruit(new Apple());


        Box boxApple2 = new Box();
        boxApple2.addFruit(new Apple());


        Box boxOrange = new Box();
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());
        boxOrange.addFruit(new Orange());

        boxApple.info();
        boxApple1.info();
        boxApple2.info();
        boxOrange.info();

        System.out.println("Вывод веса коробок");

        System.out.println(boxApple.getWeight());
        System.out.println(boxApple1.getWeight());
        System.out.println(boxApple2.getWeight());
        System.out.println(boxOrange.getWeight());

        System.out.println("Сравнение двух коробок");

        System.out.println(boxApple1.compare(boxOrange));
        System.out.println(boxApple1.compare(boxApple2));

        System.out.println("Пересыпаем яблоки из 1 коробки во 2");

        boxApple1.moveFruitsToAnotherBox(boxApple2);

        boxApple1.info();
        boxApple2.info();

        System.out.println("Попытка пересыпать апельсины в коробку для яблок");

        boxOrange.moveFruitsToAnotherBox(boxApple2);




    }
}
