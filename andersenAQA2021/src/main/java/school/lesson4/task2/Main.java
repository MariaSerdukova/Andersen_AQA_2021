package school.lesson4.task2;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Barsik", 5);
        cats[1] = new Cat("Myrzik", 5);
        cats[2] = new Cat("Boris", 5);
        cats[3] = new Cat("Markiz", 5);
        cats[4] = new Cat("Pyshok", 5);

        Plate plate = new Plate(20);

        plate.info();
        cats[0].eat(plate);
        plate.info();
        cats[1].eat(plate);
        plate.info();
        cats[2].eat(plate);
        plate.info();
        cats[3].eat(plate);
        plate.info();
        cats[4].eat(plate);

        for (Cat c: cats) {
            if (c.isFullness()){
            System.out.println("Кот " + c.getName() + " сыт.");
            } else System.out.println("Кот " + c.getName() + " голоден.");
        }

        plate.addFood(5);

        plate.info();
        cats[4].eat(plate);

        System.out.println(cats[4].isFullness());


    }

}
