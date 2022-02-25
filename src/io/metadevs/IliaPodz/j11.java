// Задача 11: Программа выводит квадрат числа, введенного пользователем..
package io.metadevs.IliaPodz;

import java.util.Scanner;

        public class j11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        System.out.println("Введите число");
        int b = scan.nextInt();
        int min;
        if (a < b) {
            min = a;
            System.out.println("Min=" + min);
        }
        if (a > b) {
            min = b;
            System.out.println("Min=" + min);
        }
        if (a == b) {
            System.out.println("a равно b");
        }


    }
}