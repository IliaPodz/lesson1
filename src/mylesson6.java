//Машина загадывает число от 1 до 10. Пользователь пытается угадать число до
//трех попыток. Машина подсказывает пользователю загаданное число больше или
//меньше числа, введенного пользователем.


import java.util.Scanner;

public class mylesson6 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a;
        int result = (int) (Math.random() * 11);
        for (int i = 0; i < 3; i++) {
            System.out.println("Угадайте число");
            a = sc.nextInt();
            if (a == result) {
                System.out.println("Правильно");
            } else {
                if (a < result) {
                    System.out.println("не правильно,Больше" + a);
                } else {
                    System.out.println("не правильно,Меньше" + a);
                }
            }
        }
        System.out.println("Ответ:" + result);


    }
}