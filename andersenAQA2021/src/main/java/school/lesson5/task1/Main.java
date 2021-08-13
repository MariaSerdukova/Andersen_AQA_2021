package school.lesson5.task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July",
                                       "August", "September", "October", "November", "December"};

        System.out.println(Arrays.deepToString(months));
        swap(months, 0, 1);
        System.out.println(Arrays.deepToString(months));
    }

    public static void swap(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}


