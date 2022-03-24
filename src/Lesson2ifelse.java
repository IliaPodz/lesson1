import java.util.Scanner;

public class Lesson2ifelse {
    static void sum(int x, int y){
        int z =(x+y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        sum(a, b);
        sum(3, a);
        sum(5,23);

        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualTHenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;

        if (aGreaterThenB) {
            System.out.println("a>b");
        }else{
            System.out.println("False");
        }
        if (aLessThenB) {
            System.out.println("a<b");
        }
        if (aGreaterOrEqualTHenB) {
            System.out.println("a>=b");
        }
        if (aLessOrEqualThenB) {
            System.out.println("a<=b");
        }else {
            System.out.println("False");
        }

        int userInput = new Scanner(System.in).nextInt();
        if (userInput % 2 == 0) {
            System.out.println("Число четное");
        }else {
            System.out.println("Число нечетное");
        }
    }
}
