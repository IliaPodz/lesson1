// Задача 26: Программа выдает абсолютное значение числа, введенного пользователем.


package io.metadevs.IliaPodz;
        import java.util.Scanner;
public class j26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a=sc.nextInt();
        int k = a < 0 ? -a : a;
        System.out.println("Абсолютное значение " + a + " равно " + k);
    }
}