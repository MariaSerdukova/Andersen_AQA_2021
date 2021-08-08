package school.lesson4.task4;

import java.util.ArrayList;
import java.util.List;

public class Park {

        List<Attraction> attractionList = new ArrayList<>();

        public Park(){

        }

        public void showAttractions(){
            attractionList.forEach(System.out::println);
        }


         public void addAttraction(String name, String time, double price) {
            attractionList.add(new Attraction(name, time, price));
        }

        private class Attraction{
            private String name;
            private String time;
            private double price;

            public Attraction(String name, String time, double price) {
                this.name = name;
                this.time = time;
                this.price = price;
            }

            @Override
            public String toString() {
                return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
            }
        }
}


