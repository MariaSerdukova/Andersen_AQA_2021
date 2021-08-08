package school.lesson4.task2;

public class Cat {
    private String name;
    private int appetite;
    private boolean Fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isFullness() {
        return Fullness;
    }

    public void eat(Plate p) {
        if (p.getFood() >= appetite) {
        p.decreaseFood(appetite);
        Fullness = true;
        } else System.out.println("В тарелке не хватит еды, чтобы накормить кота " + getName() + ".");
    }

}
