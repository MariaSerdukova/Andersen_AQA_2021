package school.lesson4.task1;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Пушок");
        Cat cat4 = new Cat("Полосатик");

        Dog dog1 = new Dog("Каштанка");
        Dog dog2 = new Dog("Граф");
        Dog dog3 = new Dog("Майкл");
        Dog dog4 = new Dog("Джексон");


        cat1.run(150);
        cat1.swim(100);

        cat2.run(210);
        cat2.swim(-1);

        cat3.run(-1);
        cat3.swim(10);

        cat4.run(0);
        cat4.swim(5);


        dog1.run(450);
        dog1.swim(5);

        dog2.run(502);
        dog2.swim(8);

        dog3.run(120);
        dog3.swim(15);

        dog4.run(-1);
        dog4.swim(20);

        System.out.println("Количество котов " + Cat.catCounter + ".");
        System.out.println("Количество собак " + Dog.dogCounter + ".");
    }


}
