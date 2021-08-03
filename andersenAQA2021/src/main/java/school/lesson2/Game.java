package school.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static final int SIZE = 4;
    public static final int DOTS_TO_WIN = 4;
    public static char[][] map;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';

    public static void initMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE ; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) + " ");
            for (int j = 0; j < SIZE ; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static Scanner scanner = new Scanner(System.in);
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y >= SIZE)
            return false;
        else if (map[y][x] == DOT_EMPTY)
            return true;
        else return false;
    }

    public static boolean isMapFull(){
        for (int i = 0; i < SIZE ; i++) {
            for (int j = 0; j < SIZE ; j++) {
                if(map[i][j] == DOT_EMPTY)
                    return false;
            }
        } return true;
    }

    public static Random rand = new Random();
    public static void aiTurn(){
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_0;
    }

    public static boolean checkWin(char symb) {
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb)
//            return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb)
//            return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb)
//            return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb)
//            return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb)
//            return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb)
//            return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb)
//            return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb)

// ЗАДАНИЕ 12 и 12*
// Проверка диагоналей
        boolean test = true;
        boolean test1 = true;

        for (int i = 0; i < SIZE ; i++) {
            test &= (map[i][i] == symb);
            test1 &= (map[SIZE-i-1][i] == symb);
        }
        if(test || test1) return true;
// Проверка горизонталей и вертикалей
        boolean col = true;
        boolean row = true;
        for (int cols = 0; cols < SIZE ; cols++) {
            for (int rows = 0; rows < SIZE; rows++) {
                col &= (map[cols][rows] == symb);
                row &= (map[rows][cols] == symb);
            }
            if (col || row)
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        Game.initMap();
        Game.printMap();

        while (true) {
            Game.humanTurn();
            Game.printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            Game.aiTurn();
            Game.printMap();
            if (checkWin(DOT_0)) {
                System.out.println("Победил Искусственный Интеллект!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

        }
        System.out.println("Игра закончена!");

    }
}
