package org.myproject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название дня недели на английском:");
        String dayOfWeekEnglish = scanner.nextLine().trim();

        String dayOfWeekRussian = DayConvertor.convertToRussian(dayOfWeekEnglish);
        System.out.println("Название дня недели на русском: " + dayOfWeekRussian);
    }
}
