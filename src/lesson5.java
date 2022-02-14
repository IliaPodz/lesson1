import java.util.Scanner;

public class lesson5 {
    public static void main(String args[]) {
        int userSum = 0;//сумма к переводу//
        int maxSumRaw = 0;
        System.out.println("Введите сумму перевода ");
        userSum = new Scanner(System.in).nextInt();
        int feeRaw = (userSum / 100 + 1) * 7;
        maxSumRaw = (userSum - feeRaw);
        int fee = (maxSumRaw / 100 + 1) * 7;
        int maxSum = (userSum - fee);// реальная сумма
        int coverage = (100 * fee) / 7;//допустимая к переводу суммa
        int result;
        if (maxSum > coverage) {
            result = coverage;
        } else {
            result = maxSum;
        }
        System.out.println("максимальная сумма " + result + " комиссия " + fee);
    }
}
