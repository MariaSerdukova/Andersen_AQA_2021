package school.lesson4.task4;


public class Main {
    public static void main(String[] args) {

        Park park = new Park();

        park.addAttraction("Веселые горки", "5 минут", 4);
        park.addAttraction("Зодиак", "7 минут", 5.5);
        park.addAttraction("Чашечки", "3 минутs", 3);

        park.showAttractions();


    }

}
