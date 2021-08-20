package school.lesson8.phoneNumbers;


public class Main {


    public static void main(String[] args) {
        Contacts contacts1 = new Contacts();

        contacts1.add("Иванов", "+375 29 111 11 11");
        contacts1.add("Петров", "+375 29 222 22 22");
        contacts1.add("Сидоров", "+375 29 333 33 33");
        contacts1.add("Иванов", "+375 29 444 44 44");
        contacts1.add("Александров", "+375 29 555 55 55");
        contacts1.add("Сидоров", "+375 29 666 66 66");

        System.out.println(contacts1.get("Иванов"));
        System.out.println(contacts1.get("Сидоров"));

    }

}
