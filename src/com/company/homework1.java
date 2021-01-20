package com.company;

import java.util.Scanner;

public class homework1 {

    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        byte b = 124;
        short s = 1300;
        char c = 'l';
        int i = 1234121;
        long l = 12309943845l;
        float f = 1.2f;
        double d = 5.6;
        boolean bo = true;
        System.out.println("\nЗадание № 3");
        virazh();
        System.out.println("\nЗадание № 4");
        System.out.println(chekSum());
        System.out.println("\nЗадание № 5");
        proverka();
        System.out.println("\nЗадание № 6");
        System.out.println(proverkaTF());
        System.out.println("\nЗадание № 7");
        String a = "Никита";
        inname(a);
       /*imy(a);*/
       System.out.println("\nЗадание № 8");
        year();
        scanner.close();
    }

    /***
     * 3 задание
     * вычисляющий выражение a * (b + (c / d))
     *
     */

    static void virazh() {
        System.out.println("Введите a,b,c,d для вычесления: ");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float result = a * (b + (c / d));
        System.out.println("Результат = " + result);
    }

    ;
    /***
     * 4 задание
     * проверка на сумму в промежутке 10 и 20
     *
     */

    public static boolean chekSum() {
        System.out.println("Введите два числа для сложения: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    /***
     * 5 задание
     * проверка положительное или отрицательное число
     *
     */

    public static void proverka() {
        System.out.println("Введите число для проверки положительное или нет");
        int a = scanner.nextInt();
        if (a>=0){
            System.out.println("Число положительное");
        }
        else
        System.out.println("Число отрицательное");
    }
    /***
     * 6 задание
     * проверка положительное или отрицательное число
     *
     */


    public static boolean proverkaTF()
    {
        System.out.println("Введите число для проверки правда положительное или нет ");
        int a = scanner.nextInt();
        return a>=0;
    }
    /***
     * 7 задание
     * проверка положительное или отрицательное число
     *
     */


    public static void inname(String name)
    {
        System.out.println("Привет," + name + "!");
    }

   /* public static void imy()
    {
        System.out.println("Введите имя: ");
        String a=scanner.nextLine();
        System.out.println("Привет," + a + "!");
    }
*/

    /***
     * 8 задание
     * проверка положительное или отрицательное число
     *
     */

    public static void year()
    {
        System.out.println("Введите год");
        int year=scanner.nextInt();
        System.out.printf("Год %d " + (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? "Високосный" : "Не високосный"), year);
    }

}
