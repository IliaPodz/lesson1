import java.util.Scanner;

public class Lesson6 {
        static Scanner in = new Scanner(System.in);

        public static void main(String[] args) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int sum = a;
            if (d - b > 0) { //планирует потратить - то что у него есть >0
                sum += (d - b) * c;//планирует потратить - то что у него есть * стоимость если выйдет за лимит
            }
            System.out.println(sum);
        }
    }

