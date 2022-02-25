//Задача 23: Ученик сдал экзамен. Внесите с консоли оценку ученику по 10-ти бальной системе.
//Программа выдаст свою оценку ученику.

package io.metadevs.IliaPodz;

import java.util.Scanner;

public class j23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scan.nextInt();
        switch (a) {
            case 1:
            case 2:
                System.out.println("Оценка: " + a + ("-Ужасно "));
                break;
            case 3:
            case 4:
                System.out.println("Оценка: " + a + ("-Плохо "));
                break;
            case 5:
            case 6:
                System.out.println("Оценка: " + a + ("-Удовлетворительно "));
                break;
            case 7:
            case 8:
                System.out.println("Оценка: " + a + ("-Хорошо "));
                break;
            case 9:
            case 10:
                System.out.println("Оценка: " + a + ("-Отлично "));
                break;
            default:
                System.out.println("Оценка: " + a + ("-Некорректный ввод "));
                break;
        }

    }
}