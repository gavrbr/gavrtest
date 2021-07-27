package ru.gb.less1;

public class HomeWorkApp {
    public static void main(String[] args) {

       System.out.println("Задание 2");
       System.out.println(" ");
       printThreeWords("Orange","Banana","Apple" );
       System.out.println(" ");
       System.out.println("Задание 3");
       System.out.println(" ");
       checkSumSign(-23,22);
       System.out.println(" ");
       System.out.println("Задание 4");
       System.out.println(" ");
       printColor(101);
       System.out.println(" ");
       System.out.println("Задание 5");
       System.out.println(" ");
       compareNumbers(1, 22);

    }


    //Задание 1 - вызов для вывода в столбец три слова

    public static String printThreeWords(String val1, String val2, String val3){
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        String s = val1 + val2 + val3;
        return s;
    }

    // Задание 2 - Сумма положительная и отрицательная

    public static int checkSumSign(int a, int b){
        int c = a + b;
        if (c >= 0) {
                System.out.println("Сумма положительная");
            }
         else {
            System.out.println("Сумма отрицательная");
        }
        return c;
    }


    public static int printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 100){
            System.out.println("Зеленый");
        }
        else {
            System.out.println("Желтый");
        }
        return value;
    }

    public static int compareNumbers(int a, int b){
        if (a >= b) {
            System.out.println("a >= b");
        }
        else{
            System.out.println("a < b");
        }
        return a + b;

    }
    

}