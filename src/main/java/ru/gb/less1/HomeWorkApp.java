package ru.gb.less1;

public class HomeWorkApp {
    public static void main(String[] args) {

       System.out.println("Задание 2");
       System.out.println(" ");
       printThreeWords();
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

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2 - Сумма положительная и отрицательная

    public static void checkSumSign(int a, int b){
        if (a + b >= 0) {
                System.out.println("Сумма положительная");
            }
         else {
            System.out.println("Сумма отрицательная");
        }
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