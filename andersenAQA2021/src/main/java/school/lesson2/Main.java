package school.lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static boolean summ10and20(int a, int b) {
        int summ = a + b;
        if (summ>=10 && summ<=20) {
            return true;
        } else return false;

    }

    public static void bolsheNula(int a) {

        if (a>=0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");

    }

    public static boolean bolsheNulaWithReturn(int a) {
        if (a<0) {
            return true;
        } else
            return false;
     }

    public static void printString(String s, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(s);
        }

    }

    public static boolean visokosnyGod(int a) {
        if (a%4==0 && a%100!=0 || a%400==0) {
            return true;
        } else
            return false;

    }

    public static void invertOneByZero() {
        int [] array= {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else if (array[i] == 1){
                array[i] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void emptyArray() {
        int [] array = new int[100];

        for (int i = 0, num = 1; i < array.length; i++, num++) {
            array[i] = num;
        }
        System.out.println(Arrays.toString(array));
    }
    
    public static void multiply6(){
        
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int x:array) {
            if (x<6){
                x*=2;
                System.out.print(x + " ");
            } else System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void diagonal() {
//* Объявление массива

        int[][] array = new int[6][6];

//* Заполнение массива случаными значениями

        Random rand = new Random();
        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j < 6; j++) {
                array[i][j] = rand.nextInt(10);
            }
        }
//* Заполнение диагоналей массива единицами

        for (int i = 0, j = 0; i < array.length ; i++, j++) {
            array[i][j] = 1;
        }
        for (int i = 0, j = array.length - 1; i < array.length ; i++, j--) {
            array[i][j] = 1;
        }
//* Вывод массива в консоль

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] equalsValueArray(int len, int initialValue) {
        int[]array = new int[len];

          for (int i = 0; i < array.length ; i++) {
              array[i] = initialValue;
          }
        return array;
    }

    public static void minMax() {
        int[]array = {6, 4, 3, 8, 1, 0, 5};
        int min = 0;
        int max = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] < min) {
                min = array[i];
            } else if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальное значение массива " + min);
        System.out.println("Максимальное значение массива " + max);
    }

    public static boolean sumPartOfArray(int[]array) {

        int part1 = 0;
        int part2 = 0;

        for (int i = 1; i < array.length-1; i++) {

            int num = array[i];

            for (int j = 0; j < i; j++) {
                part1 += array[j];
            }
            for (int k = array[i+1]; k < array.length; k++) {
                part2 += array[k];
            }

            if (num == part1 && num == part2){
                return true;
            }
        }
        return false;
    }

    public static int[]moveArray(int[]array, int move){
        if (move > 0) {
            for (int i = 0; i < move ; i++) {
                int temp = array[0];
                array[0] = array[array.length-1];

                for (int j = 1; j < array.length-1; j++) {
                    array[array.length-j] = array[array.length-j-1];
                }
                array[1] = temp;
            }
        }
        if (move < 0) {
            for (int i = 0; i > move ; i--) {
                int temp = array[array.length-1];
                array[array.length-1] = array[0];

                for (int j = 1; j < array.length-1; j++) {
                    array[j-1] = array[j];
                }
                array[array.length-2] = temp;
            }
        }
        return array;
    }

    public static void main(String[] args) {
// 1 задание
        System.out.println(Main.summ10and20(6, 4));
// 2 задание
        Main.bolsheNula(6);
// 3 задание
        System.out.println(Main.bolsheNulaWithReturn(-3));
// 4 задание
        Main.printString("Maria Serdukova", 5);
// 4* задание
        System.out.println(Main.visokosnyGod(2020));
// 6 задание (почему не 5?))
        Main.invertOneByZero();
// 7 задание
        Main.emptyArray();
// 8 задание
        Main.multiply6();
// 9 задание
        Main.diagonal();
// 10 задание
        System.out.println(Arrays.toString(Main.equalsValueArray(10, 5)));
// 10* задание
        Main.minMax();
// 10** задание
        int[]array = {1, 3, 5, 9, 4, 2, 1, 2};
        System.out.println(Main.sumPartOfArray(array));
// 12*** задание
        System.out.println(Arrays.toString(Main.moveArray(array, -2)));
    }
}
