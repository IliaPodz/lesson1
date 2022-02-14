import java.util.Scanner;

public class GameGuessNumber {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a;
        int result = (int) (Math.random() * 100+1);
        for (int i = 0; i < 10; i++) {
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