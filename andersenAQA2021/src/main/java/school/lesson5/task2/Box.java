package school.lesson5.task2;

import java.util.ArrayList;

public class Box <T extends Fruit>{

    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit){
        this.fruits.add(fruit);
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public float getWeight(){
        float totalWeight = 0.0f;
        if (fruits.size() == 0) return 0;
        else {
            for (T fr : fruits) {
                totalWeight += fr.getWeight();
            }
        }
        return  totalWeight;
    }

    public boolean compare( Box box){
        return this.getWeight() == box.getWeight();
    }

    public void moveFruitsToAnotherBox(Box<T> anotherBox) {
        if (fruits.get(0).getClass().equals(anotherBox.getFruits().get(0).getClass())) {
            anotherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
            System.out.println("Фрукты пересыпаны.");}
        else System.out.println("Данная коробка не для этих фруктов.");
    }

    public void info() {
        if (fruits.isEmpty()) {
            System.out.println("В коробке ничего нет");
        } else {
            System.out.println("В коробке находятся " + fruits.get(0).getClass().toString() + " в количестве: " + fruits.size());
        }
    }

}
