package school.lesson4.task1;

public abstract class Animals {

    private String name;

    public Animals(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void run(int length);
    public abstract void swim(int length);


}
