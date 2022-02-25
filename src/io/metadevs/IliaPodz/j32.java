// Задача 32: Ученик сдал экзамен. Программа выводит результаты экзамена и дает свою оценку знаниям ученика.
//Оценка определяется программой случайным образом.


package io.metadevs.IliaPodz;

public class j32 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 5);
        if (a == 0) {
            System.out.println("Незачет");
        }else if (a == 1) {
            System.out.println("Оценка: 2");
        }else if (a == 2) {
            System.out.println("Оценка: 3");
        }else if (a == 3) {
            System.out.println("Оценка: 4");
        }else if (a == 4) {
            System.out.println("Оценка: 5");
        }else {
            System.out.println("неожиданное число" + a );
        }
    }
}

