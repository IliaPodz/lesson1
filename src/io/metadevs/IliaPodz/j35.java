// Задача 35: Программа определяет большее из двух чисел, введенных пользователем, или выдает сообщение, что числа равны.

package io.metadevs.IliaPodz;
import java.util.Scanner;

public class j35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int a = sc.nextInt();
        System.out.println("Введите число");
        int b = sc.nextInt();
        if (a<b){
            System.out.println(b + " Больше  " + a);
        }else if (a>b){
            System.out.println(a + " Больше  " + b);
        }else if (a==b){
            System.out.println(b + " Равно  " + a);
        }

    }
}