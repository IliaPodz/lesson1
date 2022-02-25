 //Спортсмен на соревнованиях стреляет три раза по трем мишеням. За каждое
//попадание дается один балл. Программа выводит результат каждого выстрела и
//общее количество баллов спортсмена. Результат каждого выстрела формируется
//программой случайным образом.


import java.util.Scanner;

    public class j14 {
        public static void main(String[] agrs) {
            Scanner scan = new Scanner(System.in);
            System.out.println("введите число");
            int a = scan.nextInt();
            scan.close();
            if (a < 0) {
                System.out.println(a + " <0");
            }
            if (a > 0) {
                System.out.println(a + ">0");
            }
            if (a == 0) {
                System.out.println(a + "==0");

            }

        }
    }

