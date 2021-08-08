package school.lesson4.task1;

public class Dog extends Animals {

    static int dogCounter;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    @Override
    public void run(int length) {
        if (length < 0) {
            System.out.println("Введено расстояние меньше нуля");
        } else if (length >= 500) {
            System.out.println("Собака не может пробежать более 500 м.");
        } else System.out.println(getName() + " пробежал " + length + " м.");
    }

    @Override
    public void swim(int length) {
        if (length < 0) {
            System.out.println("Введено расстояние меньше нуля");
        } else if (length >= 10) {
            System.out.println("Собака не может проплыть более 10 м.");
        } else System.out.println(getName() + " проплыл " + length);
    }
}
