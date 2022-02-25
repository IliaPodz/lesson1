// Задача 38: Программа считает количество повторов цикла от 0 до числа, введенного пользователем.

package io.metadevs.IliaPodz;

import java.util.Scanner;
public class j38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        int i = 0;
        do {
            System.out.println("Повтор:" + i);
            i = i + 1;
        } while (i < (a + 1));

    }
}