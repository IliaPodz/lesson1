//Введите в консоль число. Программа определяет число больше, меньше или равно 0.

package io.metadevs.IliaPodz;

import java.util.Scanner;

public class j20 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (0<a){
            System.out.println("Число больше нуля");
        }else if ( 0>a){
            System.out.println("Число меньше 0");
        }else if (0==a){
            System.out.println("Число равно 0");
        }

    }
}