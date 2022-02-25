// Задача 29: Программа случайным образом выводит порядковый номер дня недели и сообщает рабочий этот день или выходной.
//
package io.metadevs.IliaPodz;
import java.util.Scanner;

public class j29 {
    public static void main(String[] args) {
        int week = (int) (Math.random() * 7);
        switch (week) {
            case 1:
                System.out.println("1:Понедельник" + " рабочий ");
                break;
            case 2:
                System.out.println("2:Вторник" + " рабочий ");
                break;
            case 3:
                System.out.println("3:Среда" + " рабочий ");
                break;
            case 4:
                System.out.println("4:Четверг" + " рабочий ");
                break;
            case 5:
                System.out.println("5:Пятница" + " рабочий ");
                break;
            case 6:
                System.out.println("6:Суббота" + " выходной ");
                break;
            case 7:
                System.out.println("7:Воскресенье" + " выходной ");
                break;
        }
    }
}