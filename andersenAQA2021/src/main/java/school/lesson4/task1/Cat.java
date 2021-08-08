package school.lesson4.task1;

public class Cat extends Animals {

    static int catCounter;

    Cat(String name){
        super(name);
        catCounter++;
    }

    @Override
    public void run(int length) {
        if (length < 0) {
            System.out.println("Введено расстояние меньше нуля");
        } else if (length >= 200) {
            System.out.println("Кот не может пробежать более 200 м.");
        } else System.out.println(getName() + " пробежал " + length + " м.");
    }
    @Override
    public void swim(int length) {
        if (length < 0) {
            System.out.println("Введено расстояние меньше нуля");
        } else System.out.println("Коты не умеют плавать");

    }
}
