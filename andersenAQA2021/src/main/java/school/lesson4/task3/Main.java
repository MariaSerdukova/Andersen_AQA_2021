package school.lesson4.task3;

public class Main {

    public static void main(String[] args) {

    Payment payment = new Payment("Покупка 1");

    payment.addProduct("Milk", 1.6);
    payment.addProduct("Bread", 1.1);
    payment.addProduct("Juice", 3);

    System.out.println(payment.getNamePayment());
    payment.showProducts();

    Payment payment1 = new Payment("Покупка 2");

    payment1.addProduct("Water", 0.7);
    payment1.addProduct("Bananas", 2.7);
    payment1.addProduct("Eggs", 3);

    System.out.println(payment1.getNamePayment());
    payment1.showProducts();


    }
}
