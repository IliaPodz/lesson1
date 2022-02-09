import java.util.Scanner;

public class LessonM3 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int produkt = sc.nextInt();
        int allComdinations = 0;
        for (int i = 2; i <= produkt; i++) {
            allComdinations = allComdinations + comdinations(produkt, i);
        }
        System.out.println(allComdinations);
    }

    private static int comdinations(int n, int produkt){
        return factorial(n)/(factorial(n-produkt) * factorial(produkt));
    }

    private static int factorial(int n) {
       int factorialVaiue = 1;
       for (int i = 1; i <=n; i++) {
           factorialVaiue = factorialVaiue*i;
       }
       return factorialVaiue;
    }
}